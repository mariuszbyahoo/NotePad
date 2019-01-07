package InputOutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

    Scanner input = new Scanner(System.in);
    private String fileName;
    private boolean fileExists;

    public void createFile() {
        System.out.println("Podaj nazwe pliku: ");
        fileName = input.nextLine();
        File file = new File(fileName);
        fileExists = file.exists();
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udalo sie stworzyc pliku...");
            }
        }
        if (fileExists) {
            System.out.println("Plik o naziwe: " + fileName + " Istnieje lub zostal stworzony");
        }
    }
}
