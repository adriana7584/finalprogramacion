
public class Carro {
	
	// se coloca el tipo de acceso private para que el acceso a estas variables sean
	//solo por medio de funciones get y set
	private String marca;
	private String modelo;
	private String gasolina;
	private int consumoGasolina;
	private int kilometraje;
	private boolean movimiento = false;
	private int velocidad;
	private boolean luces = false;
	
	//constructor
	public Carro(String pMarca, String pModelo, String pGasolina, int pConsumoGasolina, int pKilometraje, boolean pMovimiento, int pVelocidad, boolean pLuces) {
		marca = pMarca;
		modelo = pModelo;
		gasolina = pGasolina;
		consumoGasolina = pConsumoGasolina;
		kilometraje = pKilometraje;
		movimiento = pMovimiento;
		velocidad = pVelocidad;
		luces = pLuces;
	}
	// no hago el retorno en esta funcion debido a que dice solo mostrar marca y modelo. una funcion solo retorna una variable asi que debe ser una muestra en pantalla
	public void getMarcaModelo()
	{
		System.out.println("La marca es :" + this.marca + "y el modelo es :" + this.modelo);
	}
	
	public void setMarcaModelo(String pMarca, String pModelo)
	{
		this.marca = pMarca;
		this.modelo = pModelo;
	}
	public void arrancar()
	{
		if(!movimiento && consumoGasolina>0)
		{
			System.out.println("Arrancando el carro");
			movimiento = true;
		}
		else
		{
			if(movimiento){
				System.out.println("el carro ya esta en movimiento");
			}
			else{
				System.out.println("el carro no tiene gasolina");
			}
		}
	}
	
	public void frenar(int porcentaje)
	{
		if( velocidad > 0)
		{
			//hago esto solo para forzar que al frenar la velocidad no sea negativa
			if( (velocidad - porcentaje) <= 0)
			{
				this.velocidad = 0;
			}
			else
			{
				this.velocidad = velocidad - porcentaje;
			}
		}
		else{
			System.out.println("la velocidad del carro es menor o igual a cero");
		}
	}
	
	public void acelerar(int pConsumoGasolina, int pKilometraje, int pVelocidad)
	{
		if(this.movimiento && this.consumoGasolina>0 )
		{
			//hago esto solo para forzar que consumoGasolina no sea negativo
			if(this.consumoGasolina - pConsumoGasolina <= 0)
			{
				this.consumoGasolina = 0;
				//como la gasolina se acaba toca cancelar el movimiento y apagar el carro
				movimiento = false;
				velocidad = 0;
			}
			else{
				this.consumoGasolina = this.consumoGasolina - pConsumoGasolina;
			}
			this.kilometraje = this.kilometraje + pKilometraje;
			this.velocidad = this.velocidad + pVelocidad;
		}
		else{
			if(!this.movimiento)
			{
				System.out.println("el carro no esta en movimiento");
			}
			else{
				System.out.println("el carro no tiene gasolina");
			}
		}
	}
	
	public void estado()
	{
		System.out.println("La marca es :" + this.marca);
		System.out.println("el modelo es :" + this.modelo);
		System.out.println("Tipo de Gasolina es :" + this.gasolina);
		System.out.println("Estado del tanque de gasolina :" + this.consumoGasolina);
		System.out.println("Kilometraje :" + this.kilometraje);
		System.out.println("Velocidad :" + this.velocidad);
		if (luces)
		{
			System.out.println("Luces prendidas");
		}
		else{
			System.out.println("Luces apagadas");
		}
	}
   public void encederLuces()
   {
	  this.luces = true; 
   }
   public void apagarLuces()
   {
	   this.luces = false;
   }
}
