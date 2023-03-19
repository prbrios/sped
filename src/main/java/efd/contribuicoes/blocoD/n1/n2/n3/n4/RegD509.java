package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegD509 implements Serializable {
	private static final long serialVersionUID = 6822711940729263025L;

	@Inclui
	private final String reg = "D509";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegD509(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegD509(){}

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
