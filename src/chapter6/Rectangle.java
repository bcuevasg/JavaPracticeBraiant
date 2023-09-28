package chapter6;

public class Rectangle {
    private double lenght;
    private double width;

    // used when we dont know the values of the rectangle
    public Rectangle(){
        lenght = 0;
        width = 0;
    }
    //Bellow is used when we know the values for the rectangle
    public Rectangle(double lenght, double width){
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
