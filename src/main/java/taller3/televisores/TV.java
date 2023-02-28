package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal =1;
	private int precio=500;
	private boolean estado;
	private int volumen =1;
	private Control control;
	private static int numTV = 0;
	

	//Constructor
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		TV.numTV +=1;
	}	
	//Constructor
	public TV (Marca marca, int canal, int precio, boolean estado, int volumen, Control control) {
		this.marca = marca;
		this.canal = canal;
		this.precio = precio;
		this.estado = estado;
		this.volumen = volumen;
		this.control = control;
	}
		
	
	//Method for counting TV objects
	public static int getNumTV() {
		return numTV;
	}

	
	//Change status of "estado"
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	
	//Return status of "estado"
	public boolean getEstado() {
		return estado;
	}
		
	
	//Changing channels
	public void canalUp() {
		//Conditions
		if (getEstado()) {
			if (this.canal >=1 && this.canal <120)  {
				this.canal ++;
			}
		}					
	}
	public void canalDown() {
		//Conditions
		if (getEstado()) {
			if (this.canal >1 && this.canal <=120)  {
				this.canal --;
			}
		}					
	}

	
	//Volume change
	public void volumenUp() {
		//Conditions
		if (getEstado()) {
			if (this.volumen>=0 && this.volumen<7) {
				this.volumen++;
			}
		}
	}
	public void volumenDown() {
		//Conditions
		if (getEstado()) {
			if (this.volumen>0 && this.volumen<=7) {
				this.volumen--;
			}
		}
	}

	
	
	//Getters and Setters
 	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (canal <=120 && canal>=1) {
			this.canal = canal;
		}
	}

	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		if(volumen >= 0 && volumen <=7) {
			this.volumen = volumen;
		}
	}
	
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public static void setNumTV(int n) {
		TV.numTV = n;
	} 

}