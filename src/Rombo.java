
public class Rombo implements Figurasgeometricas {
	private String name;
	private double lado;
	private double diagonal1;
	private double diagonal2;

	
	
	public Rombo(String name, double lado, double diagonal1, double diagonal2) {
		this.name = name;
		this.lado = lado;
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}// Constructor Rombo

	public double calcularArea() {
		return (getDiagonal1() * getDiagonal2()/2);
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

	public double getDiagonal1() {
		return diagonal1;
	} // getDiagonal1
	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	} // setDiagonal1

	public double getDiagonal2() {
		return diagonal2;
	} // getDiagonal2
	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	} // setDiagonal2

	@Override
	public String toString() {
		return "Rombo [ Nombre= " + name + ", Lados= " + lado + ", Diagonal menor= " + diagonal1 + ", Diagonal mayor= " + diagonal2 + " ]";
	} // toString
	

} // class Rombo
