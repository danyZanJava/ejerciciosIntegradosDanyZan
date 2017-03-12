
public class Handy implements Telefono {
	
	private String marca;
	private String numeroTelefono;
	private boolean tieneCamara;
	private boolean tieneVideo;
	private boolean tieneWhatsapp;
	private boolean datosLibres;
	private boolean estadoPrueba;
	
public Handy(){
	
	marca = "";
	numeroTelefono = "";
	tieneCamara = true;
	tieneVideo = true;
	tieneWhatsapp = false;
	datosLibres = false;
	estadoPrueba = true;
}
public boolean isEstadoPrueba() {
	return estadoPrueba;
}


public void setEstadoPrueba(boolean estadoPrueba) {
	this.estadoPrueba = estadoPrueba;
}


public String getMarca() {
	return marca;
}

public void setMarca(String marca)  {	
	
	this.marca = marca;
}

public String getNumeroTelefo()  {
	
	
		return numeroTelefono;		
}

/*private boolean NumeroTelefonoExeption(int i) {
	// TODO Auto-generated method stub
	return false;
}*/
public void setNumeroTelefo(String numeroTelefo) throws NumeroTelefonoExeption{
	
	if (numeroTelefo == "" || Integer.parseInt(numeroTelefo) == 0)
	{
		throw new NumeroTelefonoExeption("Ingrese numero de telefono correcto");
	}
	else
	{
		this.numeroTelefono = numeroTelefo;
	}	
}

public boolean isTieneCamara() {
	return tieneCamara;
}

public void setTieneCamara(boolean tieneCamara) {
	this.tieneCamara = tieneCamara;
}

public boolean isTieneVideo() {
	return tieneVideo;
}

public void setTieneVideo(boolean tieneVideo) {
	this.tieneVideo = tieneVideo;
}

public boolean isTieneWhatsapp() {
	return tieneWhatsapp;
}

public void setTieneWhatsapp(boolean tieneWhatsapp) {
	this.tieneWhatsapp = tieneWhatsapp;
}

public boolean isDatosLibres() {
	return datosLibres;
}

public void setDatosLibres(boolean datosLibres) {
	this.datosLibres = datosLibres;
}
public void imprimirInfoHandy(){
	
	System.out.println("La marca es: " + marca);
	System.out.println("El numero de telefono es: " + numeroTelefono);
	System.out.println("Tiene cámara?" + tieneCamara);
	System.out.println("Tiene video? " + tieneVideo);
	System.out.println("tiene whatsapp? " + tieneWhatsapp);
	System.out.println("Tiene datos libres? " + datosLibres);
}
public void llamar() {
	System.out.println("Llamada realizada");	
}
public void enviarSMS(String unMensaje) {	// TODO Auto-generated method stub
	System.out.println("Mensaje enviado");
}
}
