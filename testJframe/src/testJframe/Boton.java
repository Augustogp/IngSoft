package testJframe;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Boton extends JButton implements ActionListener{
	
	ImageIcon X,O;
	byte valor = 0;
	/*
	 * 0: nada
	 * 1: X, es decir, disparo fallido
	 * 2: O, es decir, disparo acertado
	 */
	static int indice = 0;
	private int numero;

	public Boton() {
		X = new ImageIcon(this.getClass().getResource("cruz.jpg"));
		O = new ImageIcon(this.getClass().getResource("circulo.png"));
		this.addActionListener(this);
		numero = ++indice;
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("pulsaste el boton " + numero);
		int max = 2; 
        int min = 0; 
        int range = max - min + 1;
		int estado = (int)(Math.random()*range) + min;
		switch(estado) {
			case 0: setIcon(null); break;
			case 1: setIcon(X); break;
			case 2: setIcon(O); break;
			default: System.out.println("Esto no tiene que salir");
		}
	}
}
