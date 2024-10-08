package lv.rvt;
import java.util.Scanner;

public class App {    
    public static void main(String[] args) {
        printStars(5);
        System.out.println("");

        printStars(3);
        System.out.println("");

        printStars(9);
        System.out.println("");
        System.out.println("");

        printSquare(4);
        System.out.println("");

        printRectangle(17,3);
        System.out.println("");

        printTriangle(4);
        System.out.println("");

        printTriangle2(4);
        System.out.println("");

        christmasTree(4);
        System.out.println();
        christmasTree(10);
    }


    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
            System.out.println("");
        }
    }
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
            System.out.println("");
        }
    }
    public static void printTriangle(int size) {
        for (int i = 1; i < (size+1); i++) {
            printStars(i);
            System.out.println("");
        }
    }
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
    public static void printTriangle2(int size) {
        for (int i = 1; i < (size+1); i++) {
            printSpaces(size-i);
            printStars(i);
            System.out.println("");
        }
    }
    public static void christmasTree(int size) {
        for (int i = 1; i < (size+1); i++) {
            printSpaces(size-i);
            printStars(i);
            printStars(i-1);
            System.out.println("");
        }
        printSpaces(size-2);
        printStars(3);
        System.out.println();
        printSpaces(size-2);
        printStars(3);
        System.out.println();
    }
}