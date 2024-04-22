package ejClase1;

import java.io.Serializable;

public class ParCodAsign implements Serializable{

	Integer[] codYnota=new Integer[2];

	public ParCodAsign(Integer[] codYnota) {
		super();
		this.codYnota = codYnota;
	}

	
	public Integer[] getCodYnota() {
		return codYnota;
	}

	public void setCodYnota(Integer[] codYnota) {
		this.codYnota = codYnota;
	}

	
	
	
	
}
