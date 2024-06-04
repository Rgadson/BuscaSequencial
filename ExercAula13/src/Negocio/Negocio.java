package Negocio;



import Modelo.Modelo;
import Visao.Visao;

public class Negocio {
	private Modelo modelo;
    private Visao visao;

    public Negocio(Modelo modelo, Visao visao) {
        this.modelo = modelo;
        this.visao = visao;
    }

    public void iniciarBusca(int[] vetor) {
        int elementoParaEncontrar = visao.solicitarElemento();
        int resultado = modelo.buscar(vetor, elementoParaEncontrar);
        visao.mostrarResultado(resultado);
    }
    
}
