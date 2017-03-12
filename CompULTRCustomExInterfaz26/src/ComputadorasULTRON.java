import java.util.*;

public class ComputadorasULTRON {
	
	Scanner ing;	
	private String nombreEmpresa;
	private String direccionEmpresa;
	private int telefonoEmpresa;
	private String directorEmpresa;
	private String fecha;
	private ArrayList<Cliente>listaDeClientes;
	private ArrayList<ComputadoraInterf>listaDeComputadoraEnStock;
	private Cliente unCliente;
	private Notebook unaNotebook;
	private PC unaPC;
	private ALLinOne unaAllinOne;
	
public ComputadorasULTRON(){
	
	ing = new Scanner(System.in);
	nombreEmpresa = "";
	direccionEmpresa = "";
	telefonoEmpresa = 0;
	directorEmpresa = "";
	fecha = "";	
	listaDeClientes = new ArrayList<Cliente>();
	listaDeComputadoraEnStock = new ArrayList<ComputadoraInterf>();	
	unCliente = new Cliente();
	unaNotebook = new Notebook();
	unaPC = new PC();
	unaAllinOne = new ALLinOne();
}

public Notebook getUnNotebook() {
	return unaNotebook;
}
public void setUnNotebook(Notebook unNotebook) {
	this.unaNotebook = unNotebook;
}
public String getNombreEmpresa() {
	return nombreEmpresa;
}
public void setNombreEmpresa(String nombreEmpresa) {
	this.nombreEmpresa = nombreEmpresa;
}
public String getDireccionEmpresa() {
	return direccionEmpresa;
}
public void setDireccionEmpresa(String direccionEmpresa) {
	this.direccionEmpresa = direccionEmpresa;
}
public int getTelefonoEmpresa() {
	return telefonoEmpresa;
}
public void setTelefonoEmpresa(int telefonoEmpresa) {
	this.telefonoEmpresa = telefonoEmpresa;
}
public String getDirectorEmpresa() {
	return directorEmpresa;
}
public void setDirectorEmpresa(String directorEmpresa) {
	this.directorEmpresa = directorEmpresa;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public ArrayList<Cliente> getListaDeClientes() {
	return listaDeClientes;
}
public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
	this.listaDeClientes = listaDeClientes;
}
public ArrayList<ComputadoraInterf> getListaDeComputadoraEnStock() {
	return listaDeComputadoraEnStock;
}
public void setListaDeComputadoraEnStock(
		ArrayList<ComputadoraInterf> listaDeComputadoraEnStock) {
	this.listaDeComputadoraEnStock = listaDeComputadoraEnStock;
}
public Cliente getUnCliente() {
	return unCliente;
}
public void setUnCliente(Cliente unCliente) {
	this.unCliente = unCliente;	
}
public Notebook getUnaNotebook() {
	return unaNotebook;
}

public void setUnaNotebook(Notebook unaNotebook) {
	this.unaNotebook = unaNotebook;
}

public PC getUnaPC() {
	return unaPC;
}

public void setUnaPC(PC unaPC) {
	this.unaPC = unaPC;
}

public ALLinOne getUnaAllinOne() {
	return unaAllinOne;
}

public void setUnaAllinOne(ALLinOne unaAllinOne) {
	this.unaAllinOne = unaAllinOne;
}

public void agregoClientesAlaListaDeClientes(Cliente unClienteMas){ // Agrego un cliente a la listaDeClientes
	
	listaDeClientes.add(unClienteMas);
}
public void agregoComputadorasAlaListaDeComputadoras(ComputadoraInterf unaCompMas){ // Agrego una computadora a la listaDeComputadoras//
	
	listaDeComputadoraEnStock.add(unaCompMas);
}
public void cargoDatosTotalesDeComputadorasULTRON() throws NombreApellidoException, DNIClientePerException, CodigoDeBarrasException{
	
	cargoEncabezado();
	cargoReporte();
	calculoOperacionesPie();
}
public void cargoEncabezado(){
	
			System.out.println("Nombre de la empresa: ");
			this.setNombreEmpresa(ing.next());
			System.out.println("Dirección: ");
			this.setDireccionEmpresa(ing.next());
			System.out.println("Telefono:");
			this.setTelefonoEmpresa(ing.nextInt());
			System.out.println("Director:");
			this.setDirectorEmpresa(ing.next());
			System.out.println("Fecha:");
			this.setFecha(ing.next());	
}
public void cargoReporte() throws NombreApellidoException, DNIClientePerException, CodigoDeBarrasException{
	
			int com = 0; //indice para recorrer el array clientes//			
			int c = 0;
			int clientesAcargar = 0; //indice para indicar CUANTOS clientes son.
			int cuantascompCargar = 0;
			String tipoComputadoras = "";
			System.out.println("Cuantos clientes desea cargar?");
			clientesAcargar = ing.nextInt();
	
	 	for ( com = 0; com < clientesAcargar; com ++){     //ciclo for de N clientes que es la cantidad de clientes 
	 														//que me pide el requerimiento !!//
	 		
	 		System.out.println("''''''''''''''''''''''''''Cargo Çlientes''''''''''''''''''''''''");
	 		System.out.println("");
	 		unCliente = new Cliente();
	 		System.out.println("Nombre y Apellido del cliente:");
	 		unCliente.setNombreApellido(ing.next());
	 		System.out.println("DNI");
	 		unCliente.setDNI(ing.nextInt());
	 		System.out.println("Domicilio");
	 		unCliente.setDomicilio(ing.next());
	 		System.out.println("Telefono");
	 		unCliente.setTelefono(ing.next());
	 		System.out.println("Lugar de nacimiento");
	 		unCliente.setLugarDeNacimiento(ing.next());
	 		System.out.println("Esta activo?");
	 		unCliente.setActivo(ing.nextBoolean());	
	 		this.agregoClientesAlaListaDeClientes(unCliente);
	 		///////////////////////////////////////////////cargo datos de los 3 tipos de computadoras/////////////////////////////////////
	 		
	 		System.out.println("...........................Cargo Computadoras...............................");
	 		System.out.println("");	
	 		System.out.println("Ingrese la cantidad de computadoras: ");
	 		cuantascompCargar = ing.nextInt();
	 			for ( c = 0; c < cuantascompCargar; c ++)
	 			{
	 				System.out.println("Qué tipo de computadora desea cargar??");
	 				tipoComputadoras = ing.next();
	 				if ( tipoComputadoras.contains("Notebook"))
	 				{
	 					unaNotebook = new Notebook();
	 			 		System.out.println("Marca de la placa");
	 			 		unaNotebook.setMarca(ing.next());
	 			 		System.out.println("Marca del socket de la Notebook");
	 			 		unaNotebook.setSocket(ing.next());
	 			 		System.out.println("Tiene PCI express??");
	 			 		unaNotebook.setPCIexpress(ing.nextBoolean());
	 			 		System.out.println("Tiene Video on board??");
	 			 		unaNotebook.setVideoOnBoard(ing.nextBoolean());
	 			 		System.out.println("Tiene Audio on board??");
	 			 		unaNotebook.setAudioOnBoard(ing.nextBoolean());
	 			 		System.out.println("Sistema operativo de la Notebook");
	 			 		unaNotebook.setSistemOperativo(ing.next());
	 			 		System.out.println("Codigo de barras Notebook");
	 			 		unaNotebook.setCodigoDeBarras(ing.next());
	 			 		this.agregoComputadorasAlaListaDeComputadoras(unaNotebook);
	 			 		System.out.println("---------------------------------------------------");
	 			 		System.out.println("");	 			 		
	 				}
	 				if ( tipoComputadoras.contains("PC"))
	 				{
	 					unaPC = new PC();
	 			 		System.out.println("Marca de la placa");
	 			 		unaPC.setMarcaPlacaM(ing.next());
	 			 		System.out.println("Marca del socket de la PC");
	 			 		unaPC.setSocket(ing.next());
	 			 		System.out.println("Tiene PCIExpress??");
	 			 		unaPC.setPCIExpress(ing.nextBoolean());
	 			 		System.out.println("Tiene video on board??");
	 			 		unaPC.setVideoOnBoard(ing.nextBoolean());
	 			 		System.out.println("Tiene audio on board??");
	 			 		unaPC.setAudioOnBoard(ing.nextBoolean());
	 			 		System.out.println("Sistema operativo de la PC");
	 			 		unaPC.setSistemaOperativo(ing.next());
	 			 		System.out.println("Codigo de barras PC");
	 			 		this.agregoComputadorasAlaListaDeComputadoras(unaPC);
	 			 		System.out.println("----------------------------------------------------");
	 			 		System.out.println("");	 			 		
	 				}
	 				if ( tipoComputadoras.contains("ALLinOne"))
	 				{
	 					unaAllinOne = new ALLinOne();
	 			 		System.out.println("Marca de la placa");
	 			 		unaAllinOne.setMarcaPlacaM(ing.next());
	 			 		System.out.println("Marca del socket de ALLinOne");
	 			 		unaAllinOne.setSocket(ing.next());
	 			 		System.out.println("Tiene PCIExpress??");
	 			 		unaAllinOne.setPCIExpress(ing.nextBoolean());
	 			 		System.out.println("Tiene video on board??");
	 			 		unaAllinOne.setVideoOnBoard(ing.nextBoolean());
	 			 		System.out.println("Tiene Audio on board??");
	 			 		unaAllinOne.setAudioOnBoard(ing.nextBoolean());
	 			 		System.out.println("Sistema operativo de ALLinOne");
	 			 		unaAllinOne.setSistemaOperativo(ing.next());
	 			 		System.out.println("Codigo de Barras ALLinOne");
	 			 		unaAllinOne.setCodigoDeBarras(ing.next());
	 			 		this.agregoComputadorasAlaListaDeComputadoras(unaAllinOne);
	 				}
	 			}	 		
	 	}	
}
public void calculoOperacionesPie(){ 
	
	calculoCantTotalClientes();
	calculoCantTotalCompStock();
	calculoCantEquiposTesteadosOK();
	calculoCantEquiposTesteadosNOok();					
}
public int calculoCantTotalClientes(){
	
			return listaDeClientes.size();
}
public int calculoCantTotalCompStock(){
	
			return listaDeComputadoraEnStock.size();
}
public int calculoCantEquiposTesteadosOK(){
	
	int e = 0;
	int cantCompOK = 0;	
	
		for (e = 0; e < listaDeComputadoraEnStock.size(); e ++){
			
			if ( (listaDeComputadoraEnStock.get(e)) instanceof Notebook)
			{
				Notebook unaNotebook = (Notebook)listaDeComputadoraEnStock.get(e);
				if (unaNotebook.isEstadoPruebaTeclado() == true)
				{
					cantCompOK++;
				}
				if (unaNotebook.isEstadoPruebaMouse() == true)
				{
					cantCompOK++;
				}
			}
			if ( (listaDeComputadoraEnStock.get(e)) instanceof PC)
			{
				PC unPc = (PC)listaDeComputadoraEnStock.get(e);
				if (unPc.isEstadoPruebaTeclado() == true)
				{
					cantCompOK++;
				}
				if (unPc.isEstadoPruebaMouse() == true)
				{
					cantCompOK++;
				}
			}
			if ( (listaDeComputadoraEnStock.get(e)) instanceof ALLinOne)
			{
				ALLinOne unAllinOne = (ALLinOne)listaDeComputadoraEnStock.get(e);
				if (unAllinOne.isEstadoPruebaTeclado() == true)
				{
					cantCompOK++;  
				}
				if (unAllinOne.isEstadoPruebaMouse() == true)
				{
					cantCompOK++;
				}					
			}
		}
		return cantCompOK;
}
public int calculoCantEquiposTesteadosNOok(){
	
	int e = 0;
	int cantCompNook;
	cantCompNook = 0;
	
		for (e = 0; e < listaDeComputadoraEnStock.size(); e ++){
			
			if ( (listaDeComputadoraEnStock.get(e)) instanceof Notebook)
			{
				Notebook unaNotebook = (Notebook)listaDeComputadoraEnStock.get(e);
				if (unaNotebook.isEstadoPruebaTeclado() == false)
				{
					cantCompNook++;
				}
				if (unaNotebook.isEstadoPruebaMouse() == false)
				{
					cantCompNook++;
				}
			}
			if ( (listaDeComputadoraEnStock.get(e)) instanceof PC)
			{
				PC unPc = (PC)listaDeComputadoraEnStock.get(e);
				if (unPc.isEstadoPruebaTeclado() == false)
				{
					cantCompNook++;
				}
				if (unPc.isEstadoPruebaMouse() == false)
				{
					cantCompNook++;
				}
			}
			if ( (listaDeComputadoraEnStock.get(e)) instanceof ALLinOne)
			{
				ALLinOne unAllinOne = (ALLinOne)listaDeComputadoraEnStock.get(e);
				if (unAllinOne.isEstadoPruebaTeclado() == false)
				{
					cantCompNook++;  
				}
				if (unAllinOne.isEstadoPruebaMouse() == false)
				{
					cantCompNook++;
				}
			}
     } 
	 return cantCompNook;
}
public void testearComputadoras(){
	
	int a = 0;
	 	for ( a = 0; a < listaDeComputadoraEnStock.size(); a ++){
	 
	 		listaDeComputadoraEnStock.get(a).probarTeclado();// Si los metodos que deseo invocar son 
	 															//comunes a todas las clases	 														
		 	listaDeComputadoraEnStock.get(a).probarMouse();//(metodos prototipos de la INTERFAZ )
		 													//por tanto NO necesito casteo.
	 	}
}
//======================================================IMPRIMIRES===========================================================================================================
//===========================================================================================================================================================================


public void ImprimoDatosTotales() throws NombreApellidoException, DNIClientePerException, CodigoDeBarrasException{	
		
		System.out.println("........................................................................................................................");
		System.out.println("");
		imprimoEncabezadoEmpresaULTRON();
		imprimoReporteClientes();
		imprimoTestEquipos();
		imprimoCalculosPieReporte();
}
public void imprimoEncabezadoEmpresaULTRON(){
	
		System.out.println("Nombre Empresa: " + nombreEmpresa);
		System.out.println("Dirección: " + direccionEmpresa); ///imprimir Telefono en ESTA linea tabulando !!!!
		System.out.println("Telefono: " + telefonoEmpresa);
		System.out.println("                                                                         Director: " + directorEmpresa);
		System.out.println("Fecha: " + fecha);	
		System.out.println("");
		System.out.println("");
}
public void imprimoReporteClientes() throws NombreApellidoException, DNIClientePerException, CodigoDeBarrasException{
	
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\REPORTE CLIENTES COMPUTADORAS ULTRON S.A.///////////////////////////");
		System.out.println("");		
		System.out.println("===========================================CLIENTE==================================================");
		System.out.println("");
		
	int cli = 0;
	
		for ( cli = 0; cli  < listaDeClientes.size(); cli ++) /// Recorro la lista de clientes e imprimimo datos de cada uno de acuerdo
																//a la cantidad de clientes
		{
			listaDeClientes.get(cli).ImprimirInfoCliente();			
		}
		
		System.out.println("");
		System.out.println("=======================================EQUIPOS DE CLIENTE================================================");
		System.out.println("");
		
	int equ = 0;
	
		for ( equ = 0; equ < listaDeComputadoraEnStock.size(); equ ++){
			
			System.out.println("-----------------Equipo: " + (equ + 1) + ("----------------------------"));
			System.out.println("");
			System.out.println("");
			if (listaDeComputadoraEnStock.get(equ) instanceof Notebook)
			{
				Notebook unaNotebook = (Notebook)listaDeComputadoraEnStock.get(equ);
				//listaDeComputadoraEnStock.get(com) => PESIMOOO !!!! //si ya efectué el casteo en la linea anterior, y lo guarde en una variable
				//utilizo la variable unaNotebook
				unaNotebook.ImprimirInfoNotebook();
			}
			if (listaDeComputadoraEnStock.get(equ) instanceof PC)
			{
				PC unaPC = (PC)listaDeComputadoraEnStock.get(equ);
				unaPC.ImprimirInfoPC();				
			}
			if (listaDeComputadoraEnStock.get(equ) instanceof ALLinOne)
			{
				ALLinOne unaALLinOne = (ALLinOne)listaDeComputadoraEnStock.get(equ);
				unaALLinOne.ImprimirInfoAllinOne();				
			}
		}
			System.out.println("-------------------------------------------------------------------------------------------------------------");
}

public void imprimoTestEquipos(){
	
	     	int t = 0;
	     	for ( t = 0; t < listaDeComputadoraEnStock.size(); t ++)
	     	{
	     		System.out.println("============================================TEST EQUIPOS========================================================");
	     		System.out.println("");
	     		System.out.println("");
	     		System.out.println("----Equipo: " + (t + 1) + "----");
	     			
	     			if (listaDeComputadoraEnStock.get(t) instanceof Notebook)
	     			{
	     				Notebook unaNotebook = (Notebook)listaDeComputadoraEnStock.get(t);	     			
	     				unaNotebook.imprimirInfoNotebookTest();
	     			}
	     			if (listaDeComputadoraEnStock.get(t) instanceof ALLinOne)
	     			{
	     				ALLinOne unaAlLinOne = (ALLinOne)listaDeComputadoraEnStock.get(t);
	     				unaAlLinOne.imprimirInfoAllinOneTest();
	     			}
	     			if (listaDeComputadoraEnStock.get(t) instanceof PC)
	     			{
	     				PC unaPC = (PC)listaDeComputadoraEnStock.get(t);
	     				unaPC.imprimmirInfoPCTest();
	     			}	     		
	     	}
  	}
public void imprimoCalculosPieReporte(){
	
				System.out.println("");
				System.out.println("");
				System.out.println("-----------------------OPERACIONES PIE INFORME-------------------------");
				System.out.println("Total de clientes: " + calculoCantTotalClientes());
				System.out.println("Total de computadoras en stock: " + calculoCantTotalCompStock());
				System.out.println("Cantidad de equipos testeados OK: " + calculoCantEquiposTesteadosOK());
				System.out.println("Cantidad de equipos testeados No OK: " + calculoCantEquiposTesteadosNOok());
}
}
