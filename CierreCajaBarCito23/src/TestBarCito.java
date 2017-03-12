
public class TestBarCito {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BarCito unBar;
			unBar = new BarCito();
			unBar.cargaTotalDeDatosBarCito();
			unBar.tituloDelInformeCierre();
			unBar.imprimirTodoslosDatosDelReporte();
		}
		catch(DNImozoException em)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha dectectado un error en: ");
			System.out.println("Error" + em.getMessage());
			System.out.println("Causa: " + em.getCause());
			System.out.println("Clase: " + em.getClass());
			int m;
			m = 0;
			for ( m = 0; m < em.getStackTrace().length; m ++)
			{
				System.out.println("StackTrace: " + em.getStackTrace()[m].getMethodName());
			}
		}
		catch(Exception e)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha dectectado un error en: ");
			System.out.println("Error" + e.getMessage());
			System.out.println("Causa: " + e.getCause());
			System.out.println("Clase: " + e.getClass());
			int k;
			k  = 0;
				for ( k = 0; k < e.getStackTrace().length; k ++)
				{
					System.out.println("StackTrace: " + e.getStackTrace()[k].getMethodName());
				}
		}
	}
}
