import java.util.Scanner;
public class ControlFlowExercises {
    static void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i%5==0) {
                System.out.println("buzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        while(i<=15){
//            System.out.println(i++);
//        }
        for(int i=5;i<=15;i++){
            System.out.println(i);
        }
//        int x = 0;
//        do{
//            System.out.println(x+=2);
//        }while(x<100);
        for(int x=0;x<=100;x+=2){
            System.out.println(x);
        }
//        int y = 100;
//        do{
//            System.out.println(y-=5);
//        }while(y>-10);
        for(int y=100;y>=-10;y-=5){
            System.out.println(y);
        }
//        int z = 2;
//        do{
//            System.out.println(z);
//            z = (int)Math.pow(z, 2);
//        }while(z<1000000);
        for(int z=2;z<1000000;z=(int)Math.pow(z,2)){
            System.out.println(z);
        }

        fizzBuzz(100);
//        String response;
//        do {
//            System.out.println("How High?");
//            int number = scanner.nextInt();
//            System.out.println("Here is your Table:\nnumber | squared | cubed\n------ | ------- | -----");
//            for (int i = 1; i <= number; i++) {
//                System.out.printf("%s      |%s       |%s\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
//            }
//            System.out.println("Would you like to keep going?");
//            response = scanner.next();
//            System.out.println(response);
//        }while(response.equalsIgnorecase("yes"));


    }
}
