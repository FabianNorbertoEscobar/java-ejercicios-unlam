package mountainLike;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File entrada = new File("entrada.in");
		File salida = new File("salida.out");
		Monta�aComo monta�a = new Monta�aComo(entrada, salida);
		monta�a.resolver();
	}
}
