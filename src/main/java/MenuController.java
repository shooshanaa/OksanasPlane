import javax.swing.*;

public class MenuController {

    private final SeatController seatController = new SeatController();
    EconomyMenu economyMenu = new EconomyMenu();
    BusinessMenu businessMenu = new BusinessMenu();

    public SeatController getSeatController() {
        return seatController;
    }

    public void start() {
        this.displayMainMenu();
    }

    private void displayMainMenu() {
        JOptionPane.showConfirmDialog(null, "Welcome on board!");
        String option = JOptionPane.showInputDialog(null,
                "Please select your ticket type\n\n" +
                        "1. Business Class ticket\n" +
                        "2. Economy Class ticket\n" +
                        "3. Close / Exit\n");

        switch (option){
            case "1":
                this.processBusinessClassTicket();
                break;
            case "2":
                this.processEconomyClassTicket();
                break;
            case "3":
                System.exit(0);
                break;
            default:
            JOptionPane.showMessageDialog(null, "Please select a valid entry");
            break;
        }
        displayMainMenu();
    }

    private void processBusinessClassTicket() {
        int businessTicket = 1;
        if(businessTicket == 1){
            businessMenu.displayBusinessMenu();
        }
    }

    private void processEconomyClassTicket() {
        int economyTicket = 2;
        if(economyTicket == 2){
            economyMenu.displayEconomyMenu();
        }
    }
}






