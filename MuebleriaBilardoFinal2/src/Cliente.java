import java.util.ArrayList;

public class Cliente extends Persona {
	
	private int telefono;
	private String lugarDeNacimiento;
	private ArrayList<MueblesAbstract>listaDeMueblesDelCliente;
	
public Cliente(){
	
	telefono = 0;
	lugarDeNacimiento = "";
	listaDeMueblesDelCliente = new ArrayList<MueblesAbstract>();
	//Lista de muebles del Cliente y no de la MuebleriaBilardo
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	this.telefono = telefono;
}

public String getLugarDeNacimiento() {
	return lugarDeNacimiento;
}

public void setLugarDeNacimiento(String lugarDeNacimiento) {
	this.lugarDeNacimiento = lugarDeNacimiento;
}

public ArrayList<MueblesAbstract> getListaDeMueblesDelCliente() {
	return listaDeMueblesDelCliente;
}

public void setListaDeMueblesDelCliente(
		ArrayList<MueblesAbstract> listaDeMueblesDelCliente) {
	this.listaDeMueblesDelCliente = listaDeMueblesDelCliente;
}
public void ImprimirInfoCliente(){
	
	
}


}
