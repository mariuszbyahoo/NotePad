package pl.budzisz.mariusz.InputOutput;

import pl.budzisz.mariusz.methods.Options;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

    Scanner input = new Scanner(System.in);
    private String fileName;
    private boolean fileExists;

    public void createFile() {
        System.out.println("Podaj nazwe pliku: ");
        fileName = input.nextLine() + ".txt";
        File file = new File(fileName);
        fileExists = file.exists();
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
                setFileName(fileName);
            } catch (IOException e) {
                System.out.println("Nie udalo sie stworzyc pliku...");
            }
        }
        if (fileExists) {
            System.out.println("Plik o naziwe: " + fileName + " Istnieje lub zostal stworzony");
        }
    }

    public void saveToFile() {
        try (
                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {
            for (int i = 0; i < Options.list.size(); i++) {
                writer.write(Options.list.get(i));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Nie udalo sie zapisac pliku " + getFileName());
        }
        System.out.println("Zapisano dane do pliku");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
