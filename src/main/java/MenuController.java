import javax.swing.*;
import java.util.Scanner;

public class MenuController {
    private final SeatController seatController = new SeatController();
    EconomyMenu economyMenu = new EconomyMenu();
    BusinessMenu businessMenu = new BusinessMenu();

    Passengers passenger = new Passengers();

    public SeatController getSeatController() {
        return seatController;
    }

    public void start() {
        this.displayMainMenu();
    }

    private void displayMainMenu() {
        JOptionPane.showConfirmDialog(null, "Welcome on board!");
        String option = JOptionPane.showInputDialog(null,
                "Please choose the corresponding number from the menu \n\n" +
                        "1. Insert your data\n" +

                        "2. Close / Exit\n");

        switch (option){
            case "1":
                this.processPassengerData();
                break;

            case "2":
                System.exit(0);
                break;
            default:
            JOptionPane.showMessageDialog(null, "Please select a valid entry");
            break;
        }
        displayMainMenu();
    }

    private void processPassengerData() {
        String fullName = JOptionPane.showInputDialog(null, "Enter your full name");
        String ticketType = JOptionPane.showInputDialog(null, "Enter your ticket type");

        if(ticketType.equals("economy")) {
            economyMenu.displayEconomyMenu();
        }
        if(ticketType.equals("business")){
            businessMenu.displayBusinessMenu();
        }

    }


   /*private void processSeatBooking() {
       if (passenger.getTicketType().equals(seatController.economyTicket)) {
           System.out.println(seatController.chooseEconomySeat());
       } else if (passenger.getTicketType().equals(seatController.businessTicket)) {
           System.out.println(seatController.chooseBusinessSeat());
       }
   }*/


    }






