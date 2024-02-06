package res1;

public class Hora {

	int h,min;

	public Hora(int h, int min) {
		this.h = h;
		this.min = min;
	}
	
	public void incremento() {
		if(fechaCorrecta()) {
			min++;
			if(min>59) {
				h++;
				min=0;
			}
			
			if(h>23){
				h=0;
				min=0;
			}
		}else {
			System.out.println("No se puede incrementar.Hora incorrecta");
		}
		
		
	}
	
	public boolean fechaCorrecta() {
		if(h<=23 && h>=0 && min<=59 && min>=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public String mostrar() {
		return h+":"+min;
	}

	
}
