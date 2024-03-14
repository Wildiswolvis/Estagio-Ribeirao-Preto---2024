
public class InverterTexto {
	public static String inverterString(String texto) {
		char[] caracteres = texto.toCharArray();
		int inicio = 0;
		int fim = caracteres.length - 1;
		while(inicio < fim) {
			char temp = caracteres[inicio];
			caracteres[inicio] = caracteres[fim];
			caracteres[fim] = temp;
			inicio++;
			fim--;
		}
		return new String(caracteres);
	}
	
	public static void main(String[] args) {
		String texto = "Hello, World!";
		String textoInvertido = inverterString(texto);
		System.out.println(textoInvertido);
	}

}
