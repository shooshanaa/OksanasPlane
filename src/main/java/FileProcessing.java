import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileProcessing {

    private ArrayList<String> businessPassengers = new ArrayList<String>();
    private ArrayList<String> businessRandomPassengers = new ArrayList<String>();
    String filepath1 = "BusinessPassengers.txt";
    File file1 = new File(filepath1);

    public void addBusinessPassenger(String fullName, String seatNumber) {
        try {
            FileWriter myWriter = new FileWriter(filepath1, true);
            myWriter.write( fullName + "," + seatNumber);
            myWriter.write(System.lineSeparator());
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
        System.out.println(seatNumber + " was assigned successfully to " + fullName);
    }

    public void addBusinessPassengerRandom (String fullNameRandom, String randomSeatNumber) {
        try {
            FileWriter myWriter = new FileWriter(filepath1, true);
            myWriter.write( fullNameRandom + "," + randomSeatNumber);
            myWriter.write(System.lineSeparator());
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
        System.out.println(randomSeatNumber + " was assigned successfully to " + fullNameRandom);
    }

    private ArrayList<String> economyPassengers = new ArrayList<String>();
    private ArrayList<String> economyPassengersRandom = new ArrayList<String>();
    String filepath2 = "EconomyPassengers.txt";
    File file2 = new File(filepath2);

    public void addEconomyPassenger(String fullName, String seatNumber) {
        try {
            FileWriter myWriter = new FileWriter(filepath2, true);
            myWriter.write( fullName + "," + seatNumber);
            myWriter.write(System.lineSeparator());
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
        System.out.println(seatNumber + " was assigned successfully to " + fullName);
    }

    public void addEconomyPassengerRandom (String fullNameRandom, String randomSeatNumber) {
        try {
            FileWriter myWriter = new FileWriter(filepath2, true);
            myWriter.write( fullNameRandom + "," + randomSeatNumber);
            myWriter.write(System.lineSeparator());
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
        System.out.println(randomSeatNumber + " was assigned successfully to " + fullNameRandom);
    }
}
