package miPack;

public class Complejo implements Comparable<Complejo> {

	private double real;
	private double imaginario;
	
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImaginario() {
		return imaginario;
	}
	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}

	public String toString() {
		return this.real + ((this.imaginario < 0)? "-" + this.imaginario * -1 : " + " + this.imaginario) + "i";  
	}
	
	public Complejo() {
		this.real = 0;
		this.imaginario = 0;
	}
	
	public Complejo(double r,double i) {
		this.real = r;
		this.imaginario = i;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(imaginario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(real);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	public int compareTo(Complejo comp) {
		if(this.modulo() > comp.modulo())
			return 1;
		else if(this.modulo() < comp.modulo())
			return -1;
		return 0;
	}
	
	/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(imaginario) != Double.doubleToLongBits(other.imag))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}
	*/
	
	public boolean equals(Complejo comp) {
		if(this.real == comp.real) {
			if(this.imaginario == comp.imaginario)
				return true;
		}
		return false;
	}
	
	/*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	*/
	
	protected Complejo clone() {
		return new Complejo(this.real,this.imaginario);
	}
	
	public double modulo() {
		return Math.sqrt(this.real*this.real+this.imaginario*this.imaginario);
	}
	
	public Complejo sumar(Complejo comp) {
		return new Complejo(this.real + comp.real , this.imaginario + comp.imaginario);
	}
	
	public Complejo restar(Complejo comp) {
		return new Complejo(this.real - comp.real , this.imaginario - comp.imaginario);
	}
	
	public Complejo multiplicar(Complejo comp) {
		return new Complejo(this.real*comp.real - this.imaginario*comp.imaginario , this.real*comp.imaginario + this.imaginario*comp.real);
	}
	
	public Complejo dividir(Complejo comp) {
		try {
			return new Complejo((this.real*comp.real - this.imaginario*comp.imaginario) / (comp.real*comp.real + comp.imaginario*comp.imaginario) , (this.imaginario*comp.real - this.real*comp.imaginario) / (comp.real*comp.real + comp.imaginario*comp.imaginario));
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException: la división por cero es una indeterminación matemática");
			return null;
		}
	}
	
	public Complejo sumar(double num) {
		return new Complejo(this.real + num,this.imaginario);
	}
	
	public Complejo restar(double num) {
		return new Complejo(this.real - num,this.imaginario);
	}
	
	public Complejo multiplicar(double num) {
		return new Complejo(this.real* num,this.imaginario * num);
	}
	
	public Complejo dividir(double num) {
		try {
			return new Complejo(this.real / num,this.imaginario / num);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException: la división por cero es una indeterminación matemática");
			return null;
		}
	}
}
