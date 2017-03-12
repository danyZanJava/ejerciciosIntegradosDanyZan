
public class Persona {
	
	private String nombreApellido;
	private int DNI;
	private String domicilio;
	private String telefono;
	
public Persona(){
	
	nombreApellido = "";
	DNI = 0;
	domicilio = "";
	telefono = "";
}

public String getNombreApellido() {
	return nombreApellido;
}

public void setNombreApellido(String nombreApellido) throws NombreYapellidoExcpetion {
	
	if ( nombreApellido == (""))
	{
		throw new NombreYapellidoExcpetion("Nombre y apellido incorrecto, completar nuevamente!");
	}
	this.nombreApellido = nombreApellido;
}

public int getDNI() {
	return DNI;
}

public void setDNI(int dNI) throws NroDniException {
	
	if ( dNI == 0)
	{
		throw new NroDniException("DNI incorrecto, Ingréselo nuevamente!");
	}
	this.DNI = dNI;
}

public String getDomicilio() {
	return domicilio;
}

public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public void imprimirInfoPersona(){
	
	System.out.println("El nombre y apellido:" + nombreApellido);
	System.out.println("DNI : " + DNI);
	System.out.println("Domicilio: " + domicilio);
	System.out.println("Telefono: " + telefono);
}
}
