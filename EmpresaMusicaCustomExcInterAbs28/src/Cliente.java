import java.util.ArrayList;

public class Cliente extends Persona {
	
	private int telefono;
	private String lugarDenacimiento;
	private boolean activo;
	private ArrayList<Guitarra>listaDeGuitarras;
	
public Cliente(){
	
	super();
	telefono = 0;
	lugarDenacimiento = "";
	activo = true;
	listaDeGuitarras = new ArrayList<Guitarra>();
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	this.telefono = telefono;
}

public String getLugarDenacimiento() {
	return lugarDenacimiento;
}

public void setLugarDenacimiento(String lugarDenacimiento) {
	this.lugarDenacimiento = lugarDenacimiento;
}

public boolean isActivo() {
	return activo;
}

public void setActivo(boolean activo) {
	this.activo = activo;
}

public ArrayList<Guitarra> getListaDeGuitarras() {
	return listaDeGuitarras;
}

public void setListaDeGuitarras(ArrayList<Guitarra> listaDeGuitarras) {
	this.listaDeGuitarras = listaDeGuitarras;
}
public void agregarGuitarrasAlaListaDeGuitarras(Guitarra unaGuitarraMas){
	
	listaDeGuitarras.add(unaGuitarraMas);
}
public void ImprimirInfoCliente(){
	
	ImprimirInfoPersona();
	System.out.println("El telefono del cliente es: " + telefono);
	System.out.println("El lugar de nacimiento del cliente es: " + lugarDenacimiento);
	System.out.println("El cliente está activo?? " + activo);
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("");
}
}
