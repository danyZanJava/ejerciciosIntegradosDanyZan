// Importé las librerias que voy a utilizar para la clase Scanner y el ArrayList
import java.util.*;

//--------El Proyecto SUBE ejemplifica lo que es un software de carga de un comprobante del sistema SUBE(Sistema Unico->
// de Boleto Electornico para viajar en transporte público)
// Declaración de la clase SUBE
public class Sube { 
	// declaracion de la clase Scanner mediante una variable ing 
	private Scanner ing;  ///
	// Declaración de las estructuras necesaria(Atributos de la clase)
	private int fecha; 
	private String Comercio;
	private String operador;
	private String direccion;
	private int hora;
	private String agente;
	private int terminal;
	// declaro la lista ArrayList llamado<Ticket> del tipo listaDeTickets
	private ArrayList<Ticket>listaDeTickets; 
	private Ticket unTicket;
	
	
	//Sobrecarga de Método, Sirve para darle valores iniciales (inicializar)
	// a las variables que crean la estructura de un objeto
public Sube(int _fecha,String _Comercio,String _operador,String _direccion,int _hora,String _agente,int _terminal,Ticket _unTicket){
	
	// Creo un objeto Scanner para cargar datos por el teclado
    // NEW  = Operador de instancia 
	ing = new Scanner(System.in); 
	fecha =_fecha;
	Comercio =_Comercio;
	operador =_operador;
	direccion =_direccion;
	hora =_hora;
	agente =_agente;
	terminal =_terminal;
	// Creo el objeto ArrayList<Ticket> del tipo listaDeTickets
	listaDeTickets = new ArrayList<Ticket>(); 
	unTicket =_unTicket;
}
//constructor por defecto, debe existir para instanciar el objeto
public Sube(){ 
	
	//Se repite la declaración del Scanner en el constructor por defecto 
	ing = new Scanner(System.in); 
	
	fecha = 0;
	Comercio = "";
	operador = "";
	direccion = "";
	hora = 0;
	agente = "";
	terminal = 0;
	listaDeTickets = new ArrayList<Ticket>();
}
public Scanner getIng() {
	return ing;
}
public void setIng(Scanner ing) {
	this.ing = ing;
}
//Los accesores(getter y setters) son metodos publicos que sirven para modificar atributos de tipo privados
//El getter permitirá OBTENER el valor del atributo, y el setter permitirá ESTABLECER un nuevo valor al 
//atributo
public int getFecha() {
	return fecha;
}
public void setFecha(int fecha) {
	this.fecha = fecha;
}
public String getComercio() {
	return Comercio;
}
public void setComercio(String comercio) {
	Comercio = comercio;
}
public String getOperador() {
	return operador;
}
public void setOperador(String operador) {
	this.operador = operador;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public int getHora() {
	return hora;
}
public void setHora(int hora) {
	this.hora = hora;
}
public String getAgente() {
	return agente;
}
public void setAgente(String agente) {
	this.agente = agente;
}
public int getTerminal() {
	return terminal;
}
public void setTerminal(int terminal) {
	this.terminal = terminal;
}
public ArrayList<Ticket> getListaDeTickets() {
	return listaDeTickets;
}
public void setListaDeTickets(ArrayList<Ticket> listaDeTickets) {
	this.listaDeTickets = listaDeTickets;
}
public Ticket getUnTicket() {
	return unTicket;
}
public void setUnTicket(Ticket unTicket) {
	this.unTicket = unTicket;
}
//Método agregoTicketsA... para cargar cada ticket a la listaDeTickets//
public void agregoTicketsAlaListaDeTickests(Ticket unTicketMas){	
	listaDeTickets.add(unTicketMas);
}
//Declaro método cargoDatosTotalesSUBE y lo divido en tres metodos: //
	// 1) cargoEncabezado() 2) cargoInfoDeLaCarga() 3) calulo OperacionesSaldoFinalDelaCarga()	//
public void cargoDatosTotalesSUBE() throws ImporteExcepcion{ 
	
		cargoEncabezadoCargaVirtual();
		cargoInformacionDeLaCarga();
		calculoOperacionesSaldoFinalDelaCarga();	
		
}
//Deberia ir un ciclo for por el arraylist? NO!! x que es un solo ticket por vez //
public void cargoEncabezadoCargaVirtual(){
	
		System.out.println("Fecha");
		
		// Utilizo la sentencia THIS para utilizar un método y un atributo que se encuentra//
		// en la misma clase en la que escribo el código, también diferenciar que las variables y métodos son de la clase en la que//
		// aparecen. Diferencian métodos y clases heredadas de otras clases.//
		this.setFecha(ing.nextInt());
		System.out.println("Comercio");
		this.setComercio(ing.next());
		System.out.println("Operador");
		this.setOperador(ing.next());
		System.out.println("Direccion");
		this.setDireccion(ing.next());
		System.out.println("Hora");
		this.setHora(ing.nextInt());
		System.out.println("Agente");
		this.setAgente(ing.next());
		System.out.println("Terminal");
		this.setTerminal(ing.nextInt());			
}
// Cargo Info de la carga y utilizo THROWS para marcarle al compilador que debe lanzar una excepcion llamada ImporteExpetion//
public void cargoInformacionDeLaCarga() throws ImporteExcepcion{
	
	    unTicket = new Ticket();
		System.out.println("SALDO ANTERIOR  $:");
		unTicket.setSaldoAnterior(ing.nextDouble());
	//  variable afectada a la excepcion//
		System.out.println("IMPORTE  $:");  
		unTicket.setImporte(ing.nextDouble());
		
		this.agregoTicketsAlaListaDeTickests(unTicket);
}
//Calculo del importe final luego de tomar el SaldoAnterior y sumarle el importe para calcular SaldoFinal//	
public double calculoOperacionesSaldoFinalDelaCarga() throws ImporteExcepcion{	
		
		double saldoFinal;
		saldoFinal = 0;
		saldoFinal = unTicket.getSaldoAnterior() + unTicket.getImporte();		 					
			
		return saldoFinal;	
}
////////////////////////////////////////////////////////////IMPRIMIRES//////////////////////////////////////////////////
public void imprimirTodo() throws ImporteExcepcion{
	
		imprimoEncabezado();
		ImprimoReporte();
		imprimoOperacionPieInforme();
}
public void imprimoEncabezado(){
	
		System.out.println("------------------------------------------------------------------------");
		System.out.println("                              SUBE                                      ");
		System.out.println("                            RECARGAS                                     ");
		System.out.println("                          ELECTROPAGO                                       ");
		System.out.println("                         CARGA EFECTIVO                                     ");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Fecha: " + this.getFecha() + "\t  Hora: " + this.getHora());
		System.out.println("Comercio: " + this.getComercio() + "\t  Agente: " + this.getAgente());
		System.out.println("Operador: " + this.getOperador() + "\t  Terminal: " + this.getTerminal());
        System.out.println("Direccion: " + this.getDireccion());
}
public void ImprimoReporte() throws ImporteExcepcion{
	
	
		System.out.println("");
		System.out.println("           TICKET : 00001357          ");
		System.out.println("");
		System.out.println("SALDO ANTERIOR:     $ " + unTicket.getSaldoAnterior());
		System.out.println("IMPORTE:            $ " + unTicket.getImporte());
		
}
public void imprimoOperacionPieInforme() throws ImporteExcepcion{
	
		System.out.println("SALDO FINAL:        $ " + calculoOperacionesSaldoFinalDelaCarga());
		System.out.println("");
		System.out.println("             TARJETA: XXXX  XX70 0224 692X");
		System.out.println("");
		System.out.println("          ANTE CUALQUIER RECLAMO INDIQUE ESTE NRO");
		System.out.println("               NRO.CTRL: 0000-JKD6-UXFU-XS3F-4");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("           TICKET NO VALIDO COMO COMPROBANTE FISCAL ");
		System.out.println("                 GRACIAS ! POR USAR ELECTROPAGO");
}
}

	
















	
	


