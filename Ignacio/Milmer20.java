
/**
 * Write a description of class Milmer20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Milmer20
{
    public static void main(String [] args) {
        int[] arr = {10, 22, 15, 30, 8, 26, 41};
        
        System.out.print("Even numbers greater than 20: ");
        
        for (int num : arr) {
            if (num % 2 == 0 && num > 20) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}