package java_stack;

public class FlujoConError {
	public static void main(String[] args) {
		System.out.println("Inicio del main");
		try {
			m1();
		} catch (ArithmeticException | NullPointerException e) {
			String msg = e.getMessage();
			System.out.println("Exception" + msg);
			e.printStackTrace();
		}
		System.out.println("Fin del main");
	}

	private static void m1() {
		System.out.println("inicio de m1");
		m2();
		System.out.println("fin de m1");
	}

	private static void m2() {
		System.out.println("inicio de m2");
		m2();
		System.out.println("fin de m2");
	}
}
