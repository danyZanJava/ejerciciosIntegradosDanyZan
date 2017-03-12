
public class PianoElectronico extends Piano {
	
	private String color;
	
public PianoElectronico(){
	
	color = "";
}
public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

@Override
public void pruebaTeclasBlancas() {
	
	if (isPruebaTeclasBlancas() == true)
	{
		System.out.println("Prueba Teclas Blancas OK");
	}
	else
	{
		System.out.println("Prueba Teclas Blancas NO OK");
	}	
}
@Override
public void pruebaTeclasNegras() {
	
	if (isPruebaTeclasNegras() == true)
	{
		System.out.println("Prueba Teclas Negras OK");
	}
	else
	{
		System.out.println("Prueba Teclas Negras NO OK");
	}	
}
@Override
public void pruebaPedales() {
	
	if (isPruebaPedales() == true)
	{
		System.out.println("Prueba Pedales OK");
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
		System.out.println("Prueba Piano OK");
	}
	else
	{
		System.out.println("Prueba Piano NO OK");
	}	
	
}
public void pruebaTotal(){
	
	if (isPruebaTotal() == true)
	{
		System.out.println("Prueba Total OK");
	}
	else
	{
		System.out.println("Prueba Total NO OK");
	}
}
@Override
public void pruebaAcustica() {
	
	if (isPruebaAcustica() == true)
	{
		System.out.println("Prueba Acustica OK");
	}
	else
	{
		System.out.println("Prueba Acustica NO OK");
	}	
}
public void ImprimirInfoPianoElectronico(){
	
	ImprimirInfoPiano();
	System.out.println("El color del piano electronico es: ");
}
}
