import java.io.*; 

public class Except 
{

void readLine(File f) throws IOException
{ 
FileReader r = new FileReader(f); 
BufferedReader b = new BufferedReader(r); 
System.out.println(b.readLine()); 
} 
void fileExist() throws IOException
{ 

File f = new File("Filename.txt"); 
readLine(f); 
}

 public static void main(String[] args) 
{ 
try
{ 

Except e = new Except(); 
e.fileExist(); } catch(Exception ex)  
{ 

ex.printStackTrace(); 

} 
finally
{ 

System.out.println("\nThere was an error while executing,terminating execution."); 
}
} 

}

