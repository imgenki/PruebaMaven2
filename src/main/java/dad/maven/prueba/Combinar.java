package dad.maven.prueba;

public class Combinar {
	
	public static String combinar(Object [] array) {
		String cosa="";
		for(int i=0;i<array.length-2;i++) {
			cosa+=array[i];
		}
		return cosa;
	}
	
	public static void main(String [] args) {
		Object [] array = {"hola", 3.14126, "adios", 4, true};
		String resultado = combinar(array);
		System.out.println(resultado);
	}
	
}
