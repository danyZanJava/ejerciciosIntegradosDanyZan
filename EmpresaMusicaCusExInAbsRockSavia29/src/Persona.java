
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

public void setNombreYapellido(String nombreYapellido) {
	this.nombreYapellido = nombreYapellido;
}

public int getDni() throws DNIClienteException {	
	return dni;
}

public void setDni(int dni) throws DNIClienteException {
	
	if ( dni == 0)
	{
		throw new DNIClienteException("DNI Incorrecto, Ingréselo nuevamente");
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
	
	System.out.println("Nombre y Apellido de la persona:" + nombreYapellido);
	System.out.println("DNI de la persona:" + dni);
	System.out.println("Domicilio de la persona:" + domicilio);
}
}
