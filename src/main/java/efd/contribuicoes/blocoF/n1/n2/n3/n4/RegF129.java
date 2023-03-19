package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegF129 implements Serializable {
	private static final long serialVersionUID = -3412460533323227533L;

	@Inclui
	private final String reg = "F129";

    @Inclui
    private String numProc;

    @Inclui
    private String indproc;

    public RegF129(String numProc, String indproc) {
        this.numProc = numProc;
        this.indproc = indproc;
    }

    public RegF129(){}

    public String getReg() {
        return reg;
    }

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public String getIndproc() {
        return indproc;
    }

    public void setIndproc(String indproc) {
        this.indproc = indproc;
    }
    
}
