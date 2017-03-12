
public abstract class Automovil implements InterfazAutomovil {
	
	private int ruedas;
	private boolean tieneAirbag;
	private String modeloMotor;
	private String modeloChasis;
	private String numeroSerial;
	private String marca;
	private boolean pruebaAcelerador;
	private boolean pruebaFrenos;
	private boolean pruebaAirBag;
	private boolean pruebaMotor;
	private boolean pruebaAerodinamica; // variable creada para interpretar el método
	                                         // probarAerodinamicaDelChasis
	
public Automovil(){
	
	ruedas = 0;
	tieneAirbag = true;
	modeloMotor = "";
	modeloChasis = "";
	numeroSerial = "";
	marca = "";
	pruebaAcelerador = true;
	pruebaFrenos = true;
	pruebaAirBag = true;
	pruebaMotor = true;
	pruebaAerodinamica = true;
}

public int getRuedas() {
	return ruedas;
}

public void setRuedas(int ruedas) {
	this.ruedas = ruedas;
}

public boolean isTieneAirbag() {
	return tieneAirbag;
}

public void setTieneAirbag(boolean tieneAirbag) {
	this.tieneAirbag = tieneAirbag;
}

public String getModeloMotor() {
	return modeloMotor;
}

public void setModeloMotor(String modeloMotor) {
	this.modeloMotor = modeloMotor;
}

public String getModeloChasis() {
	return modeloChasis;
}

public void setModeloChasis(String modeloChasis) {
	this.modeloChasis = modeloChasis;
}

public String getNumeroSerial() {
	return numeroSerial;
}

public void setNumeroSerial(String numeroSerial) {
	this.numeroSerial = numeroSerial;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public boolean isPruebaAcelerador() {
	return pruebaAcelerador;
}

public void setPruebaAcelerador(boolean pruebaAcelerador) {
	this.pruebaAcelerador = pruebaAcelerador;
}

public boolean isPruebaFrenos() {
	return pruebaFrenos;
}

public void setPruebaFrenos(boolean pruebaFrenos) {
	this.pruebaFrenos = pruebaFrenos;
}

public boolean isPruebaAirBag() {
	return pruebaAirBag;
}

public void setPruebaAirBag(boolean pruebaAirBag) {
	this.pruebaAirBag = pruebaAirBag;
}

public boolean isPruebaMotor() {
	return pruebaMotor;
}

public void setPruebaMotor(boolean pruebaMotor) {
	this.pruebaMotor = pruebaMotor;
}

public boolean ispruebaAerodinamica() {
	return pruebaAerodinamica;
}
public void setpruebaAerodinamica(boolean pruebaAerodinamica) {
	this.pruebaAerodinamica = pruebaAerodinamica;
}
public void probarMotor(){
	
	if (pruebaMotor == true)
	{
		System.out.println("Motor OK!!");	
	}
	else
	{
		System.out.println("Motor NO OK!!");
	}
}

public abstract void probarAerodinamicaDelChasis();//
	
public void ImprimirInfoAutomovil(){
	
	System.out.println("Cantidad de ruedas del automovil" + ruedas);
	System.out.println("Tiene el auto airbag??" + tieneAirbag);
	System.out.println("El modelo de motor del auto es:" + modeloMotor);
	System.out.println("El modelo de chasis del auto es:" + modeloChasis);
	System.out.println("El numero de serie del auto es: " + numeroSerial);
	System.out.println("La marca del auto es: " + marca);
	System.out.println("Funciona el acelerador del auto??" + pruebaAcelerador);
	System.out.println("Funciona el airbag del auto" + pruebaAirBag);
	System.out.println("Funciona el motor del auto??" + pruebaMotor);	
}
}
