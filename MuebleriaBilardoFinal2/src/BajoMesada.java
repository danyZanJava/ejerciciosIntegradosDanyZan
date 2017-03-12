
public class BajoMesada extends MueblesAbstract {
	
	private String color;
	private boolean tieneMarmol;
	
public BajoMesada(){
	
	color = "";
	tieneMarmol = true;	
}


	public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public boolean isTieneMarmol() {
	return tieneMarmol;
}


public void setTieneMarmol(boolean tieneMarmol) {
	this.tieneMarmol = tieneMarmol;
}
	@Override
	public void pruebaResistencia() throws ExceptionFallaResistencia {
		
		if (isPruebaResistencia() == true)
		{
			throw new ExceptionFallaResistencia("Falla Resistencia: Verificar");
		}
		else
		{
			System.out.println("Prueba Resistencia OK");
		}
		
	}

	@Override
	public void pruebaClavos() {
		
		if (isPruebaClavos() == true)
		{
			System.out.println("Prueba Clavos Ok");
		}
		else
		{
			System.out.println("Prueba NO OK");
		}		
	}

	@Override
	public void pruebaTornillos() {
		
		if (isPruebaTornillos() == true)
		{
			System.out.println("Prueba Tornillos Ok");
		}
		else
		{
			System.out.println("Prueba Tornillos NO Ok");
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
			System.out.println("Prueba Total No Ok");
		}		
	}
}
