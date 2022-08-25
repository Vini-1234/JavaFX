package calculadora;


import javafx.scene.layout.*;

public class Teclado extends GridPane{

	private float aux = 0;
	private String mode = "";
	
	
	private Botao bot1 = new Botao(1,this,"grayButton");
	private Botao bot2 = new Botao(2,this,"grayButton");
	private Botao bot3 = new Botao(3,this,"grayButton");
	private Botao bot4 = new Botao(4,this,"grayButton");
	private Botao bot5 = new Botao(5,this,"grayButton");
	private Botao bot6 = new Botao(6,this,"grayButton");
	private Botao bot7 = new Botao(7,this,"grayButton");
	private Botao bot8 = new Botao(8,this,"grayButton");
	private Botao bot9 = new Botao(9,this,"grayButton");
	private Botao bot0 = new Botao(0,this,"grayButton");
	
	private Botao soma = new Botao("+",this);
	private Botao sub = new Botao("-",this);
	private Botao mult = new Botao("x",this);
	private Botao div = new Botao("÷",this);
	private Botao negate = new Botao("+/-",this,"grayButton");
	private Botao rest = new Botao("%",this);
	
	private Botao reset = new Botao("AC",this);
	private Botao clear = new Botao("<x",this);
	
	private Botao result = new Botao("=",this,"yellowButton");
	private Botao virg = new Botao(".",this,"grayButton");
	
	Display display;
	
	public Teclado(Display dis) {
		display = dis;
		setHgap(2);
		setVgap(2);
		
		this.add(reset,0,0);
		this.add(clear,2,0);
		
		this.add(bot0,1,4);
		this.add(bot1,0,3);
		this.add(bot2,1,3);
		this.add(bot3,2,3);
		this.add(bot4,0,2);
		this.add(bot5,1,2);
		this.add(bot6,2,2);
		this.add(bot7,0,1);
		this.add(bot8,1,1);
		this.add(bot9,2,1);
		
		this.add(rest,1,0);
		this.add(soma,3,0);
		this.add(sub,3,1);
		this.add(mult,3,2);
		this.add(div,3,3);
		
		this.add(result,3,4);
		this.add(virg,2,4);
		this.add(negate,0,4);
		
		
	}
	public Display GetDisplay() {
		return display;
	}
	

	public float GetAux() {
		return aux;
	}
	
	public void SetAux(float auxiliar) {
		aux = auxiliar;
	}

	
	public String GetMode() {
		return mode;
	}
	
	public void SetMode(String modesign) {
		mode = modesign;
	}
	
	public void Reset() {
		display.Clear();
		aux = 0;
	}
	
}
