
/**
 * Write a description of class Milmer12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Milmer12
{
    public static void main (String [] args){
    int[] arr = {1,5,2,5,8,5,9,5};
    int target = 5;
    int count = 0;
    
    for(int num : arr){
        if(num == target) {
            count++;
            if(count >= 3){
                break;
            }
        }
    }
        if(count >= 3) {
            System.out.println("The value " + target + "appears at least 3 time.");
        } else {
            System.out.println("The value " + target + "appears only " + count + " times.");
        }
    }
}