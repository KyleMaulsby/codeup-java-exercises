package shapes;

class Rectangle extends Quadrilateral implements Measurable{
//    Quadrilateral box1 = new Rectangle();
    public Rectangle(double lng, double wid){
        super(lng,wid);
    }
    public void setL(double Length){
        this.length = Length;
    }
    public void setW(double Width){
        this.width= Width;
    }
//    private int width;
//    private int height;
//    public Rectangle(int height,int width){
//        this.height = height;
//        this.width = width;
//    }
////    protected static int getArea(Rectangle shape){
////        return shape.width*shape.height;
////    }
////    protected static int getPerim(Rectangle shape){
////        return (2*shape.width) + (2*shape.height);
////    }
//
//    protected int getArea(){
//        return this.width*this.height;
//    }
//    protected int getPerim(){
//        return (2*this.width) + (2*this.height);
//    }
}
