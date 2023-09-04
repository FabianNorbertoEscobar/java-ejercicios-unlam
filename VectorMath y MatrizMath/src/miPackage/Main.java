package miPackage;

public class Main {

	public static void main(String[] args) {

		System.out.println("Clase VectorMath");

		VectorMath nulo = new VectorMath(5);
		System.out.println("Vector nulo:");
		nulo.mostrar();

		System.out.println("a:");
		VectorMath a = new VectorMath("archivos/vectorA.in");
		a.mostrar();

		System.out.println("b:");
		VectorMath b = new VectorMath("archivos/vectorB.in");
		b.mostrar();

		VectorMath c;
		double d;

		System.out.println("a + b:");
		c = a.sumar(b);
		c.mostrar();

		System.out.println("a - b:");
		c = a.restar(b);
		c.mostrar();

		System.out.println("a * b:");
		d = a.multiplicar(b);
		System.out.println(d);

		System.out.println("a * 2");
		c = a.multiplicar(2);
		c.mostrar();

		System.out.println("Norma1 de a:");
		d = a.norma1();
		System.out.println(d);

		System.out.println("Norma2 de a:");
		d = a.norma2();
		System.out.println(d);

		System.out.println("NormaInfinita de a:");
		d = a.normaInfinita();
		System.out.println(d);

		System.out.println("Se clona a en c");
		c = a.clone();

		if (a.equals(c)) {
			System.out.println("a es igual a c");
		}

		System.out.println();
		System.out.println("Clase MatrizMath");

		System.out.println("Matriz nula");
		MatrizMath nula = new MatrizMath(2, 3);
		nula.mostrar();

		System.out.println("Matriz A:");
		MatrizMath ma = new MatrizMath("archivos/matrizA.in");
		ma.mostrar();

		System.out.println("Matriz B:");
		MatrizMath mb = new MatrizMath("archivos/matrizB.in");
		mb.mostrar();

		MatrizMath mc = new MatrizMath(2, 2);

		System.out.println("Matriz A + Matriz B:");
		mc = ma.sumar(mb);
		mc.mostrar();

		System.out.println("Matriz A - Matriz B:");
		mc = ma.restar(mb);
		mc.mostrar();

		System.out.println("Matriz A * Matriz B:");
		mc = ma.multiplicar(mb);
		mc.mostrar();

		System.out.println("Matriz A * 2:");
		mc = ma.multiplicar(2);
		mc.mostrar();

		System.out.println("Norma1 de Matriz A:");
		d = ma.norma1();
		System.out.println(d);

		System.out.println("Norma2 de Matriz A:");
		d = ma.norma2();
		System.out.println(d);

		System.out.println("NormaInfinita de Matriz A:");
		d = ma.normaInfinita();
		System.out.println(d);

		System.out.println("Se clona Matriz A en Matriz C");
		mc = ma.clone();

		if (ma.equals(mc)) {
			System.out.println("Matriz A es igual a Matriz C");
		}

		System.out.println("Matriz identidad orden 3");
		MatrizMath.identidad(3).mostrar();

		System.out.println("Determinante de la Matriz A:");
		d = ma.determinante();
		System.out.println(d);

		System.out.println("Matriz inversa de A:");
		mc = ma.inversa();
		mc.mostrar();

		System.out.println("Error al invertir:");
		d = ma.errorAlInvertir();
		System.out.println(d);

		System.out.println("Vector A * Matriz Identidad:");
		c = a.multiplicar(MatrizMath.identidad(6));
		c.mostrar();

		System.out.println("Matriz Identidad * Vector A");
		c = MatrizMath.identidad(6).multiplicar(a);
		c.mostrar();

		double[][] mat = { { 3, 1, 2 }, { 3, 9, 5 }, { 1, 7, 6 } };
		MatrizMath matriz = new MatrizMath(3, 3, mat);
		MatrizMath potencia = matriz.potencia(5);
		potencia.mostrar();

		// 27651.0 83765.0 58026.0
		// 111583.0 337665.0 233801.0
		// 98869.0 299379.0 207202.0
	}
}
