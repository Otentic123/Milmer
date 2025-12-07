
/**
 * Write a description of class Milmer18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Milmer19
{
    public static void main(String [] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        int[] grades = {85, 92, 78, 65};
        
        if (names.length != grades.length) {
            System.out.println("Arrays must be the same length.");
            return;
        }
        
        System.out.println("--- Student Grades ---");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Student: " + names[i] + ", Grade: " + grades[i]);
        }
    }
}