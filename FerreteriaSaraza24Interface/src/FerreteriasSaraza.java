import java.util.*;

public class FerreteriasSaraza implements InterfazFerreteria {
	
	Scanner ing;
	
	private String razonSocial;
	private String direccion;
	private int fechaReporte;
	private int telefonoCentral;
	private ArrayList<Sucursal>listaDeSucursales;
	private Sucursal unaSucursal;
	private StockSucursal unStock;
	
public FerreteriasSaraza(String _razonSocial,String _direccion,int _fechaReporte,int _telefonoSucursal,Sucursal _unaSucursal,StockSucursal _unStock){
	
	ing = new Scanner(System.in);
	
	razonSocial =_razonSocial;
	direccion =_direccion;
	fechaReporte =_fechaReporte;
	telefonoCentral =_telefonoSucursal;
	listaDeSucursales = new ArrayList<Sucursal>();
	/*unaSucursal =_unaSucursal;
	unStock =_unStock;*/
}
public FerreteriasSaraza(){
	
	ing = new Scanner(System.in);
	
	razonSocial = "";
	direccion = "";
	fechaReporte = 0;
	telefonoCentral = 0;
	listaDeSucursales = new ArrayList<Sucursal>();	
}
public Scanner getIngr() {
	return ing;
}
public void setIngr(Scanner ingr) {
	this.ing = ingr;
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
public int getFechaReporte() {
	return fechaReporte;
}
public void setFechaReporte(int fechaReporte) {
	this.fechaReporte = fechaReporte;
}
public int getTelefonoCentral() {
	return telefonoCentral;
}
public void setTelefonoCentral(int telefonoCentral) {
	this.telefonoCentral = telefonoCentral;
}
public ArrayList<Sucursal> getListaDeSucursales() {
	return listaDeSucursales;
}
public void setListaDeSucursales(ArrayList<Sucursal> listaDeSucursales) {
	this.listaDeSucursales = listaDeSucursales;
}
public Sucursal getUnaSucursal() {
	return unaSucursal;
}
public void setUnaSucursal(Sucursal unaSucursal) {
	this.unaSucursal = unaSucursal;
}
public StockSucursal getUnStock() {
	return unStock;
}
public void setUnStock(StockSucursal unStock) {
	this.unStock = unStock;
}
public void agregoSucursalalaListaDeSucursales(Sucursal unaSucursalMas){
	
	listaDeSucursales.add(unaSucursalMas);
}
public void cargoDatosTotalesFerreteriasSaraza() throws ImporteException{
	
	cargoEncabezadoReporte();
	cargoReporteFerreteria();
	calculoOperacionesPieReporte();
}
public void cargoEncabezadoReporte(){
	
	System.out.println("razon social");
	this.setRazonSocial(ing.next());
	System.out.println("direccion");
	this.setDireccion(ing.next());
	System.out.println("fecha del reporte");
	this.setFechaReporte(ing.nextInt());
	System.out.println("telefono de la central");
	this.setTelefonoCentral(ing.nextInt());	
}
public void imprimirSeparacionparaCargaReporte(){
	
	System.out.println("=========================================================================carga reporte=============================================");
	System.out.println("");
	System.out.println("");
}
public void cargoReporteFerreteria() throws ImporteException{
	
	int suc;
	suc = 0;
	int stk;
	stk = 0;
		for ( suc = 0; suc < 3; suc ++ )  /// RECORRO LAS 3 SUCURSALES
		{
			System.out.println("--------sucursal:" + (suc + 1) + "----------");
			System.out.println("");
			
			Sucursal unaSucursal;			
			unaSucursal = new Sucursal();
			System.out.println("Razon Social:");
			unaSucursal.setRazonSocialSucursal(ing.next());
			System.out.println("CUIT:");
			unaSucursal.setCUIT(ing.nextInt());
			System.out.println("Domicilio sucursal:");
			unaSucursal.setDomicilioSucursal(ing.next());
			System.out.println("telefono");
			unaSucursal.setTelefonoSucursal(ing.nextInt());
			System.out.println("Barrio de la sucursal");
			String ingrBarrio = ing.next();
			
				if ( ing.equals("Flores"))// equals es el equivalente a == en java para los enumerados//
				{	
					unaSucursal.setBarrioSucursal(BarrioEnum.Flores);
				}
				if ( ing.equals("VillaDelParque"))
				{
					unaSucursal.setBarrioSucursal(BarrioEnum.VillaDelParque);
				}
				if ( ing.equals("Caballito"))
				{
					unaSucursal.setBarrioSucursal(BarrioEnum.Caballito);
				}
			this.agregoSucursalalaListaDeSucursales(unaSucursal);
				
			for ( stk = 0; stk < 4; stk ++ )//segundo ciclo for para stock de 4 items //
			{
				
				System.out.println("Articulo");
				StockSucursal unStock = new StockSucursal();
				unStock.setArticulo(ing.next());
				System.out.println("importe");/// CUSTOM EXCEPTION !!!!///
				unStock.setImporte(ing.nextDouble());
				System.out.println("Stock");
				unStock.setStockInterno(ing.nextInt());   //estará bien??? ///
				unaSucursal.agregoStockalaListaDeStock(unStock);				
			}
          }
}
public void calculoOperacionesPieReporte(){
	
		calculoCantTotalDeSucursales();
		calculoSucursalesBajoStockCintaDobleA();
		calculoSucursalStockCompleto();
}
public int calculoCantTotalDeSucursales(){
	
	return listaDeSucursales.size();
}
public int calculoSucursalesBajoStockCintaDobleA(){
	
	int su;
	su = 0;
	int SuBajStDobleA;
	SuBajStDobleA = 0;
	
		for (su = 0; su < listaDeSucursales.size(); su ++)
		{
			if ( listaDeSucursales.get(su).tieneStockBajo("cinta dobleAA") == true)
			{
				SuBajStDobleA = SuBajStDobleA + 1;
			}
		}
		return SuBajStDobleA;
		/*
		int s = 0;
		for ( su = 0; su < listaDeSucursales.size(); su ++)
		{
			for (int i = 0; i < listaDeSucursales.get(su).getListaDeStock().size(); i++) 
			{
				if ( listaDeSucursales.get(su).getListaDeStock().get(s).getArticulo() == "Cinta Doble A")
				{
					if (listaDeSucursales.get(su).getListaDeStock().get(s).getStockInterno() == 0) {
						SuBajStDobleA = SuBajStDobleA + 1;
					}					
				}
			}			
		}
		*/		
}
public int calculoSucursalStockCompleto(){
	
	int m;
	m = 0;
	int suStock;
	suStock = 0;
	
	
		for ( m = 0; m < listaDeSucursales.size(); m ++)
		{
			if ( listaDeSucursales.get(m).TieneStockCompleto() == true)
			{
				suStock = m + 1;
			}
		}	
	return suStock;
}

//==================================================================IMPRIMIRES====================================================================//
public void imprimirTodoslosDatosDelReporteFerreteria() throws ImporteException{
	
	imprimirTituloReporte();
	imprimirSeparacionparaCargaReporte();
	imprimirEncabezadoReporte();
	imprimirDatosDelReporte();
	imprimirCalculoOperacionesPieReporte();	
}
public void imprimirTituloReporte(){
	
	System.out.println("##################################### FERRETERIAS SARAZA ############################################");
	System.out.println("");
	System.out.println("");
}
public void imprimirEncabezadoReporte(){	
	
	obtenerInfo();  //interfaz//
	
	System.out.println("Fecha del reporte: " + fechaReporte);
	
}
public void imprimirDatosDelReporte() throws ImporteException{
	
	int s;
	s = 0;
	
	System.out.println("----------------------------------------SUCURSAL: " + (s+1) + "-----------------------------------------------");
	System.out.println("");
	System.out.println("");
	
		for ( s = 0; s < listaDeSucursales.size(); s ++){
			
			System.out.println("El número de sucursales es: " + listaDeSucursales.get(s));
			listaDeSucursales.get(s).imprimirInfoStockDecadaSucursal();
			listaDeSucursales.get(s).imprimoInfoSucursalEnum();		// Ver con Tavo///	
		}
}	
public void imprimirCalculoOperacionesPieReporte() throws ImporteException{
	
	System.out.println("Cantidad de sucursales: " + calculoCantTotalDeSucursales());
	System.out.println("Cantidad de sucursales con bajo stock de cinta doble A: " + calculoSucursalesBajoStockCintaDobleA());
	System.out.println("Sucursal con stock completo: " + calculoSucursalStockCompleto());
}
public void obtenerInfo() {   //interfaz//
	
	// TODO Auto-generated method stub
	System.out.println("Razon Social: " + razonSocial);
	System.out.println("Dirección: " + direccion);
	System.out.println("Telefono de la central: " + telefonoCentral);
}
}	


