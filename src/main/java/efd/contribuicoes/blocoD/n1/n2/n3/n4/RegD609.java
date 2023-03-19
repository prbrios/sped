package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegD609 implements Serializable {
	private static final long serialVersionUID = -6905754357023203976L;

	@Inclui
	private final String reg = "D609";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegD609(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegD609(){}

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
