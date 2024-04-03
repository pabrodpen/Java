package res9;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Registro implements Serializable{

	double temperatura;
	
	LocalDateTime fecha;
	
	
	static final DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	public Registro(double temperatura, String fecha) {
		super();
		this.temperatura = temperatura;
		this.fecha = LocalDateTime.parse(fecha,formatter);
	}

	@Override
	public String toString() {
		return "Registro [temperatura=" + temperatura + ", fecha=" + fecha.format(formatter) + "]";
	}
	
	
}
