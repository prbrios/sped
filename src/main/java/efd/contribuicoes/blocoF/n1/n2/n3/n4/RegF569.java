package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegF569 implements Serializable {
	private static final long serialVersionUID = -7480206937499185000L;

	@Inclui
	private final String reg = "F569";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegF569(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegF569(){}

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
