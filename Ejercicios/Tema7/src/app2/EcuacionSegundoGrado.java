package app2;

public class EcuacionSegundoGrado {

	
	double a,b,c;

	
	
	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}


	public EcuacionSegundoGrado(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	
	public boolean esPositivo(EcuacionSegundoGrado e) {
		if(Math.pow(e.getB(), 2)-4*e.getA()*e.getC()>=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public double[] resultados(EcuacionSegundoGrado e) {
		
		boolean discriminantePosit=esPositivo(e);
		
		if(discriminantePosit) {
			double res1=(-e.getB()+Math.sqrt(Math.pow(e.getB(), 2)-4*e.getA()*e.getC()))/(2*e.getA());
			double res2=(-e.getB()-Math.sqrt(Math.pow(e.getB(), 2)-4*e.getA()*e.getC()))/(2*e.getA());

		
			double[] resultados= {res1,res2};
			return resultados;

		}else {
			System.out.println("No se puede realizar la ecuacion");
			double[] resultados= {0,0};
			return resultados;

		}
		
		
				
		
		}
}
