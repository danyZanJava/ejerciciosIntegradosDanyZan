
public class StockSucursal {
	
	private String articulo;
	private double importe;
	private int stockInterno;
	
public StockSucursal(){
	
	articulo = "";
	importe = 0;
	stockInterno = 0;	
}

public String getArticulo() {
	return articulo;
}

public void setArticulo(String articulo) {
	this.articulo = articulo;
}

public double getImporte() throws ImporteException { /// Declaracion de la exepcoion personalizada//
	
	if ( importe <= 0)
	{
		throw new ImporteException("IMPORTE INCORRECTO: Agregue valores correctos!!");
	}
	else
	{
		return importe;
	}	
}

public void setImporte(double importe) {
	this.importe = importe;
}
public int getStockInterno() {
	return stockInterno;
}

public void setStockInterno(int stockInterno) {
	this.stockInterno = stockInterno;
}

public void imprimirInfoStock(){
	
	System.out.println("El articulo es: " + articulo);
	System.out.println("El importe es: " + importe);
	System.out.println("El numero de Stock es: " + stockInterno);
}
}
