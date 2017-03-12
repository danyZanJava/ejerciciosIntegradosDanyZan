
public class Persona {
	
	private String nombreYapellido;
	private int dni;
	private String domicilio;
	
public Persona(){
	
	nombreYapellido = "";
	dni = 0;
	domicilio = "";
}

public String getNombreYapellido() {
	return nombreYapellido;
}

public void setNombreYapellido(String nombreYapellido) throws ExceptionNombreYApellido {
	
	if ( nombreYapellido == "Indefinido")
	{
		throw new ExceptionNombreYApellido("DEBE COMPLETAR NOMBRE Y APELLIDO !! OBLIGATORIAMENTE");
	}
	this.nombreYapellido = nombreYapellido;
}

public int getDni() {
	return dni;
}

public void setDni(int dni) throws ExceptionDNI {
	
	if ( dni == 0 )
	{
		throw new ExceptionDNI("DNI INCORRECTO!! INGRESELO NUEVAMENTE");
	}
	this.dni = dni;
}

public String getDomicilio() {
	return domicilio;
}

public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}
public void ImprimirInfoPersona(){
	
	System.out.println("Nombre y Apellido: " + nombreYapellido);
	System.out.println("DNI: " + dni);
	System.out.println("Domicilio del cliente: " + domicilio);
}
}
