import java .util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        int sceretenumber = rand.nextInt(100);
        int Guessnumber =0;
        int attemt =0;
        System.out.println("welcome to Garck Game");
        System.out.print("enter your guess number");
        while (Guessnumber!=sceretenumber){
            Guessnumber=reader.nextInt();
            if(Guessnumber>sceretenumber){
                System.out.print("you enter to high");
                attemt++;
            }
            else if(Guessnumber<sceretenumber){
                System.out.print("you enter too low");
                attemt++;
            }
            else {
                System.out.print("you fins it! with  "+attemt+"tries:)");
            }
        } reader.close();
    }
}