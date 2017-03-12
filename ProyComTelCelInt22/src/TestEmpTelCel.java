
public class TestEmpTelCel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub ///  CORREGIDO Y OK !!!!!!! ///// /
		try
		{
		EmpresaTelCelInt laempresaTelCel;
		laempresaTelCel = new EmpresaTelCelInt();
		laempresaTelCel.cargoDatosEmpresaTellCelInt();
		laempresaTelCel.imprimoTodoslosDatosDelReporte();
		}
		catch(CuotaInternetException er)
		{
			System.out.println("");
			System.out.println("Se ha dectectado un error en:");
			System.out.println("Error:" + er.getMessage());
			System.out.println("Causa: " + er.getCause());
			System.out.println("Clase: " + er.getClass());
			int m;
			m = 0;
			 	for ( m = 0; m < er.getStackTrace().length; m ++ )
			 	{
			 		System.out.println("Stack Trace: " + er.getStackTrace()[m].getMethodName()) ;
			 	 }
		}
		catch(Exception e)
		{
			System.out.println("");
			System.out.println("Se ha dectectado un error en:");
			System.out.println("Error:" + e.getMessage());
			System.out.println("Causa: " + e.getCause());
			System.out.println("Clase: " + e.getClass());
			int g;
			g = 0;
			 	for ( g = 0; g < e.getStackTrace().length; g ++ )
			 	{
			 		System.out.println("Stack Trace: " + e.getStackTrace()[g].getMethodName()) ;
			 	 }
		}	
}
}
