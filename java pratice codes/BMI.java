public class BMI {
 public static void main(String[] a1) {

 int Weight = Integer.parseInt(a1[0]);
 float Height = Float.parseFloat(a1[1]);
 float BMI = Weight/(Height*Height);
 System.out.println("Your BMI is = "+ BMI);
 }
}
