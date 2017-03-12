
public class TestPersonal {

	public static void main(String[] args) {
		
		try
		{
			Personal empresaPersonal;
			empresaPersonal = new Personal();
			empresaPersonal.cargoDatosTotalesTelefonia();
			empresaPersonal.ImprimoDatosTotalesTelefonia();
		}
		catch(DNIexception dni) 
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha dectectado un error en: ");
			System.out.println("Error" + dni.getMessage());
			System.out.println("Causa: " + dni.getCause());
			System.out.println("Clase: " + dni.getClass());
			int k;
			k  = 0;
				for ( k = 0; k < dni.getStackTrace().length; k ++)
				{
					System.out.println("StackTrace: " + dni.getStackTrace()[k].getMethodName());
				}
		}
		catch(NumeroTelefonoExeption nte){
			
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error en: ");
			System.out.println("Error" + nte.getMessage());
			System.out.println("Causa " + nte.getCause());
			System.out.println("Clase " + nte.getClass());
			int c;
			c = 0;
				for ( c = 0; c < nte.getStackTrace().length; c ++)
				{
					System.out.println("StackTrace: " + nte.getStackTrace()[c].getMethodName());
				}			
		}
		catch (Exception n){
			
			System.out.println("");
			System.out.println("Se ha dectectado un error en: ");
			System.out.println("Error: " + n.getMessage());
			System.out.println("Causa: " + n.getCause());
			System.out.println("Clase: " + n.getClass());
			int e;
			e = 0;
				for ( e = 0; e < n.getStackTrace().length; e ++)
				{
					System.out.println("StackTrace: " + n.getStackTrace()[e].getMethodName());
				}
		}

	}

}
