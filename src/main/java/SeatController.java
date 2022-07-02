import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeatController {

    public boolean businessTicket;
    public boolean economyTicket;

    ArrayList<String> businessClass;

    {
        businessClass = new ArrayList<>(Arrays.asList("1a", "1b", "1c", "1d", "2a", "2b", "2c", "2d"));
    }

    ArrayList<String> economyClass;

    {
        economyClass = new ArrayList<>(Arrays.asList("3A", "3B", "3C", "3D", "4A", "4B", "4C", "4D",
                "5A", "5B", "5C", "5D", "6A", "6B", "6C", "6D"));
    }

    List businessList = new ArrayList(businessClass);
    List economyList = new ArrayList(economyClass);

    public String businessSeatController(boolean businessTicket) {
        this.businessTicket = businessTicket;

        try {
            if (this.businessTicket == true) return "Available Business Class seats " + businessClass;
        } catch (Exception e) {
            return "Something went wrong: " + e.getMessage();
        }
        return null;
    }


    public String economySeatController(boolean economyTicket) {
        this.economyTicket = economyTicket;

        try {
            if (this.economyTicket == true) return "Available Economy Class seats " + economyClass;
        } catch (Exception e) {
            return "Something went wrong: " + e.getMessage();
        }
        return null;
    }

    public String chooseEconomySeat() {

        String[] availableEconomySeats = economyClass.toArray(new String[0]);
        String choice = (String) JOptionPane.showInputDialog(
                null,
                "Please choose a seat: ",
                "Available seats: ",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableEconomySeats,
                availableEconomySeats[0]
        );

        this.economyClass.remove(availableEconomySeats[0]);
        return "Seat " + availableEconomySeats[0] + " booked successfully";

    }

    public String chooseBusinessSeat() {

        String[] availableBusinessSeats = businessClass.toArray(new String[0]);
        String choice = (String) JOptionPane.showInputDialog(
                null,
                "Please choose a seat: ",
                "Available seats: ",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableBusinessSeats,
                availableBusinessSeats[0]
        );

        this.businessClass.remove(availableBusinessSeats[0]);
        return "Seat " + availableBusinessSeats[0] + " booked successfully";
    }

}
