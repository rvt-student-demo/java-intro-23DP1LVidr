package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

    
        while (true) {

            System.out.println("Ievadiet skaitli: ");
            int num =  Integer.valueOf(scanner.nextLine());
    
            if (num == 0) {
                break;
            };
                sum = sum + num;
                count = count + 1;
        }
        System.out.println("Ievadīto skaitļu summa ir " + sum);
        System.out.println("Ievadīto skaitļu skaits ir " + count);
    }
}