import javax.swing.*;

public class EconomyMenu {
    SeatController seatController = new SeatController();
    Passengers passenger = new Passengers();


    public void displayEconomyMenu() {
        JOptionPane.showConfirmDialog(null, "Economy class passenger," +
                " please choose your next step: ");
        String option = JOptionPane.showInputDialog(null,
                "Please choose the corresponding number from the menu \n\n" +

                        "1. Check available seats in Economy Class\n" +
                        "2. Book an Economy class seat\n" +
                        "3. Random seat\n" +
                        "4. Close / Exit\n");

        switch (option){
            case "1":
                this.processAvailableEconomySeats();
                break;
            case "2":
                System.out.println(seatController.chooseEconomySeat());
                break;
            case "3":
                System.out.println(seatController.getRandomSeatInEconomyClass());

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
