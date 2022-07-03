import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeatController {

    public boolean businessTicket;
    public boolean economyTicket;

    ArrayList<String> businessClass;
    {
        businessClass = new ArrayList<>(Arrays.asList("1A", "1B", "1C", "1D", "2A", "2B", "2C", "2D"));
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

    public String chooseBusinessSeat() {

        String[] availableBusinessSeats = businessClass.toArray(new String[0]);
        String seatNumber = (String) JOptionPane.showInputDialog(
                null,
                "Please choose a seat: ",
                "Available seats: ",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableBusinessSeats,
                availableBusinessSeats[0]
        );

        this.businessClass.remove(seatNumber);
        System.out.println("Seat " + seatNumber + " booked successfully");
        return seatNumber;

    }

    public String chooseEconomySeat() {

        String[] availableEconomySeats = economyClass.toArray(new String[0]);
        String seatNumber = (String) JOptionPane.showInputDialog(
                null,
                "Please choose a seat: ",
                "Available seats: ",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableEconomySeats,
                availableEconomySeats[0]
        );

        this.economyClass.remove(seatNumber);
        System.out.println("Seat " + seatNumber + " booked successfully");
        return seatNumber;
    }

    public String getRandomSeatInBusinessClass() {
        String[] availableBusinessSeats = businessClass.toArray(new String[0]);
        String randomSeatNumber = availableBusinessSeats[0];

        this.businessClass.remove(randomSeatNumber);
        System.out.println("Random seat " + randomSeatNumber + " booked successfully");
        return randomSeatNumber;
    }

    public String getRandomSeatInEconomyClass() {
        String[] availableEconomySeats = economyClass.toArray(new String[0]);
        String randomSeatNumber = availableEconomySeats[0];

        this.economyClass.remove(randomSeatNumber);
        System.out.println("Random seat " + randomSeatNumber + " booked successfully");
        return randomSeatNumber;
    }
}
