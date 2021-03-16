package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	public int precio=500;
	public boolean estado;
	private int volumen=1;
	private Control control;
	private int numTv=0;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTv++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		while(estado==true) {
			if(this.canal>1) {
			this.canal = canal++;
			}
		}
	}
	
	public void canalDown() {
		while(estado==true) {
			if(this.canal<120) {
			this.canal = canal++;
			}
		}
	}
	
	public void volumenUp() {
		while(estado==true) {
			if(this.volumen<7) {
			this.volumen = volumen++;
			}
		}
	}
	
	public void volumenDown() {
		while(estado==true) {
			if(this.volumen>0) {
			this.volumen = volumen--;
			}
		}
	}
	
	public int getNumTv() {
		return numTv;
	}
	
	public void turnOn() {
		estado=true;
	}
	
	public void turnOff() {
		estado=false;
	}
	
}
