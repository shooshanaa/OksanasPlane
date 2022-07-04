import java.io.File;

public class Main {

    public static void main(String[] args) {

        MenuController menuController = new MenuController();
        menuController.start();

        FileProcessing fileProcessing = new FileProcessing();
        fileProcessing.readFile1();
        fileProcessing.readFile2();
    }
}
