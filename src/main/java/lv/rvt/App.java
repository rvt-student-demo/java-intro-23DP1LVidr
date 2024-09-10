package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Uzrakstiet savu vārdu");
        String name = scanner.nextLine();

        System.out.println("Uzrakstiet savu uzvārdu");
        String surname = scanner.nextLine();

        System.out.println("Ievadiet savu grupu");
        String group = scanner.nextLine();
        
        System.out.println("Students: " + name + " " + surname + ", grupa: " + group);
    }
}