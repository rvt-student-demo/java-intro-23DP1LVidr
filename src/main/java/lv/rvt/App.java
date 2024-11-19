package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 

public class App {    
    public static void main(String[] args) throws Exception{

        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();
        
            try {
                Thread.sleep(10);
            } catch (Exception e) {
        
            }
        }
    }
}