
public class Acustica extends Guitarra  {
	
	private String color;
	
public Acustica(){
	
	super();
	color = "";
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
public void ImprimirInfoAcústica(){
	
	ImprimirInfoGuitarra();
	System.out.println("El color de la guitarra acústica es: " + color);
}

public void probarCuerdas() {
	
	if (isProbarCuerdas() == true)
	{
		System.out.println("Prueba cuerdas OK!!");
	}
	else
	{
		System.out.println("Prueba cuerdas NOOK!!");
	}
}
public void probarTraste() {
	
	if (isProbarTraste() == true)
	{
		System.out.println("Prueba traste Ok!!");
	}
	else
	{
		System.out.println("Prueba traste NOOK!!");
	}
}

public void probarGuitarra() {
	
	if (isProbarGuitarra() == true)
	{
		System.out.println("Prueba de guitarra OK!!");
	}
	else
	{
		System.out.println("Prueba de guitarra NO OK!!");
	}
}
public void pruebaIntegral(){
	
	if (isPruebaIntegral() == true)
	{
		System.out.println("Prueba Integral OK!!");
	}
	else
	{
		System.out.println("Prueba Integral NO OK");
	}
}
public void pruebaAcusticaTecnica() {	
	
	if (isPruebaAcusticaTecnica() == true)
	{
		System.out.println("Prueba Acustica Tecnica OK!!");
	}
	else	
	{
		System.out.println("Prueba de guitarra NO OK!!");
	}
	}
}

