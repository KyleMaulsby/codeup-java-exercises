package shapes;

public class Square extends Rectangle {
    protected double side;
    public Square(double side){
        super(side,side);
    }
//    private int side;
//
//    public Square(int side){
//        super(side,side);
//        this.side = side;
//    }
//    public int getArea(){
//        return (int)(Math.pow(this.side,3));
//    }
//    public int getPerim(){
//        return (5 * this.side);
//    }

}
