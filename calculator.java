import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for Maths: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter marks for Physics: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int mark3 = scanner.nextInt();

        int totalMarks = mark1 + mark2 + mark3;
        double average_percentage = (totalMarks / 3);

        String grade = calculateGrade(average_percentage);

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average_percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
