package app15;

public class Calendario {

	int anio,mes,dia;

	public Calendario(int anio, int mes, int dia) {
		super();
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}
	
	void incrementarDia() {
		if(dia==31 && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)) {
			dia=1;
			mes++;
		}else if(dia==30 && (mes==4 || mes==6 || mes==9 || mes==11)) {
			dia=1;
			mes++;
		}else if(dia==28 && mes==2) {
			dia=1;
			mes++;
		}else {
			dia++;
		}
	}
	
	void incrementarMes() {
		if(mes==12) {
			mes=1;
			anio++;
		}else {
			mes++;
		}
	}
	
	
	
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	void incrementarAnio() {
		anio++;
	}
	
	boolean fechaCorrecta() {
		boolean correcto=false;
		
		if(anio>0 && mes<=12 && mes>0 && dia>0) {
			if((dia<=31 && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)) || (dia<=30 && (mes==4 || mes==6 || mes==9 || mes==11)) || (dia<=28 && mes==2)) {
				correcto=true;
			}
		}
		
		return correcto;
	}
	
	boolean iguales(Calendario otro) {
		if(anio==otro.getAnio() && mes==otro.getMes() && dia==otro.getDia()) {
			return true;
		}else {
			return false;
		}
	}
	
	void mostrar() {
		System.out.println("Fecha:"+dia+"/"+mes+"/"+anio);
	}
}
