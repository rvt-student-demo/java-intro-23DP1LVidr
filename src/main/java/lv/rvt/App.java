package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        
        System.out.println("Ievadiet skaitļus: ");
        while (true) {
            int input = Integer.valueOf(reader.nextLine());
            if (input == -1) {
                break;
            }
            intList.add(input);
        }
        System.out.println("No kura? ");
        int start = Integer.valueOf(reader.nextLine());

        while (start > (intList.size()-1) || start<0) {
            System.out.println("Elements neder, ievadiet citu.");
            start = Integer.valueOf(reader.nextLine());
        }

        System.out.println("Līdz kuram? ");
        int end = Integer.valueOf(reader.nextLine());

        while (start > end || end > (intList.size()-1) || end < 0) {
            System.out.println("Elements neder, ievadiet citu. ");
            end = Integer.valueOf(reader.nextLine());
        }
        System.out.println();
        for (int i = start; i < end+1; i++){
            System.out.println(intList.get(i));
        }
    }
}