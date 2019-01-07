package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoadFile {
    Scanner input = new Scanner(System.in);
    private String nextLine;

    public void loadFile() {
        System.out.println("Podaj nazwe pliku, ktory chcesz wpisac. Program za Ciebie doda suffix \".txt\"");
        try (
                FileReader fileReader = new FileReader((input.nextLine() + ".txt"));
                BufferedReader reader = new BufferedReader(fileReader);
        ) {
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
            }
        } catch (IOException e) {
            System.err.println("Nie udalo sie wczytac pliku...");
            e.printStackTrace();
        }
    }
}
