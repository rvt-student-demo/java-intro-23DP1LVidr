package lv.rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet skaitli: ");
        int beginning = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet vēl vienu skaitli: ");
        int end = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(beginning, end);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i < end; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
        if (end%3==0) {
            System.out.println(end);
        }
    }
}