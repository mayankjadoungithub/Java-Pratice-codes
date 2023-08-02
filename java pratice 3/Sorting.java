import java.io.*;
  
class Sorting {
    public static void main(String[] args)
    {
	System.out.println("TUSHAR KUMAR   SAP ID: 1000014268");
        String names[]= { "Tushar", "John", "Millie", "Adam","Lily","Mohan","Ben","Tina","Siri","Alex" };
        String temp;
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {        
                if (names[i].compareTo(names[j]) > 0) {                 
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("The names in ascending order are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}