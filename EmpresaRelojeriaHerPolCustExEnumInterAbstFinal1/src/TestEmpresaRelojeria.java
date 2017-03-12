
public class TestEmpresaRelojeria {

	
	public static void main(String[] args) {
		
		try
		{
			EmpresaRelojeriaTime laEmpresa;
			laEmpresa = new EmpresaRelojeriaTime();
			laEmpresa.cargoDatosTotales();
			laEmpresa.ImprimoDatosTotales();
		}
		catch(ExceptionNombreYApellido nom)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error:");
			System.out.println("Error :" + nom.getMessage());
			System.out.println("Causa: " + nom.getCause());
			System.out.println("Clase: " + nom.getClass());
			int n = 0;
					for (n = 0; n < nom.getStackTrace().length; n ++)
					{
						System.out.println("Stack trace: " + nom.getStackTrace()[n].getMethodName());
					}
		}
		catch(ExceptionDNI dn)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error: ");
			System.out.println("Error: " + dn.getMessage());
			System.out.println("Causa: " + dn.getCause());
			System.out.println("Clase: " + dn.getClass());
			int d = 0;
					for (d = 0; d < dn.getStackTrace().length; d ++)
					{
						System.out.println("Stack trace: " + dn.getStackTrace()[d].getMethodName());
					}
		}
		catch(ExceptionFallaSegundero dn)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error: ");
			System.out.println("Error: " + dn.getMessage());
			System.out.println("Causa: " + dn.getCause());
			System.out.println("Clase: " + dn.getClass());
			int f = 0;
					for (f = 0; f < dn.getStackTrace().length; f ++)
					{
						System.out.println("Stack trace: " + dn.getStackTrace()[f].getMethodName());
					}
		}
		catch(Exception n)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error: ");
			System.out.println("Error: " + n.getMessage());
			System.out.println("Causa: " + n.getCause());
			System.out.println("Clase: " + n.getClass());
			int d = 0;
					for (d = 0; d < n.getStackTrace().length; d ++)
					{
						System.out.println("Stack trace: " + n.getStackTrace()[d].getMethodName());
					}
		}
	}
}
