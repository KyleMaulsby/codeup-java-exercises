import java.util.Scanner;
//import java.lang.Math;
public class HighLow {
    public static void main(String[] args) {
        intro();
        if(character.gameoverValue == 0) {
            fight1();
        }
    }
    public static int dice(int side){
        double roll = Math.ceil(Math.random() * side);
            return (int)roll;
    }
    public static class character{
        private static int gameoverValue = 0;
        private static String playerName = "";
        private static int playerhp = 50;
        private static int baddyhp1 = 20;
        private static int Potion = 3;
    }
    public static void intro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name adventurer?");
        character.playerName = scanner.nextLine();
        if (character.playerName.equalsIgnoreCase("tim")) {
            character.gameoverValue = 1;
            System.out.println("Gameover!?!?");
        }else {
            System.out.println("Hello there, " + character.playerName + ".");
            System.out.println("After the town of friendly chased you out with torches and pitchforks, you continue on your way through the woods to get to the city of Whoknowsville.");
            System.out.println("*snap!* What was that? Hello? You notice a tall shadowy figure approach from the distance.  It's running straight toward you. Defend yourself!");
        }
    }
    public static void fight1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The figure starts to come into view as the light reveals a 10ft tall one-eyed ogre with "+character.baddyhp1+" hp and a wooden club that deals d8 damage.");
        do{
            System.out.println("What do you do?(Fight/Potion("+character.Potion+")/Run)");
            String response = scanner.nextLine();
            response(response);
        }while(character.baddyhp1>0);
        System.out.println("");
    }
    public static void response(String input){
        int badDmg = dice(8);
        int goodDmg = dice(8);
        if(input.equalsIgnoreCase("fight")){
            character.baddyhp1-=goodDmg;
            System.out.println("You strike your foe dealing "+goodDmg+" damage.");
            if(character.baddyhp1 <= 0){
                System.out.println("The enemy is no more.");
            }else {
                character.playerhp-=badDmg;
                System.out.println("Your foe strikes you back and you take "+badDmg+" damage.");
                if(character.playerhp<=0){
                    character.gameoverValue = 1;
                    System.out.println("Gameover");
                }
                System.out.println("Player HP: "+character.playerhp+"\nEnemy HP: "+character.baddyhp1);
            }
        }  else if(input.equalsIgnoreCase("Potion")){
            if(character.Potion > 0) {
                character.Potion--;
                int healing = dice(20);
                character.playerhp += healing;
                System.out.println("You drink one of your potions healing for " + healing + " health.");
            }else{
                System.out.println("You ran out of potions. Uh Oh!  While fumbling through your bag your foe strikes you dealing "+badDmg+" damage.");
                character.playerhp -=badDmg;
            }
            System.out.println("Player HP: "+character.playerhp+"\nEnemy HP: "+character.baddyhp1);
        } else if(input.equalsIgnoreCase("Run")){
            int run = dice(6);
            if(run == 6){
                character.baddyhp1 = 0;
                System.out.println("You run away successfully.");
            }else{
                character.playerhp -=badDmg;
                System.out.println("You tried to run, but you tripped and fell after they hit you in the back taking "+badDmg+" damage.");
                System.out.println("Player HP: "+character.playerhp+"\nEnemy HP: "+character.baddyhp1);
            }
        }
    }
//    public static void guesser(){
//        Scanner scanner = new Scanner(System.in);
//        double random = (Math.ceil(Math.random()*100));
//        int count=0;
//        int guess;
//        System.out.println("Can you guess the number from 1-100?");
//        do {
//            guess = scanner.nextInt();
//            if (guess == random) {
//                System.out.println("Woah you guess it!!\nIt only took you "+count+" tries!");
//            } else if (guess > random) {
//                System.out.println("Lower");
//            } else if (guess < random) {
//                System.out.println("Higher");
//            }
//            count++;
//        }while(guess != random);
//    }
}
