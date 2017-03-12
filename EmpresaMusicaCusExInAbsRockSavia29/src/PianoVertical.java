
public class PianoVertical extends Piano{
	
	private String color;
	private boolean estaLaqueado;
	
public PianoVertical(){
	
	color = "";
	estaLaqueado = true;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public boolean isEstaLaqueado() {
	return estaLaqueado;
}

public void setEstaLaqueado(boolean estaLaqueado) {
	this.estaLaqueado = estaLaqueado;
}
public void ImprimirInfoPianoVertical(){
	
	ImprimirInfoPiano();
	System.out.println("Color del piano vertical: ");
	System.out.println("Esta laqueado el piano vertical??: ");
}

@Override
public void pruebaTeclasBlancas() {
	
	if ( isPruebaTeclasBlancas() == true)
	{
		System.out.println("Prueba Teclas blancas OK");
	}
	else
	{
		System.out.println("Prueba Teclas blancas NO OK");
	}	
}

@Override
public void pruebaTeclasNegras() {
	
	if ( isPruebaTeclasBlancas() == true)
	{
		System.out.println("Prueba Teclas negras OK");
	}
	else
	{
		System.out.println("Prueba Teclas negras NO OK");
	}		
}
@Override
public void pruebaPedales() {
	
	if ( isPruebaPedales() == true)
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
	
	if ( isPruebaPiano() == true)
	{
		System.out.println("Prueba Piano OK");
	}
	else
	{
		System.out.println("Prueba Piano NO OK");
	}		
}

@Override
public void pruebaAcustica() {
	
	if ( isPruebaTeclasBlancas() == true)
	{
		System.out.println("Prueba Acustica OK");
	}
	else
	{
		System.out.println("Prueba Acustica NO OK");
	}	
	
}
}
