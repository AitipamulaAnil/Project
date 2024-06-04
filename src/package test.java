package test;
import p1.*;
import p1.p2.*;
public class IMP extends p1.A implements p1.p2.I1{
	public IMP(){
	super(A.sc.nextInt());
	}
	public String m5(int a){
	System.out.println(a);
	return A.sc.next();
	}
	public boolean m9(String s){
	System.out.println(s);
	try{
		int u=A.sc.nextInt();
		int v=A.sc.nextInt();
		int x=u/v;
		System.out.println(x);
		}
	catch(ArithmeticException i){
		System.out.println(i);
		
	return A.sc.nextboolean();
	}
try{
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print(arr[n]);
		}
		catch(ArrayindexoutofBoundsException g){
			System.out.println(g);
			}


	public double m7(int k){
	System.out.print(k);
	return A.sc.nextDouble();
	}
	
	
}