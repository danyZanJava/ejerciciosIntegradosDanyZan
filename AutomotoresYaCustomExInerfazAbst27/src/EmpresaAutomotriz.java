import java.util.*;

public class EmpresaAutomotriz {
	
	Scanner ing;
	private String razonSocial;
	private String direccion;
	private String fecha;
	private String telefono;
	private String director;
	private ArrayList<Cliente>listaDeClientes;
	private ArrayList<InterfazAutomovil>listaDeAutomovilesEnSotck;
	private Cliente unCliente;
	private Camion unCamion;
	private Urbano unUrbano;
	private Deportivo unDeportivo;
	
	
public EmpresaAutomotriz(){
	
	ing = new Scanner(System.in);
	razonSocial = "";
	direccion = "";
	fecha = "";
	telefono = "";
	director = "";
	listaDeClientes = new ArrayList<Cliente>();
	listaDeAutomovilesEnSotck = new ArrayList<InterfazAutomovil>();
	unCliente = new Cliente();
	unCamion = new Camion();
	unUrbano = new Urbano();
	unDeportivo = new Deportivo();	
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

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
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

public ArrayList<Cliente> getListaDeClientes() {
	return listaDeClientes;
}

public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
	this.listaDeClientes = listaDeClientes;
}

public ArrayList<InterfazAutomovil> getListaDeAutomovilesEnSotck() {
	return listaDeAutomovilesEnSotck;
}

public void setListaDeAutomovilesEnSotck(
		ArrayList<InterfazAutomovil> listaDeAutomovilesEnSotck) {
	this.listaDeAutomovilesEnSotck = listaDeAutomovilesEnSotck;
}
public Cliente getUnCliente() {
	return unCliente;
}

public void setUnCliente(Cliente unCliente) {
	this.unCliente = unCliente;
}

public Camion getUnCamion() {
	return unCamion;
}

public void setUnCamion(Camion unCamion) {
	this.unCamion = unCamion;
}
public Urbano getUnUrbano() {
	return unUrbano;
}

public void setUnUrbano(Urbano unUrbano) {
	this.unUrbano = unUrbano;
}
public Deportivo getUnDeportivo() {
	return unDeportivo;
}

public void setUnDeportivo(Deportivo unDeportivo) {
	this.unDeportivo = unDeportivo;
}

public void agregarClienteAlaListaDeClientes(Cliente unClienteMas){
	
	listaDeClientes.add(unClienteMas);
}
public void agregarAutomovilesAlaListaDeAutomovilesEnStock(Automovil unAutomovilMas){
	
	listaDeAutomovilesEnSotck.add(unAutomovilMas);
}
public void cargasDatosTotalesReporte() throws FallaFrenosException, NroDniException, NombreYapellidoExcpetion{
	
	cargoEncabezado();
	cargoReporte();
	calculoOperacionesPie();
}
public void cargoEncabezado(){

	System.out.println("Razon social");
	this.setRazonSocial(ing.next());
	System.out.println("Direccion");
	this.setDireccion(ing.next());
	System.out.println("Fecha");
	this.setFecha(ing.next());
	System.out.println("Telefono");
	this.setTelefono(ing.next());
	System.out.println("Director");
	this.setDirector(ing.next());	
}
public void cargoReporte() throws FallaFrenosException, NroDniException, NombreYapellidoExcpetion{
	
	int k = 0;
	int m = 0;
	int cuantosAutosAcargar = 0;
	int clientesAcargar = 0;
	String tipoDeAutomovil = "";
	 
			// Cuantos clientes deseo cargar determinaran la cantidad de vueltas del ciclo FOR 
			System.out.println("------------------------Cargo clientes---------------------------");
			System.out.println("");
			System.out.println("Cuántos clientes desea cargar??");//ingreso cuantos clientes deseo cargar
			                                                   //en la varible clientesAcargar
			clientesAcargar = ing.nextInt();
		
			for ( k = 0; k < clientesAcargar; k ++){
				
				Cliente unCliente = new Cliente();
				System.out.println("Nombre y apellido");
				unCliente.setNombreApellido(ing.next());
				System.out.println("DNI");
				unCliente.setDNI(ing.nextInt());
				System.out.println("Domicilio del cliente");
				unCliente.setDomicilio(ing.next());
				System.out.println("Telefono del cliente");
				unCliente.setTelefono(ing.next());
				System.out.println("Lugar de nacimiento del cliente");
				unCliente.setLugarDeNacimiento(ing.next());
				System.out.println("El cliente está activo??");
				unCliente.setActivo(ing.nextBoolean());
				this.agregarClienteAlaListaDeClientes(unCliente);
				System.out.println("");
				System.out.println("-------------------------------------------------------------------------------");
			}
				System.out.println("---------------------------Cargo Automoviles-------------------------------------------");
				System.out.println("");
				System.out.println("Cuántos automoviles desea cargar??");
				cuantosAutosAcargar = ing.nextInt();
			
				for ( m = 0; m < cuantosAutosAcargar; m ++)
				{
					System.out.println("Qué tipos de automoviles desea cargar??");
					tipoDeAutomovil = ing.next();
					
						if ( tipoDeAutomovil.contains ("Camion"))
						{
						System.out.println("Cantidad de puertas del camion:");
						unCamion.setCantPuertas(ing.nextInt());
						System.out.println("Tiene baul el camión??");
						unCamion.setTieneBaul(ing.nextBoolean());
						System.out.println("Marca de neumaticos del camión");
						unCamion.setMarcaNeumaticos(ing.next());
						System.out.println("Capacidad de carga del camion");
						unCamion.setCapacidadDeCarga(ing.next());
						System.out.println("Soporta containers el camión??");
						unCamion.setSoportaContainer(ing.nextBoolean());
						System.out.println("Tipo de combustible del camion");
						unCamion.setTipoCombustible(ing.next());
						this.agregarAutomovilesAlaListaDeAutomovilesEnStock(unCamion);
						System.out.println("");
						System.out.println("------------------------------------------------------------------------------");
						}
						if (tipoDeAutomovil.contains("Urbano"))
						{
						System.out.println("Cantidad de puuertas del urbano");
						unUrbano.setCantPuertas(ing.nextInt());
						System.out.println("Tiene baul el urbano??");
						unUrbano.setTieneBaul(ing.nextBoolean());
						System.out.println("Marca de neumaticos del urbano");
						unUrbano.setMarcaNeumaticos(ing.next());
						this.agregarAutomovilesAlaListaDeAutomovilesEnStock(unUrbano);
						System.out.println("");
						System.out.println("--------------------------------------------------------------------------------");
						}
						if (tipoDeAutomovil.equals("Deportivo"))
						{
						System.out.println("Cantidad de puertas del deportivo");
						unDeportivo.setCantPuertas(ing.nextInt());
						System.out.println("Tiene baul el deportivo??");
						unDeportivo.setTieneBaul(ing.nextBoolean());
						System.out.println("Marca de neumaticos del deportivo");
						unDeportivo.setMarcaNeumaticos(ing.next());
						System.out.println("Tiene oxido nitroso el deportivo??");
						unDeportivo.setTieneOxidoNitroso(ing.nextBoolean());
						this.agregarAutomovilesAlaListaDeAutomovilesEnStock(unDeportivo);
						System.out.println("");
						System.out.println("--------------------------------------------------------------------------------");
						}						
                     }	
}
public void calculoOperacionesPie(){
	
	calculoTotalClientes();
	calculoTotalAutomovilesDelaEmpresa();
	cantidadDeAutomovilesTesteadosOK();
	cantidadDeAutomovilesTesteadosNOOK();
}
public int calculoTotalClientes(){
	
	return listaDeClientes.size();
}
public int calculoTotalAutomovilesDelaEmpresa(){
	
	return listaDeAutomovilesEnSotck.size();
}
public int cantidadDeAutomovilesTesteadosOK(){
	
	int b = 0;
	int cantAutomOK = 0;
	
		for ( b = 0; b < listaDeAutomovilesEnSotck.size(); b ++)
		{
			if (( listaDeAutomovilesEnSotck.get(b)) instanceof Camion)
					{
						Camion unCamion = (Camion)listaDeAutomovilesEnSotck.get(b);
						if (unCamion.isPruebaAcelerador() == true)
						{
							cantAutomOK++;
						}
						if (unCamion.isPruebaFrenos() == true)
						{
							cantAutomOK++;
						}
						if (unCamion.isPruebaAirBag() == true)
						{
							cantAutomOK++;
						}
					}
			if ((listaDeAutomovilesEnSotck).get(b) instanceof Urbano)
					{
						Urbano unUrbano = (Urbano)listaDeAutomovilesEnSotck.get(b);
						if (unUrbano.isPruebaAcelerador() == true)
						{
							cantAutomOK++;
						}
						if (unUrbano.isPruebaFrenos() == true)
						{
							cantAutomOK++;
						}
						if (unUrbano.isPruebaAirBag() == true)
						{
							cantAutomOK++;
						}
					}
			if ((listaDeAutomovilesEnSotck.get(b)) instanceof Deportivo)
					{
						Deportivo unDeportivo = (Deportivo)listaDeAutomovilesEnSotck.get(b);
						if (unDeportivo.isPruebaAcelerador() == true)
						{
							cantAutomOK++;
						}
						if (unDeportivo.isPruebaFrenos() == true)
						{
							cantAutomOK++;
						}
						if (unDeportivo.isPruebaAirBag() == true)
						{
							cantAutomOK++;
						}
					}
		}
		return cantAutomOK;
}
public int cantidadDeAutomovilesTesteadosNOOK(){
	
	int c = 0;
	int cantAutomNOOK = 0;
	
		for ( c = 0; c < listaDeAutomovilesEnSotck.size(); c ++)
		{
			if ((listaDeAutomovilesEnSotck.get(c)) instanceof Camion)
			{
				Camion unCamion = (Camion)listaDeAutomovilesEnSotck.get(c);
				if(unCamion.isPruebaAcelerador() == false)
				{
					cantAutomNOOK++;
				}
				if(unCamion.isPruebaFrenos() == false)
				{
					cantAutomNOOK++;
				}
				if(unCamion.isPruebaAirBag() == false)
				{
					cantAutomNOOK++;
				}
			}
			if ((listaDeAutomovilesEnSotck.get(c)) instanceof Urbano)
			{
				Urbano unUrbano = (Urbano)listaDeAutomovilesEnSotck.get(c);
				if (unUrbano.isPruebaFrenos() == false)
				{
					cantAutomNOOK++;
				}
				if(unUrbano.isPruebaAcelerador() == false)
				{
					cantAutomNOOK++;
				}
				if(unUrbano.isPruebaAirBag() == false)
				{
					cantAutomNOOK++;
				}
			}			
		}		
	return cantAutomNOOK;
}
/////////////////////////////////////////////////////////////////////////IMPRIMIRES////////////////////////////////////////////////////
public void imprimirDatosTotales() throws FallaFrenosException, NroDniException, NombreYapellidoExcpetion{

	
	ImprimirEncabezado();
	ImprimirReporte();
	ImprimirCalculosPieReporte();
}	
public void ImprimirEncabezado(){	
	
	System.out.println("");
	System.out.println("");	
	System.out.println("Razon social de la empresa" + razonSocial);
	System.out.println("Direccion de la empresa" + direccion);
	System.out.println("Fecha:" + fecha);
	System.out.println("                                                          Telefono: " + telefono);
	System.out.println("                                                          Director: " + director);	
	System.out.println("");
	System.out.println("");
}
public void ImprimirReporte() throws FallaFrenosException, NroDniException, NombreYapellidoExcpetion{
	
	System.out.println("                     REPORTE DE CLIENTES Yang Automoviles S.R.L.                          ");
	System.out.println("-----------------------------------------------------------------------------------------");
	System.out.println("");
	System.out.println("=================================== CLIENTE ======================================================");
	
	   int cli = 0;
			for ( cli = 0; cli < listaDeClientes.size(); cli ++)
			{
				listaDeClientes.get(cli).imprimirInfoCliente();
			}
	
	System.out.println("               ================== AUTOS DEL CLIENTE ==========================");
	System.out.println("");
	
	int au = 0;
	
			for ( au = 0; au < listaDeAutomovilesEnSotck.size(); au ++)
			{
				System.out.println("---------Automovil:" + au+1 + "----------");
				System.out.println("");
				System.out.println("");
				if ((listaDeAutomovilesEnSotck.get(au)) instanceof Camion)
				{
					Camion unCamion = (Camion)listaDeAutomovilesEnSotck.get(au);
					unCamion.ImprimirInfoCamion();
				}
				if ((listaDeAutomovilesEnSotck.get(au)) instanceof Urbano)
				{
					Urbano unUrbano = (Urbano)listaDeAutomovilesEnSotck.get(au);
					unUrbano.ImprimirInfoUrbano();
				}
				if ((listaDeAutomovilesEnSotck.get(au)) instanceof Deportivo)
				{
					Deportivo unDeportivo = (Deportivo)listaDeAutomovilesEnSotck.get(au);
					unDeportivo.imprimirInfoDeportivo();
				}				
			}
			System.out.println("");
			System.out.println("----------------------------------------------------------------------------------------------");
			TestAutomoviles();
}
public void TestAutomoviles() throws FallaFrenosException {
	
	int test = 0;
			for ( test = 0; test < listaDeAutomovilesEnSotck.size(); test ++)
			{
				//marca
				Automovil auto = (Automovil)listaDeAutomovilesEnSotck.get(test); /// genero un casteo para ir a la clase Abstracta Automovil, para tener acceso a las operaciomes
				                                                                 // de la clase
				System.out.println("Marca: " + auto.getMarca());
				listaDeAutomovilesEnSotck.get(test).probarAcelerador();// Dado que el metodo es void, y éste metodo ya tiene un System.out.println dentro de él, basta con invocarlo solamente		
				
				listaDeAutomovilesEnSotck.get(test).probarFrenos();// Dado que el metodo es void, y éste metodo ya tiene un System.out.println dentro de él, basta con invocarlo solamente		
				
				listaDeAutomovilesEnSotck.get(test).probarAirbag();// Dado que el metodo es void, y éste metodo ya tiene un System.out.println dentro de él, basta con invocarlo solamente		
				auto.probarMotor(); // Dado que el metodo es void, y éste metodo ya tiene un System.out.println dentro de él, basta con invocarlo solamente				
				//prueba motor
			}
}
public void ImprimirCalculosPieReporte(){
	
			System.out.println("");
			System.out.println("");
			System.out.println("--------------------- CALCULOS PIE DE INFORME -----------------");
			System.out.println("");
			System.out.println("Cantidad total de clientes: " + calculoTotalClientes());
			System.out.println("Cantidad total de automoviles: " + calculoTotalAutomovilesDelaEmpresa());
			System.out.println("Cantidad de automoviles testeados OK: " + cantidadDeAutomovilesTesteadosOK());
			System.out.println("Cantidad de automoviles testeados NO OK: " + cantidadDeAutomovilesTesteadosNOOK());	
}

}
