import java.util.ArrayList;

public class Cliente extends Persona {
	
	private int telefono;
	private String lugarNacimiento;
	private boolean estaActivo;
	private ArrayList<Piano>listaDePianos;
	
public Cliente(){
	
	telefono = 0;
	lugarNacimiento = "";
	estaActivo = true;
	listaDePianos = new ArrayList<Piano>();
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	this.telefono = telefono;
}

public String getLugarNacimiento() {
	return lugarNacimiento;
}

public void setLugarNacimiento(String lugarNacimiento) {
	this.lugarNacimiento = lugarNacimiento;
}

public boolean isEstaActivo() {
	return estaActivo;
}

public void setEstaActivo(boolean estaActivo) {
	this.estaActivo = estaActivo;
}

public ArrayList<Piano> getListaDePianos() {
	return listaDePianos;
}

public void setListaDePianos(ArrayList<Piano> listaDePianos) {
	this.listaDePianos = listaDePianos;
}
public void agregarPianoAlaListaDePianos(Piano unPianoMas){
	
	listaDePianos.add(unPianoMas);
}
public void ImprimirInfoCliente(){
	
	ImprimirInfoPersona(); // llamo al metodo ImprimirInfoPersona por ésta en la clase Persona
	System.out.println("El teléfono del cliente es: " + telefono);
	System.out.println("El lugar de nacimiento del cliente es: " + lugarNacimiento);
	System.out.println("El cliente está activo?? " + estaActivo);
	System.out.println("");
	System.out.println("-----------------------------------------------------------------------------------");	
}
}
