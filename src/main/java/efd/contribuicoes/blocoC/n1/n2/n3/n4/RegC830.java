package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC830 implements Serializable {
	private static final long serialVersionUID = -3331637152382372201L;

	@Inclui
	private final String reg = "C830";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegC830(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegC830(){ }

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
