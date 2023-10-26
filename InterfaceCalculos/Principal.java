package InterfaceCalculos;

public class Principal {
	public static void main(String[] args) {
		
		Calculando calc = new Calculando ();
		System.out.println(calc.somar(10, 35));
		System.out.println(	calc.sub(45, 25));
		System.out.println(	calc.mult(20, 35));
		System.out.println(calc.div(65, 4));
		System.out.println(calc.exp(15, 5));
		
	

	}

}
