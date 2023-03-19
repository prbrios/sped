package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegD309 implements Serializable {
	private static final long serialVersionUID = -4484227092043810791L;

	@Inclui
	private final String reg = "D309";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegD309(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegD309(){}

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
