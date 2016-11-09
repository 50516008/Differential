package differrential;

import java.util.Scanner;

public class Differrential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("Input value of a>");
        double a=Double.parseDouble(scan.next());
        System.out.println("Input value of h>");
        double h=Double.parseDouble(scan.next());
        

Differrential_lib dlib = new Differrential_lib(a,h);

System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŒW”‚Í"+dlib.getRx());
System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”’l”÷•ª‚Í"+dlib.getDx());
System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é‘Š‘ÎŒë·‚Í"+Math.abs(dlib.getRx()-dlib.getDx())/dlib.getRx()*100);




	}

}
