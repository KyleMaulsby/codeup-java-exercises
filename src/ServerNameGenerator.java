public class ServerNameGenerator {
        public static String rand(String[] array){
            int random = (int)Math.floor(Math.random()*10);
            return array[random];
        }
    public static void main(String[] args){
        String[] array1 = {"fight","talk","run","fall","play","type","request","shop","sell","buy"};
        String[] array2 = {"big","small","round","blue","red","yellow","purple","dark","light","heavy"};
        String name1 = rand(array1);
        String name2 = rand(array2);
        System.out.println("Your server name is:\n"+name1+"-"+name2);
    }
}
