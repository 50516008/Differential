package differrential;

public class Differrential_lib implements Differrential_if{

private double a, h;

    

    public Differrential_lib(double a, double h) {

        this.a = a;

        this.h = h;

    }


	@Override
	public double getRx() {
		// TODO Auto-generated method stub
    return 2*this.a;


		
	}

	@Override
	public double getDx() {
		// TODO Auto-generated method stub

	    return (Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h;


	
	}
 

	
	}

