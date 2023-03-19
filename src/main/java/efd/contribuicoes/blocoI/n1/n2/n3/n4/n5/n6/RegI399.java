package efd.contribuicoes.blocoI.n1.n2.n3.n4.n5.n6;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegI399 implements Serializable {
	private static final long serialVersionUID = -3530322411828160404L;

	@Inclui
	private final String reg = "I399";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegI399(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegI399(){}

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
