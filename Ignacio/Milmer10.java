
/**
 * Write a description of class Milmer10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Milmer10
{
    public static void main (String [] args){
        
        int[] arr= {1,3,5,7,8,10,12};
        int foundIndex = -1;
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                foundIndex = 1;
                break;
            }
        }
        if (foundIndex != -1){
            System.out.println("First even number found in index: " + foundIndex);
        } else {
            System.out.println("No even number found.");
        }
        }
    }