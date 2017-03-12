import java.util.*;

public class Cliente extends Persona {	
	
	private String lugarDeNacimiento;
	private boolean activo;
	private ArrayList<ComputadoraInterf>listaDeComputadoras; 
	
public Cliente(){
	
	super();
	lugarDeNacimiento = "";
	activo = true;
	listaDeComputadoras = new ArrayList<ComputadoraInterf>();
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

public ArrayList<ComputadoraInterf> getListaDeComputadoras() {
	return listaDeComputadoras;
}

public void setListaDeComputadoras(
		ArrayList<ComputadoraInterf> listaDeComputadoras) {
	this.listaDeComputadoras = listaDeComputadoras;
}
public void agregarUnaComputadoraAlaListaDeComputadoras(ComputadoraInterf unaCompMas){
	
	listaDeComputadoras.add(unaCompMas);
}
public void ImprimirInfoCliente(){
	
	ImprimirInfoPersona(); ///hay q ponerlo x q la herencia te permite a TODO lo de la clase persona!!
						  //pero no lo invoca ESTE método automaticamente.
	System.out.println("El lugar de nacimiento del cliente es: " + lugarDeNacimiento);
	System.out.println("Es cliente activo??" + activo);	
}
}
