
public class Rectangulo implements Figurasgeometricas {
	private String name;
	private double base;
	private double altura;
	
	public Rectangulo(String name, double base, double altura) {
		this.name = name;
		this.base = base;
		this.altura = altura;
	} // Constructor Rectangulo
	
	public double calcularArea() {
		return (getBase() * getAltura());
	} // calcularArea
	
	public double calcularPerimetro() {
		return (2*getBase())+(2*getAltura());
	} // calcularPerimetro

	public String getName() {
		return name;
	} // getName
	public void setName(String name) {
		this.name = name;
	} // setName

	public double getBase() {
		return base;
	} // getBase
	public void setBase(double base) {
		this.base = base;
	} // setBase

	public double getAltura() {
		return altura;
	} // getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	} // setAltura

	@Override
	public String toString() {
		return "Rectangulo [ Nombre= " + name + ", Base= " + base + ", Altura= " + altura + " ]";
	} // toString
	

} // class Rectangulo
