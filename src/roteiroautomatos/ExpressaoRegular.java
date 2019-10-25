package roteiroautomatos;

public class ExpressaoRegular {

    public String BRANCO, BRANCOS, REAL, DIA, MES, DATA, DESIGNADOR, PONTO, DECLARACAO_FUNCAO, PARAMETROS, RETORNO;
    public String DIGITO, DIGITOS, FRACAO;
    public String LETRA, LETRAS, QUANTIDADEPARDEA, VARIAVEL, INTEIRO, EXPONENCIAL, VETOR, INTERIOR_VETOR;

    public ExpressaoRegular() {

        BRANCO = "(\\s)";
        BRANCOS = BRANCO + "*";
        DIGITO = "([0-9])";
        DIGITOS = "(" + DIGITO + "*)";
        LETRA = "([A-Za-z])";
        LETRAS = "(" + LETRA + "*)";
        VARIAVEL = "(" + LETRA + "(" + LETRA + "|" + DIGITO + ")*)";
        INTEIRO = "((-?|\\+?" + DIGITOS + ")";
        EXPONENCIAL = "(E(-?|\\+?)" + DIGITOS + ")";
        FRACAO = "(\\." + DIGITOS + ")";
        REAL = "(" + DIGITOS + FRACAO + "?" + EXPONENCIAL + "?)";
        DIA = "(1|2|3|4|5)";
        MES = "(1|2|3|4|5|6|7|8|9|10|11|12)";
        DATA = DIA + "\\/" + MES + "\\/" + DIGITO + DIGITO + DIGITO + DIGITO;
        VETOR = VARIAVEL + "\\[((" + (DIGITO + ")+|" + VARIAVEL) + ")\\]";
        PONTO = ".?";

        DESIGNADOR = (VARIAVEL + PONTO + VARIAVEL) + "+(" + PONTO + VARIAVEL + ")*(\\[(" + DIGITO + "+|" + VARIAVEL + "(" + PONTO + "" + VARIAVEL + ")*)\\])*(" + PONTO + VARIAVEL + ")*";

        PARAMETROS = "\\(" + LETRAS + "\\s" + VARIAVEL + "(\\,\\s" + LETRAS + "\\s" + VARIAVEL + ")*\\)";
        DECLARACAO_FUNCAO = VARIAVEL + "\\s" + VARIAVEL + PARAMETROS + ";";

        RETORNO = VARIAVEL + "\\(" + DIGITOS + "(\\," + DIGITOS + "|" + VARIAVEL + ")*\\);";
    }

    public void confere(String exp, String sentenca) {
        if ((sentenca != null) && !sentenca.isEmpty()) {
            if ((sentenca != null) && !sentenca.isEmpty()) {
                if (sentenca.matches(exp)) {
                    System.out.println("W: '" + sentenca + "' ACEITA!");
                } else {
                    System.err.println("W: '" + sentenca + "' REJEITA!");
                }
            } else {
                System.err.println("Sentença vazia.");
            }
        }
    }

}
