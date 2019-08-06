package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student kyle = new Student("kyle");
        kyle.addGrade(100);
        kyle.addGrade(90);
        kyle.addGrade(80);
        Student jade = new Student("jade");
        jade.addGrade(70);
        jade.addGrade(70);
        jade.addGrade(80);
        Student twilight = new Student("twilight");
        twilight.addGrade(50);
        twilight.addGrade(60);
        twilight.addGrade(70);
        Student kyziko = new Student("kyziko");
        kyziko.addGrade(10);
        kyziko.addGrade(20);
        kyziko.addGrade(30);
        System.out.println(kyle.getGradeAverage());


        students.put("KyleMaulsby",kyle);
        students.put("Jade",jade);
        students.put("TwilightJade",twilight);
        students.put("Kyziko",kyziko);
        String confirm = "y";
        System.out.println("Welcome");
        System.out.println("Here are the GitHub usernames of our students:");
        do {
            studentList();
            System.out.println("What student would you like to see more information on?");
            String userQuery = scanner.nextLine();
            if(students.containsKey(userQuery)){
                System.out.println("Name: "+students.get(userQuery).getName()+" - "+"GitHub Username: "+userQuery+"\nCurrent Average: "+students.get(userQuery).getGradeAverage());
            }else{
                System.out.println("Sorry, no student found with the GitHub username of "+ userQuery);
            }
            System.out.println("Would you like to see another student");
            confirm = scanner.nextLine();
        }while(confirm.toLowerCase().equals("y"));
        System.out.println("Goodbye, and have a wonderful day!");
    }

    public static void studentList(){
        String list = "";
        for(String username: students.keySet()){
            list +=("| "+username+" |");
        }
        System.out.println(list);
    }
}
