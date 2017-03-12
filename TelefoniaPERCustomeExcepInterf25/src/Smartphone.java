
public class Smartphone implements Telefono{
	
	private String marca;
	private String numeroTelefono;
	private boolean tieneCamara;
	private boolean tieneVideo;
	private boolean tieneWhatsapp;
	private boolean datosLibres;
	private boolean estadoPrueba;
	
public Smartphone(){
	
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

public void setMarca(String marca) {
	this.marca = marca;
}

public String getNumeroTelefono() {	
	
		return numeroTelefono;			
}

public void setNumeroTelefo(String numeroTelefo) throws NumeroTelefonoExeption{
	
	if ( numeroTelefo == "" || Integer.parseInt(numeroTelefo) == 0)
	{
		throw new NumeroTelefonoExeption("Ingrese el numero de telefono correcto");
	}
	else
	{
		this.numeroTelefono = numeroTelefono;	
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
public void ImprimioInfoSmartphone(){
	
	System.out.println("La marca es: " + marca);
	System.out.println("El numero de telefono es: " + numeroTelefono);
	System.out.println("Tiene camara? " + tieneCamara);
	System.out.println("Tiene Video? " + tieneVideo);
	System.out.println("TieneWhatsapp? " + tieneWhatsapp);
	System.out.println("Tiene datos libres: " + datosLibres);			
}

public void llamar() {      // metodos prototipos
	System.out.println("Llamada realizada");	
}

public void enviarSMS(String unMensaje) {	// metodos prototipos
	System.out.println("Mensaje enviado");
}
}
