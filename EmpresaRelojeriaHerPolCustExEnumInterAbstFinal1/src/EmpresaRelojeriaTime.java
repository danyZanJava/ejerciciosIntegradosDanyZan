
import java.util.*;

public class EmpresaRelojeriaTime {
	
	Scanner ing;
	
	private String nombreEmpresa;
	private String direccion;
	private int fecha;
	private int telefono;
	private String director;
	private ArrayList<Cliente>listaDeClientes;
	private ArrayList<InterfazRelojes>listaDeRelojes;
	private ArrayList<Empleado>listaDeEmpleados;
	private Cliente unCliente;
	private RelojAntiguo unRelojAntiguo;
	private RelojPulsera unRelojPulsera;
	private RelojDespertador unRelojDespertador;
	private Empleado unEmpleado;
	
	
public EmpresaRelojeriaTime(){
	
	ing = new Scanner(System.in);
	nombreEmpresa = "";
	direccion = "";
	fecha = 0;
	telefono = 0;
	director = "";
	listaDeClientes = new ArrayList<>();
	listaDeRelojes = new ArrayList<>();
	listaDeEmpleados = new ArrayList<>();
	unCliente = new Cliente();
	unRelojAntiguo = new RelojAntiguo();  // Casteo reloj por reloj ya que no puedo instanciar clase abstracta                                      
	unRelojPulsera = new RelojPulsera();
	unRelojDespertador = new RelojDespertador();
	unEmpleado = new Empleado();
	
}

public Scanner getIng() {
	return ing;
}

public void setIng(Scanner ing) {
	this.ing = ing;
}

public String getNombreEmpresa() {
	return nombreEmpresa;
}

public void setNombreEmpresa(String nombreEmpresa) {
	this.nombreEmpresa = nombreEmpresa;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public int getFecha() {
	return fecha;
}

public void setFecha(int fecha) {
	this.fecha = fecha;
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	this.telefono = telefono;
}

public String getDirector() {
	return director;
}

public void setDirector(String director) {
	this.director = director;
}

public ArrayList<Cliente> getListaDeClientes() {
	return listaDeClientes;
}

public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
	this.listaDeClientes = listaDeClientes;
}

public ArrayList<InterfazRelojes> getListaDeRelojes() {
	return listaDeRelojes;
}

public void setListaDeRelojes(ArrayList<InterfazRelojes> listaDeRelojes) {
	this.listaDeRelojes = listaDeRelojes;
}

public ArrayList<Empleado> getListaDeEmpleados() {
	return listaDeEmpleados;
}

public void setListaDeEmpleados(ArrayList<Empleado> listaDeEmpleados) {
	this.listaDeEmpleados = listaDeEmpleados;
}

public Cliente getUnCliente() {
	return unCliente;
}

public void setUnCliente(Cliente unCliente) {
	this.unCliente = unCliente;
}

public RelojAntiguo getUnRelojAntiguo() {
	return unRelojAntiguo;
}

public void setUnRelojAntiguo(RelojAntiguo unRelojAntiguo) {
	this.unRelojAntiguo = unRelojAntiguo;
}

public RelojPulsera getUnRelojPulsera() {
	return unRelojPulsera;
}

public void setUnRelojPulsera(RelojPulsera unRelojPulsera) {
	this.unRelojPulsera = unRelojPulsera;
}

public RelojDespertador getUnRelojDespertador() {
	return unRelojDespertador;
}

public void setUnRelojDespertador(RelojDespertador unRelojDespertador) {
	this.unRelojDespertador = unRelojDespertador;
}


public Empleado getUnEmpleado() {
	return unEmpleado;
}

public void setUnEmpleado(Empleado unEmpleado) {
	this.unEmpleado = unEmpleado;
}

public void agregarClienteAlaListaDeClientes(Cliente unClienteMas){
	
	listaDeClientes.add(unClienteMas);
}
public void agregarRelojesAlaListaDeRelojes(RelojesAbstract unRelojMas){
	
	listaDeRelojes.add(unRelojMas);	
}
public void agregarEmpleadosAlaListaDeEmpleados(Empleado unEmpleadoMas){
	
	listaDeEmpleados.add(unEmpleadoMas);
}
public void cargoDatosTotales() throws ExceptionDNI, ExceptionNombreYApellido, ExceptionFallaSegundero{
	
	cargoEncabezado();
	cargoReporte();
	calculoOperacionesPieInforme();	
}
public void cargoEncabezado(){ ////////////////////////////// CARGAS ///////////////////////////////////////////////////
	
	System.out.println("Nombre de la empresa");
	this.setNombreEmpresa(ing.next());
	System.out.println("Dirección");
	this.setDireccion(ing.next());
	System.out.println("fecha");
	this.setFecha(ing.nextInt());
	System.out.println("Telefono");
	this.setTelefono(ing.nextInt());
	System.out.println("Director");
	this.setDirector(ing.next());
	//this.agregarRelojesAlaListaDeRelojes();//
	
}
public void cargoReporte() throws ExceptionDNI, ExceptionNombreYApellido, ExceptionFallaSegundero{
	
	
	int cl = 0;
	int re = 0;
	int rv = 0;
	int emp = 0;
	int cuantosClientesCargo = 0;
	int cuantosRelojesCarga = 0;
	String tiposDeRelojes = "";
	int cantidadDeRelojesAvender = 0;
	int cantidadDeRelojesVendidos = 0;
 
	
	System.out.println("                 ----------------------------//----- CARGO CLIENTES --------------------------");
	System.out.println("");
	System.out.println("Cuántos clientes desea cargar??");
	cuantosClientesCargo = ing.nextInt();
	
			for (cl = 0; cl < cuantosClientesCargo; cl ++)
			{
				System.out.println("                     Nombre y Apellido del cliente No: " + (cl+1));
				unCliente = new Cliente();
				unCliente.setNombreYapellido(ing.next());
				System.out.println("DNI del cliente");
				unCliente.setDni(ing.nextInt());
				System.out.println("Domicilio del cliente");
				unCliente.setDomicilio(ing.next());
				System.out.println("Telefono del cliente");
				unCliente.setTelefono(ing.nextInt());
				System.out.println("El cliente ésta activo??");
				unCliente.setActivo(ing.nextBoolean());
				this.agregarClienteAlaListaDeClientes(unCliente);
				
				System.out.println("");
				System.out.println("---------------/-/--CARGO RELOJES CLIENTES ------------------------------");
				System.out.println("Cuántos relojes desea cargar??");
				cuantosRelojesCarga = ing.nextInt();
				
					for (re = 0; re < cuantosRelojesCarga; re ++)					                                         
					{
						System.out.println("                       Reloj No: " + (re+1));
						System.out.println("");
						System.out.println("Qué tipo de relojes??"); 
						tiposDeRelojes = ing.next();
						
						
						 if (tiposDeRelojes.contains("RelojAntiguo"))
						 {
							 System.out.println("Marca del reloj");
							 unRelojAntiguo.setMarca(ing.next());
							 System.out.println("Precio del reloj");
							 unRelojAntiguo.setPrecio(ing.nextDouble());
							 System.out.println("Es analogico??");
							 unRelojAntiguo.setAnalogico(ing.nextBoolean());							
							 System.out.println("Sexo del cliente");
							 unRelojAntiguo.setSexo(ing.next());
							 System.out.println("Es antiguo??");
							 unRelojAntiguo.setAntiguo(ing.nextBoolean());
							 System.out.println("Largo del pendulo");
							 unRelojAntiguo.setLargoDelPendulo(ing.nextInt());
							 unCliente.agregarRelojesAlaListaDeRelojesDelCliente(unRelojAntiguo);
							 System.out.println("");
							 System.out.println("------------------------------------------------------------------");
						 }
						 
						 if (tiposDeRelojes.contains("RelojPulsera"))
						 {
							 System.out.println("Marca del reloj");
							 unRelojPulsera.setMarca(ing.next());
							 System.out.println("Precio del reloj");
							 unRelojPulsera.setPrecio(ing.nextDouble());
							 System.out.println("Es analogico??");
							 unRelojPulsera.setAnalogico(ing.nextBoolean());
							 System.out.println("Tipo de malla");
							 unRelojPulsera.setTipoDeMalla(ing.next());
							 System.out.println("Sexo del cliente");
							 unRelojPulsera.setSexo(ing.next());
							 System.out.println("Es antiguo??");
							 unRelojPulsera.setAntiguo(ing.nextBoolean());	
							 unCliente.agregarRelojesAlaListaDeRelojesDelCliente(unRelojPulsera);
							 System.out.println("");
							 System.out.println("------------------------------------------------------------------");
						 }
						 if (tiposDeRelojes.contains("RelojDespertador"))
						 {
							 System.out.println("Marca del reloj");
							 unRelojDespertador.setMarca(ing.next());
							 System.out.println("Precio del reloj");
							 unRelojDespertador.setPrecio(ing.nextDouble());
							 System.out.println("Es analogico??");
							 unRelojDespertador.setAnalogico(ing.nextBoolean());							 
							 System.out.println("Sexo del cliente");
							 unRelojDespertador.setSexo(ing.next());
							 System.out.println("Es antiguo??");
							 unRelojDespertador.setAntiguo(ing.nextBoolean());
							 System.out.println("Tipo de despertador:");
						  	 unRelojDespertador.setTipoDespertador(ing.next());
							 unCliente.agregarRelojesAlaListaDeRelojesDelCliente(unRelojDespertador);
							 System.out.println("");
							 System.out.println("------------------------------------------------------------------");
						 }						 
					}					
			}
			//==================================================== CARGO EMPLEADOS ==============================================
			
			
			System.out.println("----------------------------//------ CARGO EMPLEADOS-----------------------------------------------");
			
			int cuantosEmpleadosCargo = 0;
			String tipoDeEmpleado = "";
			System.out.println ("Cuántos empleados desea cargar??(4 minimo)");// <-Por el tema de los enumerados
			cuantosEmpleadosCargo = ing.nextInt();
			
			
			  for (emp = 0; emp < cuantosEmpleadosCargo; emp ++) // Ciclo for por los empleados////////////////////////
			  {
				  unEmpleado = new Empleado();
				  System.out.println("");
				  System.out.println("");
				  System.out.println("                       Nombre y apellido del empleado No: " + (emp+1));
				  unEmpleado.setNombreYapellido(ing.next());
				  System.out.println("DNI del empleado");
				  unEmpleado.setDni(ing.nextInt());
				  System.out.println("Domicilio del empleado");
				  unEmpleado.setDomicilio(ing.next());																																																																											
				  System.out.println("Legajo del empledo");
				  unEmpleado.setLegajo(ing.nextInt());
				  System.out.println("Tipo de empleado?");
				  tipoDeEmpleado = ing.next();
				  System.out.println("Calificación del empleado:");
				  unEmpleado.setCalificacion(ing.nextDouble());
				  
				  if (tipoDeEmpleado.contains("Gerente"))
				  {
					  unEmpleado.setTipoDeEmpleado(TipoEmpleadoEnumerado.gerente);
				  }
				  if (tipoDeEmpleado.contains("Lider"))
				  {
					  unEmpleado.setTipoDeEmpleado(TipoEmpleadoEnumerado.lider);
				  }
				  if (tipoDeEmpleado.contains("Vendedor"))
				  {
					  unEmpleado.setTipoDeEmpleado(TipoEmpleadoEnumerado.vendedor);
				  }
				  if (tipoDeEmpleado.contains("Contador"))
				  {
					  unEmpleado.setTipoDeEmpleado(TipoEmpleadoEnumerado.contador);
				  }					  
				  this.agregarEmpleadosAlaListaDeEmpleados(unEmpleado);
				  
				  
				  System.out.println("Ingrese la cantidad de relojes a vender");
				  cantidadDeRelojesAvender = ing.nextInt();
				  
				///================ CARGO CANT RELOJES A VENDER dentro del for de EMPLEADOS ==================  
			  for ( rv = 0; rv < cantidadDeRelojesAvender; rv ++) 
			  {
				  if (tiposDeRelojes.contains("RelojAntiguo"))
					 {
					  		unRelojAntiguo = new RelojAntiguo();
					  		System.out.println("Marca del reloj No: " + (rv + 1));
					  		unRelojAntiguo.setMarca(ing.next());
					  		System.out.println("Precio del reloj:");
					  		unRelojAntiguo.setPrecio(ing.nextDouble());
					  		System.out.println("Es analógico??");
					  		unRelojAntiguo.setAnalogico(ing.nextBoolean());					  		
					  		System.out.println("Sexo para reloj");
					  		unRelojAntiguo.setSexo(ing.next());
					  		System.out.println("Es antiguo??");
					  		unRelojAntiguo.setAntiguo(ing.nextBoolean());					  		
					  		System.out.println("Color");
					  		unRelojAntiguo.setColorRelojAntiguo(ing.next());
					  		System.out.println("Está laqueado??");
					  		unRelojAntiguo.setEstaLaqueado(ing.nextBoolean());
					  		System.out.println("Largo del péndulo");
					  		unRelojAntiguo.setLargoDelPendulo(ing.nextInt());
					  		unEmpleado.agregoRelojesAlaListaDeRelojesAvender(unRelojAntiguo);
					  		System.out.println("-------------------------------------------------------------");
						  }
				  if (tiposDeRelojes.contains("RelojPulsera"))
				  		{
					  		unRelojPulsera = new RelojPulsera();
					  		System.out.println("Marca del reloj No: " + (rv + 1));
					  		unRelojPulsera.setMarca(ing.next());
					  		System.out.println("Precio reloj pulsera");
					  		unRelojPulsera.setPrecio(ing.nextDouble());
					  		System.out.println("Es analogico??");
					  		unRelojPulsera.setAnalogico(ing.nextBoolean());
					  		System.out.println("Tipo de malla:");
					  		unRelojPulsera.setTipoDeMalla(ing.next());
					  		System.out.println("Sexo para reloj");
					  		unRelojPulsera.setSexo(ing.next());
					  		System.out.println("Es antiguo??");
					  		unRelojPulsera.setAntiguo(ing.nextBoolean());
					  		unEmpleado.agregoRelojesAlaListaDeRelojesAvender(unRelojPulsera);
					  		System.out.println("-------------------------------------------------------------");
				  		}
				  if (tiposDeRelojes.contains("RelojDespertador"))
				  		{
					  		unRelojDespertador = new RelojDespertador();
					  		
					  		System.out.println("Marca del reloj No: " + (rv + 1));
					  		unRelojDespertador.setMarca(ing.next());
					  		System.out.println("Precio");
					  		unRelojDespertador.setPrecio(ing.nextDouble());
					  		System.out.println("Analogico??");
					  		unRelojDespertador.setAnalogico(ing.nextBoolean());
					  		System.out.println("Tipo de despertador:");
					  		unRelojDespertador.setTipoDespertador(ing.next());
					  		unEmpleado.agregoRelojesAlaListaDeRelojesAvender(unRelojDespertador);
					  		System.out.println("-------------------------------------------------------------");
				  		}					  
			  }
			  // ========================= CARGO CANTIDAD DE RELOJES VENDIDOS EMPLEADOS ==========================
			  
			  for (rv = 0; rv < cantidadDeRelojesVendidos; rv ++)
			  {
				  if (tiposDeRelojes.contains("RelojAntiguo"))
					  																															
				  {     unRelojAntiguo = new RelojAntiguo();
					    System.out.println("Marca del reloj: ");
				  		unRelojAntiguo.setMarca(ing.next());
				  		System.out.println("Precio del reloj:");
				  		unRelojAntiguo.setPrecio(ing.nextDouble());
				  		System.out.println("Es analógico??");
				  		unRelojAntiguo.setAnalogico(ing.nextBoolean());				  		
				  		System.out.println("Sexo para reloj");
				  		unRelojAntiguo.setSexo(ing.next());
				  		System.out.println("Es antiguo??");
				  		unRelojAntiguo.setAntiguo(ing.nextBoolean());					  		
				  		System.out.println("Color");
				  		unRelojAntiguo.setColorRelojAntiguo(ing.next());
				  		System.out.println("Está laqueado??");
				  		unRelojAntiguo.setEstaLaqueado(ing.nextBoolean());
				  		System.out.println("Largo del péndulo");
				  		unRelojAntiguo.setLargoDelPendulo(ing.nextInt());
				  		unEmpleado.agregoRelojesAlaListaDeRelojesVendidos(unRelojAntiguo);
				  }
				  if (tiposDeRelojes.contains("RelojPulsera"))					  
				  {
					  	unRelojPulsera = new RelojPulsera();
					    System.out.println("Marca del reloj:");
				  		unRelojPulsera.setMarca(ing.next());
				  		System.out.println("Precio reloj pulsera");
				  		unRelojPulsera.setPrecio(ing.nextDouble());
				  		System.out.println("Es analogico??");
				  		unRelojPulsera.setAnalogico(ing.nextBoolean());
				  		System.out.println("Tipo de malla:");
				  		unRelojPulsera.setTipoDeMalla(ing.next());
				  		System.out.println("Sexo para reloj");
				  		unRelojPulsera.setSexo(ing.next());
				  		System.out.println("Es antiguo??");
				  		unRelojPulsera.setAntiguo(ing.nextBoolean());
				  		unEmpleado.agregoRelojesAlaListaDeRelojesVendidos(unRelojPulsera);
				  }
				  if (tiposDeRelojes.contains("RelojDespertador"))
				  {
					  	unRelojDespertador = new RelojDespertador();
					  	System.out.println("Marca");
				  		unRelojDespertador.setMarca(ing.next());
				  		System.out.println("Precio");
				  		unRelojDespertador.setPrecio(ing.nextDouble());
				  		System.out.println("Analogico??");
				  		unRelojDespertador.setAnalogico(ing.nextBoolean());
				  		System.out.println("Tipo de despertador:");
				  		unRelojDespertador.setTipoDespertador(ing.next());
				  		unEmpleado.agregoRelojesAlaListaDeRelojesVendidos(unRelojDespertador);
				  }
			  }				 
		 }			
}
private void calculoOperacionesPieInforme() {//=========================== CALCULO OPERACIONES PIE INFORME ===============================================================================
	
	cantidadTotalClientes();
	cantidadTotalRelojesDelaEmpresa();
	cantidadRelojesTesteadosOK();
	cantidadRelojesTestadosNOOK();		
	}
private int cantidadTotalClientes(){
	
	return listaDeClientes.size();	
}
private int cantidadTotalRelojesDelaEmpresa(){
	
	return listaDeRelojes.size();
}
private int cantidadRelojesTesteadosOK(){
	
	int p = 0;
	int cantidadRelojesTesteadosOK = 0;
		for (p = 0; p < listaDeRelojes.size(); p ++)
		{
			if ((listaDeRelojes.get(p)) instanceof RelojAntiguo)
			{
				RelojAntiguo unRelojAntiguo = (RelojAntiguo)listaDeRelojes.get(p);
				if (unRelojAntiguo.isPruebaReloj() && unRelojAntiguo.isPruebaTotal())
				{
					cantidadRelojesTesteadosOK ++;
				}
			}
			if ((listaDeRelojes.get(p)) instanceof RelojDespertador)
			{
				RelojDespertador unRelojDespertador = (RelojDespertador)listaDeRelojes.get(p);
				if (unRelojDespertador.isPruebaReloj() && unRelojDespertador.isPruebaTotal())
				{
					cantidadRelojesTesteadosOK ++;
				}
					
			}
			if ((listaDeRelojes.get(p)) instanceof RelojPulsera)
			{
				RelojPulsera unRelojPulsera = (RelojPulsera)listaDeRelojes.get(p);
				if (unRelojPulsera.isPruebaReloj() && unRelojPulsera.isPruebaTotal())
				{
					cantidadRelojesTesteadosOK ++;
				}
			}					
		}
	return cantidadRelojesTesteadosOK;
}
private int cantidadRelojesTestadosNOOK(){//////////////////////////////////////////////////////////////////////////////////
	
	int n = 0;
	int cantidadRelojTesteadosNOOK = 0;
		for (n = 0; n < listaDeRelojes.size(); n ++)
		{
			if ((listaDeRelojes.get(n)) instanceof RelojAntiguo)
			{
				RelojAntiguo unRelojAntiguo = (RelojAntiguo)listaDeRelojes.get(n);
				if (unRelojAntiguo.isPruebaReloj() && unRelojAntiguo.isPruebaTotal())
				{
					cantidadRelojTesteadosNOOK ++;
				}
			}
			if ((listaDeRelojes.get(n)) instanceof RelojDespertador)
			{
				RelojDespertador unRelojDespertador = (RelojDespertador)listaDeRelojes.get(n);
				if (unRelojDespertador.isPruebaReloj() && unRelojDespertador.isPruebaTotal())
				{
					cantidadRelojTesteadosNOOK ++;
				}
			}
			if ((listaDeRelojes.get(n)) instanceof RelojPulsera)
			{
				RelojPulsera unRelojPul = (RelojPulsera)listaDeRelojes.get(n);
				if (unRelojPul.isPruebaReloj() && unRelojPul.isPruebaTotal())
				{
					cantidadRelojTesteadosNOOK ++;
				}
			}
		}
	return cantidadRelojTesteadosNOOK;
}
//////////////////////////////////////////////////////////// IMPRESIONES //////////////////////////////////////////////////////////


public void ImprimoDatosTotales() throws ExceptionDNI, ExceptionNombreYApellido, ExceptionFallaSegundero{
	
	ImprimoEncabezado();
	ImprimoReporte();
	ImprimoCalculoPieReporte();
}
public void ImprimoEncabezado(){
	
	System.out.println("");
	System.out.println("====================================================================================");
	System.out.println("");
	System.out.println("Nombre de la Empresa: " + nombreEmpresa);
	System.out.println("Dirección: " + direccion);
	System.out.println("Fecha: " + fecha);
	System.out.println("Telefono: " + telefono);
	System.out.println("Director: " + director);
}
public void ImprimoReporte() throws ExceptionDNI, ExceptionNombreYApellido, ExceptionFallaSegundero{
	
	System.out.println("");
	System.out.println("");
	int cli = 0;
	System.out.println("                  REPORTE CLIENTES-Relojeria-Time Extension S.A.                                   ");
	System.out.println("");
	System.out.println("--------------------------------Cliente-------------------------------------------");
	System.out.println("");
	
	///=================================== IMPRIMO CLIENTES =========================
	
		for (cli = 0; cli < listaDeClientes.size(); cli ++)  
		{
			listaDeClientes.get(cli).ImprimirInfoCliente();				
		}
		//llamo al método ImprimirInfoCliente() a la clase Cliente
        //ya que están desarolladas las características del método en 
        //dicha clase Cliente.-
		
		///============================== IMPRIMO EMPLEADOS ==========================================
	System.out.println("");
	System.out.println("--------------------------Empleados--------------------------------------------");
	System.out.println("");
		
		int emp = 0;
		int rav = 0;
			for (emp = 0; emp < listaDeEmpleados.size(); emp ++) 
			{
				 listaDeEmpleados.get(emp).ImprimirInfoEmpleado();//<- Imprimo EMPLEADOS				
			}	
			//llamo al método ImprimirInfoEmpleado() a la clase empleado
            //ya que están desarolladas las características del método en 
            //la clase empleado.-
			
////==================================== TEST RELOJES EN STOCK =======================================
			System.out.println("");
			System.out.println("         -----------Imprimo Test Relojes en Stock----------"); 
			System.out.println("");
			TestRelojesEnStock();			
}
public void TestRelojesEnStock() throws ExceptionDNI, ExceptionNombreYApellido, ExceptionFallaSegundero{
	
	int test = 0;
		for (test = 0; test < listaDeRelojes.size(); test ++)
		{
			listaDeRelojes.get(test).pruebaHorario();
			listaDeRelojes.get(test).pruebaMinutero();
			listaDeRelojes.get(test).pruebaSegundero() ;
		}
}
public void ImprimoCalculoPieReporte(){
	
	System.out.println("");
	System.out.println("");
	System.out.println("                 ---------- OPERACIONES PIE INFORME ------------");
	System.out.println("");
	System.out.println("Cantidad total de clientes: " + cantidadTotalClientes());
	System.out.println("Cantidad total de relojes de la empresa: " + cantidadTotalRelojesDelaEmpresa());
	System.out.println("Cantidad de relojes testeados OK: " + cantidadRelojesTesteadosOK());
	System.out.println("Cantidad de relojes testeados NO OK: " + cantidadRelojesTestadosNOOK());	
}
}
