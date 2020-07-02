package calculadoraTarea;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

public class Ventana extends JFrame{
	 public Ventana() {
		 
		 this.setTitle("Calculadora");
		 this.setSize(325,450);
		 this.setLocationRelativeTo(null);
		 
		 iniciarComponentes();
		 
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }
	 
	 private void iniciarComponentes() {
		 JPanel panel = new JPanel();
		 
		 panel.setLayout(null);
		 
		 
		 //Pantalla de Operaciones
		 
		 JTextField operadorTexto = new JTextField();
		 operadorTexto.setBounds(0,0,310,150);
		 operadorTexto.setFont(operadorTexto.getFont().deriveFont(50f));
		 panel.add(operadorTexto);
		 
		 //Controles
		 
		 JButton botonSumar = new JButton();
		 botonSumar.setBounds(232,175,70,50);
		 botonSumar.setText("+");
		 panel.add(botonSumar);
		 
		 JButton botonRestar = new JButton();
		 botonRestar.setBounds(232,232,70,50);
		 botonRestar.setText("-");
		 panel.add(botonRestar);
		 
		 JButton botonMult = new JButton();
		 botonMult.setBounds(232, 290, 70, 50);
		 botonMult.setText("*");
		 panel.add(botonMult);
		 
		 JButton botonDiv = new JButton();
		 botonDiv.setBounds(156, 348, 70, 50);
		 botonDiv.setText("/");
		 panel.add(botonDiv);
		 
		 JButton botonMod = new JButton();
		 botonMod.setBounds(5,348,70,50);
		 botonMod.setText("%");
		 panel.add(botonMod);
		 
		 JButton botonIgual = new JButton();
		 botonIgual.setBounds(232, 348, 70, 50);
		 botonIgual.setText("=");
		 panel.add(botonIgual);
		 
		 //Numeros
		 JButton boton1 = new JButton();
		 boton1.setBounds(5,175,70,50);
		 boton1.setText("1");
		 panel.add(boton1);
		 
		 JButton boton2 = new JButton();
		 boton2.setBounds(80,175,70,50);
		 boton2.setText("2");
		 panel.add(boton2);
		 
		 JButton boton3 = new JButton();
		 boton3.setBounds(156,175,70,50);
		 boton3.setText("3");
		 panel.add(boton3);
		 
		 JButton boton4 = new JButton();
		 boton4.setBounds(5,232,70,50);
		 boton4.setText("4");
		 panel.add(boton4);
		 
		 JButton boton5 = new JButton();
		 boton5.setBounds(80,232,70,50);
		 boton5.setText("5");
		 panel.add(boton5);
		 
		 JButton boton6 = new JButton();
		 boton6.setBounds(156,232,70,50);
		 boton6.setText("6");
		 panel.add(boton6);
		 
		 JButton boton7 = new JButton();
		 boton7.setBounds(5,290,70,50);
		 boton7.setText("7");
		 panel.add(boton7);
		 
		 JButton boton8 = new JButton();
		 boton8.setBounds(80,290,70,50);
		 boton8.setText("8");
		 panel.add(boton8);
		 
		 JButton boton9 = new JButton();
		 panel.add(boton9);
		 boton9.setText("9");
		 boton9.setBounds(156,290,70,50);
		 
		 JButton boton0 = new JButton();
		 boton0.setBounds(80,348,70,50);
		 boton0.setText("0");
		 panel.add(boton0);
		 
		 
		 this.getContentPane().add(panel);
	 }
}
