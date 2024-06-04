import java.util.Scanner;
interface I1{
Scanner sc=new Scanner(System.in);
abstract String m1(int a);
abstract float m2(String b);
static int m3(String s){
System.out.print(s);
return sc.nextInt();
}
static String m4(float f){
System.out.print(f);
return sc.next();
}
}
interface I2{
abstract float m5(int a);
abstract boolean m6(String g);
static int m7(String a){
System.out.print(a);
return I1.sc.nextInt();
}
static int  m8(float d){
System.out.print(d);
return I1.sc.nextInt();
}
}
abstract class Z implements I1,I2{
Z(int a){
System.out.print(a);
}
abstract float m9(int h);
abstract String m10(float l);
static String m11(boolean b){
System.out.print(b);
return I1.sc.next();
}
}
class A extends Z{
A(){
super(10);
}
public String m1(int a){
System.out.print(a);
return I1.sc.next();
}
public float m2(String b){
System.out.print(b);
return I1.sc.nextFloat();
}
public float m5(int a){
System.out.print(a);
return I1.sc.nextFloat();
}
public boolean m6(String g){
System.out.print(g);
return I1.sc.nextBoolean();
}
float m9(int h){
System.out.print(h);
return I1.sc.nextFloat();
}
String m10(float l){
System.out.print(l);
return I1.sc.next();
}
}
class B{
B(){
A obj2=new A();
System.out.print(obj2.m1(I1.sc.nextInt()));
System.out.print(obj2.m2(I1.sc.next()));
System.out.print(I1.m3(I1.sc.next()));
System.out.print(I1.m4(I1.sc.nextFloat()));
System.out.print(obj2.m5(I1.sc.nextInt()));
System.out.print(obj2.m6(I1.sc.next()));
System.out.print(I2.m7(I1.sc.next()));
System.out.print(I2.m8(I1.sc.nextFloat()));
System.out.print(obj2.m9(I1.sc.nextInt()));
System.out.print(obj2.m10(I1.sc.nextFloat()));
System.out.print(Z.m11(I1.sc.nextBoolean()));
}
public static void main(String[]args){
B obj1=new B();
}
}







