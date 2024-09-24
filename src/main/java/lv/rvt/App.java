package lv.rvt;
import java.util.Scanner;
public class App {

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet pēdējo skaitli saskaitīšanai: ");
        int number = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i < (number+1); i++) {

           sum+=i;

        }
        System.out.println(sum);
    }

    
} 