
public class Deportivo extends Automovil {
	
	private int cantPuertas;
	private boolean tieneBaul;
	private String marcaNeumaticos;
	private boolean tieneOxidoNitroso;
	
public Deportivo(){
	
	cantPuertas = 0;
	tieneBaul = true;
	marcaNeumaticos = "";
	tieneOxidoNitroso = true;
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


public boolean isTieneOxidoNitroso() {
	return tieneOxidoNitroso;
}


public void setTieneOxidoNitroso(boolean tieneOxidoNitroso) {
	this.tieneOxidoNitroso = tieneOxidoNitroso;
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
			System.out.println("Prueba OK!!");
		}
		else
		{
			throw new FallaFrenosException("Frenos no OK!!");
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
			System.out.println("Prueba Aerodinamica del chasis NO Ok!!");
		}		
	}
	
public void imprimirInfoDeportivo(){
	
		System.out.println("La cantidad de puertas del deportivo son:" + cantPuertas);
		System.out.println("Tiene baul el deportivo??" + tieneBaul);
		System.out.println("La marca de neumaticos del deportivo es:" + marcaNeumaticos);
		System.out.println("Tiene oxido Nitroso el deportivo??" + tieneOxidoNitroso);
}
}
