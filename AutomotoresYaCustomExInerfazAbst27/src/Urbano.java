
public class Urbano extends Automovil{
	
	private int cantPuertas;
	private boolean tieneBaul;
	private String marcaNeumaticos;
	
public Urbano(){
	
	super();
	cantPuertas = 0;
	tieneBaul = true;
	marcaNeumaticos = "";
}

public int getCantPuertas() {
	return cantPuertas;
}


public void setCantPuertas(int cantPuertas) {
	this.cantPuertas = cantPuertas;
}


public boolean isTieneBaul() {
	return tieneBaul;
}


public void setTieneBaul(boolean tieneBaul) {
	this.tieneBaul = tieneBaul;
}


public String getMarcaNeumaticos() {
	return marcaNeumaticos;
}


public void setMarcaNeumaticos(String marcaNeumaticos) {
	this.marcaNeumaticos = marcaNeumaticos;
}


	public void probarAcelerador() {
		
		if (isPruebaAcelerador() == true)
		{
			System.out.println("Acelerador OK!!");
		}
		else
		{
			System.out.println("Acelerador NO OK!!");
		}
	}

	public void probarFrenos() throws FallaFrenosException {
		
		if (isPruebaFrenos() == true)
		{
			System.out.println("Prueba de frenos OK!!");
		}
		else
		{
			throw new FallaFrenosException("Prueba de frenos NO OK!!");
		}
	}

	public void probarAirbag() {
		

		if (isPruebaAirBag() == true)
		{
			System.out.println("Air bag OK!!");
		}
		else
		{
			System.out.println("Air bag NO OK!!");
		}
		
	}

	@Override
	public void probarAerodinamicaDelChasis() {	
		
		if (ispruebaAerodinamica() == true)
		{
			System.out.println("Prueba Aerodinamica del chasis OK!!");
		}
		else
		{
			System.out.println("Prueba Aerodinaminca NO Ok!!");
		}
		
	}
	// ATENCION probarMotor() lo hereda como herencia!!//
	public void ImprimirInfoUrbano(){
		
		System.out.println("La cantidad de puertas es: " + cantPuertas);
		System.out.println("Tiene baul?? " + tieneBaul);
		System.out.println("La marca de los neumaticos es: " + marcaNeumaticos);
	}
	
	

}
