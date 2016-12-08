
public class PruebaExcepciones {

	public PruebaExcepciones() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int estudiantes = 10;
		int notaSumadaClase = 1000;
		int promedioClase = 0;
		String nombreCurso = "";
		
		try {
			promedioClase = notaSumadaClase/estudiantes;
			nombreCurso = args[0];
		}catch(ArithmeticException e){
			System.err.println("Nadie se inscribio en el curso. No se tomara en cuenta para el conteo.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Mande parametro de nombre de curso");
			System.err.println(e.getMessage());
		}		
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("Cualquier otro error");
			e.printStackTrace();			
		}finally{
			System.out.println("Finalmente aprendimos a manejar errores.");
		}
		
		
		System.out.println("El promedio de la clase "+ nombreCurso 
				+ " es: " + promedioClase);
	}

}
