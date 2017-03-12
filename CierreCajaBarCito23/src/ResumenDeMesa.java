
public class ResumenDeMesa {
	
	private String articulo;
	private double importe;	
	
public ResumenDeMesa(){
	
	articulo = "";
	importe = 0;	
}

public String getArticulo() {
	return articulo;
}

public void setArticulo(String articulo) {
	this.articulo = articulo;
}

public double getImporte() {
	return importe;
}

public void setImporte(double importe) {
	this.importe = importe;
}
public void imprimirInfoResumenDeMesa(){
	
	System.out.println("Tipo de articulo: " + articulo);
	System.out.println("Importe de mesa: " + importe);
}
}
