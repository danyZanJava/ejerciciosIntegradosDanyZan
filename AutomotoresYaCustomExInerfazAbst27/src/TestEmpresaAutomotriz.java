
public class TestEmpresaAutomotriz {

	
	public static void main(String[] args) {
		
		try
		{
			EmpresaAutomotriz laEmpresa;
			laEmpresa = new EmpresaAutomotriz();
			laEmpresa.cargasDatosTotalesReporte();
			laEmpresa.imprimirDatosTotales();
		}
		catch(FallaFrenosException fall) 
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error en: ");
			System.out.println("Error: " + fall.getMessage());
			System.out.println("Causa: " + fall.getCause());
			System.out.println("Clase: " + fall.getClass());
			
			int k = 0;
				for ( k = 0; k < fall.getStackTrace().length; k ++)
				{
					System.out.println("StackTrace: " + fall.getStackTrace()[k].getMethodName());
				}
		}
		catch(NroDniException n)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error en: ");
			System.out.println("Error: " + n.getMessage());
			System.out.println("Causa: " + n.getCause());
			System.out.println("Clase: " + n.getClass());
			
			int b = 0;
				for ( b = 0; b < n.getStackTrace().length; b ++)
				{
					System.out.println("StackTrace: " + n.getStackTrace()[b].getMethodName());
				}
		}
		catch(NombreYapellidoExcpetion nap)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error en: ");
			System.out.println("Error: " + nap.getMessage());
			System.out.println("Causa: " + nap.getCause());
			System.out.println("Clase: " + nap.getClass());
			
			int b = 0;
				for ( b = 0; b < nap.getStackTrace().length; b ++)
				{
					System.out.println("StackTrace: " + nap.getStackTrace()[b].getMethodName());
				}
		}
		catch(Exception m)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error en: ");
			System.out.println("Error: " + m.getMessage());
			System.out.println("Causa: " + m.getCause());
			System.out.println("Clase: " + m.getClass());
			int b = 0;
				for ( b = 0; b < m.getStackTrace().length; b ++)
				{
					System.out.println("StackTrace: " + m.getStackTrace()[b].getMethodName());
				}
		}		
	}

}
