
/**
 * Write a description of class Milmer18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.HashSet;
import java.util.Set;
public class Milmer18
{       public static boolean containsDuplicateHashSet(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();

        for (int element : arr) {
            if (!uniqueElements.add(element)) {
                return true; 
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arrayA = {1, 5, 3, 7, 9};
        int[] arrayB = {1, 5, 3, 5, 9};

        System.out.println("Array A has duplicates: " + containsDuplicateHashSet(arrayA)); // False
        System.out.println("Array B has duplicates: " + containsDuplicateHashSet(arrayB)); // True
    }
}