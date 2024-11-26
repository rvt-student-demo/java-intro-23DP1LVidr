package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 

public class App {    
    public static void main(String[] args) throws Exception{

        BufferedReader reader = Helper.getReader("persons.csv");

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

    
    }
}
