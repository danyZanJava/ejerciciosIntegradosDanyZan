import java.util.ArrayList;

public class Empleado extends Persona {
	
	private int legajo;
	private double calificacion;
	private TipoEmpleadoEnumerado tipoDeEmpleado;
	private ArrayList<RelojesAbstract>listaDeRelojesAvender;
	private ArrayList<RelojesAbstract>listaDeRelojesVendidos;
	
public Empleado(){
	
	super();
	legajo = 0;
	calificacion = 0;
	listaDeRelojesAvender = new ArrayList<RelojesAbstract>();
	listaDeRelojesVendidos = new ArrayList<RelojesAbstract>();
}

public int getLegajo() {
	return legajo;
}


public void setLegajo(int legajo) {
	this.legajo = legajo;
}
public double getCalificacion() {
	return calificacion;
}

public void setCalificacion(double calificacion) {
	this.calificacion = calificacion;
}

public TipoEmpleadoEnumerado getTipoDeEmpleado() {
	return tipoDeEmpleado;
}

public void setTipoDeEmpleado(TipoEmpleadoEnumerado tipoDeEmpleado) {
	this.tipoDeEmpleado = tipoDeEmpleado;
}

public ArrayList<RelojesAbstract> getListaDeRelojesAvender() {
	return listaDeRelojesAvender;
}

public void setListaDeRelojesAvender(
		ArrayList<RelojesAbstract> listaDeRelojesAvender) {
	this.listaDeRelojesAvender = listaDeRelojesAvender;
}
public ArrayList<RelojesAbstract> getListaDeRelojesVendidos() {
	return listaDeRelojesVendidos;
}

public void setListaDeRelojesVendidos(
		ArrayList<RelojesAbstract> listaDeRelojesVendidos) {
	this.listaDeRelojesVendidos = listaDeRelojesVendidos;
}
public void agregoRelojesAlaListaDeRelojesAvender(RelojesAbstract unRelojMas){
	
	listaDeRelojesAvender.add(unRelojMas);
}
public void agregoRelojesAlaListaDeRelojesVendidos(RelojesAbstract otroRelojMas){
	
	listaDeRelojesVendidos.add(otroRelojMas);
}

public void ImprimirInfoEmpleado(){
	///Se detallan las operaciones de todos los tipos enumerados Gerente,Vendedor,Lider,Contador recorriendo
	/// la lista LISTA DE RELOJES AVENDER en forma generalizada con todas las categorías de empleados
	///utilizando INSTANCEOF para cada tipo de reloj mediante un Casteo;
	///a titulo informativo para explicar cómo se recorren todos los enumerados.
	
	this.ImprimirInfoPersona(); // herencia de clase Persona
	System.out.println("Legajo del empleado" + legajo);
	System.out.println("Calificación del empleado" + calificacion);
	int v = 0;
	
	   if (tipoDeEmpleado == TipoEmpleadoEnumerado.gerente) // X enumerado gerente
	   {
		   System.out.println("categoria gerente");
		   
		   for (v = 0; v < listaDeRelojesAvender.size(); v ++) //LISTA DE RELOJES A VENDER
		   {
			   if (listaDeRelojesAvender.get(v) instanceof RelojAntiguo)
			   {
				   RelojAntiguo unRelojCast = (RelojAntiguo)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojAntiguo();
			   }
			   if (listaDeRelojesAvender.get(v) instanceof RelojPulsera)
			   {
				   RelojPulsera unRelojCast = (RelojPulsera)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojPulsera();
			   }
			   if (listaDeRelojesAvender.get(v) instanceof RelojDespertador)
			   {
				   RelojDespertador unRelojCast = (RelojDespertador)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojDespertador();
			   }				   
		   }		   
	   }
	   if (tipoDeEmpleado == TipoEmpleadoEnumerado.contador) // x enumerado Contador
	   {
		   System.out.println("categoría contador");
		   
		   for (v = 0; v < listaDeRelojesAvender.size(); v ++)
		   {
			   if (listaDeRelojesAvender.get(v) instanceof RelojAntiguo)
			   {
				   RelojAntiguo unRelojCast = (RelojAntiguo)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojAntiguo();
			   }
			   if (listaDeRelojesAvender.get(v) instanceof RelojPulsera)
			   {
				   RelojPulsera unRelojCast = (RelojPulsera)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojPulsera();
			   }
			   if (listaDeRelojesAvender.get(v) instanceof RelojDespertador)
			   {
				   RelojDespertador unRelojCast = (RelojDespertador)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojDespertador();				   
			   }
		   }
	   }
	   if (tipoDeEmpleado == TipoEmpleadoEnumerado.lider)// x enumerado Lider
	   {
		   for (v = 0; v < listaDeRelojesAvender.size(); v ++)
		   {
			   if (listaDeRelojesAvender.get(v) instanceof RelojAntiguo)
			   {
				   RelojAntiguo unRelojCast = (RelojAntiguo)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojAntiguo();
			   }
			   if (listaDeRelojesAvender.get(v) instanceof RelojPulsera)
			   {
				   RelojPulsera unRelojCast = (RelojPulsera)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojPulsera();
			   }
			   if (listaDeRelojesAvender.get(v) instanceof RelojDespertador)
			   {
				   RelojDespertador unRelojCast = (RelojDespertador)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojDespertador();
			   }
		   }
	   }
	   if (tipoDeEmpleado == TipoEmpleadoEnumerado.vendedor)// x enumerado vendedor
	   {
		   for (v = 0; v < listaDeRelojesAvender.size(); v ++)
		   {
			   if (listaDeRelojesAvender.get(v) instanceof RelojAntiguo)
			   {
				   RelojAntiguo unRelojCast = (RelojAntiguo)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojAntiguo();
			   }
			   if (listaDeRelojesAvender.get(v) instanceof RelojPulsera)
			   {
				   RelojPulsera unRelojCast = (RelojPulsera)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojPulsera();
			   }
			   if (listaDeRelojesAvender.get(v) instanceof RelojDespertador)
			   {
				   RelojDespertador unRelojCast = (RelojDespertador)listaDeRelojesAvender.get(v);
				   unRelojCast.ImprimirInfoRelojDespertador();
			   }
		   }
	   }
		   
	 ///Se detallan las operaciones de el enumerado VENDEDOR solamente!!; recorriendo
		/// la lista LISTA DE RELOJES VENDIDOS por éste enumerado.
	   if (tipoDeEmpleado == TipoEmpleadoEnumerado.vendedor) // X enumerado vendedor
	   {
		   System.out.println("categoria vendedor");
		   for ( v = 0; v < listaDeRelojesVendidos.size(); v ++)// LISTA DE RELOJES VENDIDOS			   
		   {
			 if (listaDeRelojesVendidos.get(v) instanceof RelojAntiguo)
			 {
				 RelojAntiguo unRelojCast = (RelojAntiguo)listaDeRelojesVendidos.get(v);
				 unRelojCast.ImprimirInfoRelojAntiguo();				 
			 }
			 if (listaDeRelojesVendidos.get(v) instanceof RelojPulsera)
			 {
				 RelojPulsera unRelojCast = (RelojPulsera)listaDeRelojesVendidos.get(v);
				 unRelojCast.ImprimirInfoRelojPulsera();
			 }
			 if (listaDeRelojesVendidos.get(v) instanceof RelojDespertador)
			 {
				 RelojDespertador unRelojCast = (RelojDespertador)listaDeRelojesVendidos.get(v);
				 unRelojCast.ImprimirInfoRelojDespertador();
			 }
		   }		   
	   }	   
}
}
