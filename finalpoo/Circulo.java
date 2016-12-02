
public class Circulo extends FigurasGeometricas{
	
	private int radio;

	public Circulo(int pRadio) {
		super();
		radio = pRadio;
	}
	
	public void calcularArea()
	{
		System.out.println("El Area del circulo es "+ (radio*radio));
	}

}
