package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double lng, double wid) {
        this.length = lng;
        this.width = wid;
    }
    public abstract void setL(double Length);
    public abstract void setW(double Width);
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getPerimeter(){
        return 2*width + 2*length;
    }
    public double getArea(){
        return width * length;
    }

}
