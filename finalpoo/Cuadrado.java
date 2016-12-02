
public class Cuadrado extends FigurasGeometricas{
	
	private int alto;
	private int ancho;
	
	public Cuadrado(int pAlto, int pAncho) {
		//por herencia llamar al constructor de figuras geometricas por igual
		super();
		alto = pAlto;
		ancho = pAncho;
	}
	
	public void calcularArea()
	{
		System.out.println("El Area del cuadrado es "+ (alto*ancho));
	}
}
