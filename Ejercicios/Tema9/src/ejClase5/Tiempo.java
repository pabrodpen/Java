package ejClase5;

public class Tiempo {

	int h,m,s;

	public Tiempo(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
		this.horaCorrecta();//MUY IMP
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
	
	public void horaCorrecta() {
		while(s>59) {
			s=s-60;
			m++;
		}
		while(m>59) {
			m=m-60;
			h++;
		}
	}

	@Override
	public String toString() {
		return "Tiempo [" + h + ":" + m + ":" + s + "]";
	}
	
	public Tiempo suma(Tiempo otro) {
		int sumaH,sumaM,sumaS;
		sumaH=h+otro.getH();
		sumaM=m+otro.getM();
		sumaS=s+otro.getS();
		
		Tiempo sumTiempo=new Tiempo(sumaH, sumaM, sumaS);
		return sumTiempo;
	}
}
