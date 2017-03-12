import java.util.*;

public class Sucursal implements InterfazFerreteria {
	
	Scanner ing;   
	
	private String razonSocialSucursal;
	private int CUIT;
	private String domicilioSucursal;
	private int telefonoSucursal;
	private BarrioEnum barrioSucursal;
	private ArrayList<StockSucursal>stock;	
	
public Sucursal(String _razonSocialSucursal,int _CUIT,String _domicilioSucursal,int _telefonoSucursal,BarrioEnum _barrioSucursal){
	
	ing = new Scanner(System.in);
	
	razonSocialSucursal =_razonSocialSucursal;
	CUIT =_CUIT;
	domicilioSucursal =_domicilioSucursal;
	telefonoSucursal =_telefonoSucursal;
	barrioSucursal =_barrioSucursal;
	stock = new ArrayList<StockSucursal>();	
}
public Sucursal(){
	
	ing = new Scanner(System.in);
	
	razonSocialSucursal = "";
	CUIT = 0;
	domicilioSucursal = "";
	telefonoSucursal = 0;
	barrioSucursal = barrioSucursal;
	stock = new ArrayList<StockSucursal>();			
}
public Scanner getIng() {
	return ing;
}
public void setIng(Scanner ing) {
	this.ing = ing;
}
public String getRazonSocialSucursal() {
	return razonSocialSucursal;
}
public void setRazonSocialSucursal(String razonSocialSucursal) {
	this.razonSocialSucursal = razonSocialSucursal;
}
public int getCUIT() {
	return CUIT;
}
public void setCUIT(int cUIT) {
	CUIT = cUIT;
}
public String getDomicilioSucursal() {
	return domicilioSucursal;
}
public void setDomicilioSucursal(String domicilioSucursal) {
	this.domicilioSucursal = domicilioSucursal;
}
public int getTelefonoSucursal() {
	return telefonoSucursal;
}
public void setTelefonoSucursal(int telefonoSucursal) {
	this.telefonoSucursal = telefonoSucursal;
}
public ArrayList<StockSucursal> getListaDeStock() {
	return stock;
}
public void setListaDeStock(ArrayList<StockSucursal> listaDeStock) {
	this.stock = listaDeStock;
}
public BarrioEnum getBarrioSucursal() {
	return barrioSucursal;
}
public void setBarrioSucursal(BarrioEnum barrioSucursal) {
	this.barrioSucursal = barrioSucursal;
}

public void agregoStockalaListaDeStock(StockSucursal unStockMas){///// agrego stock a la lista//
	
	stock.add(unStockMas);
}

public boolean tieneStockBajo(String articulo){
	
	boolean stockBajo;
	stockBajo = false;
	int stk;
	stk = 0;
		for ( stk = 0; stk < stock.size(); stk ++)
		{
			if ( stock.get(stk).getArticulo() == articulo)
			{
			if ( stock.get(stk).getStockInterno() == 0)
			{
				stockBajo = true; // TRUE porque el stock bajo ahora es VERDADERO //
			}
			}
		}
	return stockBajo;
}
public boolean TieneStockCompleto(){
	
	int t;
	t = 0;
	boolean tieneStockComp;
	tieneStockComp = true;
	
		for (t = 0; t < stock.size(); t ++)
		{
			if ( stock.get(t).getStockInterno() == 0)
			{
				tieneStockComp = false; //false porque si ya encuentra un articulo con stock = 0, ergo, NO ESTA COMPLETO!!!//
				//break;
			}
		}
	
	return tieneStockComp ;
}
public void imprimoInfoSucursalEnum(){
	
	obtenerInfo();
	
	System.out.println("El CUIT de la sucursal es: " + CUIT);
	
	
		if ( this.getBarrioSucursal() == BarrioEnum.Flores)
		{
			System.out.println("El barrio de la sucursal es: Flores");
		}
		if ( this.getBarrioSucursal() == BarrioEnum.VillaDelParque)
		{
			System.out.println("El barrio de la sucursal es: Villa del Parque");
		}
		if ( this.getBarrioSucursal() == BarrioEnum.Caballito)
		{
			System.out.println("El barrio de la sucursal es: Caballito");
		}
}
public void imprimirInfoStockDecadaSucursal () throws ImporteException{
	
		int o;
		o = 0;
			for ( o = 0; o < stock.size(); o ++)
			{
				System.out.println("Articulo: " + stock.get(o).getArticulo() + " /t Importe: " + stock.get(o).getImporte() + "/t Stock:  " + stock.get(o).getStockInterno());				
			}				
			}
public void obtenerInfo() {
	
	// TODO Auto-generated method stub
	System.out.println("La razon social de la sucursal es: " + razonSocialSucursal);
	System.out.println("El domicilio de la sucursal es: " + domicilioSucursal);
	System.out.println("El telefono de la sucursal es: " + telefonoSucursal);
}		
}

