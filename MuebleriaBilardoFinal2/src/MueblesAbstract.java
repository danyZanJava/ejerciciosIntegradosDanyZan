
public abstract class MueblesAbstract implements InterfazMuebles {
	
	private int resistenciaMueble;
	private String tipoDeMueble;
	private double precio;
	private String marca;
	private TipoDeMaderaEnum tipodemadera; /// Ver sintaxis//
	private int alto;
	private int ancho;
	private int largo;
	private int cantPuertas;
	private int cantCajones;	
	private boolean pruebaResistencia;
	private boolean pruebaClavos;
	private boolean pruebaTornillos;
	private boolean pruebaMueble;
	private boolean pruebaTotal;	
	
public MueblesAbstract(){
	
	resistenciaMueble = 0;
	tipoDeMueble = "";
	precio = 0;
	marca = "";	
	alto = 0;
	ancho = 0;
	largo = 0;
	cantPuertas = 0;
	cantCajones = 0;
	pruebaResistencia = true;
	pruebaClavos = true;
	pruebaTornillos = true;
	pruebaMueble = true;
	pruebaTotal = true;	
}

public int getResistenciaMueble() {
	return resistenciaMueble;
}

public void setResistenciaMueble(int resistenciaMueble) {
	this.resistenciaMueble = resistenciaMueble;
}

public String getTipoDeMueble() {
	return tipoDeMueble;
}

public void setTipoDeMueble(String tipoDeMueble) {
	this.tipoDeMueble = tipoDeMueble;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public TipoDeMaderaEnum getTipodemadera() {
	return tipodemadera;
}

public void setTipodemadera(TipoDeMaderaEnum tipodemadera) {
	this.tipodemadera = tipodemadera;
}

public int getAlto() {
	return alto;
}

public void setAlto(int alto) {
	this.alto = alto;
}

public int getAncho() {
	return ancho;
}

public void setAncho(int ancho) {
	this.ancho = ancho;
}

public int getLargo() {
	return largo;
}

public void setLargo(int largo) {
	this.largo = largo;
}

public int getCantPuertas() {
	return cantPuertas;
}

public void setCantPuertas(int cantPuertas) {
	this.cantPuertas = cantPuertas;
}

public int getCantCajones() {
	return cantCajones;
}

public void setCantCajones(int cantCajones) {
	this.cantCajones = cantCajones;
}
public boolean isPruebaResistencia() {
	return pruebaResistencia;
}

public void setPruebaResistencia(boolean pruebaResistencia) {
	this.pruebaResistencia = pruebaResistencia;
}

public boolean isPruebaClavos() {
	return pruebaClavos;
}

public void setPruebaClavos(boolean pruebaClavos) {
	this.pruebaClavos = pruebaClavos;
}

public boolean isPruebaTornillos() {
	return pruebaTornillos;
}

public void setPruebaTornillos(boolean pruebaTornillos) {
	this.pruebaTornillos = pruebaTornillos;
}

public boolean isPruebaMueble() {
	return pruebaMueble;
}

public void setPruebaMueble(boolean pruebaMueble) {
	this.pruebaMueble = pruebaMueble;
}

public boolean isPruebaTotal() {
	return pruebaTotal;
}

public void setPruebaTotal(boolean pruebaTotal) {
	this.pruebaTotal = pruebaTotal;
}

public void pruebaMueble(){
	
	if (pruebaMueble == true)
	{
		System.out.println("Prueba mueble OK!");
	}
	else
	{
		System.out.println("Prueba mueble NO OK");
	}
}
public abstract void pruebaTotal();  //Invoco metodos abstractos sin llaves//

public void ImprimoInfoMueblesAbstract(){
	
	System.out.println("Resistencia del mueble: " + resistenciaMueble);
	System.out.println("Tipo de mueble: " + tipoDeMueble);
	System.out.println("Precio del mueble: " + precio);
	System.out.println("Marca del mueble: " + marca);
	System.out.println("Alto del mueble: " + alto);
	System.out.println("Ancho del mueble: " + ancho);
	System.out.println("Largo del mueble: " + largo);
	System.out.println("Cantidad de puertas: " + cantPuertas);
	System.out.println("Cantidad de cajones: " + cantCajones);
}
}


