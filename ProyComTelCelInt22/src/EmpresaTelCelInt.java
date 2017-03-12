import java.util.*;

public class EmpresaTelCelInt {
	
	Scanner ing;
	
	private String nombreDelaEmpresa;
	private String direccionDeLaEmpresa;
	private int fechaReporte;
	private int telefonoDelaEmpresa;
	private String CEO;
	private ArrayList<AbonadoTelCel>listaDeAbonados;	
	private AbonadoTelCel unAbonado;
	private ResumenDeCuenta unResumen;
	
public EmpresaTelCelInt(String _nombreDelaEmpresa,String _direccionDeLaEmpresa,int _fechaReporte,int _telefonoDelaEmpresa,String _CEO,AbonadoTelCel _unAbonado,ResumenDeCuenta _unResumen){
	
	ing = new Scanner(System.in);
	
	nombreDelaEmpresa =_nombreDelaEmpresa;
	direccionDeLaEmpresa =_direccionDeLaEmpresa;
	fechaReporte = _fechaReporte;
	telefonoDelaEmpresa = _telefonoDelaEmpresa;
	CEO =_CEO;
	listaDeAbonados = new ArrayList<AbonadoTelCel>();	
	unAbonado =_unAbonado;
	unResumen =_unResumen;	
}
public EmpresaTelCelInt(){
	
	ing = new Scanner(System.in);
	
	nombreDelaEmpresa = "";
	direccionDeLaEmpresa = "";
	fechaReporte = 0;
	telefonoDelaEmpresa = 0;
	CEO = "";
	listaDeAbonados = new ArrayList<AbonadoTelCel>();	
}
public ResumenDeCuenta getUnResumen() {
	return unResumen;
}
public void setUnResumen(ResumenDeCuenta unResumen) {
	this.unResumen = unResumen;
}
public ArrayList<AbonadoTelCel> getListaDeAbonados() {
	return listaDeAbonados;
}
public void setListaDeAbonados(ArrayList<AbonadoTelCel> listaDeAbonados) {
	this.listaDeAbonados = listaDeAbonados;
}
public AbonadoTelCel getUnAbonado() {
	return unAbonado;
}
public void setUnAbonado(AbonadoTelCel unAbonado) {
	this.unAbonado = unAbonado;
}
public Scanner getIng() {
	return ing;
}
public void setIng(Scanner ing) {
	this.ing = ing;
}
public String getNombreDelaEmpresa() {
	return nombreDelaEmpresa;
}
public void setNombreDelaEmpresa(String nombreDelaEmpresa) {
	this.nombreDelaEmpresa = nombreDelaEmpresa;
}
public String getDireccionDeLaEmpresa() {
	return direccionDeLaEmpresa;
}
public void setDireccionDeLaEmpresa(String direccionDeLaEmpresa) {
	this.direccionDeLaEmpresa = direccionDeLaEmpresa;
}
public int getFechaReporte() {
	return fechaReporte;
}
public void setFechaReporte(int fechaReporte) {
	this.fechaReporte = fechaReporte;
}
public int getTelefonoDelaEmpresa() {
	return telefonoDelaEmpresa;
}
public void setTelefonoDelaEmpresa(int telefonoDelaEmpresa) {
	this.telefonoDelaEmpresa = telefonoDelaEmpresa;
}
public String getCEO() {
	return CEO;
}
public void setCEO(String cEO) {
	CEO = cEO;
}	
public void agregoAbonadosAlaListaDeAbonados(AbonadoTelCel unAbonadoMas){
	
	listaDeAbonados.add(unAbonadoMas);  // agrego abonados a la lista//
}

//////////////////// ////////////////////// INICIO DE LAS CARGAS ////////////////////////////////////////////

public void cargoDatosEmpresaTellCelInt() throws CuotaInternetException{ /// Este metodo va a ser llamado en el test !!! ///	
	
	cargoEncabezadoReporte();
	cargoReporte();
	calculoOperacionesPieInforme();
}
public void cargoEncabezadoReporte(){//----------------------------------------------------------------------------------------------
	
	cargoNombreDelaEmpresa();
	cargoDireccionDelaEmpresa();
	cargoFechaDelReporte();
	cargoTelefonoDelaEmpresa();
	cargoNombreDelCEO();	
}
public void cargoNombreDelaEmpresa(){
	
	System.out.println("El nombre de la Empresa es: ");
	this.setNombreDelaEmpresa(ing.next());
}
public void cargoDireccionDelaEmpresa(){
	
	System.out.println("La direccion de la empresa es:");
	this.setDireccionDeLaEmpresa(ing.next());	
}
public void cargoFechaDelReporte(){
	
	System.out.println("La fecha del Reporte es:");
	this.setFechaReporte(ing.nextInt());
}
public void cargoTelefonoDelaEmpresa(){
	
	System.out.println("El telefono de la empresa es:");
	this.setTelefonoDelaEmpresa(ing.nextInt());
}
public void cargoNombreDelCEO(){
	
	System.out.println("El nombre del CEO es:");
	this.setCEO(ing.next());
}

public void cargoReporte() throws CuotaInternetException{// --------------------------------------------------------------------------------------------------//
	
	int abo;
	abo = 0;
	int re;
	re = 0;
	
	for ( abo = 0; abo < 2; abo ++ ) /// cargo abonados//
	{
		System.out.println("=================== ABONADO ====================");
		System.out.println("");
		System.out.println("");
		System.out.println("Nombre y apelllido del socio:");
		unAbonado = new AbonadoTelCel();
		unAbonado.setNombreYapellido(ing.next());
		System.out.println("DNI");
		unAbonado.setDNI(ing.nextInt());
		System.out.println("Domicilio del abonado:");
		unAbonado.setDomicilio(ing.next());
		System.out.println("Telefono del abonado:");
		unAbonado.setTelefono(ing.nextInt());
		System.out.println("Lugar de nacimiento del abonado:");
		unAbonado.setLugarDeNacimiento(ing.next());
		System.out.println("Valor de la cuota de Internet:");
		unAbonado.setCuotaInternet(ing.nextInt());
		System.out.println("Perfil velocidad de Internet");
		String ingr = ing.next();
		
			if ( ing.equals("6MG"));
			{
				unAbonado.setPerfilVelocidadInternet(VelocidadInternetEnum.seisMG);
				
			}
			if ( ing.equals("10MG"));
			{
				unAbonado.setPerfilVelocidadInternet(VelocidadInternetEnum.diezMG);				
			}
		System.out.println("Valor cuota telefonica:");
		unAbonado.setCuotaTelefonica(ing.nextInt());
		System.out.println("Valor cuota del celular");
		unAbonado.setCuotaCelular(ing.nextInt());
		System.out.println("Total a pagar:");
		unAbonado.setTotalaPagar(ing.nextDouble());
		this.agregoAbonadosAlaListaDeAbonados(unAbonado);
		
		for ( re = 0; re < 3; re ++ )   //cargo resumen//
		{
			System.out.println("fecha:");
			unResumen = new ResumenDeCuenta();
			unResumen.setFecha(ing.nextInt());
			System.out.println("couta:");
			unResumen.setCuota(ing.nextInt());
			unAbonado.agregarResumenAlaListaDeResumen(unResumen);
		}
	}	
}
public void calculoOperacionesPieInforme(){
	
	calculoCantidadTotalAbonados();
	calculoSociosHasta500$Inclusive();
	calculoSociosMayor500$();
}
public int calculoCantidadTotalAbonados(){
	
	return listaDeAbonados.size();	
}
public int calculoSociosHasta500$Inclusive(){
	
	int sociosHasta500;
	sociosHasta500 = 0;
	
	int so500;
	so500 = 0;
		for ( so500 = 0; so500 < listaDeAbonados.size(); so500 ++)
		{
			if (listaDeAbonados.get(so500).getTotalaPagar() <= 500)
			{
				sociosHasta500 = sociosHasta500 + 1;
			}
		}
	
	return sociosHasta500;
}
public int calculoSociosMayor500$(){
	
	int sociosMay500;
	sociosMay500 = 0;
	
	int soM500;
	soM500 = 0;
		for ( soM500 = 0; soM500 < listaDeAbonados.size(); soM500 ++)
		{
			if (listaDeAbonados.get(soM500).getTotalaPagar() > 500)
			{
				sociosMay500 = sociosMay500 + 1;
			}
		}
	
	return sociosMay500;
}
//=============================================== IMPRIMIMIRES ===========================================================================================================//




public void imprimoTodoslosDatosDelReporte() throws CuotaInternetException{
	
	imprimirTituloDelReporte();
	imprimirEncabezadoDelReporte();
	imprimoDatosDelReporteEnum(); 
	imprimirInfoOperacionesPieInforme();
}
public void imprimirEncabezadoDelReporte(){
	
	System.out.println("                                   --------------- EMPRESA TELCELINT ---------------------");
	System.out.println("");
	System.out.println("");
	System.out.println("Direccion de la empresa: " + direccionDeLaEmpresa);
	System.out.println("Fecha: " + fechaReporte);
	System.out.println("Direccion de la empresa: " + direccionDeLaEmpresa);
	System.out.println("Nombre y apellido del CEO: " + CEO);
}
public void imprimirTituloDelReporte(){
	
	System.out.println("");
	System.out.println("");
	System.out.println("                                   --------------- REPORTE DEL ABONADOS AL 2014 --------------");
	System.out.println("");
	System.out.println("");
}
public void imprimoDatosDelReporteEnum() throws CuotaInternetException{
	
	
	 int ab;
	 ab = 0;
	 	for ( ab = 0; ab < listaDeAbonados.size(); ab ++)
	 	{	 		
	 		listaDeAbonados.get(ab).imprimirInfoAbonadoEnum();
	 		listaDeAbonados.get(ab).imprimoDatosResumenEnum();
	 	}	 	
}
public void imprimirInfoOperacionesPieInforme(){
	
	System.out.println("------------------- OPERACIONES PIE INFORME -------------------");
	System.out.println("");
	System.out.println("");
	System.out.println("Cantidad de socios abonados: " + calculoCantidadTotalAbonados());
	System.out.println("Cantidad hasta $ 500 (inclusive): " + calculoSociosHasta500$Inclusive());
	System.out.println("Cantidad de socio mayor a $ 500: " + calculoSociosMayor500$());
}
}
