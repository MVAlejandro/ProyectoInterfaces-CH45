
public class Trapecio implements Figurasgeometricas {
	private String name;
	private double base1;
	private double base2;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	
	
	
	public Trapecio(String name, double base1, double base2, double altura, double lado1, double lado2, double lado3,
			double lado4) {
		this.name = name;
		this.base1 = base1;
		this.base2 = base2;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	} // // Constructor Trapecio

	public double calcularArea() {
		return (getAltura()*(getBase1()+getBase2()))/2;
	} // calcularArea
	
	public double calcularPerimetro() {
		return (getLado1()+getLado2()+getLado3()+getLado4());
	} // calcularPerimetro
	
	public String getName() {
		return name;
	} // getName
	public void setName(String name) {
		this.name = name;
	} // setName
	
	public double getBase1() {
		return base1;
	} // getBase1
	public void setBase1(double base1) {
		this.base1 = base1;
	} // setBase1

	public double getBase2() {
		return base2;
	} // getBase2
	public void setBase2(double base2) {
		this.base2 = base2;
	} // setBase2

	public double getAltura() {
		return altura;
	} // getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	} // setAltura
	
	public double getLado1() {
		return lado1;
	} // getLado1
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	} // setLado1
	
	public double getLado2() {
		return lado2;
	} // getLado2
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	} // setLado2
	
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	} // setLado3
	
	public double getLado4() {
		return lado4;
	} // getLado4
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	} // setLado4

	@Override
	public String toString() {
		return "Trapecio [ Nombre= " + name + ", Base menor= " + base1 + ", Base mayor= " + base2 + ", Altura= " + altura + ", Lado 1= "
				+ lado1 + ", Lado 2= " + lado2 + ", Lado 3= " + lado3 + ", Lado 4= " + lado4 + " ]";
	} // toString
	

} // class Trapecio
