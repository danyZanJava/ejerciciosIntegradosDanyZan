
public class Entretenimiento extends MueblesAbstract {
	
	private String color;
	private boolean espacioCD;
	
public Entretenimiento(){
	
	color = "";
	espacioCD = true;
}
	public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public boolean isEspacioCD() {
	return espacioCD;
}


public void setEspacioCD(boolean espacioCD) {
	this.espacioCD = espacioCD;
}
//-----------------------------------------------------------------------------------------------------------
@Override
public void pruebaResistencia() throws ExceptionFallaResistencia {
	
	if (isPruebaResistencia() == true)
	{
		throw new ExceptionFallaResistencia("Falla Resistencia, Verificar!");
	}
	else
	{
		System.out.println("Prueba de Resistencia OK!");
	}
	
}
@Override
public void pruebaClavos() {
	
	if (isPruebaClavos() == true)
	{
		System.out.println("Prueba de clavos OK");
	}
	else
	{
		System.out.println("Prueba de clavos NO OK");
	}	
}
@Override
public void pruebaTornillos() {
	
	if (isPruebaTornillos() == true)
	{
		System.out.println("Prueba de Tornillos OK");		
	}
	else
	{
		System.out.println("Prueba de Tornillos NO OK");
	}
	
}
public void pruebaMueble(){
	
	if (isPruebaMueble() == true)
	{
		System.out.println("Prueba Mueble OK");
	}
	else
	{
		System.out.println("Prueba Mueble NO OK");
	}
}
@Override
public void pruebaTotal() {
	
	if (isPruebaTotal() == true)
	{
		System.out.println("Prueba Total OK");
	}
	else
	{
		System.out.println("Prueba Total NO OK");
	}	
}
public void ImprimirInfoEntretenimiento(){
	
	System.out.println("El color del mueble de entretenimiento es: " + color);
	System.out.println("El mueble de entretenimiento tiene espacio para CD??" + espacioCD);
}





























}
