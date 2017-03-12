
public class Persona {
	
	private String nombreYapellido;
	private int dNI;
	private String domicilio;
	
public Persona(){
	
	nombreYapellido = "";
	dNI = 0;
	domicilio = "";	
}

public String getNombreYapellido() {
	return nombreYapellido;
}

public void setNombreYapellido(String nombreYapellido) {
	this.nombreYapellido = nombreYapellido;
}
public int getdNI()  {
	return dNI;
}

public void setdNI(int dNI) throws DNIClienteException{  /////////////////////////////////////
	
	if ( dNI == 0)
	{
		throw new DNIClienteException("Nro de DNI Incorrecto, ingrese nuevamente!!");
	}
	this.dNI = dNI;
}

public String getDomicilio() {
	return domicilio;
}

public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}
public void ImprimirInfoPersona(){
	
	System.out.println("Nombre y Apellido de la persona: "+ nombreYapellido);
	System.out.println("DNI de la persona: " + dNI);
	System.out.println("Domicilio de la persona: " + domicilio);
}
}
