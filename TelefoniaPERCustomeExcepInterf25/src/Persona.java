
public class Persona {
	
	private String nombreApellido;
	private int DNI;
	private String domicilio;
	private String telefono;
	
Persona(){
	
	nombreApellido = "";
	DNI = 0;
	domicilio = "";
	telefono = "";
}

public String getNombreApellido() {
	return nombreApellido;
}

public void setNombreApellido(String nombreApellido) {
	nombreApellido = nombreApellido;
}

public int getDNI(){
	
		return DNI;			
}
public void setDNI(int dNI) throws DNIexception{
	
	if ( dNI == 0 )
	{
		throw new DNIexception("Ingrese DNI correcto");
	}
	else
	{
		DNI = dNI;
	}	
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
public void ImprimirInfoPersona(){
	
	System.out.println("El nombre y apellido de la persona es: " + nombreApellido);
	System.out.println("El DNI de la persona es: " + DNI);
	System.out.println("El domicilio de la persona es: " + domicilio);
	System.out.println("El telefono de la persona es: " + telefono);	
}
}
