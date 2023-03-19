package efd.contribuicoes.blocoP.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegP199 implements Serializable {
	private static final long serialVersionUID = -7462979354333127112L;

	@Inclui
	private final String reg = "P199";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegP199(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegP199(){}

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
