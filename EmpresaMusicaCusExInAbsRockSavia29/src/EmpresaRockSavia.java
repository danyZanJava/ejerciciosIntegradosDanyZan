import java.util.*;

public class EmpresaRockSavia {
	
	Scanner ing;
	private String nombreEmpresa;
	private String direccion;
	private String fecha;
	private int telefono;
	private String director;
	private ArrayList<Piano>listaDePianos;
	private ArrayList<Cliente>listaDeClientes;
	private Cliente unCliente;            // variables agregadas
	private PianoCola unPianoDeCola; 
	private PianoElectronico unPianoElectronico;// variables agregadas
	private PianoVertical unPianoVertical;
	
public EmpresaRockSavia(){
	
	ing = new Scanner(System.in);
	nombreEmpresa = "";
	direccion = "";
	fecha = "";
	telefono = 0;
	director = "";
	listaDePianos = new ArrayList<Piano>();
	listaDeClientes = new ArrayList<Cliente>();
	unCliente = new Cliente();
	unPianoDeCola = new PianoCola();
	unPianoElectronico = new PianoElectronico();
	unPianoVertical = new PianoVertical();
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

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
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

public ArrayList<Piano> getListaDePianos() {
	return listaDePianos;
}

public void setListaDePianos(ArrayList<Piano> listaDePianos) {
	this.listaDePianos = listaDePianos;
}

public ArrayList<Cliente> getListaDeClientes() {
	return listaDeClientes;
}

public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
	this.listaDeClientes = listaDeClientes;
}
public Cliente getUnCliente() {
	return unCliente;
}

public void setUnCliente(Cliente unCliente) {
	this.unCliente = unCliente;
}

public PianoCola getUnPianoDeCola() {
	return unPianoDeCola;
}

public void setUnPianoDeCola(PianoCola unPianoDeCola) {
	this.unPianoDeCola = unPianoDeCola;
}

public PianoElectronico getUnPianoElectronico() {
	return unPianoElectronico;
}

public void setUnPianoElectronico(PianoElectronico unPianoElectronico) {
	this.unPianoElectronico = unPianoElectronico;
}

public PianoVertical getUnPianoVertical() {
	return unPianoVertical;
}

public void setUnPianoVertical(PianoVertical unPianoVertical) {
	this.unPianoVertical = unPianoVertical;
}

public void agregarPianoAlaListaDePianos(Piano unPianoMas){
	
	listaDePianos.add(unPianoMas);
}
public void agregarClienteAlaListaDeClientes(Cliente unClienteMas){
	
	listaDeClientes.add(unClienteMas);
}
public void cargoDatosTotalesReporte() throws DNIClienteException, FallaTeclasException{
	
	cargoEncabezado();
	cargoReporte();
	calculoOperacionesPieReporte();	
}
public void cargoEncabezado(){
	
	System.out.println("Nombre de la empresa:");
	this.setNombreEmpresa(ing.next());
	System.out.println("Dirección de la empresa:");
	this.setDireccion(ing.next());
	System.out.println("Fecha del reporte:");
	this.setFecha(ing.next());
	System.out.println("Telefono de la empresa:");
	this.setTelefono(ing.nextInt());
	System.out.println("Director de la empresa:");
	this.setDirector(ing.next());
}
public void cargoReporte() throws DNIClienteException, FallaTeclasException{
	
	int c = 0; // variable local para ciclo for de cuantos clientes
	int p = 0; // variable local para ciclo for de cantidad de pianos
	int cuantosClientesCargar = 0;
	int cuantosPianosCargar = 0;
	String tipoDePianos = "";
	System.out.println("------------- CARGO CLIENTES -------------");
	System.out.println("");
	System.out.println("");
	System.out.println("Cuántos clientes desea cargar??");
	cuantosClientesCargar = ing.nextInt();
		
		for (c = 0; c < cuantosClientesCargar; c ++)
		{
			unCliente = new Cliente();
			System.out.println("Nombre y Apellido del cliente");
			unCliente.setNombreYapellido(ing.next());
			System.out.println("DNI del cliente");
			unCliente.setDni(ing.nextInt());
			System.out.println("Domicilio del cliente");
			unCliente.setDomicilio(ing.next());
			System.out.println("Telefono del cliente");
			unCliente.setTelefono(ing.nextInt());
			System.out.println("Lugar de nacimiento");
			unCliente.setLugarNacimiento(ing.next());
			System.out.println("El cliente está activo??");
			unCliente.setEstaActivo(ing.nextBoolean());
			this.agregarClienteAlaListaDeClientes(unCliente);
			System.out.println("");
			System.out.println("---------------------------------------------------------------------");
		}
			System.out.println("-------------------- CARGO PIANOS --------------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("Cuántos pianos desea cargar??");
			cuantosPianosCargar = ing.nextInt();
				
				for (p = 0; p < cuantosPianosCargar; p ++)
				{
					System.out.println("Qué tipo de pianos desea cargar??");
					tipoDePianos = ing.next();
					
					if (tipoDePianos.contains("PianoCola"))
					{
						System.out.println("Marca del piano");
						unPianoDeCola.setMarca(ing.next());
						System.out.println("Cantidad de teclas blancas");
						unPianoDeCola.setCantTeclasBlancas(ing.nextInt());
						System.out.println("Cantidad de teclas negras");
						unPianoDeCola.setCantTeclasNegras(ing.nextInt());
						System.out.println("Cantidad de teclas totales");
						unPianoDeCola.setCantTeclasTotales(ing.nextInt());
						System.out.println("Cantidad de pedales");
						unPianoDeCola.setCantPedales(ing.nextInt());
						System.out.println("Color del piano");
						unPianoDeCola.setColor(ing.next());	
						this.agregarPianoAlaListaDePianos(unPianoDeCola);
						System.out.println("");
						System.out.println("-------------------------------------------------------");
					}
					if (tipoDePianos.contains("PianoElectronico"))
					{
						System.out.println("Marca del piano");
						unPianoElectronico.setMarca(ing.next());
						System.out.println("Cantidad de teclas blancas");
						unPianoElectronico.setCantTeclasBlancas(ing.nextInt());
						System.out.println("Cantidad de teclas negras");
						unPianoElectronico.setCantTeclasNegras(ing.nextInt());
						System.out.println("Cantidad de teclas totales");
						unPianoElectronico.setCantTeclasTotales(ing.nextInt());
						System.out.println("Cantidad de pedales");
						unPianoElectronico.setCantPedales(ing.nextInt());
						System.out.println("Color del piano");
						unPianoElectronico.setColor(ing.next()); //variable color es la única en la //clase PianoCola	
						this.agregarPianoAlaListaDePianos(unPianoElectronico);
						System.out.println("");
						System.out.println("-------------------------------------------------------");						
					}
					if (tipoDePianos.contains("PianoVertical"))
					{
						System.out.println("Marca del piano");
						unPianoVertical.setMarca(ing.next());
						System.out.println("Cantidad de teclas blancas");
						unPianoVertical.setCantTeclasBlancas(ing.nextInt());
						System.out.println("Cantidad de teclas negras");
						unPianoVertical.setCantTeclasNegras(ing.nextInt());
						System.out.println("Cantidad de teclas totales");
						unPianoVertical.setCantTeclasTotales(ing.nextInt());
						System.out.println("Cantidad de pedales");
						unPianoVertical.setCantPedales(ing.nextInt());
						System.out.println("Color del piano");
						unPianoVertical.setColor(ing.next()); 
						System.out.println("Está laqueado el piano??");
						unPianoVertical.setEstaLaqueado(ing.nextBoolean());
						this.agregarPianoAlaListaDePianos(unPianoVertical);
						System.out.println("");
						System.out.println("-------------------------------------------------------");						
					}
				}
}
public void calculoOperacionesPieReporte(){
	
	cantidadTotalClientes();
	cantidadTotalPianos();
	cantidadTotalPianosTesteadosOK();
	cantidadTotalPianosTesteadosNOOK();
}
public int cantidadTotalClientes(){
	
		return listaDeClientes.size();
}
public int cantidadTotalPianos(){
	
		return listaDePianos.size();
}
public int cantidadTotalPianosTesteadosOK(){
	
	int ok = 0;
	int cantidadPianosOK = 0;
		for (ok = 0; ok < listaDePianos.size(); ok ++)
		{
			if ((listaDePianos.get(ok)) instanceof PianoCola)
			{
				PianoCola unPianoCola = (PianoCola)listaDePianos.get(ok);
				if (unPianoCola.isPruebaAcustica() == true && unPianoCola.isPruebaTotal() == true)
				{
					cantidadPianosOK ++;
				}				
			}
			if ((listaDePianos.get(ok)) instanceof PianoElectronico)
			{
				PianoElectronico unPianoElectronico = (PianoElectronico)listaDePianos.get(ok);
				if (unPianoElectronico.isPruebaAcustica() && unPianoElectronico.isPruebaTotal() == true)
				{
					cantidadPianosOK ++;
				}
			}
			if ((listaDePianos.get(ok)) instanceof PianoVertical)
			{
				PianoVertical unPianoVertical = (PianoVertical)listaDePianos.get(ok);
				if (unPianoVertical.isPruebaAcustica() && unPianoVertical.isPruebaTotal() == true)
				{
					cantidadPianosOK ++;
				}
			}
			
		}			
	return cantidadPianosOK;
}
public int cantidadTotalPianosTesteadosNOOK(){
	
	int n = 0;
	int cantidadNOk = 0;
		for (n = 0; n < listaDePianos.size(); n ++)
		{
			if ((listaDePianos.get(n)) instanceof PianoCola)
			{
				PianoCola unPianoCola = (PianoCola)listaDePianos.get(n);
				if (unPianoCola.isPruebaAcustica() == false && unPianoCola.isPruebaTotal() == false)
				{
					cantidadNOk ++;
				}
			}
			if ((listaDePianos.get(n)) instanceof PianoElectronico)
			{
				PianoElectronico unpianoElectronico = (PianoElectronico)listaDePianos.get(n);
				if (unpianoElectronico.isPruebaAcustica() == false && unpianoElectronico.isPruebaTotal() == false)
				{
					cantidadNOk ++;
				}
			}
			if ((listaDePianos.get(n)) instanceof PianoVertical)
			{
				PianoVertical unpianoVertical = (PianoVertical)listaDePianos.get(n);
				if (unpianoVertical.isPruebaAcustica() == false && unpianoVertical.isPruebaTotal() == false)
				{
					cantidadNOk ++;
				}
			}
		}
		return cantidadNOk;		
}
//////////////////////////////////////////////////////////////// IMPRIMIRES ///////////////////////////////////////
public void ImprimirDatosTotales() throws DNIClienteException, FallaTeclasException{
	
	ImprimoEncabezado();
	ImprimoReporte();
	ImprimoOperacionesPie();
}
public void ImprimoEncabezado(){
	
	System.out.println("");
	System.out.println("");
	System.out.println("Nombre de la empresa: " + nombreEmpresa);
	System.out.println("Dirección de la empresa: " + direccion);
	System.out.println("Fecha: " + fecha);
	System.out.println("Telefono: " + telefono);
	System.out.println("Director: " + director);	
}
public void ImprimoReporte() throws DNIClienteException, FallaTeclasException{
	
	System.out.println("                                        REPORTE DE CLIENTES - Musica-RockSavia      ");
	System.out.println("");
	System.out.println("                                     ------------------ Cliente -------------------");
	System.out.println("");
	int c = 0;
			for ( c = 0; c < listaDeClientes.size(); c ++)
			{
				listaDeClientes.get(c).ImprimirInfoCliente();
			}
			System.out.println("");
			System.out.println("                          ---------------------- PIANOS DEL CLIENTE ------------------");
			System.out.println("");
	int p = 0;	
			for ( p = 0; p < listaDePianos.size(); p ++)
			{
				System.out.println("                                   --------------Piano: " + (p+1) + "---------------");
				System.out.println("");
				System.out.println("");
				
				if ((listaDePianos.get(p)) instanceof  PianoCola)
				{
					PianoCola unPianocola = (PianoCola)listaDePianos.get(p);
					unPianocola.ImprimirInfoPianoCola();
				}
				if ((listaDePianos.get(p)) instanceof PianoElectronico)
				{
					PianoElectronico unPianoElectronico = (PianoElectronico)listaDePianos.get(p);
					unPianoElectronico.ImprimirInfoPianoElectronico();
				}
				if ((listaDePianos.get(p)) instanceof PianoVertical)
				{
					PianoVertical unPianoVertical = (PianoVertical)listaDePianos.get(p);
					unPianoVertical.ImprimirInfoPianoVertical();
				}					
			}
			System.out.println("");
			System.out.println("                                       ---------------- TEST PIANOS ----------------------");
			System.out.println("");
			TestPianos();
}
public void TestPianos() throws FallaTeclasException{
	
	
	int test = 0;
			for (test = 0; test < listaDePianos.size(); test ++)
			{
				listaDePianos.get(test).pruebaTeclasBlancas();
				listaDePianos.get(test).pruebaTeclasNegras();
				listaDePianos.get(test).pruebaPedales();
				listaDePianos.get(test).pruebaPiano();				
			}	
}
public void ImprimoOperacionesPie(){
	
	System.out.println("");
	System.out.println("");
	System.out.println("                                      -------------------- OPERACIONES PIE INFORME -----------------");
	System.out.println("");
	System.out.println("Cantidad Total de clientes: " + cantidadTotalClientes());
	System.out.println("Cantidad Total de pianos: " + cantidadTotalPianos());
	System.out.println("Cantidad Total pianos testeados OK: " + cantidadTotalPianosTesteadosOK());
	System.out.println("Cantidad Total pianos testeados NO OK: " + cantidadTotalPianosTesteadosNOOK());
}
}
