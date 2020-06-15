package testJframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// Se omite el comentario

public class VisorDeImagen 
{
	private JFrame ventana;
	private Boton botones[] = new Boton[81];
	/**
	* Crea un VisorDeImagen y lo muestra en la pantalla.
	*/
	public VisorDeImagen ()
	{
		construirVentana();
	}
	
	
	/**
	* Crea la ventana Swing y su contenido.
	*/
	private void construirVentana()
	{
		ventana = new JFrame("Batalla Naval");
		Container panelContenedor = ventana.getContentPane();
		
		panelContenedor.setLayout(new GridLayout(9, 9));
		for(int i = 0; i < 81; i++) {
			botones[i] = new Boton();
			panelContenedor.add(botones[i]);
		}
		
		construirBarraMenu();
		
		ventana.pack();
		ventana.setVisible(true);
	}
	
	
	private void construirBarraMenu() {
		JMenuBar barraDeMenu = new JMenuBar();
		ventana.setJMenuBar(barraDeMenu);
		
		JMenu menu;
		JMenuItem elemento;
		
		//Crea el menu opciones
		menu = new JMenu("Opciones");
		barraDeMenu.add(menu);
		
		elemento = new JMenuItem("Reiniciar");
		elemento.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});
		menu.add(elemento);
		
		elemento = new JMenuItem("Salir");
		elemento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		menu.add(elemento);
		
		//Crea el menu help
		menu = new JMenu("Help");
		barraDeMenu.add(menu);
		
		elemento = new JMenuItem("Acerca de");
		elemento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				help();
			}
		});
		menu.add(elemento);
		
	}


	private void reiniciar() {
		System.out.println("Soy reninciar");		
	}
	
	private void salir() {
		System.exit(0);
	}
	
	private void help()
	{
		System.out.println("Menu Ayuda");
	}
}