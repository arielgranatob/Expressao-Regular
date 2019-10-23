package roteiroautomatos;

public class RoteiroAutomatos {

    public static void main(String[] args) {
        ExpressaoRegular ER = new ExpressaoRegular();

        ER.confere(ER.DATA, "1/7/1996");
        ER.confere(ER.VETOR, "vetor[indice5]");
    }

}
