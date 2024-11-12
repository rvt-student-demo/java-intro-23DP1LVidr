package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {    
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());


        //SUM OF USER INPUT
        Statistics statistika = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet skaitļus (-1, lai beigtu):");

        while (true) {
            int number = scanner.nextInt();
            
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                statsEven.addNumber(number);
            } else {
                statsOdd.addNumber(number);
            }
            statistika.addNumber(number);
        }
        System.out.println("Skaitļu summa ir " + statistika.sum());
        System.out.println("Pāra skaitļu summa ir " + statsEven.sum());
        System.out.println("Nepāra skaitļu summa ir " + statsOdd.sum());

    }
}