import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        String ui = scanner.next();
        System.out.format("The value of pi is approximately %s", ui);

        System.out.println("Input a number");
        int number = scanner.nextInt();
        System.out.format("%s", number);

        System.out.println("Input 3 words");

        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        System.out.format("%s\n%s\n%s", s1,s2,s3);

        System.out.println("Write a sentence");
        String sent = scanner.nextLine();
        System.out.printf("%s", sent);

        System.out.println("Input Width");
        int width = scanner.nextInt();
        System.out.println("Input Length");
        int length = scanner.nextInt();
        int area = width*length;
        int perimiter = (2*width)+(2*length);
        System.out.printf("Area is %ssqr/ft\nPerimiter is %sft", area,perimiter);
    }
}