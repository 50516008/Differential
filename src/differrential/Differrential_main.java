package differrential;

import java.util.Scanner;

public class Differrential_main {
//h=5^10^-12の時、相対誤差が最小である。//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("Input value of a>");
        double a=Double.parseDouble(scan.next());
        System.out.println("Input value of h>");
        double h=Double.parseDouble(scan.next());
        

Differrential_lib dlib = new Differrential_lib(a,h);

System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
System.out.println("f(x)=x^2のx="+a+"における数値微分は"+dlib.getDx());
System.out.println("f(x)=x^2のx="+a+"における相対誤差は"+Math.abs(dlib.getRx()-dlib.getDx())/dlib.getRx()*100);




	}

}
