package lv.rvt;

public class Box {

    private double width;
    private double height;
    private double length;

    private double faceArea;
    private double sideArea;
    private double topArea;

    Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double side){
        this.width = side;
        this.height = side;
        this.length = side;
    }

    Box(Box oldBox){
        this.width = oldBox.width();
        this.height = oldBox.height();
        this.length = oldBox.length();
    }

    public Box biggerBox( Box oldBox ){
        return new Box(1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
    }

    public Box smallerBox( Box oldBox ){
        return new Box(0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.length());
    }

    public boolean nests( Box outsideBox, Box insideBox){
        if ( insideBox.width < outsideBox.width() & insideBox.height() < outsideBox.height() & insideBox.length() < outsideBox.length() ) {
            return true;
        } else{
            return false;
        }
    }
    
    double area(){
        return 2 * faceArea + 2 * topArea + 2 * sideArea;
    }
    double volume(){
        return height * topArea;

    }
    public double length(){
        return length;
    }
    public double height(){
        return height;
    }
    public double width(){
        return width;
    }

}
