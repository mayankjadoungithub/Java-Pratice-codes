public class Circles
{
     int radius;
    

     Circles()
    {
        radius = 8;
    }

     Circles(int radius) 
    {
        this.radius= radius;
    }

     void printData() 
    {
        System.out.println("Radius: " + radius );
    }

     void printArea() 
    {
        System.out.println("Area: " + 3.14 * radius * radius);
    }

     void printPerimeter() 
    {
        System.out.println("Perimeter: " + 2 * 3.14 * radius);
    }


    public static void main(String[] args) 
    {
        Circles c1 = new Circles();
        c1.printData();
        c1.printArea();
        c1.printPerimeter();
        Circles c2 = new Circles(12);
        c2.printData();
        c2.printArea();
        c2.printPerimeter();
    }
}