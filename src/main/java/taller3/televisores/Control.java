package taller3.televisores;

public class Control {
	//Attribute
	private TV tv;
		
	//Connection
	public void enlazar(TV tv1) {
		this.tv = tv1;
		this.tv.setControl(this);
	}

	//A control being control
	public void turnOff() {
		this.tv.turnOff();
	}
	public void setCanal(int i) {
		this.tv.setCanal(i);		
	}
	public void canalUp() {
		this.tv.canalUp();
	}
	public void volumenUp() {
		this.tv.volumenUp();
	}	
	public void turnOn() {
		this.tv.turnOn();
	}
	public void canalDown() {
		this.tv.canalDown();
	}
	public void volumenDown() {
		this.tv.volumenDown();
	}

	//Get and set
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public TV getTv() {
		return tv;
	}
}
