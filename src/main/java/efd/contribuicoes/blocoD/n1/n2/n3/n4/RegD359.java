package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegD359 implements Serializable {
	private static final long serialVersionUID = 9196804214399173201L;

	@Inclui
	private final String reg = "D359";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegD359(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegD359(){}

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
