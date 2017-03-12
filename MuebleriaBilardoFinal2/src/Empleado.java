import java.util.ArrayList;

public class Empleado {
	
	private int legajo;
	private String nombreApellido;
	private TipoDeEmpleadoEnum tipodeEmpleado;
	private ArrayList<MueblesAbstract>listaDeMueblesAvender;
	private ArrayList<MueblesAbstract>listaDeMueblesVendidos;
	
public Empleado(){
	
	legajo = 0;
	nombreApellido = "";
	listaDeMueblesAvender = new ArrayList<MueblesAbstract>();
	listaDeMueblesVendidos = new ArrayList<MueblesAbstract>();	
}

public int getLegajo() {
	return legajo;
}

public void setLegajo(int legajo) {
	this.legajo = legajo;
}

public String getNombreApellido() {
	return nombreApellido;
}

public void setNombreApellido(String nombreApellido) {
	this.nombreApellido = nombreApellido;
}

public TipoDeEmpleadoEnum getTipodeEmpleado() {
	return tipodeEmpleado;
}

public void setTipodeEmpleado(TipoDeEmpleadoEnum tipodeEmpleado) {
	this.tipodeEmpleado = tipodeEmpleado;
}

public ArrayList<MueblesAbstract> getListaDeMueblesAvender() {
	return listaDeMueblesAvender;
}

public void setListaDeMueblesAvender(
		ArrayList<MueblesAbstract> listaDeMueblesAvender) {
	this.listaDeMueblesAvender = listaDeMueblesAvender;
}

public ArrayList<MueblesAbstract> getListaDeMueblesVendidos() {
	return listaDeMueblesVendidos;
}

public void setListaDeMueblesVendidos(
		ArrayList<MueblesAbstract> listaDeMueblesVendidos) {
	this.listaDeMueblesVendidos = listaDeMueblesVendidos;
}
public void ImprimirInfoEmpleado(){
	
	System.out.println("El No de legajo del empleado es: " + legajo);
	System.out.println("El nombre y apellido del empleado es: " + nombreApellido);
}
}
