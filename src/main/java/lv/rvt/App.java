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

        System.out.println("Esat sveicināts person manager, ievaiet \"help\", lai redzētu komandas.");

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
                System.out.println("");
                ArrayList<Person> persons = PersonManager.getPersonList();
                System.out.printf("%-20s| %-10s| %-10s| %-10s| %-20s \n","Vārds","Vecums","Svars","Augstums","Ķermeņa masas indekss");
                System.out.println("--------------------|-----------|-----------|-----------|---------------------");
                for (Person person : persons){
                    double bodyMassIndex = Double.valueOf(person.getWeight())/Double.valueOf(person.getHeight());
                    System.out.printf("%-20s| %-10s| %-10s| %-10s| %-10.2f \n",person.getName(),person.getAge(),person.getWeight(),person.getHeight(),bodyMassIndex);
                }
                System.out.println();
            }

            if (command.equals("exit")){
                System.out.println();
                System.out.println("Visu labu!");
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
