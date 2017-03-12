
public class PianoCola extends Piano {
	
	private String color;	
	
public PianoCola(){
	
	super();
	color = "";
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
public void ImprimirInfoPianoCola(){
	
	ImprimirInfoPiano();
	System.out.println("El color del piano de cola es:");
}

@Override
public void pruebaTeclasBlancas() {
	
	if (isPruebaTeclasBlancas() == true)
	{
		System.out.println("Prueba teclas blancas OK!!");
	}
	else
	{
		System.out.println("Prueba teclas blancas NO OK");
	}	
}
@Override
public void pruebaTeclasNegras() {
	
	if (isPruebaTeclasNegras() == true)
	{
		System.out.println("Prueba teclas Negras OK!!");
	}
	else
	{
		System.out.println("Prueba teclas Negras NO OK");
	}	
}
@Override
public void pruebaPedales() {
	
	if (isPruebaPedales() == true)
	{
		System.out.println("Prueba Pedales OK!!");
	}
	else
	{
		System.out.println("Prueba Pedales NO OK");
	}	
}
@Override
public void pruebaPiano() {
	
	if (isPruebaPiano() == true)
	{
		System.out.println("Prueba Piano OK!!");
	}
	else
	{
		System.out.println("Prueba Piano NO OK");
	}	
}
public void PruebaTotal(){
	
	if (isPruebaTotal() == true)
	{
		System.out.println("Prueba Total OK!!");
	}
	else
	{
		System.out.println("Prueba Total NO OK");
	}	
}
public void pruebaAcustica(){
	
	if (isPruebaAcustica() == true)
	{
		System.out.println("Prueba Acustica OK!!");
	}
	else
	{
		System.out.println("Prueba Acustica NO OK");
	}	
}	
}

