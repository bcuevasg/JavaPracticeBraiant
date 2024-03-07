package chapter6_objects_classes;
/*
 * Write a class that creates instances of the Rectangle class to find the
 * total area of the two rooms in the house.
 */
public class HomeAreaCalculator_6b {
    public static void main(String[] args) {
        /*******************
         * RECTANGLE 1
         *******************/
        //Create instance of Rectangle class
        Rectangle_6a room1 = new Rectangle_6a();
        room1.setWidth(25);
        room1.setLenght(50);

        double areaOfRoom1  = room1.calculateArea();

        /*******************
         * RECTANGLE 2
         *******************/
        Rectangle_6a room2 = new Rectangle_6a(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms is :" + totalArea);


    }
}
