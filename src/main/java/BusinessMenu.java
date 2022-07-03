import javax.swing.*;
import java.io.File;

public class BusinessMenu {

    SeatController seatController = new SeatController();
    FileProcessing BusinessFile = new FileProcessing();

    public void displayBusinessMenu() {
        JOptionPane.showConfirmDialog(null, "Dear passenger," +
                " please choose your next step: ");
        String option = JOptionPane.showInputDialog(null,
                "Please choose the corresponding number from the menu \n\n" +
                        "1. Check available seats in Business Class\n" +
                        "2. Book a Business Class seat\n" +
                        "3. Get a random seat\n" +
                        "4. Close / Exit\n");

        switch (option){
            case "1":
                this.processAvailableBusinessSeats();
                break;
            case "2":
                String seatNumber = seatController.chooseBusinessSeat();
                String fullName = JOptionPane.showInputDialog(null, "Please enter your full name");
                BusinessFile.addBusinessPassenger(fullName, seatNumber);
                break;
            case "3":
                String randomSeatNumber = seatController.getRandomSeatInBusinessClass();
                String fullNameRandom = JOptionPane.showInputDialog(null, "Please enter your full name");
                BusinessFile.addBusinessPassengerRandom(fullNameRandom, randomSeatNumber);
                break;
            case "4":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please select a valid entry");
                break;
        }
        displayBusinessMenu();
    }

    private void processAvailableBusinessSeats() {
        String businessSeats = seatController.businessSeatController(true);
        System.out.println(businessSeats);
    }
}
