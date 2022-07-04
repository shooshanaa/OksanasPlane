import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void readFile1(){
     try {
        File file1 = new File(filepath1);
        Scanner myReader = new Scanner(file1);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    } catch (
    FileNotFoundException e) {
        System.out.println("File was not found.");
        e.printStackTrace();
    }
    }

    public void readFile2(){
        try {
            File file2 = new File(filepath2);
            Scanner myReader = new Scanner(file2);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("File was not found.");
            e.printStackTrace();
        }
    }
}
