
/**
 * Write a description of class Milmer15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Milmer15
{
    public static void main (String [] args){
       Scanner scanner = new Scanner(System.in);
       int[] arr = new int [5];
       
       System.out.println("Enter 5 numbers:");
       for (int i = 0; i < 5; i++){
           System.out.println("Number " + (i + 1) + ": ");
           arr[i] = scanner.nextInt();
       }
       System.out.print("Numbers greater than 50: ");
       boolean foundOne = false;
       
       for (int num : arr){
           if (num > 50){
               System.out.print(num + " ");
               foundOne = true;
           }
       }
       if (!foundOne) {
           System.out.print("None found. ");
       }
       System.out.println();
    }
    }