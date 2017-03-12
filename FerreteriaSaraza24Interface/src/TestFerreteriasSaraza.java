
public class TestFerreteriasSaraza {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FerreteriasSaraza unaFerre;
			unaFerre = new FerreteriasSaraza();
			unaFerre.cargoDatosTotalesFerreteriasSaraza();
			unaFerre.imprimirTodoslosDatosDelReporteFerreteria();
		}
		catch (ImporteException en)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error en: ");
			System.out.println("Error: " + en.getMessage());
			System.out.println("Causa: " + en.getCause());
			System.out.println("Clase: " + en.getClass());
			int t;
			t = 0;
				for ( t = 0; t < en.getStackTrace().length; t ++)
				{
					System.out.println("Stack Trace: " + en.getStackTrace()[t].getMethodName());
				}
		}
		catch(Exception n)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha dectectado un error en: ");
			System.out.println("Error" + n.getMessage());
			System.out.println("Causa: " + n.getCause());
			System.out.println("Clase: " + n.getClass());
			int k;
			k  = 0;
				for ( k = 0; k < n.getStackTrace().length; k ++)
				{
					System.out.println("StackTrace: " + n.getStackTrace()[k].getMethodName());
				}
		}		
	}
}
