package mountainLike;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File entrada = new File("entrada.in");
		File salida = new File("salida.out");
		MontañaComo montaña = new MontañaComo(entrada, salida);
		montaña.resolver();
	}
}
