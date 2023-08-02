class animal{
void eat(){
System.out.println("Eating....");
}

}
class dog extends animal{
void bark(){
System.out.println("Barking dog ");
}
}
class puppy extends animal{
void weep(){
System.out.println(" dog baby is weeping ");
}
public static void main(String[] a){
puppy a1=new puppy();
dog a2=new dog();
a1.eat();
a2.bark();
a1.weep();
}
}


