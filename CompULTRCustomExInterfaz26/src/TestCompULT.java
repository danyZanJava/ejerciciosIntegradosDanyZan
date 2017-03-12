

public class TestCompULT {
	                                             ///  CORREGIDO Y FUNCIONANDO  !!!!!
	public static void main(String[] args) {
		
		try
		{
			ComputadorasULTRON unaEmpresa;
			unaEmpresa = new ComputadorasULTRON();
			unaEmpresa.cargoDatosTotalesDeComputadorasULTRON();
			unaEmpresa.ImprimoDatosTotales();			
		}
		catch(DNIClientePerException dni){ 
		
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha dectectado un error en: ");
			System.out.println("Error:" + dni.getMessage());
			System.out.println("Causa: " + dni.getCause());
			System.out.println("Clase: " + dni.getClass());
			int k;
			k  = 0;
				for ( k = 0; k < dni.getStackTrace().length; k ++)
				{
					System.out.println("StackTrace: " + dni.getStackTrace()[k].getMethodName());
				}
		}
		catch(NombreApellidoException nom){
			
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error en: ");
			System.out.println("Error" + nom.getMessage());
			System.out.println("Causa " + nom.getCause());
			System.out.println("Clase " + nom.getClass());
			int c;
			c = 0;
				for ( c = 0; c < nom.getStackTrace().length; c ++)
				{
					System.out.println("StackTrace: " + nom.getStackTrace()[c].getMethodName());
				}			
		}
        catch(CodigoDeBarrasException cod){
			
			System.out.println("");
			System.out.println("");
			System.out.println("Se ha detectado un error en: ");
			System.out.println("Error" + cod.getMessage());
			System.out.println("Causa " + cod.getCause());
			System.out.println("Clase " + cod.getClass());
			int c;
			c = 0;
				for ( c = 0; c < cod.getStackTrace().length; c ++)
				{
					System.out.println("StackTrace: " + cod.getStackTrace()[c].getMethodName());
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
