import java.io.*;

class CirclesWithException
{ 

private static double radius; 

CirclesWithException(double r) 
{ 
setRadius(r); 
} 
void setRadius(double r) 
{ 

if(r<0) 
throw new IllegalArgumentException("Radius cannot be negative"); 
radius=r; 

} 
double getRadius()
{ 

return radius;
} 

void printRadius()
{ 
System.out.println("Radius of the Circle is: " + radius); 

} 
} 

public class Test1
{ 
public static void main(String[] args) 
{ 

Try

{ 

CirclesWithException p = new CirclesWithException(10); 
p.printRadius(); 

CirclesWithException z = new CirclesWithException(0); 
z.printRadius(); 

CirclesWithException n = new CirclesWithException(-6); 
n.printRadius(); 

} 
catch(IllegalArgumentException e) 
{ 

System.out.println(e.getMessage()); 
e.printStackTrace(); 

} 
} 
}
