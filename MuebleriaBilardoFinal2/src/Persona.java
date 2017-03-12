
public class Persona {
	
	private String nombreYApellido;
	private int dNI;
	private String domicilio;
	
public Persona(){
	
	nombreYApellido = "";
	dNI = 0;
	domicilio = "";
}

public String getNombreYApellido() {
	return nombreYApellido;
}

public void setNombreYApellido(String nombreYApellido) {
	this.nombreYApellido = nombreYApellido;
}

public int getdNI() {
	return dNI;
}

public void setdNI(int dNI) {
	this.dNI = dNI;
}

public String getDomicilio() {
	return domicilio;
}

public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}
public void ImprimirInfoPersona(){
	
	System.out.println("Nombre y Apellido: " + nombreYApellido);
	System.out.println("DNI: " + dNI);
	System.out.println("Domicilio: " + domicilio);
}

}
