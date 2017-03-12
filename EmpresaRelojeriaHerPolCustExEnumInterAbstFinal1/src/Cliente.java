
import java.util.ArrayList;

public class Cliente extends Persona {
	
	private int telefono;
	private boolean activo;
	private ArrayList<RelojesAbstract>listaDeRelojesCliente; 
	
	//Lista de relojes del cliente y NO la lista de
    //los relojes de la Relojería
	
public Cliente(){
	
	telefono = 0;
	activo = true;
	listaDeRelojesCliente = new ArrayList<RelojesAbstract>();
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	this.telefono = telefono;
}

public boolean isActivo() {
	return activo;
}

public void setActivo(boolean activo) {
	this.activo = activo;
}

public ArrayList<RelojesAbstract> getListaDeRelojes() {
	return listaDeRelojesCliente;
}

public void setListaDeRelojes(ArrayList<RelojesAbstract> listaDeRelojes) {
	this.listaDeRelojesCliente = listaDeRelojes;
}
public  void agregarRelojesAlaListaDeRelojesDelCliente(RelojesAbstract unRelojMas){
	
	listaDeRelojesCliente.add(unRelojMas);
}
public void ImprimirInfoCliente(){
	
	this.ImprimirInfoPersona();
	System.out.println("El telefono del cliente es: " + telefono);
	System.out.println("El cliente es activo?? " + activo);
	System.out.println("");
	System.out.println("                 ------------Relojes----------");
	System.out.println("");
	int rel = 0;
	for (rel = 0; rel < listaDeRelojesCliente.size(); rel ++) // Imprimo RELOJES del CLIENTE ===================================
	{
		System.out.println("");
		System.out.println("                     Reloj No: " + (rel +1) +  "                         ");
		System.out.println("");
			if ((listaDeRelojesCliente.get(rel)) instanceof RelojAntiguo)
			{
				RelojAntiguo unRelojAntiguo = (RelojAntiguo)listaDeRelojesCliente.get(rel);
				unRelojAntiguo.ImprimirInfoRelojAntiguo();
			}
			if ((listaDeRelojesCliente.get(rel)) instanceof RelojPulsera)
			{
				RelojPulsera unRelojPulsera = (RelojPulsera)listaDeRelojesCliente.get(rel);
				unRelojPulsera.ImprimirInfoRelojPulsera();
			}
			if ((listaDeRelojesCliente.get(rel)) instanceof RelojDespertador)
			{
				RelojDespertador unRelojDespertador = (RelojDespertador)listaDeRelojesCliente.get(rel);
				unRelojDespertador.ImprimirInfoRelojDespertador();
			}
		}	
}
}
