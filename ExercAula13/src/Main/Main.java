package Main;



import Modelo.Modelo;
import Negocio.Negocio;
import Visao.Visao;

public class Main {

	public static void main(String[] args) {

		int[] array = { 54, 26, 93, 17, 77, 31, 44, 55, 20, 65 };

		Modelo model = new Modelo();
		Visao view = new Visao();
		Negocio controller = new Negocio(model, view);

		controller.iniciarBusca(array);
	}
}