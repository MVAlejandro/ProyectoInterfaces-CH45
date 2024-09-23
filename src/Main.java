
public class Main {

	public static void main(String[] args) {
		Triangulo t = new Triangulo("Triangulo", 20, 10, 15);
		Cuadrado c = new Cuadrado("Cuadrado", 15);
		Rectangulo re = new Rectangulo("Rectangulo", 20, 30);
		Rombo r = new Rombo("Rombo", 15, 10, 20);
		Romboide ro = new Romboide("Romboide", 30, 15);
		Trapecio tr = new Trapecio("Trapecio", 15, 20, 18, 14, 16, 14, 25);
		
		imprimirCalculo(t);
		imprimirCalculo(c);
		imprimirCalculo(re);
		imprimirCalculo(r);
		imprimirCalculo(ro);
		imprimirCalculo(tr);
		
	} // main
	
	public static void imprimirCalculo(Figurasgeometricas t) {
		System.out.println(t);
		System.out.println("+-----------------------------------------------------------------");
		System.out.println("| El área de [" + t.getName() + "] es: " + t.calcularArea());
		System.out.println("| El perímetro de [" + t.getName() + "] es: " + t.calcularPerimetro());
		System.out.println("+-----------------------------------------------------------------");
	} // imprimirCalculo

} // class Main
