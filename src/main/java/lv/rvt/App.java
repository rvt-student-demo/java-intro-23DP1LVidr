package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader; 
import java.io.IOException;
import java.nio.file.StandardOpenOption; 

public class App {    
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Labdien, izvēlaties komandu:");
        System.out.println();
        System.out.println("show - parāda visas personas");
        System.out.println("add - pievieno personu");
        System.out.println("help - izvadīt komandas");
        System.out.println("exit - iziet no programmas");
        System.out.println();
        while (true){
            System.out.println();
            System.out.println("Ievadiet komandu: ");
            System.out.println();
            String command = scanner.nextLine();
            if (command.equals("add")){
                System.out.println();
                System.out.println("Ievadiet vārdu:");
                String name = scanner.nextLine();
                System.out.println("Ievadiet vecumu:");
                int age = Integer.valueOf(scanner.nextLine());
                System.out.println("Ievadiet svaru:");
                int weight = Integer.valueOf(scanner.nextLine());
                System.out.println("Ievadiet augstumu:");
                int height = Integer.valueOf(scanner.nextLine());


                Person person = new Person(name, age, weight, height);
                
                PersonManager.addPerson(person);
            }
            if (command.equals("show")){
                System.out.println();
                ArrayList<Person> persons = PersonManager.getPersonList();
                for (Person person : persons){
                    System.out.println(person);
                }
                System.out.println();
            }
            if (command.equals("exit")){
                break;
            }
            if (command.equals("help")){
                System.out.println();
                System.out.println("show - parāda visas personas");
                System.out.println("add - pievieno personu");
                System.out.println("help - izvadīt komandas");
                System.out.println("exit - iziet no programmas");
                System.out.println();
            }
        }
    }
}
