
public class ResumenDeCuenta {
	
	private int fecha;
	private int cuota;
	
public ResumenDeCuenta(int _fecha,int _cuota){
	
	fecha =_fecha;
	cuota =_cuota;
}
public ResumenDeCuenta(){
	
	fecha = 0;
	cuota = 0;
}
public int getFecha() {
	return fecha;
}

public void setFecha(int fecha) {
	this.fecha = fecha;
}

public int getCuota() {
	return cuota;
}

public void setCuota(int cuota) {
	this.cuota = cuota;
}
public void imprimirInfoResumenDeCuenta(){
	
	System.out.println("Fecha del resumen: " + fecha);
	System.out.println("Cuota del resumen: " + cuota);
}
}
