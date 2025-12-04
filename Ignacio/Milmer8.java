
/**
 * Write a description of class Milmer8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Milmer8
{
    public static void main (String [] args){
        int [] A = {2, 4, 6, 8};
        int [] B = new int[A.length];
        
        for (int i = 0; i < A.length; i++){
            B[i] = A[i];
        }
        System.out.print("B: ");
        for (int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
    }
}