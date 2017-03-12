import java.util.*;

import javax.management.InstanceAlreadyExistsException; // ?????????????????///

public class Personal {
	
	Scanner ing;
	
	public String razonSocial;
	public String direccion;
	public String telefono;
	public String director;
	public ArrayList<Cliente>listaDeClientes;
	public ArrayList<Telefono> listaDeTelefonosEnStock;
	public Cliente unClienteMas;  //Variables de Instancia//
	public Telefono unTelefonoMas; //Variables de Instancia//
	
public Personal(){
	
	ing = new Scanner(System.in);
	
	razonSocial = "";
	direccion = "";
	telefono = "";
	director = "";
	listaDeClientes = new ArrayList<Cliente>();
	listaDeTelefonosEnStock = new ArrayList<Telefono>();	
}

public Cliente getUnClienteMas() {
	return unClienteMas;
}

public void setUnClienteMas(Cliente unClienteMas) {
	this.unClienteMas = unClienteMas;
}

public Telefono getUnCelularMas() {
	return unTelefonoMas;
}

public void setUnCelularMas(Telefono unCelularMas) {
	this.unTelefonoMas = unCelularMas;
}

public Scanner getIng() {
	return ing;
}

public void setIng(Scanner ing) {
	this.ing = ing;
}

public Cliente getUnCliente() {
	return unClienteMas;
}

public void setUnCliente(Cliente unCliente) {
	this.unClienteMas = unCliente;
}

public ArrayList<Cliente> getListaDeClientes() {
	return listaDeClientes;
}

public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
	this.listaDeClientes = listaDeClientes;
}

public String getRazonSocial() {
	return razonSocial;
}

public void setRazonSocial(String razonSocial) {
	this.razonSocial = razonSocial;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getDirector() {
	return director;
}

public void setDirector(String director) {
	this.director = director;
}

public ArrayList<Telefono> getListaDeCelularesEnStock() {
	return listaDeTelefonosEnStock;
}

public void setListaDeCelularesEnStock(
		ArrayList<Telefono> listaDeCelularesEnStock) {
	this.listaDeTelefonosEnStock = listaDeCelularesEnStock;
}

public Telefono getUnTelefonoMas() {
	return unTelefonoMas;
}

public void setUnTelefonoMas(Telefono unTelefonoMas) {
	this.unTelefonoMas = unTelefonoMas;
}

public void agregoClienteAlistaClientes(Cliente unClienteMas){
	
	listaDeClientes.add(unClienteMas);	
}
public void agregoTelefonoAlistaDeTelefonos(Telefono unCelularMas){
	
	listaDeTelefonosEnStock.add(unCelularMas);
}
public void cargoDatosTotalesTelefonia() throws NumeroTelefonoExeption, DNIexception{
	
	cargoEncabezado();
	cargoReporteTelefonia();
	calculoOperacionesPie();
}
public void cargoEncabezado(){  
	
	System.out.println("Razon social:");
	this.setRazonSocial(ing.next());
	System.out.println("Direccion");
	this.setDireccion(ing.next());
	System.out.println("Telefono");
	this.setTelefono(ing.next());
	System.out.println("Director");
	this.setDirector(ing.next());	
}
public void cargoReporteTelefonia() throws NumeroTelefonoExeption, DNIexception{
	
	int cli;
	cli = 0;
		for ( cli = 0; cli < 1; cli ++){ // Ciclo for para 2 clientes, (pueden ser más, en éste ejemplo pongo 2 solamente)
			
			Cliente unCliente;
			unCliente = new Cliente();
			System.out.println("Nombre del Cliente");
			unCliente.setNombreApellido(ing.next());
			System.out.println("DNI del cliente:");
			unCliente.setDNI(ing.nextInt());
			System.out.println("El domicilio del cliente es");
			unCliente.setDomicilio(ing.next());
			System.out.println("El telefono del cliente es");
			unCliente.setTelefono(ing.next());
			System.out.println("El lugar de nacimiento del cliente es");
			unCliente.setLugarNacimiento(ing.next());
			System.out.println("Está activo el cliente?");
			unCliente.setActivo(ing.nextBoolean());
			this.agregoClienteAlistaClientes(unClienteMas);
			
		
			Handy unTelefonoMas;
			unTelefonoMas = new Handy();
			System.out.println("La marca del Handy es"); //Cargo un Handy, un Smartphone y un TEinalambrico//
			unTelefonoMas.setMarca(ing.next());
			System.out.println("Numero de telefono");
			unTelefonoMas.setNumeroTelefo(ing.next());
			System.out.println("Tiene cámara?");
			unTelefonoMas.setTieneCamara(ing.nextBoolean());
			System.out.println("Graba video?");
			unTelefonoMas.setTieneVideo(ing.nextBoolean());
			System.out.println("Tiene Whatsapp?");
			unTelefonoMas.setTieneWhatsapp(ing.nextBoolean());
			System.out.println("Tiene datos libres?");
			unTelefonoMas.setDatosLibres(ing.nextBoolean());			
			this.agregoTelefonoAlistaDeTelefonos(unTelefonoMas);
			
			Smartphone unTelefonoMas1;
			unTelefonoMas1 = new Smartphone();
			System.out.println("La marca del Smartphone es");
			unTelefonoMas1.setMarca(ing.next());
			System.out.println("Numero de telefono");
			unTelefonoMas1.setNumeroTelefo(ing.next());
			System.out.println("Tiene cámara?");
			unTelefonoMas1.setTieneCamara(ing.nextBoolean());
			System.out.println("Grava video?");
			unTelefonoMas1.setTieneVideo(ing.nextBoolean());
			System.out.println("Tiene Whatsapp?");
			unTelefonoMas1.setTieneWhatsapp(ing.nextBoolean());
			System.out.println("Tiene datos libres?");
			unTelefonoMas1.setDatosLibres(ing.nextBoolean());			
			this.agregoTelefonoAlistaDeTelefonos(unTelefonoMas1);
			
			TelefonoInalambrico unTelefonoMas2;
			unTelefonoMas2 = new TelefonoInalambrico();
			System.out.println("La marca del TelefonoInalambrico es");
			unTelefonoMas2.setMarca(ing.next());
			System.out.println("Numero de telefono");
			unTelefonoMas2.setNumeroTelefo(ing.next());
			System.out.println("Tiene cámara?");
			unTelefonoMas2.setTieneCamara(ing.nextBoolean());
			System.out.println("Grava video?");
			unTelefonoMas2.setTieneVideo(ing.nextBoolean());
			System.out.println("Tiene Whatsapp?");
			unTelefonoMas2.setTieneWhatsapp(ing.nextBoolean());
			System.out.println("Tiene datos libres?");
			unTelefonoMas2.setDatosLibres(ing.nextBoolean());			
			this.agregoTelefonoAlistaDeTelefonos(unTelefonoMas2);	
			System.out.println("===========================================================================================");
		}	
}
public void calculoOperacionesPie(){
	
	cantidadTotalClientes();
	cantidadTotalEquiposDelaEmpresa();
	cantidadEquiposTesteadosOK();
	cantidadEquiposTesteadosNOok();
}
public int cantidadTotalClientes(){	
	
	return listaDeClientes.size();
}
public int cantidadTotalEquiposDelaEmpresa(){
	
	return listaDeTelefonosEnStock.size();
}
public int cantidadEquiposTesteadosOK(){
	
	int e = 0;
	int cantTeOK;
	cantTeOK = 0;
	
		for (e = 0; e < listaDeTelefonosEnStock.size(); e ++){
			
			if ( (listaDeTelefonosEnStock.get(e)) instanceof Handy)
			{
				Handy unHandy = (Handy)listaDeTelefonosEnStock.get(e);
				if (unHandy.isEstadoPrueba() == true)
				{
					cantTeOK++;
				}
			}
			if ( (listaDeTelefonosEnStock.get(e)) instanceof Smartphone)
			{
				Smartphone unSmartphone = (Smartphone)listaDeTelefonosEnStock.get(e);
				if (unSmartphone.isEstadoPrueba() == true)
				{
					cantTeOK++;
				}
			}
			if ( (listaDeTelefonosEnStock.get(e)) instanceof TelefonoInalambrico)
			{
				TelefonoInalambrico unTelefonInalambrico = (TelefonoInalambrico)listaDeTelefonosEnStock.get(e);
				if (unTelefonInalambrico.isEstadoPrueba() == true)
				{
					cantTeOK++;   /// Hay que sumar 
				}
			}
		}		
	return cantTeOK;	
}
public int cantidadEquiposTesteadosNOok(){
	
	int r;
	r = 0;
	int cantEquipNOok = 0;
	
		for ( r = 0; r < listaDeTelefonosEnStock.size(); r ++){
			
			if (listaDeTelefonosEnStock.get(r) instanceof Handy)
			{		
				Handy unHandy = (Handy)listaDeTelefonosEnStock.get(r); // linea de CASTEO//
				if (unHandy.isEstadoPrueba() == false)
				{
					cantEquipNOok++;
				}				
			}
			if (listaDeTelefonosEnStock.get(r) instanceof Smartphone)
			{
				Smartphone unSmartphone = (Smartphone)listaDeTelefonosEnStock.get(r);
				if (unSmartphone.isEstadoPrueba() == false)
				{
					cantEquipNOok++;
				}
			}
			if (listaDeTelefonosEnStock.get(r) instanceof TelefonoInalambrico)
			{
				TelefonoInalambrico unTelefonoInalambrico = (TelefonoInalambrico)listaDeTelefonosEnStock.get(r);
				if (unTelefonoInalambrico.isEstadoPrueba() == false)
				{
					cantEquipNOok++;
				}
			}	
		}
	return cantEquipNOok;
}
//********************************************************IMPRIMIRES*******************************************************************************//




public void ImprimoDatosTotalesTelefonia() throws NumeroTelefonoExeption, DNIexception{
	
	ImprimirInfoPersonal();
	ImprimirDatosDelCliente();
	ImprimirInfoCalculosPie();
}
public void ImprimirInfoPersonal(){
	
	System.out.println("TELECOM PERSONAL");
	System.out.println("");
	System.out.println("");
	System.out.println("Razon social" + razonSocial);///TABULAR//
	System.out.println("Direccion" + direccion);
	System.out.println("Telefono" + telefono);
	System.out.println("Director " + director);
}
public void ImprimirDatosDelCliente(){
	
	int s = 0;
	System.out.println("======================================= CLIENTE ===============================================");
	System.out.println("");
	
		for ( s = 0; s < listaDeClientes.size(); s++)
		{
			listaDeClientes.get(s).ImprimirInfoCliente();			
		}
		/// faltan datos de las computadoras!!!!
}

public void ImprimirInfoCalculosPie(){
	
	System.out.println("Cantidad total de clientes" + cantidadTotalClientes());
	System.out.println("Cantidad total de equipos de la empresa" + cantidadTotalEquiposDelaEmpresa());
	System.out.println("Cantidad total de equipos testeados OK" + cantidadEquiposTesteadosOK());
	System.out.println("Cantidad total de equipos testeados No OK" + cantidadEquiposTesteadosNOok());
}
public void testearCelulares(){
	
	    int l;
	    l = 0;
	    String unMensaje = "";
	    
    	for (l =0; l <= listaDeTelefonosEnStock.size(); l ++){
    		
    		listaDeTelefonosEnStock.get(l).llamar();
    		listaDeTelefonosEnStock.get(l).enviarSMS(unMensaje);// Si los metodos que deseo invocar son comunes a todas las clases(metodos prototipos
    		                                                    // de la INTERFAZ ) por tanto no necesito casteo.
    	} 

}
}
