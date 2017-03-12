
public class ALLinOne  implements ComputadoraInterf{
	
	private String marcaPlacaM;
	private String socket;
	private boolean PCIExpress;
	private boolean videoOnBoard;
	private boolean audioOnBoard;
	private String sistemaOperativo;
	private boolean estadoPruebaTeclado; //////??????
	private boolean estadoPruebaMouse;  //????
	private String codigoDeBarras;
	
public ALLinOne(){
	
	marcaPlacaM = "";
	socket = "";
	PCIExpress = true;
	videoOnBoard = true;
	audioOnBoard = true;
	sistemaOperativo = "";
	estadoPruebaTeclado = true;
	estadoPruebaMouse = true;
	codigoDeBarras = "";
}

public String getMarca() {
	return marcaPlacaM;
}

public void setMarca(String marca) {
	this.marcaPlacaM = marca;
}

public String getSocket() {
	return socket;
}

public void setSocket(String socket) {
	this.socket = socket;
}
public String getMarcaPlacaM() {
	return marcaPlacaM;
}

public void setMarcaPlacaM(String marcaPlacaM) {
	this.marcaPlacaM = marcaPlacaM;
}

public boolean isPCIExpress() {
	return PCIExpress;
}

public void setPCIExpress(boolean pCIExpress) {
	PCIExpress = pCIExpress;
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

public String getSistemaOperativo() {
	return sistemaOperativo;
}

public void setSistemaOperativo(String sistemaOperativo) {
	this.sistemaOperativo = sistemaOperativo;
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

public void setCodigoDeBarras(String codigoDeBarras) throws CodigoDeBarrasException{
	
	if ( codigoDeBarras.equals("0"))
	{
		throw new CodigoDeBarrasException("Codigo de barras Incorrecto, completar nuevamente!");
	}
	this.codigoDeBarras = codigoDeBarras;
}
public void ImprimirInfoAllinOne(){
	
	System.out.println("Marca Placa Madre: " + marcaPlacaM);
	System.out.println("Socket: " + socket);
	System.out.println("PCI Express:" + PCIExpress);
	System.out.println("VideoOnBoard: " + videoOnBoard);
	System.out.println("AudioOnBoard: " + audioOnBoard);
	System.out.println("Sistema Operativo: " + sistemaOperativo);
	System.out.println("Codigo de barras: " + codigoDeBarras);
}
public void imprimirInfoAllinOneTest(){
	
	System.out.println("Marca Placa Madre: " + marcaPlacaM);
	System.out.println("Socket: " + socket);
	System.out.println("Estado de prueba del teclado??:");
	this.probarTeclado();
	System.out.println("Estado de prueba del mouse??:");
	this.probarMouse();
}
public void probarTeclado(){   //Metodos prototipos
	
	System.out.println("OK");	
}
public void probarMouse(){   ///Metodos prototipos
	
	System.out.println("OK ");
}
}
