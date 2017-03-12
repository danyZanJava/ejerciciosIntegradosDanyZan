
import java.util.*;	

public class Mesa {
	Scanner ing;
	
	private String nombreYapellidoDelMozo;
	private int DNI;
	private String domicilio;
	private int telefono;
	private int mesaAsignada;
	private int cantFactEmitidas;
	private double total;
	private ArrayList<ResumenDeMesa>listaDeResumenes;
	private ResumenDeMesa unResumen;
	
public Mesa(String _nombreYapellidoDelMozo,int _DNI,String _domicilio,int _telefono,int _mesaAsignada,int _cantFactEmitidas,double _total,ResumenDeMesa _unResumen){
	
	ing = new Scanner(System.in);
	
	nombreYapellidoDelMozo =_nombreYapellidoDelMozo;
	DNI =_DNI;
	domicilio =_domicilio;
	telefono =_telefono;
	mesaAsignada =_mesaAsignada;
	cantFactEmitidas =_cantFactEmitidas;
	total =_total;
	listaDeResumenes = new ArrayList<ResumenDeMesa>();	
	unResumen =_unResumen;
}
public Mesa(){
	
	ing  = new Scanner(System.in);
	
	nombreYapellidoDelMozo = "";
	DNI = 0;
	domicilio = "";
	telefono = 0;
	mesaAsignada = 0;
	cantFactEmitidas = 0;
	listaDeResumenes = new ArrayList<ResumenDeMesa>();
	total = 0;
}
public Scanner getIng() {
	return ing;
}
public void setIng(Scanner ing) {
	this.ing = ing;
}
public String getNombreYapellidoDelMozo() {
	return nombreYapellidoDelMozo;
}
public void setNombreYapellidoDelMozo(String nombreYapellidoDelMozo) {
	this.nombreYapellidoDelMozo = nombreYapellidoDelMozo;
}
public int getDNI() throws DNImozoException {
	
	if ( DNI <= 0)
	{
		throw  new DNImozoException("DNI incorrecto!! Digite el DNI correcto");
	}
	else
	{
		return DNI;
	}	
}
public void setDNI(int dNI) {
	DNI = dNI;
}
public String getDomicilio() {
	return domicilio;
}
public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}
public int getTelefono() {
	return telefono;
}
public void setTelefono(int telefono) {
	this.telefono = telefono;
}
public int getMesaAsignada() {
	return mesaAsignada;
}
public void setMesaAsignada(int mesaAsignada) {
	this.mesaAsignada = mesaAsignada;
}
public int getCantFactEmitidas() {
	return cantFactEmitidas;
}
public void setCantFactEmitidas(int cantFactEmitidas) {
	this.cantFactEmitidas = cantFactEmitidas;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public ArrayList<ResumenDeMesa> getListaDeResumenes() {
	return listaDeResumenes;
}
public void setListaDeResumenes(ArrayList<ResumenDeMesa> listaDeResumenes) {
	this.listaDeResumenes = listaDeResumenes;
}
public void agregarResumenAlaListaDeResumenes(ResumenDeMesa unResumenMas){
	
	listaDeResumenes.add(unResumenMas);
}
public void imprimirInfoMesa(int numeroDeMesa) throws DNImozoException{
	
	System.out.println("Nombre y Apellido del Mozo: " + nombreYapellidoDelMozo);
	System.out.println("DNI del Mozo: " + DNI);
	System.out.println("Domicilio del Mozo: " + domicilio);
	System.out.println("Telefono particular del Mozo: " + telefono);
	System.out.println("Mesa asignada: " + mesaAsignada);
	System.out.println("Cantidad de facturas emitidas: " + cantFactEmitidas);
	System.out.println("Total: " + total);
	int r;
	r = 0; 
		System.out.println("================================================== RESUMEN DE LA MESA "+ (numeroDeMesa+1) + "=========================");
		for ( r = 0; r < listaDeResumenes.size(); r ++)
		{
			System.out.println( "Articulo " + listaDeResumenes.get(r).getArticulo() + "\t Importe: " + listaDeResumenes.get(r).getImporte());		
				
			
		}
}
}
