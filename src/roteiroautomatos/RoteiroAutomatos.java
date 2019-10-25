package roteiroautomatos;

public class RoteiroAutomatos {

    public static void main(String[] args) {
        ExpressaoRegular ER = new ExpressaoRegular();
        ER.confere(ER.DESIGNADOR, "lista[5]");
        ER.confere(ER.DESIGNADOR, "produto.nome");
        ER.confere(ER.DESIGNADOR, "produto.livros[a].autor");
        ER.confere(ER.DESIGNADOR, "lista[ponto.x]");
        ER.confere(ER.DESIGNADOR, "produto.custo.x");
        
        ER.confere(ER.DECLARACAO_FUNCAO, "int soma(int a, int b);");
        ER.confere(ER.RETORNO, "soma(2,a);");
        ER.confere(ER.RETORNO, "soma(3,x);");

    }

}
