
public class Ticket {
	
	private double saldoAnterior;
	private double Importe;  // variable afectada a la excepcion //
	private double saldoFinal;
	
public Ticket(double _saldoAnterior,double _Importe,double _saldoFinal){// Sobrecarga: sirve para darle valores iniciales a //
	//algunas o todas las variables(inicializar) que dan estructura al objeto//
	
	saldoAnterior =_saldoAnterior;
	Importe =_Importe;
	saldoFinal =_saldoFinal;
}
public Ticket(){ // constructor por defecto //
	
	saldoAnterior = 0;
	Importe = 0;
	saldoFinal = 0;	
}
public double getSaldoAnterior() {
	return saldoAnterior;
}
public void setSaldoAnterior(double saldoAnterior) {
	this.saldoAnterior = saldoAnterior;
}
public double getImporte() throws ImporteExcepcion {
	
	if  ( Importe <= 0)
	{
		throw new ImporteExcepcion("Importe Incorrecto: DIGITE IMPORTE CORRECTO ");
	}
	else
	{
		return Importe;
	}	
}
public void setImporte(double importe) {
	Importe = importe;
}
public double getSaldoFinal() {
	return saldoFinal;
}
public void setSaldoFinal(double saldoFinal) {
	this.saldoFinal = saldoFinal;
}
public void ImprimirInfoTicket(){
	
	System.out.println("SALDO ANTERIOR   $ :" + saldoAnterior);
	System.out.println("IMPORTE          $ :" + Importe);
	System.out.println("SALDO FINAL      $ :" + saldoFinal);
}
}
