package lv.rvt;

import java.util.Scanner;

public class Gift_tax 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet dāvanas cenu: ");
        String gift = scanner.nextLine();
        int giftAsInt = Integer.valueOf(gift);

        if (giftAsInt < 5000) {
            System.out.println("Nav nodokļu!");

        } else if (giftAsInt > 5000 || giftAsInt < 25000) {
            System.out.println(100+(giftAsInt-5000)*0.08);

        } else if (giftAsInt > 25000 || giftAsInt < 55000) {
            System.out.println(1700+(giftAsInt-25000)*0.10);

        } else if (giftAsInt > 55000 || giftAsInt < 200000) {
            System.out.println(4700+(giftAsInt-55000)*0.12);

        } else if (giftAsInt > 200000 || giftAsInt < 1000000) {
            System.out.println(22100+(giftAsInt-200000)*0.15);

        } else if (giftAsInt > 1000000) {
            System.out.println(142100+(giftAsInt-1000000)*0.17);
        }
    }
}
