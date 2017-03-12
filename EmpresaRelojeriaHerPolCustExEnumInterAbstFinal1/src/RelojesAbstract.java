
public abstract class RelojesAbstract implements InterfazRelojes {
	
	private String marca;
	private double precio;
	private boolean analogico;
	private String sexo;
	private boolean antiguo;	
	private boolean pruebaReloj;
	private boolean pruebaTotal;
	private boolean pruebaHorario;
	private boolean pruebaMinutero;
	private boolean pruebaSegundero;
	
public RelojesAbstract(){
	
	marca = "";
	precio = 0;
	analogico = true;
	sexo = "";
	antiguo = true;	
	pruebaReloj = true;
	pruebaTotal = true;
	pruebaHorario = true;
	pruebaMinutero = true;
	pruebaSegundero = true;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public boolean isAnalogico() {
	return analogico;
}

public void setAnalogico(boolean analogico) {
	this.analogico = analogico;
}
public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public boolean isAntiguo() {
	return antiguo;
}

public void setAntiguo(boolean antiguo) {
	this.antiguo = antiguo;
}
public boolean isPruebaReloj() {
	return pruebaReloj;
}

public void setPruebaReloj(boolean pruebaReloj) {
	this.pruebaReloj = pruebaReloj;
}
public boolean isPruebaTotal() {
	return pruebaTotal;
}

public void setPruebaTotal(boolean pruebaTotal) {
	this.pruebaTotal = pruebaTotal;
}
public boolean isPruebaHorario() {
	return pruebaHorario;
}

public void setPruebaHorario(boolean pruebaHorario) {
	this.pruebaHorario = pruebaHorario;
}

public boolean isPruebaMinutero() {
	return pruebaMinutero;
}

public void setPruebaMinutero(boolean pruebaMinutero) {
	this.pruebaMinutero = pruebaMinutero;
}

public boolean isPruebaSegundero() {
	return pruebaSegundero;
}

public void setPruebaSegundero(boolean pruebaSegundero)  {
	this.pruebaSegundero = pruebaSegundero;
}

public void pruebaReloj(){
	
	if ( pruebaReloj == true)
	{
		System.out.println("Prueba  OK!!");
	}
	else
	{
		System.out.println("Prueba  NO OK!!");
	}	
}
public abstract void pruebaTotal(); // Invoco metodos abstractos sin llaves///
	
public void ImprimirInfoRelojAbstracto(){
	
	System.out.println("La marca del reloj es:" + marca);
	System.out.println("El precio del reloj es: " + precio);
	System.out.println("El reloj es analogico??" + analogico);	
	System.out.println("El tipo(sexo) del cliente es: " + sexo);
	System.out.println("El reloj es antiguo?? " + antiguo);	
}
}
