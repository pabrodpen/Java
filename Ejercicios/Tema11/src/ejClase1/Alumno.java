package ejClase1;

import java.io.Serializable;
import java.util.Arrays;

public class Alumno implements Serializable{

	String dni,nombre;
	Integer[] par1=new Integer[2];
	Integer[] par2=new Integer[2];
	Integer[] par3=new Integer[2];
	Integer[] par4=new Integer[2];
	Integer[] par5=new Integer[2];
	
	public Alumno(String dni, String nombre, Integer[] par1, Integer[] par2, Integer[] par3, Integer[] par4,Integer[]par5) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.par1=par1;
		this.par2=par2;
		this.par3=par3;
		this.par4=par4;
		this.par5=par5;

	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", par1=" + Arrays.toString(par1) + ", par2="
				+ Arrays.toString(par2) + ", par3=" + Arrays.toString(par3) + ", par4=" + Arrays.toString(par4)
				+ ", par5=" + Arrays.toString(par5) + "]";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer[] getPar1() {
		return par1;
	}

	public void setPar1(Integer[] par1) {
		this.par1 = par1;
	}

	public Integer[] getPar2() {
		return par2;
	}

	public void setPar2(Integer[] par2) {
		this.par2 = par2;
	}

	public Integer[] getPar3() {
		return par3;
	}

	public void setPar3(Integer[] par3) {
		this.par3 = par3;
	}

	public Integer[] getPar4() {
		return par4;
	}

	public void setPar4(Integer[] par4) {
		this.par4 = par4;
	}

	public Integer[] getPar5() {
		return par5;
	}

	public void setPar5(Integer[] par5) {
		this.par5 = par5;
	}
	
	
	
	
	
	
	
	
}
