import java.util.*;
public class BiseccionS{

double a,b,xm,tol,e;

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

BiseccionS B=new BiseccionS();

System.out.println("Dame la tolerancia");
B.tol=sc.nextDouble();

do{
System.out.println("Dame a");
B.a=sc.nextDouble();
System.out.println("Dame b");
B.b=sc.nextDouble();
}while(B.f(B.a)*B.f(B.b)>=0);

do{
B.xm=(B.a+B.b)/2;
if(B.f(B.a)*B.f(B.xm)<0)
B.b=B.xm;
else
B.a=B.xm;
B.e=Math.abs(B.a-B.b);
}while(B.e>B.tol);

System.out.printf("\nLa raiz es %.4f",B.xm);
}
public double f(double x){
return x*x-4*x-6;
}
}

