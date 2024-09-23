
public class Cuadrado implements Figurasgeometricas {
	private String name;
	private double lado;
	
	public Cuadrado(String name, double lado) {
		this.name = name;
		this.lado = lado;
	} // Constructor Cuadrado
	
	public double calcularArea() {
		return (getLado() * getLado());
	} // calcularArea
	
	public double calcularPerimetro() {
		return 4*getLado();
	} // calcularPerimetro

	public String getName() {
		return name;
	} // getName
	public void setName(String name) {
		this.name = name;
	} // setName

	public double getLado() {
		return lado;
	} // getLado
	public void setLado(double lado) {
		this.lado = lado;
	} // setLado

	@Override
	public String toString() {
		return "Cuadrado [ Nombre= " + name + ", Lados= " + lado + " ]";
	} // toString
	
	
	
} // class Cuadrado
