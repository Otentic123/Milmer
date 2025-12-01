
/**
 * Write a description of class MIlmer1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MIlmer2
{
   public static void main(String [] args){
      int[] arr = {17, 7, 7, 3, 7, 42, 5, 7, 6, 7};
      int target = 7;
      int count = 0;
      
      for (int i = 0; i < arr.length; i++){
          if (arr[i] == target) {
              count++;
          }
      }
       
      System.out.print("The number " + target + " appears " + count + " times."); 
    
   }
}