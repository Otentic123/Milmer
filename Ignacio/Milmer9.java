
/**
 * Write a description of class Milmer9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Milmer9
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        
        do { 
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
            sum += num;
        } while (num !=0);
        
        System.out.println("Total sum: " + sum);
    }
}