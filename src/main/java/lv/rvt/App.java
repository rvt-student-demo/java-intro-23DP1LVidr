package lv.rvt;
import java.util.Scanner;
public class App {

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet skaitļus (-1, lai pabeigtu ievadi): ");
        

        int sum = 0;
        int numberOfNumbers = 0;
        float average = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number < 0) {
                if (number > -2) {
                    break;
                }
            }
            sum = sum + number;
            numberOfNumbers +=1;
            average = sum / numberOfNumbers;

            if (number % 2 == 0) {
                even +=1;
            } else{
                odd +=1;
            }
        }

        System.out.println("Pabeigts");
        System.out.println("Skaitļu summa ir " + sum + ".");
        System.out.println("Jūs ievadījāt " + numberOfNumbers + " skaitļus.");
        System.out.println("Skaitļu vidējā vērtība ir " + average + ".");
        System.out.println("Jūs ievadījāt " + even + " pāra skaitļus un " + odd + " nepāra skaitļus.");

    }
} 