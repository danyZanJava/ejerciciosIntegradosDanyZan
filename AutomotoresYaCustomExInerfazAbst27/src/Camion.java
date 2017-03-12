
public class Camion extends Automovil {
	
	private int cantPuertas;
	private boolean tieneBaul;
	private String marcaNeumaticos;
	private String capacidadDeCarga;
	private boolean soportaContainer;
	private String tipoCombustible;
	
public Camion(){
	
	super();
	cantPuertas = 0;
	tieneBaul = true;
	marcaNeumaticos = "";
	capacidadDeCarga = "";
	soportaContainer = true;
	tipoCombustible = "";	
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


public String getCapacidadDeCarga() {
	return capacidadDeCarga;
}


public void setCapacidadDeCarga(String capacidadDeCarga) {
	this.capacidadDeCarga = capacidadDeCarga;
}


public boolean isSoportaContainer() {
	return soportaContainer;
}


public void setSoportaContainer(boolean soportaContainer) {
	this.soportaContainer = soportaContainer;
}


public String getTipoCombustible() {
	return tipoCombustible;
}


public void setTipoCombustible(String tipoCombustible) {
	this.tipoCombustible = tipoCombustible;
}


	public void probarAcelerador() {
		
		if (isPruebaAcelerador() == true)
		{
			System.out.println("Prueba acelerador OK!!");
		}
		else
		{
			System.out.println("Prueba acelerador No Ok!!");
		}
		
	}

	public void probarFrenos() throws FallaFrenosException {
		
		if (isPruebaFrenos() == true)
		{
			System.out.println("Prueba de frenos OK!!");
		}
		else
		{
			throw new FallaFrenosException("Prueba de freno NO OK!!");
		}		
	}

	public void probarAirbag() {
		
		if (isPruebaAirBag() == true)
		{
			System.out.println("Prueba airbag Ok!!");
		}
		else
		{
			System.out.println("Prueba airbag NO OK!!");
		}
	}

	@Override
	public void probarAerodinamicaDelChasis() {
		
		if (ispruebaAerodinamica() == true)
		{
			System.out.println("Prueba aerodinamica del chasis OK!!");
		}
		else
		{
			System.out.println("Prueba aerodinamica del chasis NO OK!!");
		}
		
	}
public void ImprimirInfoCamion(){
	
	System.out.println("La cantidad de puertas del camión es: " + cantPuertas);
	System.out.println("Tiene baul el camión?? " + tieneBaul);
	System.out.println("La marca de neumaticos del camión es: " + marcaNeumaticos);
	System.out.println("La capacidad de carga del camión es; " + capacidadDeCarga);
	System.out.println("Soporta carga de container el camión?? " + soportaContainer);
	System.out.println("Cual es el tipo de combustible del camión?? " + tipoCombustible);
}
}
