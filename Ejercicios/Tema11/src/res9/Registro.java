package res9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Registro {

	double temperatura;
	
	LocalDateTime fecha;
	
	
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	public Registro(double temperatura, String fecha) {
		super();
		this.temperatura = temperatura;
		this.fecha = LocalDateTime.parse(fecha,formatter);
	}

	@Override
	public String toString() {
		return "Registro [temperatura=" + temperatura + ", fecha=" + fecha + "]";
	}
	
	
}
