package java_stack;

public class Flujo {
	public static void main(String[] args) {
		System.out.println("inicio de la clase main");
		try {
			m1();
		} catch (ArithmeticException | NullPointerException | MiExcepcion ex) {
			String msg = ex.getMessage();

			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("fin de la clase main");
	}

	public static void m1() {
		System.out.println("Inicio de la clase m1");

		try {
			m2();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}

		System.out.println("fin de la clase m2");

	}

	public static void m2() {
		System.out.println("inicio de la clase m2");
		throw new MiExcepcion("Ha ocurrido una excepcion");
	}
}
