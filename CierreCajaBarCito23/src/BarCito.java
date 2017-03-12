import java.util.*;

public class BarCito {
	
	Scanner ing;
	
	private String nombreDelBar;
	private String direccion;
	private int fecha;
	private int telefono;
	private ArrayList<Mesa>listaDeMesas;
	private Mesa unaMesa;
	private ResumenDeMesa unResumen;
	private int cantMesas;
	
public BarCito(String _nombreDelBar,String _direccion,int _fecha,int _telefono,Mesa _unaMesa,ResumenDeMesa _unResumen,int _cantMesas){
	
	ing = new Scanner(System.in);
	
	nombreDelBar =_nombreDelBar;
	direccion =_direccion;
	fecha =_fecha;
	telefono =_telefono;
	listaDeMesas = new ArrayList<Mesa>();
	unaMesa =_unaMesa;
	unResumen =_unResumen;
	cantMesas =_cantMesas;  // variable creada para el calculo de mesa que mas facturó//
}
public BarCito(){
	
	ing = new Scanner(System.in);
	
	nombreDelBar = "";
	direccion = "";
	fecha = 0;
	telefono = 0;
	listaDeMesas = new ArrayList<Mesa>();
	cantMesas = 0;
	
}
public Scanner getIng() {
	return ing;
}
public void setIng(Scanner ing) {
	this.ing = ing;
}
public String getNombreDelBar() {
	return nombreDelBar;
}
public void setNombreDelBar(String nombreDelBar) {
	this.nombreDelBar = nombreDelBar;
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
public ArrayList<Mesa> getListaDeMesas() {
	return listaDeMesas;
}
public void setListaDeMesas(ArrayList<Mesa> listaDeMesas) {
	this.listaDeMesas = listaDeMesas;
}
public void agregoUnaMesaAlaListaDeMesas(Mesa unaMesaMas){
	
	listaDeMesas.add(unaMesaMas);
}

//======================================================= INICIO DE LAS CARGAS ========================================================//

public void cargaTotalDeDatosBarCito() throws DNImozoException{
	
	cargoEncabezadoCierreCajaBar();	
	cargoCierreCajaBar();
	calculoOperacionesPieCierre();	
}
public void cargoEncabezadoCierreCajaBar(){
	
	System.out.println("===========================================CIERRE CAJA BARCITO =============================================");
	System.out.println("");
	System.out.println("");
	System.out.println("nombre del bar:");
	this.setNombreDelBar(ing.next());
	System.out.println("direccion del bar");
	this.setDireccion(ing.next());
	System.out.println("Fecha de cierre");
	this.setFecha(ing.nextInt());
	System.out.println("telefono del bar");
	this.setTelefono(ing.nextInt());	
}
public void  tituloDelInformeCierre(){

	
	System.out.println("----------------------------------------- CIERRE DE CAJA AL 06/07/2014 --------------------------------------------");
	System.out.println("");
	System.out.println("");
}
public void cargoCierreCajaBar() throws DNImozoException{
	
	      /* int m;
	       m = 0;*/
	       /*
	        * NO SE COLOCA UN CICLO FOR POR MESA, DEBIDO A QUE LA CANTIDAD DE OBJETOS
	        * QUE COMPONEN LA MESA(RESUMENDEMESA) SON DISTINTAS EN CADA MESA.
	        * PARA SOLUCIONARLO EXISTEN DOS ALTERNATIVAS BASICAS:
	        * 1) CREAR CADA MESA UNA POR UNA, Y FOR SEGUN LA CANTIDAD DE OBJETOS QUE LA COMPONEN
	        * 2) UTILIZAR UN CICLO WHILE PARA LA CARGA DE LOS OBJETOS QUE LA COMPONEN(PROXIMAMENTE)
	        *  
	        */
		//mesa 1
			System.out.println("nombre y apellido del mozo");
			unaMesa = new Mesa();
			unaMesa.setNombreYapellidoDelMozo(ing.next());
			System.out.println("DNI");
			unaMesa.setDNI(ing.nextInt());
			System.out.println("Domicilio del mozo");
			unaMesa.setDomicilio(ing.next());
			System.out.println("Telefono del mozo");
			unaMesa.setTelefono(ing.nextInt());
			System.out.println("Mesa asignada");
			unaMesa.setMesaAsignada(ing.nextInt());
			System.out.println("Cantidad de facturas emitidas");
			unaMesa.setCantFactEmitidas(ing.nextInt());
			System.out.println("Total");
			this.agregoUnaMesaAlaListaDeMesas(unaMesa);//PERFECTO///
			
			int r;
			r = 0;
			for ( r = 0; r < 4; r ++)  //ciclo for por 4 articulos en ésta mesa//
			{
				//System.out.println("Articulo:            \t Importe:");
				unResumen = new ResumenDeMesa();
				System.out.println("Articulo " + (r + 1) + ":");
				unResumen.setArticulo(ing.next());
				System.out.println("Importe " + (r+1) + ":");
				unResumen.setImporte(ing.nextDouble());
				unaMesa.agregarResumenAlaListaDeResumenes(unResumen);/////PERFECTO///
			}			
			//mesa 2
				System.out.println("nombre y apellido del mozo");
				unaMesa = new Mesa();
				unaMesa.setNombreYapellidoDelMozo(ing.next());
				System.out.println("DNI");
				unaMesa.setDNI(ing.nextInt());
				System.out.println("Domicilio del mozo");
				unaMesa.setDomicilio(ing.next());
				System.out.println("Telefono del mozo");
				unaMesa.setTelefono(ing.nextInt());
				System.out.println("Mesa asignada");
				unaMesa.setMesaAsignada(ing.nextInt());
				System.out.println("Cantidad de facturas emitidas");
				unaMesa.setCantFactEmitidas(ing.nextInt());
				System.out.println("Total");
				this.agregoUnaMesaAlaListaDeMesas(unaMesa);// PERFECTOOOOO///
				
				int l;
				l = 0; 
				for ( l = 0; l < 3; l ++) // ciclo for de 3 articulos//
				{
				//System.out.println("Articulo:                         \t Importe:            ");
				unResumen = new ResumenDeMesa();
				System.out.println("Articulo " + (l+1) + ":");						
				unResumen.setArticulo(ing.next());
				System.out.println("Importe " + (l+1) + ":");
				unResumen.setImporte(ing.nextDouble());
				unaMesa.agregarResumenAlaListaDeResumenes(unResumen);//PERFECTO/////
				}
		
}
public void calculoOperacionesPieCierre(){
	
	calculoCantTotalDeMesas();
	calculoCantMesasQsuperan30$();
	calculoMesaQmasFacturo();	
}
public int calculoCantTotalDeMesas(){
	
	return listaDeMesas.size();
}
public int calculoCantMesasQsuperan30$(){
	
	int su;
	su = 0;
	int cantMeSup30;
	cantMeSup30 = 0;
	
		for ( su = 0; su < listaDeMesas.size(); su ++)
		{
			if ( listaDeMesas.get(su).getTotal() > 30)
			{
				cantMeSup30 = cantMeSup30 + 1;
			}
		}
	return cantMeSup30;
}
public double calculoMesaQmasFacturo(){
	
	int m;
	m = 0;
	double mesaMasFac;
	mesaMasFac = 0;
	boolean Pvez;
	Pvez = true;
		for ( m = 0; m < cantMesas; m ++)
		{
			if ( Pvez == true || listaDeMesas.get(m).getTotal() > mesaMasFac)
			{
				mesaMasFac = listaDeMesas.get(m).getTotal();
				Pvez = false;
			}
		}
	
	return mesaMasFac;
}
////////////////////////////////////////////// IMPRIMIRES ////////////////////////////////////////////////////////


public void imprimirTodoslosDatosDelReporte() throws DNImozoException{
	
	imprimoEncabezadoReporte();
	imprimoCierreDeCaja();
	imprimoOperacionesPiedelCierre();
	
	}
public void imprimoEncabezadoReporte(){
	
	System.out.println("");
	System.out.println("");
	System.out.println("--------------------------------------------------------CIERRE DE CAJA BARCITO --------------------------------------");
	System.out.println("");
	System.out.println("");
	System.out.println("nombre del bar: " + nombreDelBar);
	System.out.println("Direccion: " + direccion);
	System.out.println("Fecha: " + fecha);
	System.out.println("Telefono: " + telefono);	
}
public void imprimoCierreDeCaja() throws DNImozoException {
	
	System.out.println("");
	System.out.println("");
	System.out.println("=========================== CIERRE DE CAJA AL 06/09/2014 ===================================");
	System.out.println("");
	System.out.println("");
		int me;
		me = 0;
			for ( me = 0; me < listaDeMesas.size(); me ++)
			{
				listaDeMesas.get(me).imprimirInfoMesa(me);
				
			}
}
public void imprimoOperacionesPiedelCierre(){
	
	System.out.println("");
	System.out.println("Cantidad total de mesas: "+ calculoCantTotalDeMesas());
	System.out.println("Cantidad de mesas que superan los $ 30" + calculoCantMesasQsuperan30$());
	System.out.println("Mesa que mas facturó: " + calculoMesaQmasFacturo());
}
}


