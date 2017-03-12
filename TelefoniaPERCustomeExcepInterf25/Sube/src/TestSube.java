/*
		 * Corregido OK y funcionando		  
		 */
public class TestSube {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		// Aqui ejecuta el codigo normal
		{
		Sube unSube;                                     
		unSube = new Sube();
		unSube.cargoDatosTotalesSUBE();
		unSube.imprimirTodo();		
		}
		//TRY y CATCH Sirve para atrapar posibles errores (Excepcion) en la ejecución del código
		// Aqui el código que ejecuta en caso de error identificando la Excepcion de tipo - er -
		catch(ImporteExcepcion er)
		{
			System.out.println("");
			System.out.println("Se ha detectado un error en: ");
			System.out.println("Error: " + er.getMessage());
			System.out.println("Clase: " + er.getClass());
			System.out.println("Causa: " + er.getCause());
			int m;
			m = 0;
				for (m = 0; m < er.getStackTrace().length; m ++)
				{
					System.out.println("Stack Trace: " + er.getStackTrace()[m].getMethodName());
				}
		}
		catch(Exception e)
		{
			System.out.println("");
			System.out.println("Se ha detectado un error en: ");
			System.out.println("Error: " + e.getMessage());
			System.out.println("Clase: " + e.getClass());
			System.out.println("Causa: " + e.getCause());
			int m;
			m = 0;
				for (m = 0; m < e.getStackTrace().length; m ++)
				{
					System.out.println("Stack Trace: " + e.getStackTrace()[m].getMethodName());
				}
		}
}
}