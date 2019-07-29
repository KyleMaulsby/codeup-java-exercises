import java.util.Scanner;
import java.lang.Math;
public class MethodsExercises {
    public static void main(String[] args) {
        add(4,2);
        sub(4,2);
        mult(4,9);
        div(4,2);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
        factorial();
        dice();
    }
    public static void add(int num1,int num2){
        System.out.println(num1+" and "+num2+" added are "+(num1+num2));
    }
    public static void sub(int num1,int num2){
        System.out.println(num1+" and "+num2+" subtracted are "+(num1-num2));
    }
    public static void mult(int num1,int num2){
        int numMultiplied=0;
        for(int i = 1;i<=num2;i++){
            numMultiplied+=num1;
        }
            System.out.println(num1+" and "+num2+" subtracted are "+(numMultiplied));
    }
    public static void div(int num1,int num2){
        System.out.println(num1+" and "+num2+" divided are "+(num1/num2));
    }

//    public static int getInteger(int min,int max) {
//
//    }
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1-10 and ill show you the factorial");
        int input = scanner.nextInt();
        if(input<=0 || input>=11){
            System.out.println("Thats not a number between 1-10 try again.");
            factorial();
        }else {
            String Factorial = input + "! = ";
            long total = 1;
            for (int i = 1; i <= input; i++) {
                if (input == i) {
                    Factorial += i + " = " + (total *= i);
                } else {
                    total *= i;
                    Factorial += i + " x ";
                }
            }
            System.out.println(Factorial+"\nWould you like the play again?(y/n)");
            String confirm = scanner.next();
            if (confirm.equalsIgnoreCase("y")) {
                factorial();
            }
        }
    }
    public static void dice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What side dice would you like to roll?");
        int diceside = scanner.nextInt();
        double roll1 = Math.ceil(Math.random() * diceside);
        double roll2 = Math.ceil(Math.random() * diceside);
        System.out.println("You rolled a "+(int)roll1+" and a "+(int)roll2);
        System.out.println("Would you like to roll again?(y/n)");
        String confirm = scanner.next();
        if (confirm.equalsIgnoreCase("y")) {
            dice();
        }
    }
}