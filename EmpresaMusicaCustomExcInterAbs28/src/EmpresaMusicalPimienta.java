import java.util.*;

public class EmpresaMusicalPimienta {
	
    Scanner ing;
	private String nombreDelaEmpresa;
	private String direccion;
	private int fecha;
	private String telefono;
	private String director;
	private ArrayList<Cliente>listaDeClientes;
	private ArrayList<InterfaceGuitarra>listaDeGuitarras;
	private Cliente unCliente; //variable agregadas
	private Acustica unaAcustica; //variables agregadas
	private Electrica unaElectrica;// variables agregadas
	private Española unaEspañola; // variables agregadas
	
public EmpresaMusicalPimienta(){
	
	ing = new Scanner(System.in);
	nombreDelaEmpresa = "";
	direccion = "";
	fecha = 0;
	telefono = "";
	director = "";
	listaDeClientes = new ArrayList<Cliente>();
	listaDeGuitarras = new ArrayList<InterfaceGuitarra>();
	unCliente = new Cliente();
	unaAcustica = new Acustica();
	unaElectrica = new Electrica();
	unaEspañola = new Española();
	
}
public String getNombreDelaEmpresa() {
	return nombreDelaEmpresa;
}

public void setNombreDelaEmpresa(String nombreDelaEmpresa) {
	this.nombreDelaEmpresa = nombreDelaEmpresa;
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

public ArrayList<InterfaceGuitarra> getListaDeGuitarras() {
	return listaDeGuitarras;
}

public void setListaDeGuitarras(ArrayList<InterfaceGuitarra> listaDeGuitarras) {
	this.listaDeGuitarras = listaDeGuitarras;
}

public Cliente getUnCliente() {
	return unCliente;
}
public void setUnCliente(Cliente unCliente) {
	this.unCliente = unCliente;
}
public Acustica getUnaAcustica() {
	return unaAcustica;
}
public void setUnaAcustica(Acustica unaAcustica) {
	this.unaAcustica = unaAcustica;
}

public Electrica getUnaElectrica() {
	return unaElectrica;
}
public void setUnaElectrica(Electrica unaElectrica) {
	this.unaElectrica = unaElectrica;
}
public Española getUnaEspañola() {
	return unaEspañola;
}
public void setUnaEspañola(Española unaEspañola) {
	this.unaEspañola = unaEspañola;
}
//''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
public void agregarClientesAlaListaDeClientes(Cliente unClienteMas){
	
	listaDeClientes.add(unClienteMas);
}
public void agregarGuitarrasAlaListaDeGuitarras(Guitarra unaGuitarraMas){
	
	listaDeGuitarras.add(unaGuitarraMas);
}
public void cargoDatosTotalesReporte() throws FallaCuerdasException, DNIClienteException{
	
	cargoEncabezado();
	cargoReporte();
	calculoOperacionesPieReporte();
}
public void cargoEncabezado(){
	
		System.out.println("Nombre de la Empresa");
		this.setNombreDelaEmpresa(ing.next());
		System.out.println("Direccion de la Empresa");
		this.setDireccion(ing.next());
		System.out.println("Fecha");
		this.setFecha(ing.nextInt());
		System.out.println("Telefono");
		this.setTelefono(ing.next());
		System.out.println("Director");
		this.setDirector(ing.next());
}
public void cargoReporte() throws FallaCuerdasException, DNIClienteException{
	
	int c = 0;
	int g = 0;
	int cuantosClientesCargar = 0;
	int cuantasGuitarrasCargar = 0;
	String tipoDeGuitarras = "";
	
	System.out.println("-------------- CARGO CLIENTES ---------------");
	System.out.println("");
	System.out.println("");
	System.out.println("Cuantos clientes desea cargar??");
	cuantosClientesCargar = ing.nextInt();
	
		for ( c = 0; c < cuantosClientesCargar; c ++)
		{
			unCliente = new Cliente();
			System.out.println("Nombre del Cliente");
			unCliente.setNombreYapellido(ing.next());
			System.out.println("DNI del cliente");
			unCliente.setdNI(ing.nextInt());
			System.out.println("Domicilio del cliente");
			unCliente.setDomicilio(ing.next());
			System.out.println("Telefono del cliente");
			unCliente.setTelefono(ing.nextInt());
			System.out.println("Lugar de nacimiento del cliente");
			unCliente.setLugarDenacimiento(ing.next());
			System.out.println("El cliente es activo??");
			unCliente.setActivo(ing.nextBoolean());
			this.agregarClientesAlaListaDeClientes(unCliente);
			System.out.println("");
			System.out.println("-------------------------------------------------------------------------");
		}
			System.out.println("------------------------------------------------------CARGO GUITARRAS ----------------");
			System.out.println("");
			System.out.println("Cuantas guitarras desea cargar??");
			cuantasGuitarrasCargar = ing.nextInt();
			
				for ( g = 0; g < cuantasGuitarrasCargar; g ++)
				{
					System.out.println("Qué tipo de guitarras desea cargar??");
					tipoDeGuitarras = ing.next();
					
					if (tipoDeGuitarras.contains ("Acustica"))
					{
						System.out.println("Marca de la guitarra");
						unaAcustica.setMarca(ing.next());
						System.out.println("Tipo de cuerdas");
						unaAcustica.setTipoDeCuerdas(ing.next());
						System.out.println("Amplificación electrica");
						unaAcustica.setAmplificardorElectrico(ing.nextBoolean());
						System.out.println("Cantidad de cuerdas");
						unaAcustica.setCantCuerdas(ing.nextInt());
						System.out.println("Cantidad de clavijas");
						unaAcustica.setCantClavijas(ing.nextInt());
						System.out.println("Cantidad de cejillas");
						unaAcustica.setCantCejillas(ing.nextInt());
						System.out.println("Largo del diapason");
						unaAcustica.setLargoDiapason(ing.nextInt());
						System.out.println("Material de las cajas");
						unaAcustica.setMaterialCajas(ing.next());
						System.out.println("Color ");
						unaAcustica.setColor(ing.next());	
						this.agregarGuitarrasAlaListaDeGuitarras(unaAcustica);
						System.out.println("");
						System.out.println("-------------------------------------------------------------------------");						
					}
					if (tipoDeGuitarras.contains ("Electrica"))
					{
						System.out.println("Marca de la guitarra");
						unaElectrica.setMarca(ing.next());
						System.out.println("Tipo de cuerdas");
						unaElectrica.setTipoDeCuerdas(ing.next());
						System.out.println("Amplificación electrica");
						unaElectrica.setAmplificardorElectrico(ing.nextBoolean());
						System.out.println("Cantidad de cuerdas");
						unaElectrica.setCantCuerdas(ing.nextInt());
						System.out.println("Cantidad de clavijas");
						unaElectrica.setCantClavijas(ing.nextInt());
						System.out.println("Cantidad de cejillas");
						unaElectrica.setCantCejillas(ing.nextInt());
						System.out.println("Largo del diapason");
						unaElectrica.setLargoDiapason(ing.nextInt());
						System.out.println("Material de las cajas");
						unaElectrica.setMaterialCajas(ing.next());
						System.out.println("Color ");
						unaElectrica.setColor(ing.next());	
						this.agregarGuitarrasAlaListaDeGuitarras(unaElectrica);
						System.out.println("");
						System.out.println("-------------------------------------------------------------------------");	
					}
					if (tipoDeGuitarras.contains ("Española"))
					{
						System.out.println("Marca de la guitarra");
						unaEspañola.setMarca(ing.next());
						System.out.println("Tipo de cuerdas");
						unaEspañola.setTipoDeCuerdas(ing.next());
						System.out.println("Amplificación electrica");
						unaEspañola.setAmplificardorElectrico(ing.nextBoolean());
						System.out.println("Cantidad de cuerdas");
						unaEspañola.setCantCuerdas(ing.nextInt());
						System.out.println("Cantidad de clavijas");
						unaEspañola.setCantClavijas(ing.nextInt());
						System.out.println("Cantidad de cejillas");
						unaEspañola.setCantCejillas(ing.nextInt());
						System.out.println("Largo del diapason");
						unaEspañola.setLargoDiapason(ing.nextInt());
						System.out.println("Material de las cajas");
						unaEspañola.setMaterialCajas(ing.next());
						System.out.println("Color ");
						unaEspañola.setColor(ing.next());
						System.out.println("Está laqueada??");
						unaEspañola.setEstaLaqueada(ing.nextBoolean());						
						this.agregarGuitarrasAlaListaDeGuitarras(unaEspañola);
						System.out.println("");
						System.out.println("-------------------------------------------------------------------------");	
					}					
				}	
}
public void calculoOperacionesPieReporte(){
	
	 	cantidadTotalClientes();
	 	cantidadTotalDeGuitarrasDelaEmpresa();
	 	cantidadGuitarrasTesteadasOK();
	 	cantidadGuitarrasTesteadasNOOK();
}
public int cantidadTotalClientes(){
	
	return listaDeClientes.size();
}
public int cantidadTotalDeGuitarrasDelaEmpresa(){
	
	return listaDeGuitarras.size();
}
public int cantidadGuitarrasTesteadasOK(){
	
	int g = 0;
	int cantGuiTesOK = 0;
		for ( g = 0; g < listaDeGuitarras.size(); g ++)
		{
			if ((listaDeGuitarras.get(g)) instanceof Acustica)
			{
				Acustica unAcustica = (Acustica)listaDeGuitarras.get(g);
				if (unaAcustica.isPruebaIntegral() == true && unaAcustica.isPruebaAcustica() == true)
				{
					cantGuiTesOK ++;
				}				
			}
			if ((listaDeGuitarras.get(g)) instanceof Electrica)
			{
				Electrica unaElectrica = (Electrica)listaDeGuitarras.get(g);
				if (unaElectrica.isPruebaIntegral() == true && unaElectrica.isPruebaAcustica() == true)
				{
					cantGuiTesOK ++;
				}
				//if (unaElectrica.isPruebaAcustica() == true)
				//{
					//cantGuiTesOK ++;
				//}
			}
			if ((listaDeGuitarras.get(g)) instanceof Española)
			{
				Española unEspanola = (Española)listaDeGuitarras.get(g);
				if (unaEspañola.isPruebaIntegral() == true && unaEspañola.isPruebaAcustica() == true)
				{
					cantGuiTesOK ++;
				}
			}				
		}	
	return cantGuiTesOK;
}
public int cantidadGuitarrasTesteadasNOOK(){
	
	int n = 0;
	int cantGuiTestNOK = 0;
		for ( n  = 0; n < listaDeGuitarras.size(); n ++)
		{
			if ((listaDeGuitarras.get(n)) instanceof Acustica)
			{
				Acustica unaAcustica = (Acustica)listaDeGuitarras.get(n);
				if (unaAcustica.isPruebaIntegral() == false)
				{
					cantGuiTestNOK ++;
				}
				if (unaAcustica.isPruebaAcustica() == false)
				{
					cantGuiTestNOK ++;
				}
			}
			if ((listaDeGuitarras.get(n)) instanceof Electrica)
			{
				Electrica unaElectrica = (Electrica)listaDeGuitarras.get(n);
				if (unaElectrica.isPruebaIntegral() == false)
				{
					cantGuiTestNOK ++;
				}
				if (unaElectrica.isPruebaAcustica() == false)
				{
					cantGuiTestNOK ++;
				}
			}
			if ((listaDeGuitarras.get(n)) instanceof Española)
			{
				Española unaEspañola = (Española)listaDeGuitarras.get(n);
				
				if (unaEspañola.isPruebaIntegral() == false)
				{
					cantGuiTestNOK ++;
				}
				if (unaEspañola.isPruebaAcustica() == false)
				{
					cantGuiTestNOK ++;
				}				
			}
		}	
	return cantGuiTestNOK;
}
//////////////////////////////////////////////////////IMPRIMIRES//////////////////////////////////////////////////////////////////////////
public void ImprimirDatosTotales() throws FallaCuerdasException, DNIClienteException{
	
	ImprimoEncabezado();
	ImprimoReporte();
	ImprimoOperacionesPie();	
}
public void ImprimoEncabezado(){
	
	System.out.println("");
	System.out.println("");	
	System.out.println("Nombre de la empresa: " + nombreDelaEmpresa);
	System.out.println("Direccion: " + direccion);
	System.out.println("Fecha:" + fecha);
	System.out.println("                                                          Telefono: " + telefono);
	System.out.println("                                                          Director: " + director);	
	System.out.println("");
	System.out.println("");
}
public void ImprimoReporte() throws FallaCuerdasException, DNIClienteException{
	
	System.out.println("          REPORTE DE CLIENTES Musica 'Sospecha de Pimienta'");
	System.out.println("");
	System.out.println("---------------------------Cliente------------------------------");
		int f = 0;
			for (f = 0; f < listaDeClientes.size(); f ++)
			{
				listaDeClientes.get(f).ImprimirInfoCliente();
			}	
			
	System.out.println("-----------------------Guitarras----------------------------------");
	System.out.println("");
	   int gui = 0;
	   
	   		for ( gui = 0; gui < listaDeGuitarras.size(); gui ++)
	   		{
	   			System.out.println("................Guitarra: " + (gui+1) + "................");
	   			System.out.println("");
	   			System.out.println("");
	   			
	   			if ((listaDeGuitarras.get(gui)) instanceof Acustica)
	   			{
	   				Acustica unaAcustica = (Acustica)listaDeGuitarras.get(gui);
	   				unaAcustica.ImprimirInfoAcústica();
	   			}
	   			if ((listaDeGuitarras.get(gui)) instanceof Electrica)
	   			{
	   				Electrica unaElectrica = (Electrica)listaDeGuitarras.get(gui);
	   				unaElectrica.ImprimirInfoElectrica();
	   			}
	   			if ((listaDeGuitarras.get(gui)) instanceof Española)
	   			{
	   				Española unaEspañola = (Española)listaDeGuitarras.get(gui);
	   				unaEspañola.ImprimirInfoEspañola();
	   			}
	   		}
	   		System.out.println("");
	   		System.out.println("------------------Test Guitarras -----------------");
	   		System.out.println("");
	   		TestGuitarras();
}
public void TestGuitarras() throws FallaCuerdasException{
	
	int t = 0;
	  for ( t = 0; t < listaDeGuitarras.size(); t ++)
	  {
		  //falsa guitarra 1 2 3 
		  listaDeGuitarras.get(t).probarCuerdas();
		  listaDeGuitarras.get(t).probarTraste();
		  listaDeGuitarras.get(t).probarGuitarra();
	  }
}
public void ImprimoOperacionesPie(){
	
	System.out.println("");
	System.out.println("");
	System.out.println("--------------------- CALCULOS PIE DE INFORME -----------------");
	System.out.println("");
	System.out.println("Cantidad total de clientes: " + cantidadTotalClientes());
	System.out.println("Cantidad total de guitarras de la Empresa: " + cantidadTotalDeGuitarrasDelaEmpresa());
	System.out.println("Cantidad de guitarras testeadas Ok" + cantidadGuitarrasTesteadasOK());
	System.out.println("Cantidad de guitarras testeadas NO OK: " + cantidadGuitarrasTesteadasNOOK());	
}	
}
