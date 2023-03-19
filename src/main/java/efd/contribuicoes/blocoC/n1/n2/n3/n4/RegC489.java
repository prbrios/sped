package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC489 implements Serializable {
	private static final long serialVersionUID = -7232618218688916515L;

	@Inclui
	private final String reg = "C489";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegC489(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegC489(){}

    public String getReg() {
        return reg;
    }

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public String getIndProc() {
        return indProc;
    }

    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }
    

}
