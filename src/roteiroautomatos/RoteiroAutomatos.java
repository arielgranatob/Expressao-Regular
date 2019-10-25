package roteiroautomatos;

public class RoteiroAutomatos {

    public static void main(String[] args) {
        ExpressaoRegular ER = new ExpressaoRegular();

        ER.confere(ER.DESIGNADOR, "lista[5]");
        ER.confere(ER.DESIGNADOR, "produto.nome");
        ER.confere(ER.DESIGNADOR, "produto.livros[a].autor");
        ER.confere(ER.DESIGNADOR, "lista[ponto.x]");
        ER.confere(ER.DESIGNADOR, "produto.custo.x.a.b.d.ed.e");

    }

}
