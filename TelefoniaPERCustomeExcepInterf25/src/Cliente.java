import java.util.ArrayList;;


public class Cliente extends Persona {
	
	private String lugarNacimiento;
	private boolean activo;
	private ArrayList<Telefono>listaDeTelefonos;
	
public Cliente(){
	
	super();
	lugarNacimiento = "";
	activo = true;
	listaDeTelefonos = new ArrayList<Telefono>();
}

public String getLugarNacimiento() {
	return lugarNacimiento;
}

public void setLugarNacimiento(String lugarNacimiento) {
	this.lugarNacimiento = lugarNacimiento;
}

public boolean isActivo() {
	return activo;
}

public void setActivo(boolean activo) {
	this.activo = activo;
}

public ArrayList<Telefono> getListaDeTelefonos() {
	return listaDeTelefonos;
}

public void setListaDeTelefonos(ArrayList<Telefono> listaDeTelefonos) {
	this.listaDeTelefonos = listaDeTelefonos;
}
public void agregoTelefonoAlaListaDeTelefonos(Telefono UnTelefonoMas){
	
	listaDeTelefonos.add(UnTelefonoMas);
}
public void ImprimirInfoCliente(){
	
	this.ImprimirInfoPersona();
	System.out.println("El lugar de nacimiento del cliente es: " + lugarNacimiento);
	System.out.println("Está activo el cliente? " + activo);
	ImprimirInfoEquipos();
}

public void ImprimirInfoEquipos(){
	
	int eq = 0;
	for ( eq = 0; eq < listaDeTelefonos.size(); eq ++)
	{
		if ( listaDeTelefonos.get(eq) instanceof Handy)
		{
			Handy unHandy = (Handy)listaDeTelefonos.get(eq);
			unHandy.imprimirInfoHandy(); // Como la operacion ImprimirInfoHandy no forma parte de la INTERFAZ Telefono necesito CASTEAR para tener 
			                             // acceso a dicho metodo.
		}
		if ( listaDeTelefonos.get(eq) instanceof Smartphone)
		{
			Smartphone unSmartphone = (Smartphone)listaDeTelefonos.get(eq);
			unSmartphone.ImprimioInfoSmartphone();
		}
		if (listaDeTelefonos.get(eq) instanceof TelefonoInalambrico)
		{
			TelefonoInalambrico unTelefonoInalambrico = (TelefonoInalambrico)listaDeTelefonos.get(eq);
			unTelefonoInalambrico.ImprimirInfoTelefonoInalambrico();
		}		
	}	
}

}
