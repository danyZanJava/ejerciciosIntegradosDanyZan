import java.util.*;


public class RelojPulsera extends RelojesAbstract {
	
	private String material;
	private boolean segundero;
	private SexoEnumerado TipoSexoEnum;
	private String tipoDeMalla;
	private String sexoEnumerado;
	
public RelojPulsera(){
	
	material = "";
	segundero = true;	
	tipoDeMalla = "";
	sexoEnumerado = "";
}
	public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public boolean isSegundero() {
	return segundero;
}
public void setSegundero(boolean segundero) {
	this.segundero = segundero;
}
public SexoEnumerado getTipoSexoEnum() {
	return TipoSexoEnum;
}
public void setTipoSexoEnum(SexoEnumerado tipoSexoEnum) {
	TipoSexoEnum = tipoSexoEnum;
}
	public String getTipoDeMalla() {
	return tipoDeMalla;
}
public void setTipoDeMalla(String tipoDeMalla) {
	this.tipoDeMalla = tipoDeMalla;
}

	@Override
public void pruebaHorario() {
		
		if (isPruebaHorario() == true)
		{
			System.out.println("Prueba horario OK !!");
		}
		else
		{
			System.out.println("Prueba horario NO OK!!");
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
			System.out.println("Prueba minutero NO OK1!!");
		}		
	}

	@Override
	public void pruebaSegundero() throws ExceptionFallaSegundero{
		
		if (isPruebaSegundero() == false)
		{
			throw new ExceptionFallaSegundero("-------- FALLA SEGUNDERO RELOJ RECHAZADO -----");
		}
		else
		{
			System.out.println("Prueba reloj Pulsera OK");
		}		
	}

	@Override
	public void pruebaTotal() {
		
		if ( isPruebaTotal() == true)
		{
			System.out.println("Prueba Total OK!!");
		}
		else
		{
			System.out.println("Prueba Total NO OK!!");
		}
	}
	public void pruebaReloj(){
		
		if ( isPruebaReloj() == true)
		{
			System.out.println("Prueba Reloj OK!!");
		}
		else
		{
			System.out.println("Prueba Reloj NO OK");
		}		
	}
	public void ImprimirInfoRelojPulsera(){
		
		this.ImprimirInfoRelojAbstracto();
		System.out.println("El material del reloj pulsera es: " + material);
		System.out.println("Tiene segundero el reloj pulsera?? " + segundero);
		
		if (TipoSexoEnum == SexoEnumerado.femenino)
		{
			System.out.println("Reloj pulsera femenino");
		}
		else
		{
			System.out.println("Reloj pulsera masculino");
		}				
	}
}
