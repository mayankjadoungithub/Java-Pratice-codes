class testmax{
int max(int []a){
int max=0;
for(int i=0;i<a.length ;i++){
if(a[i]>max){
max=a[i];
}
}
return max;
}
int min( int []a){
int min=a[0];
for(int i=0;i<a.length;i++){
if(a[i]<min){
min=a[i];
}
}
return min;
}
 static void search(int []a,int e){
int f=0;
for(int i=0;i<a.length;i++){
if(a[i]==e){
System.out.println("element found  at position "+(i+1));
f=1;
break;
}
}
if(f==0){
System.out.println("element found not found ");
}
}




public static void main(String a[]){
int []array={23,45,67,89,9};
int e=89;
testmax obj=new testmax();
System.out.println("maximum value is "+obj.max(array));
System.out.println("minimum  value is "+obj.min(array));
search(array,e);
}
}
