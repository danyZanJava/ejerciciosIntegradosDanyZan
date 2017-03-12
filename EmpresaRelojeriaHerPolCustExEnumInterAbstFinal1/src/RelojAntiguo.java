
public class RelojAntiguo extends RelojesAbstract{
	
	private String colorRelojAntiguo;
	private boolean estaLaqueado;
	private int largoDelPendulo;
	
public RelojAntiguo(){
	
	colorRelojAntiguo = "";
	estaLaqueado = true;
	largoDelPendulo = 0;
}
	public String getColorRelojAntiguo() {
	return colorRelojAntiguo;
}


public void setColorRelojAntiguo(String colorRelojAntiguo) {
	this.colorRelojAntiguo = colorRelojAntiguo;
}


public boolean isEstaLaqueado() {
	return estaLaqueado;
}

public void setEstaLaqueado(boolean estaLaqueado) {
	this.estaLaqueado = estaLaqueado;
}

	public int getLargoDelPendulo() {
	return largoDelPendulo;
}
public void setLargoDelPendulo(int largoDelPendulo) {
	this.largoDelPendulo = largoDelPendulo;
}
	@Override
	public void pruebaHorario() {
		
		if (isPruebaHorario() == true)
		{
			System.out.println("Prueba horaria OK!!");			
		}
		else
		{
			System.out.println("Prueba horaria NO OK");
		}		
	}
	@Override
	public void pruebaMinutero() {
		
		if (isPruebaMinutero() == true) 
		{
			System.out.println("Prueba minutero NO OK!!");
		}
		else
		{
			System.out.println("Prueba minutero OK!!");
		}		
	}
	@Override
	public void pruebaSegundero() throws ExceptionFallaSegundero {
		
		if (isPruebaSegundero() == false)
		{
			throw new ExceptionFallaSegundero("---------- FALLA SEGUNDERO RELOJ RECHAZADO ----------");
		}
		else
		{
			System.out.println("Prueba segundero Reloj Antiguo OK");
		}		
	}
	@Override
	public void pruebaTotal() {
		
		if (isPruebaTotal() == true)
		{
			System.out.println("Prueba total OK!!");
		}
		else
		{
			System.out.println("Prueba total NO OK!!");
		}		
	}
	public void pruebaReloj(){
		
		if (isPruebaReloj() == true)
		{
			System.out.println("Prueba Reloj OK!!");
		}
		else
		{
			System.out.println("Preuba Reloj NO OK!!");
		}
	}
	public void ImprimirInfoRelojAntiguo(){
		
		this.ImprimirInfoRelojAbstracto();
		System.out.println("El color del reloj antiguo es: " + colorRelojAntiguo);
		System.out.println("El reloj antiguo ésta laqueado?? " + estaLaqueado);
	}
}
