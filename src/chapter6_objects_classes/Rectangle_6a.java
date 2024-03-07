package chapter6_objects_classes;

public class Rectangle_6a {
    private double lenght;
    private double width;

    // used when we dont know the values of the rectangle
    public Rectangle_6a(){
        lenght = 0;
        width = 0;
    }
    //Bellow is used when we know the values for the rectangle

    //This is the constructor for the Rectangle
    public Rectangle_6a(double lenght, double width){
        this.lenght = lenght; //can be set this way
        setWidth(width);// or can be set this way.
    }

    public double getLenght(){
        return lenght;
    }
    public void setLenght(double lenght){
        this.lenght = lenght;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double calculatePerimeter(){
        return (2 * lenght) + (2 * width);
    }

    public double calculateArea(){
        return lenght * width;
    }
}
