package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 

public class App {    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = Utils.getReader("persons.csv");
        String line;

        ArrayList<Person> Persons = new ArrayList<Person>();

        reader.readLine();
        while ((line = reader.readLine()) != null) {

            String[] parts = line.split(", ");
            Person pers1 = new Person(parts[0],Integer.valueOf(parts[1]),Integer.valueOf(parts[2]),Integer.valueOf(parts[3]));
            Persons.add(pers1);
        }
        for (int i = 0; i<Persons.size(); i++) {
            System.out.println(Persons.get(i));
        }
    }
}