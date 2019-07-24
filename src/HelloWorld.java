public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int myFavoriteNumber = 15;
        System.out.println(myFavoriteNumber);
        String myString = "this is a string";
        System.out.println(myString);
        myString = "changed this string";
        System.out.println(myString);
        double myNumber = 3.14;
        System.out.println(myNumber);
        int a = 5;
        System.out.println(++a);
        System.out.println(a);
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        int x = 4;
        x += 5;
        System.out.println(x);
        int z = 3;
        int y = 4;
        y *= z;
        System.out.println(y);
        int b = 10;
        int c = 2;
        b /= c;
        c -= b;
        System.out.println(b);
        System.out.println(c);
    }
}