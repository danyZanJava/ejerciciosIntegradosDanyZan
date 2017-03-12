
public abstract class Piano implements InterfazPiano{
	
	private String marca;
	private int cantTeclasBlancas;
	private int cantTeclasNegras;
	private int cantTeclasTotales;
	private int cantPedales;
	private boolean pruebaTotal;
	private boolean pruebaAcustica;
	private boolean pruebaTeclasBlancas;
	private boolean pruebaTeclasNegras;
	private boolean pruebaPedales;
	private boolean pruebaPiano;
	
public Piano(){
	
	marca = "";
	cantTeclasBlancas = 0;
	cantTeclasNegras = 0;
	cantTeclasTotales = 0;
	cantPedales = 0;
	pruebaTotal = true;
	pruebaAcustica = true;
	pruebaTeclasBlancas = true;
	pruebaTeclasNegras = true;
	pruebaPedales = true;
	pruebaPiano = true;
	
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public int getCantTeclasBlancas() {
	return cantTeclasBlancas;
}

public void setCantTeclasBlancas(int cantTeclasBlancas) {
	this.cantTeclasBlancas = cantTeclasBlancas;
}

public int getCantTeclasNegras() {
	return cantTeclasNegras;
}

public void setCantTeclasNegras(int cantTeclasNegras) throws FallaTeclasException {
	
	if (cantTeclasNegras == 0)
	{
		throw new FallaTeclasException("Cantidad de teclas Negras incorrecta!, Ingrésela nuevamente");
	}
	this.cantTeclasNegras = cantTeclasNegras;
}

public int getCantTeclasTotales() {
	return cantTeclasTotales;
}

public void setCantTeclasTotales(int cantTeclasTotales) {
	this.cantTeclasTotales = cantTeclasTotales;
}

public int getCantPedales() {
	return cantPedales;
}

public void setCantPedales(int cantPedales) {
	this.cantPedales = cantPedales;
}

public boolean isPruebaTotal() {
	return pruebaTotal;
}

public void setPruebaTotal(boolean pruebaTotal) {
	this.pruebaTotal = pruebaTotal;
}


public boolean isPruebaAcustica() {
	return pruebaAcustica;
}

public void setPruebaAcustica(boolean pruebaAcustica) {
	this.pruebaAcustica = pruebaAcustica;
}
public boolean isPruebaTeclasBlancas() {
	return pruebaTeclasBlancas;
}

public void setPruebaTeclasBlancas(boolean pruebaTeclasBlancas) {
	this.pruebaTeclasBlancas = pruebaTeclasBlancas;
}

public boolean isPruebaTeclasNegras() {
	return pruebaTeclasNegras;
}

public void setPruebaTeclasNegras(boolean pruebaTeclasNegras) {
	this.pruebaTeclasNegras = pruebaTeclasNegras;
}

public boolean isPruebaPedales() {
	return pruebaPedales;
}

public void setPruebaPedales(boolean pruebaPedales) {
	this.pruebaPedales = pruebaPedales;
}

public boolean isPruebaPiano() {
	return pruebaPiano;
}

public void setPruebaPiano(boolean pruebaPiano) {
	this.pruebaPiano = pruebaPiano;
}
////////////////////NO LLEVA GETTER Y SETTER pruebaAcustica????
public void pruebaTotal(){
	
	if (pruebaTotal == true)
	{
		System.out.println("Prueba Total OK!!");
	}
	else
	{
		System.out.println("Prueba Total NO OK");
	}
}
public abstract void pruebaAcustica();  //Invoco clase Abstracta sin llaves

public void ImprimirInfoPiano(){
	
	System.out.println("La marca del piano es: " + marca);
	System.out.println("Cantidad de teclas blancas: " + cantTeclasBlancas);
	System.out.println("Cantidad de teclas negras: " + cantTeclasNegras);
	System.out.println("Cantidad de teclas totales: " + cantTeclasTotales);
	System.out.println("Cantidad de pedales: " + cantPedales);
}
}
