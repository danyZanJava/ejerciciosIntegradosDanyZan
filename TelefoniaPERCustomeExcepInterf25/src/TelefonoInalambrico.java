
public class TelefonoInalambrico implements Telefono {
	
	private String marca;
	private String numeroTelefo;
	private boolean tieneCamara;
	private boolean tieneVideo;
	private boolean tieneWhatsapp;
	private boolean datosLibres;
	private boolean estadoPrueba;
	
public TelefonoInalambrico(){
	
	marca = "";
	numeroTelefo = "";
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

public String getNumeroTelefono(){ 
	
		return numeroTelefo;		
}

public void setNumeroTelefo(String numeroTelefo) throws NumeroTelefonoExeption{	
	
	if ( numeroTelefo == "" || Integer.parseInt(numeroTelefo) == 0)
	{
		throw new NumeroTelefonoExeption("Ingrese numero de telefono correcto");
	}
	else
	{
		this.numeroTelefo = numeroTelefo;	
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
public void ImprimirInfoTelefonoInalambrico(){
	
	System.out.println("La marca de inalambrico es: " + marca);
	System.out.println("Tiene camara? " + tieneCamara);
	System.out.println("Tiene video? " + tieneVideo);
	System.out.println("Tiene Whatsapp? " + tieneWhatsapp);
	System.out.println("Tiene datos libres? " + datosLibres);
}

public void llamar() {
	System.out.println("Llamada realizada");
	
}
public void enviarSMS(String unMensaje) {
	System.out.println("Mensaje enviado");	
}
}
