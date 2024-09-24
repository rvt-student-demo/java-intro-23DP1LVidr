package lv.rvt;
import java.util.Scanner;
public class App {

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet skaitli no kura skaitīt līdz 100: ");
        int number = Integer.valueOf(scanner.nextLine());

        for (int i = number; i < 101; i++) {
            System.out.println(i);

        }
    }
} 