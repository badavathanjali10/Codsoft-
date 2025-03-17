import java.util.Scanner;
public class UniqueGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many subjects do you have? ");
        int numSubjects = input.nextInt();
        input.nextLine(); 
        double sum = 0;
        String[] subjectNames = new String[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject name: ");
            subjectNames[i] = input.nextLine();
            System.out.print("Enter marks for " + subjectNames[i] + " (out of 100): ");
            double score = input.nextDouble();
            input.nextLine();
            sum += score;
        }
        double avg = sum / numSubjects;
        char grade = (avg >= 85) ? 'A' :
                     (avg >= 75) ? 'B' :
                     (avg >= 65) ? 'C' :
                     (avg >= 50) ? 'D' : 'F';
        System.out.println("\n--- FINAL REPORT ---");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjectNames[i] + " - Marks: " + ((i + 1) * 5 + 60)); 
        }
        System.out.printf("Total Marks: %.1f/%d%n", sum, numSubjects * 100);
        System.out.printf("Overall Percentage: %.2f%%%n", avg);
        System.out.println("Final Grade: " + grade);

        input.close();
    }
}