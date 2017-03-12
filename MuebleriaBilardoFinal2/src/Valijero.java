
public class Valijero extends MueblesAbstract {
	
	private String color;
	
public Valijero(){
	
	color = "";
}
	public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}
//-----------------------------------------------------------------------------------------------------------
	@Override
	public void pruebaResistencia() throws ExceptionFallaResistencia {
		
		if (isPruebaResistencia() == true)
		{
			throw new ExceptionFallaResistencia("Falla Resistencia: Verificar!");
		}
		else
		{
			System.out.println("Prueba de Resistencia OK");
		}		
	}

	@Override
	public void pruebaClavos() {
		
		if (isPruebaClavos() == true)
		{
			System.out.println("Prueba Clavos OK");
		}
		else
		{
			System.out.println("Prueba Clavos NO OK");
		}		
	}

	@Override
	public void pruebaTornillos() {
		
		if (isPruebaTornillos() == true)
		{
			System.out.println("Prueba Clavos OK");			
		}
		else
		{
			System.out.println("Prueba Clavos NO OK");
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
	public void ImprimirInfoValijero(){
		
		System.out.println("Color del valijero es" + color);
	}
}
