
public class Española extends Guitarra {
	
	private String color;
	private boolean estaLaqueada;
	
public Española(){
	
	super();
	color = "";
	estaLaqueada = true;
}
public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public boolean isEstaLaqueada() {
	return estaLaqueada;
}

public void setEstaLaqueada(boolean estaLaqueada) {
	this.estaLaqueada = estaLaqueada;
}
public void ImprimirInfoEspañola(){
	
	ImprimirInfoGuitarra();
	System.out.println("El color de la guitarra española es: " + color);
	System.out.println("Está laqueada la guitarra española??" + estaLaqueada);
}
public void probarCuerdas() {
	
	if (isProbarCuerdas() == true)
	{
		System.out.println("Prueba de cuerdas OK!!");
	}
	else
	{
		System.out.println("Prueba de cuerdas NO OK!!");
	}
	
}
public void probarTraste() {
	
	if (isProbarTraste() == true)
	{
		System.out.println("Prueba de traste OK!!");
	}
	else
	{
		System.out.println("Prueba de traste NO OK!!");
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
@Override
public void pruebaIntegral() {
	
	if (isPruebaIntegral() == true)
	{
		System.out.println("Prueba Integral OK !!");
	}
	else
	{
		System.out.println("Prueba Integral NO OK");
	}
}
public void pruebaAcusticaTecnica(){
	
	if (isPruebaAcusticaTecnica() == true)
	{
		System.out.println("Prueba AcusticaTecnica OK");
	}
	else
	{
		System.out.println("Prueba AcusticaTecnica NO OK");
	}
}

	

}
