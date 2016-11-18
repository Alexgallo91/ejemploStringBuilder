/*Ejemplo de StringBuilder*/

public class Main {
	
	public static void main(String []args)
	{
		String texto = "Hola Mundo!!! ";
		texto += "suscribete" + " al canal";
		
		System.out.println(texto);
		
		StringBuilder textoB = new StringBuilder();
		textoB.append("Hola soy abraham");
		textoB.append(", que esperas?").append(" suscribete!!!");
		
		System.out.println(textoB);
		
		/*StringBuilder*/
		long tiempo_inicio = System.nanoTime();
		StringBuilder txt1 = new StringBuilder();
		
		for(int i = 0; i < 1000; i++)
		{
			txt1.append(i);
		}
		
		long tiempo_final = System.nanoTime();
		System.out.println("Diferencia con StringBuilder: " + (tiempo_final - tiempo_inicio));
		
		/*Concatenacion de cadenas*/
		long tiempo_inicio2 = System.nanoTime();
		String txt2 = "";
		
		for(int i = 0; i < 1000; i++)
		{
			txt2 += "a";
		}
		
		long tiempo_final2 = System.nanoTime();
		System.out.println("Diferencia con concatenacion: " + (tiempo_final2 - tiempo_inicio2));
	}
}
