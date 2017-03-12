import java.util.*;;

public class MuebleriaBilardo {
	
	Scanner ing;
	private String nombreEmpresa;
	private String direccion;
	private int fecha;
	private int telefono;
	private String director;
	private ArrayList<Cliente>listaDeClientes;
	private ArrayList<MueblesAbstract>listaDeMueblesEmpresa;
	private ArrayList<Empleado>listaDeEmpleados;
	private Cliente unCliente;
	private MueblesAbstract unMueble;
	
public MuebleriaBilardo(){
	
	ing = new Scanner(System.in);
	nombreEmpresa = "";
	direccion  = "";
	fecha = 0;
	telefono = 0;
	director = "";
	listaDeClientes = new ArrayList<Cliente>();
	listaDeMueblesEmpresa = new ArrayList<MueblesAbstract>();
	listaDeEmpleados = new ArrayList<Empleado>();
	unCliente = new Cliente();
}
public Scanner getIng() {
	return ing;
}


public void setIng(Scanner ing) {
	this.ing = ing;
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

public ArrayList<MueblesAbstract> getListaDeMueblesEmpresa() {
	return listaDeMueblesEmpresa;
}

public void setListaDeMueblesEmpresa(
		ArrayList<MueblesAbstract> listaDeMueblesEmpresa) {
	this.listaDeMueblesEmpresa = listaDeMueblesEmpresa;
}

public ArrayList<Empleado> getListaDeEmpleados() {
	return listaDeEmpleados;
}

public void setListaDeEmpleados(ArrayList<Empleado> listaDeEmpleados) {
	this.listaDeEmpleados = listaDeEmpleados;
}
public Cliente getUnCliente() {
	return unCliente;
}
public void setUnCliente(Cliente unCliente) {
	this.unCliente = unCliente;
}
public void agregarClientesAlaListaDeClientes(Cliente unClienteMas){
	
	listaDeClientes.add(unClienteMas);
}
public void agregarMueblesAlaListaDeMuebles(MueblesAbstract unMuebleMas){
	
	listaDeMueblesEmpresa.add(unMuebleMas);
}
public void agregarEmpleadosAlaListaDeEmpleados(Empleado unEmpleadoMas){
	
	listaDeEmpleados.add(unEmpleadoMas);
}
public void cargoDatosTotales() throws ExceptionNombreApellido, ExceptionDNI, ExceptionFallaResistencia{
	
	cargoEncabezado();
	cargoReporte();
	calculoOperacionesPieInforme();
}
public void cargoEncabezado(){ ///////////////////////////////////CARGAS/////////////////////////////////////
	
	System.out.println("Nombre de la Empresa:");
	this.setNombreEmpresa(ing.next());
	System.out.println("Dirección de la Empresa:");
	this.setDireccion(ing.next());
	System.out.println("Fecha:");
	this.setFecha(ing.nextInt());
	System.out.println("Telefono de la Empresa:");
	this.setTelefono(ing.nextInt());
	System.out.println("Director de la Empresa:");
	this.setDirector(ing.next());	
}
public void cargoReporte() throws ExceptionNombreApellido, ExceptionDNI, ExceptionDNI{
	
	
	
	 int cl = 0;
	 int mu = 0;
	 int cuantosClienteCargo = 0;
	 int cuantosMueblesCargo = 0;
	 String tipoDeMuebles = "";
	
	System.out.println("               -------------------------CARGO CLIENTES-------------------------");
	System.out.println("");
	System.out.println("Cuántos clientes desea cargar??");
	cuantosClienteCargo = ing.nextInt();
	
		for (cl = 0; cl < cuantosClienteCargo; cl ++)
		{
			unCliente = new Cliente();
			System.out.println("                      Nombre y Apellido del Cliente:" + (cl +1));
			unCliente.setNombreYApellido(ing.next());
			System.out.println("Numero DNI:");
			unCliente.setdNI(ing.nextInt());
			System.out.println("Domicilio del cliente:");
			unCliente.setDomicilio(ing.next());
			System.out.println("Telefono del cliente:");
			unCliente.setTelefono(ing.nextInt());
			System.out.println("Lugar de nacimiento del cliente:");
			unCliente.setLugarDeNacimiento(ing.next());
			this.agregarClientesAlaListaDeClientes(unCliente);	
			
				System.out.println("");
				System.out.println("    -----------------------CARGO MUEBLES CLIENTES-----------------------------");
				System.out.println("");
				System.out.println("Cuántos muebles desea cargar??");
				cuantosMueblesCargo = ing.nextInt();
				
					for (mu = 0; mu < cuantosMueblesCargo; mu ++)
					{
						System.out.println("                    Mueble " + (mu+1));
						System.out.println("");
						System.out.println("Qué tipo de muebles??");
						tipoDeMuebles = ing.next();
						
						if(tipoDeMuebles.contains("Entrenimiento"))
						{
							
						}						
					}						
			}
		}
public void calculoOperacionesPieInforme(){
	
	cantidadTotalClientes();
	cantidadTotalMueblesEmpresa();
	cantidadMueblesTesteadosOK();
	cantidadMueblesTesteadosNOOK();
}
public int cantidadTotalClientes(){
	
	return listaDeClientes.size();
}
public int cantidadTotalMueblesEmpresa(){
	
	return cantidadTotalMueblesEmpresa();
}
public int cantidadMueblesTesteadosOK(){
	
	int mo = 0;
	int cantidadMueblesTesteadosOK = 0;
	 for ( mo = 0; mo < listaDeMueblesEmpresa.size(); mo ++)
	 {
		 if ((listaDeMueblesEmpresa.get(mo)) instanceof Entretenimiento)
			{
				Entretenimiento unEntrenimiento = (Entretenimiento)listaDeMueblesEmpresa.get(mo);
				if (Entretenimiento.isPruebaMueble() && Entretenimiento.isPruebaTotal())
				{
					cantidadMueblesTesteadosOK ++;
				}
			}
			if ((listaDeMueblesEmpresa.get(mo)) instanceof BajoMesada)
			{
				BajoMesada unBajoMesada = (BajoMesada)listaDeMueblesEmpresa.get(mo);
				if (unBajoMesada.pruebaMueble() && unBajoMesada.isPruebaTotal())
				{
					cantidadMueblesTesteadosOK ++;
				}
					
			}
			if ((listaDeMueblesEmpresa.get(mo)) instanceof Valijero)
			{
				Valijero unValijero = (Valijero)listaDeMueblesEmpresa.get(mo);
				if (unValijero.isPruebaMueble() && unValijero.isPruebaTotal())
				{
					cantidadMueblesTesteadosOK ++;
				}
			}					
		}
	 return cantidadMueblesTesteadosOK;
	 }
public int cantidadDeMueblesTesteadosNOOK(){
	
	int nk = 0;
	int cantidadDeMueblesTesteadosNOOK = 0;	
	 for ( nk = 0; nk < listaDeMueblesEmpresa.size(); nk ++)
	 {
		 if ((listaDeMueblesEmpresa.get(nk)) instanceof Entretenimiento)
			{
				Entretenimiento unEntrenimiento = (Entretenimiento)listaDeMueblesEmpresa.get(nk);
				if (Entretenimiento.isPruebaMueble() && Entretenimiento.isPruebaTotal())
				{
					cantidadMueblesTesteadosOK ++;
				}
			}
			if ((listaDeMueblesEmpresa.get(nk)) instanceof BajoMesada)
			{
				BajoMesada unBajoMesada = (BajoMesada)listaDeMueblesEmpresa.get(nk);
				if (unBajoMesada.pruebaMueble() && unBajoMesada.isPruebaTotal())
				{
					cantidadMueblesTesteadosOK ++;
				}
					
			}
			if ((listaDeMueblesEmpresa.get(nk)) instanceof Valijero)
			{
				Valijero unValijero = (Valijero)listaDeMueblesEmpresa.get(nk);
				if (unValijero.isPruebaMueble() && unValijero.isPruebaTotal());
				{
					cantidadDeMueblesTesteadosNOOK ++;
				}
			}					
		}	
	return cantidadDeMueblesTesteadosNOOK();
}
}




	


