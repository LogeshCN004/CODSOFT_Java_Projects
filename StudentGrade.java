import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        System.out.println("----Student Grade Calculator----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int numOfSubjects = sc.nextInt();
        int[]marks =  new int[numOfSubjects];
        int TotalMarks = 0;
        System.out.println("Enter the marks for each subject(out of 100):");
        for(int i =0; i<numOfSubjects; i++) {
            System.out.println("Subject "+(i+1)+": ");
            marks[i] = sc.nextInt();
            TotalMarks+= marks[i];
        }
        double AvgPercent = Math.round(((double)TotalMarks/numOfSubjects)*100.0)/100.0;
        char Grade;
        if(AvgPercent>=90) {
            Grade = 'A';
        }
        else if(AvgPercent>=80) {
            Grade = 'B';
        }
        else if(AvgPercent>=70) {
            Grade = 'C';
        }
        else if(AvgPercent>=60) {
            Grade = 'D';
        }
        else {
            Grade = 'F';
        }
        System.out.println("\n----Results----\n");
        System.out.println("Total Marks: "+TotalMarks);
        System.out.println("Average: "+AvgPercent+"%");
        System.out.println("Grade: "+Grade);
        System.out.println("\n----Thank You----\n");
        sc.close();
    }
}
