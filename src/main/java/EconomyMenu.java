import javax.swing.*;

public class EconomyMenu {

    SeatController seatController = new SeatController();
    FileProcessing EconomyFile = new FileProcessing();

    public void displayEconomyMenu() {
        JOptionPane.showConfirmDialog(null, "Dear passenger," +
                " please choose your next step: ");
        String option = JOptionPane.showInputDialog(null,
                "Please choose the corresponding number from the menu \n\n" +
                        "1. Check available seats in Economy Class\n" +
                        "2. Book an Economy Class seat\n" +
                        "3. Get a random seat\n" +
                        "4. Close / Exit\n");

        switch (option){
            case "1":
                this.processAvailableEconomySeats();
                break;
            case "2":
                String seatNumber = seatController.chooseEconomySeat();
                String fullName = JOptionPane.showInputDialog(null, "Please enter your full name");
                EconomyFile.addEconomyPassenger(fullName, seatNumber);
                break;
            case "3":
                String randomSeatNumber = seatController.getRandomSeatInEconomyClass();
                String fullNameRandom = JOptionPane.showInputDialog(null, "Please enter your full name");
                EconomyFile.addEconomyPassengerRandom(fullNameRandom, randomSeatNumber);
                break;
            case "4":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please select a valid entry");
                break;
        }
        displayEconomyMenu();
    }

    private void processAvailableEconomySeats() {
        String economySeats = seatController.economySeatController(true);
        System.out.println(economySeats);
    }
}
