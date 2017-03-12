
public class Notebook implements ComputadoraInterf{
	
	private String marca;
	private String socket;
	private boolean PCIexpress;
	private boolean videoOnBoard;
	private boolean audioOnBoard;
	private String sistemOperativo;
	private boolean estadoPruebaTeclado;
	private boolean estadoPruebaMouse;
	private String codigoDeBarras;	
	
public Notebook(){
	
	marca = "";
	socket = "";
	PCIexpress = true;
	videoOnBoard = true;
	audioOnBoard = true;
	sistemOperativo = "";
	estadoPruebaTeclado = true;
	estadoPruebaMouse = false;
	codigoDeBarras = "";
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getSocket() {
	return socket;
}

public void setSocket(String socket) {
	this.socket = socket;
}


public boolean isPCIexpress() {
	return PCIexpress;
}

public void setPCIexpress(boolean pCIexpress) {
	PCIexpress = pCIexpress;
}

public boolean isVideoOnBoard() {
	return videoOnBoard;
}

public void setVideoOnBoard(boolean videoOnBoard) {
	this.videoOnBoard = videoOnBoard;
}


public boolean isAudioOnBoard() {
	return audioOnBoard;
}

public void setAudioOnBoard(boolean audioOnBoard) {
	this.audioOnBoard = audioOnBoard;
}


public String getSistemOperativo() {
	return sistemOperativo;
}

public void setSistemOperativo(String sistemOperativo) {
	this.sistemOperativo = sistemOperativo;
}

public boolean isEstadoPruebaTeclado() {
	return estadoPruebaTeclado;
}

public void setEstadoPruebaTeclado(boolean estadoPruebaTeclado) {
	this.estadoPruebaTeclado = estadoPruebaTeclado;
}

public boolean isEstadoPruebaMouse() {
	return estadoPruebaMouse;
}

public void setEstadoPruebaMouse(boolean estadoPruebaMouse) {
	this.estadoPruebaMouse = estadoPruebaMouse;
}

public String getCodigoDeBarras() {
	return codigoDeBarras;
}

public void setCodigoDeBarras(String codigoDeBarras) throws CodigoDeBarrasException {
	
	if ( codigoDeBarras.equals("0"))
	{
		throw new CodigoDeBarrasException("Codigo de Barras Incorrecto, completar nuevamente!");
	}
	this.codigoDeBarras = codigoDeBarras;
}
public void ImprimirInfoNotebook(){
	
	System.out.println("Marca Placa Madre: " + marca);
	System.out.println("Socket: " + socket);
	System.out.println("PCI Express:" + PCIexpress);
	System.out.println("VideoOnBoard: " + videoOnBoard);
	System.out.println("AudioOnBoard: " + audioOnBoard);
	System.out.println("Sistema Operativo: " + sistemOperativo);
	System.out.println("Codigo de barras: " + codigoDeBarras);
}
public void imprimirInfoNotebookTest(){
	
	System.out.println("Marca Placa Madre: " + marca);
	System.out.println("Socket: " + socket);
	System.out.println("Estado de prueba del teclado??:");
	this.probarTeclado();
	System.out.println("Estado de prueba del mouse??:");
	this.probarMouse();
}
public void probarTeclado(){    //Metodos  prototipos	
	System.out.println("OK");		
		
}
public void probarMouse(){  //metodos prototipos
	
	System.out.println("OK");	
}	
}



