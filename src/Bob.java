import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.endsWith("?")){
            System.out.println("Sure.");
        } else if(input.endsWith("!")){
            System.out.println("Whoa, Chill Out!");
        }else if(input.equals("")){
            System.out.println("Fine. Be that way!");
        }
        else{
            System.out.println("Whatever.");
        }
    }
}
