import java.util.ArrayList;


//import java.util.*;//

public class AbonadoTelCel {

	private String nombreYapellido;
	private int DNI;
	private String domicilio;
	private int telefono;
	private String lugarDeNacimiento;
	private int importeInternet;
	private VelocidadInternetEnum perfilVelocidadInternet;
	private int cuotaTelefonica;
	private int cuotaCelular;
	private double TotalaPagar;
	private ArrayList<ResumenDeCuenta>listaDeResumen;
	
	
public AbonadoTelCel(String _nombreYapellido,int _DNI,String _domicilio,int _telefono,String _lugarDeNacimiento,int _cuotaInternet,VelocidadInternetEnum _perfilVelocidadInternet,int _cuotaTelefonica,int _cuotaCelular,double _TotalaPagar){
	
	nombreYapellido =_nombreYapellido;
	DNI =_DNI;
	domicilio =_domicilio;
	telefono =_telefono;
	lugarDeNacimiento =_lugarDeNacimiento;
	importeInternet =_cuotaInternet;
	perfilVelocidadInternet =_perfilVelocidadInternet;
	cuotaTelefonica =_cuotaTelefonica;
	cuotaCelular =_cuotaCelular;
	TotalaPagar =_TotalaPagar;
	listaDeResumen = new ArrayList<ResumenDeCuenta>();
}

public AbonadoTelCel(){
	
	nombreYapellido = "";
	DNI= 0;
	domicilio = "";
	telefono = 0;
	lugarDeNacimiento = "";
	importeInternet = 0;
	perfilVelocidadInternet = perfilVelocidadInternet;
	cuotaTelefonica = 0;
	cuotaCelular = 0;
	TotalaPagar = 0;
	listaDeResumen = new ArrayList<ResumenDeCuenta>();
}
public String getNombreYapellido() {
	return nombreYapellido;
}
public void setNombreYapellido(String nombreYapellido) {
	this.nombreYapellido = nombreYapellido;
}
public int getDNI() {
	return DNI;
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
public String getLugarDeNacimiento() {
	return lugarDeNacimiento;
}
public void setLugarDeNacimiento(String lugarDeNacimiento) {
	this.lugarDeNacimiento = lugarDeNacimiento;
}
public int getCuotaInternet() {/// falta throws exception//
	return importeInternet;
}
public void setCuotaInternet(int cuotaInternet) {
	this.importeInternet = cuotaInternet;
}
public VelocidadInternetEnum getPerfilVelocidadInternet() {
	return perfilVelocidadInternet;
}
public void setPerfilVelocidadInternet(VelocidadInternetEnum perfilVelocidadInternet) { 
	this.perfilVelocidadInternet = perfilVelocidadInternet;
}
public int getCuotaTelefonica() {
	return cuotaTelefonica;
}
public void setCuotaTelefonica(int cuotaTelefonica) {
	this.cuotaTelefonica = cuotaTelefonica;
}
public int getCuotaCelular() {
	return cuotaCelular;
}
public void setCuotaCelular(int cuotaCelular) {
	this.cuotaCelular = cuotaCelular;
}
public double getTotalaPagar() {
	return TotalaPagar;
}
public void setTotalaPagar(double totalaPagar) {
	TotalaPagar = totalaPagar;
}
public void agregarResumenAlaListaDeResumen(ResumenDeCuenta unaResumenMas){
	
	listaDeResumen.add(unaResumenMas);
}


public void imprimoDatosResumenEnum() throws CuotaInternetException{
	
	System.out.println("-------------------- RESUMENES ---------------------");
	System.out.println("");
	System.out.println("");
	 int re;
	 re = 0;
	 	for ( re = 0; re < listaDeResumen.size(); re ++)
	 	{
	 		listaDeResumen.get(re).imprimirInfoResumenDeCuenta();
	 	}
}
public void imprimirInfoAbonadoEnum(){
{
	System.out.println("Nombre y apellido: " + nombreYapellido);
	System.out.println("DNI: " + DNI);
	System.out.println("Domicilio: " + getDomicilio());
	System.out.println("Telefono: " + telefono);	
	System.out.println("Lugar de nacimiento: " + lugarDeNacimiento);
	System.out.println("Cuota de internet: " + importeInternet);
	System.out.println("Cuota telefoninca: " + cuotaTelefonica);
	System.out.println("Cuota celular: " + cuotaCelular);

	if ( this.getPerfilVelocidadInternet() == VelocidadInternetEnum.seisMG)
	{
		System.out.println("Velocidad de internet: 6 MG");
	}
	if ( this.getPerfilVelocidadInternet() == VelocidadInternetEnum.diezMG)
	{
		System.out.println("Velocidad de internet: 10 MG");
	}	
}
}
}