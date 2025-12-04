
/**
 * Write a description of class Milmer7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Milmer7
{
    public static void main (String [] args){
        int[] arr = {-1, -2, -3, -4, -5};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = -arr[i];
            }
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
}
}