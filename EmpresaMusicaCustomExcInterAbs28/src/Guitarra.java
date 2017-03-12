
public abstract class Guitarra implements InterfaceGuitarra{
	
	private String marca;
	private String tipoDeCuerdas;
	private boolean amplificardorElectrico;
	private int cantCuerdas;
	private int cantClavijas;
	private int cantCejillas;
	private int largoDiapason;
	private int largoCaja;
	private String materialCajas;
	private boolean pruebaAcustica;//Variable creada para interpretar el método pruebaAcustica();
	private boolean pruebaIntegral; //Variable creada para interpretar el metodo pruebaIntegral(); 
	private boolean probarCuerdas;// 
	private boolean probarTraste;
	private boolean probarGuitarra;
	private boolean pruebaAcusticaTecnica;
	
public Guitarra(){
	
	marca = "";
	tipoDeCuerdas = "";
	amplificardorElectrico = true;
	cantCuerdas = 0;
	cantClavijas = 0;
	cantCejillas = 0;
	largoDiapason = 0;
	largoCaja = 0;
	materialCajas = "";
	pruebaAcustica = true;
	pruebaIntegral = true;
	probarCuerdas = true;
	probarTraste = true;
	probarGuitarra = true;
	pruebaAcusticaTecnica = true;
	
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getTipoDeCuerdas() {
	return tipoDeCuerdas;
}
public void setTipoDeCuerdas(String tipoDeCuerdas) throws FallaCuerdasException {
	
	if (tipoDeCuerdas.equals("SinCuerdas"))
	{
		throw new FallaCuerdasException("Valor de tipos de cuerdas incorrecto, Verifique nuevamente");
	}
	this.tipoDeCuerdas = tipoDeCuerdas;
}

public boolean isAmplificardorElectrico() {
	return amplificardorElectrico;
}

public void setAmplificardorElectrico(boolean amplificardorElectrico) {
	this.amplificardorElectrico = amplificardorElectrico;
}

public int getCantCuerdas() {
	return cantCuerdas;
}

public void setCantCuerdas(int cantCuerdas) {
	this.cantCuerdas = cantCuerdas;
}

public int getCantClavijas() {
	return cantClavijas;
}

public void setCantClavijas(int cantClavijas) {
	this.cantClavijas = cantClavijas;
}

public int getCantCejillas() {
	return cantCejillas;
}

public void setCantCejillas(int cantCejillas) {
	this.cantCejillas = cantCejillas;
}

public int getLargoDiapason() {
	return largoDiapason;
}

public void setLargoDiapason(int largoDiapason) {
	this.largoDiapason = largoDiapason;
}

public int getLargoCaja() {
	return largoCaja;
}

public void setLargoCaja(int largoCaja) {
	this.largoCaja = largoCaja;
}

public String getMaterialCajas() {
	return materialCajas;
}

public void setMaterialCajas(String materialCajas) {
	this.materialCajas = materialCajas;
}

public boolean isPruebaAcustica() {
	return pruebaAcustica;
}

public void setPruebaAcustica(boolean pruebaAcustica) {
	this.pruebaAcustica = pruebaAcustica;
}

public boolean isPruebaIntegral() {
	return pruebaIntegral;
}

public void setPruebaIntegral(boolean pruebaIntegral) {
	this.pruebaIntegral = pruebaIntegral;
}

public boolean isProbarCuerdas() {
	return probarCuerdas;
}

public void setProbarCuerdas(boolean probarCuerdas) {
	this.probarCuerdas = probarCuerdas;
}


public boolean isProbarTraste() {
	return probarTraste;
}

public boolean isProbarGuitarra() {
	return probarGuitarra;
}

public void setProbarGuitarra(boolean probarGuitarra) {
	this.probarGuitarra = probarGuitarra;
}

public void setProbarTraste(boolean probarTraste) {
	this.probarTraste = probarTraste;
}

public boolean isPruebaAcusticaTecnica() {
	return pruebaAcusticaTecnica;
}

public void setPruebaAcusticaTecnica(boolean pruebaAcusticaTecnica) {
	this.pruebaAcusticaTecnica = pruebaAcusticaTecnica;
}

public void pruebaIntegral(){
	
	if ( pruebaIntegral == true)
		
	{
		System.out.println("Prueba Integral OK");
	}
	else
	{
		System.out.println("Prueba Integral NOOK");
	}	
}
public abstract void pruebaAcusticaTecnica(); // Invoco la clase abstracta SIN LLAVES!!, porque es un método prototipo

public void ImprimirInfoGuitarra(){
	
	System.out.println("La marca de la guitarras es: " + marca);
	System.out.println("El tipo de cuerdas de las guitarras es: " + tipoDeCuerdas);
	System.out.println("Tienen amplificador electrico?? " + amplificardorElectrico);
	System.out.println("La cantidad de cuerdas de las guitarras es: " + cantCuerdas);
	System.out.println("La cantidad de clavijas de las guitarras es: " + cantClavijas);
	System.out.println("La cantidad de cejillas de las guitarras es: " + cantCejillas);
	System.out.println("El largo del diapason es: " + largoDiapason);
	System.out.println("El largo de la caja de la guitarra es: " + largoCaja);
	System.out.println("El material de las cajas de la guitarra es: " + materialCajas);
}
}
