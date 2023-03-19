package efd.contribuicoes.bloco1.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg1809 implements Serializable {
	private static final long serialVersionUID = -1716485693254997488L;

	@Inclui
	private final String reg = "1809";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public Reg1809(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public Reg1809(){ }

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
