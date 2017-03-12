
public class RelojDespertador extends RelojesAbstract {
	
	private String tipoDespertador;
	
public RelojDespertador(){
	
	tipoDespertador = "";
}
	public String getTipoDespertador() {
	return tipoDespertador;
}


public void setTipoDespertador(String tipoDespertador) {
	this.tipoDespertador = tipoDespertador;
}
	@Override
	public void pruebaHorario() {
		
		if (isPruebaHorario() == true)
		{
			System.out.println("Prueba horario OK!!");			
		}
		else
		{
			System.out.println("Prueba horario NO OK");
		}		
	}

	@Override
	public void pruebaMinutero() {
		
		if (isPruebaMinutero() == true)
		{
			System.out.println("Prueba minutero OK!!");
		}
		else
		{
			System.out.println("Prueba minutero NO OK");
		}		
	}

	@Override
	public void pruebaSegundero() throws ExceptionFallaSegundero {
		
		if (isPruebaSegundero() == false)
		{
			throw new ExceptionFallaSegundero("---------- FALLA SEGUNDERO RELOJ DESPERTADOR ----------");
		}
		else
		{
			System.out.println("Prueba segundero reloj Despertador OK");
		}		
	}

	@Override
	public void pruebaTotal() {
		
		if (isPruebaTotal() == true)
		{
			System.out.println("Prueba Total OK!!");
		}
		else
		{
			System.out.println("Prueba Total NO OK");
		}		
	}
	public void pruebaReloj(){
		
		if (isPruebaReloj() == true)
		{
			System.out.println("Prueba reloj OK!!");
		}
		else
		{
			System.out.println("Prueba reloj NO OK");
		}
	}
	
	public void ImprimirInfoRelojDespertador(){
		
		this.ImprimirInfoRelojAbstracto();
		System.out.println("Tipo de despertador: " + tipoDespertador);
		
	}
}
