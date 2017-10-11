import java.util.Random;
import java.util.Scanner;
public class Loop {
    public static void main(String[]args){

    System.out.print("enter a number");
    Scanner keyboard=new Scanner(System.in);
    int userNumber=keyboard.nextInt();

    int counter=0;
    while(counter<=userNumber){
        System.out.print(counter+",");
        counter++;
    }
}}
