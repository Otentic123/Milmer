
/**
 * Write a description of class Milmer4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Milmer4
{
       public static void main (String [] args){
        int[] arr = {45, 12, 88, 5, 93, 22};
        int smallest = arr[0];
        int largest = arr[0];
        
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < smallest) smallest = arr[i];
            if (arr[i] > largest) largest = arr[i];
        }
        
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: "+ largest);
        
        
    }
}
