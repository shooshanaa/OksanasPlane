import javax.swing.*;
import java.util.Scanner;

public class MenuController {
    private final SeatController seatController = new SeatController();

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
                        "2. Check available seats in Business Class\n" +
                        "3. Check available seats in Economy Class\n" +
                        "4. Book an Economy class seat\n" +
                        "5. Book a Business class seat\n" +
                        "6. Random seat\n" +
                        "7. Close / Exit\n");

        switch (option){
            case "1":
                this.processPassengerData();
                break;
            case "2":
                this.processAvailableBusinessSeats();
                break;
            case "3":
                this.processAvailableEconomySeats();
                break;
            case "4":
                System.out.println(seatController.chooseEconomySeat());
              //  this.processSeatBooking();
                break;
            case "5":
                System.out.println(seatController.chooseBusinessSeat());
                break;
            case "6":
                //this.processRandomSeatAssignment();
                //break;
            case "7":
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
    }

    private void processAvailableBusinessSeats() {
        String businessSeats = seatController.businessSeatController(true);
        System.out.println(businessSeats);
    }

    private void processAvailableEconomySeats() {
        String economySeats = seatController.economySeatController(true);
        System.out.println(economySeats);
    }

  /*  private void processSeatBooking(){
        if(passenger.getTicketType().equals(seatController.economyTicket)){
            seatController.chooseEconomySeat();
        } else if (passenger.getTicketType().equals(seatController.businessTicket)){
            seatController.chooseBusinessSeat();
        }*/


    }






