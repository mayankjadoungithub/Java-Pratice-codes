class Rectangle {
     int length;
     int breadth;

     Rectangle() {
        length = 0;
        breadth = 0;
    }

     Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

     void printData() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
    }

     void printArea() {
        System.out.println("Area: " + length * breadth);
    }

     void printPerimeter() {
        System.out.println("Perimeter: " + 2 * (length + breadth));
    }

 
    public static void main(String[] args) {
System.out.println("MAyank Pratap Jadoun");
        Rectangle r1 = new Rectangle();
        r1.printData();
        r1.printArea();
        r1.printPerimeter();
        Rectangle r2 = new Rectangle(7,9);
        r2.printData();
        r2.printArea();
        r2.printPerimeter();
System.out.println("1000014272");
    }
}