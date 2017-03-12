import java.util.ArrayList;

public class Cliente extends Persona {
	
	private String lugarDeNacimiento;
	private boolean activo;
	private ArrayList<Automovil>listaDeAutomoviles;
	
public Cliente(){
	
	super();
	lugarDeNacimiento = "";
	activo = true;
	listaDeAutomoviles = new ArrayList<Automovil>();
}

public String getLugarDeNacimiento() {
	return lugarDeNacimiento;
}

public void setLugarDeNacimiento(String lugarDeNacimiento) {
	this.lugarDeNacimiento = lugarDeNacimiento;
}

public boolean isActivo() {
	return activo;
}

public void setActivo(boolean activo) {
	this.activo = activo;
}

public ArrayList<Automovil> getListaDeAutomoviles() {
	return listaDeAutomoviles;
}

public void setListaDeAutomoviles(ArrayList<Automovil> listaDeAutomoviles) {
	this.listaDeAutomoviles = listaDeAutomoviles;
}
public void agregarAutomovilAlaListaDeAutomoviles(Automovil unAutomas){ ///agrego un automovil a la lista//
	
	listaDeAutomoviles.add(unAutomas);
}
public void imprimirInfoCliente(){
	
	imprimirInfoPersona();	///hay q ponerlo x q la herencia te permite a TODO lo de la clase persona!!
	  //pero no lo invoca ESTE método automaticamente.
	System.out.println("El lugar de nacimiento:" + lugarDeNacimiento);
	System.out.println("Activo??" + activo);
	System.out.println("");
	System.out.println("");
}
}
