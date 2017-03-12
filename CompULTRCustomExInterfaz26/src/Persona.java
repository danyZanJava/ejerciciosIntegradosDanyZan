
public class Persona {
	
	private String nombreApellido;
	private int DNI;
	private String domicilio;
	private String telefono;
	
public Persona(){
	
	nombreApellido = "";
	DNI = 0 ;
	domicilio = "";
	telefono = "";
}
public String getNombreApellido() {
	return nombreApellido;
}

public void setNombreApellido(String nombreApellido) throws NombreApellidoException {
	
	if ( nombreApellido.equals("Vacio"))
	{
		throw new NombreApellidoException("Ingrese el nombre y apellido correcto!");
	}
	this.nombreApellido = nombreApellido;
}

public int getDNI() {
	return DNI;
}

public void setDNI(int dNI) throws DNIClientePerException{
	
	if ( dNI <= 0)
	{
		throw new DNIClientePerException("Ingrese el DNI correcto !!");
	}
	else
	{
		DNI = dNI;  // Lo mismo que this//
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
	
	System.out.println("El nombre y apellido es: " + nombreApellido);
	System.out.println("El numero de DNI es: " + DNI);
	System.out.println("El domicilio es: " + domicilio);
	System.out.println("El numero de telefono es: " + telefono);	
}
}
