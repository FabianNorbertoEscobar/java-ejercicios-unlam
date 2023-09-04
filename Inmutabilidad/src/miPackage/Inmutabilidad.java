package miPackage;

public class Inmutabilidad {

	public static void main(String[] args) {

		int aDato = 4;
		Integer aObjeto = 4;
		
		System.out.println("Originales");
		System.out.println(aDato);
		System.out.println(aObjeto);
		
		incrementar(aDato);
		incrementar(aObjeto);
		
		System.out.println("Incrementados");
		System.out.println(aDato);
		System.out.println(aObjeto);
		
		Integer a = 1000;
		Integer b = 1000;
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		a = 1;
		b = 1;
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
	
	public static void incrementar(int a) {
		a++;
	}
	
	public static void incrementar(Integer a) {
		a++;
	}
}
