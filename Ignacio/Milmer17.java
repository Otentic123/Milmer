
/**
 * Write a description of class Milmer17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Milmer17
{
    public static void main(String [] args) {
        int[] arr = {80, 20, 100, 50, 95, 100};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("The array is too small or all elements are the same.");
        } else {
            System.out.println("The highest number is: " + max);
            System.out.println("The second highest number is: " + secondMax);
        }
    }
}