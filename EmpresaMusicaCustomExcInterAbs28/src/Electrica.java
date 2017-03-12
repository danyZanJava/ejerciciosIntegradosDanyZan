
public class Electrica extends Guitarra {
	
	private String color;
	
public Electrica(){
	
	super();
	color = "";
}
public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
public void ImprimirInfoElectrica(){
	
	ImprimirInfoGuitarra();
	System.out.println("El color de la guitarra eléctrica es: " + color);
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
public  void pruebaIntegral(){
	
	if (isPruebaIntegral() == true)
	{
		System.out.println("Prueba Integral OK!!");
	}
	else
	{
		System.out.println("Prueba Integral NO OK");
	}
}
@Override
public void pruebaAcusticaTecnica() {
	
	if (isPruebaAcusticaTecnica() == true)
	{
		System.out.println("Prueba AcusticaTecnica OK!!");
	}
	else
	{
		System.out.println("Prueba AcusticaTecnica NO OK");
	}	
}
}
