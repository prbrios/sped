package efd.contribuicoes.blocoA.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegA111 implements Serializable {
	private static final long serialVersionUID = 3116332366250022833L;

	@Inclui
	private final String reg = "A111";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegA111(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegA111(){}

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
