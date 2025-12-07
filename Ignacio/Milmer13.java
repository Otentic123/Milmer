
/**
 * Write a description of class Milmer13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Milmer13
{
    public static void main(String [] args){
        int[] grades = {85, 62, 75, 90, 70, 45, 100};
        int passingGrade = 75;
        int passedCount = 0;
        int failedCount = 0;
        
        for (int grade : grades){
            if (grade >= passingGrade){
                passedCount++;
            } else {
                failedCount++;
            }
        }
        System.out.println("Students Passed: "  + passedCount);
        System.out.println("Students Failed: " + failedCount);
    }
}