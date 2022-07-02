import javax.swing.*;

public class BusinessMenu {
    SeatController seatController = new SeatController();
    Passengers passenger = new Passengers();


    public void displayBusinessMenu() {
        JOptionPane.showConfirmDialog(null, "Business class passenger," +
                " please choose your next step: ");
        String option = JOptionPane.showInputDialog(null,
                "Please choose the corresponding number from the menu \n\n" +

                        "1. Check available seats in Business Class\n" +
                        "2. Book a Business class seat\n" +
                        "3. Random seat\n" +
                        "4. Close / Exit\n");

        switch (option){
            case "1":
                this.processAvailableBusinessSeats();
                break;
            case "2":
                System.out.println(seatController.chooseBusinessSeat());
                break;
            case "3":
                System.out.println(seatController.getRandomSeatInBusinessClass());
                //this.processRandomSeatAssignment();
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
