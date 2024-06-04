package Visao;



import javax.swing.JOptionPane;

import Modelo.Modelo;
import Negocio.Negocio;

public class Visao {

	public int solicitarElemento() {
		return Integer.parseInt(JOptionPane.showInputDialog("\nInsira o número a ser buscado: \n"));
	}

	public void mostrarResultado(int resultado) {
		if (resultado != -1) {
			System.out.println("Elemento encontrado no índice: " + resultado);
		} else {
			System.out.println("Elemento não encontrado.");
		}
	}
}
