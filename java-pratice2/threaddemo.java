 public class a1{
    synchronized void print_name(String name){
   for(int i=0;i<=10;i++){
       System.out.print("Hello : ");
       try{
           Thread.sleep(2000);
       }
       catch(Execption e){

       }
       System.out.println(name);
   }
    }
}
  public class mythread extends Thread{
    a1 ob;
    String nmae;
    mythread(a1 ob,String name){
        this.ob=ob;
        this.name=name;
    }

public void run(){
    ob.print_name(name);
}
}
public class threaddemo{
    public static void main(String[] a){
a1 ob1 = new a1();
mythread t1= new mythread(ob1,"ABC");
mythread t2= new mythread(ob1,"XYZ");
t1.start();
t2.start();
    }
}