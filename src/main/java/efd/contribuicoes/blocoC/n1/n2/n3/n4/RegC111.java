package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC111 implements Serializable {
	private static final long serialVersionUID = 4005141278736478108L;

	@Inclui
	private final String reg = "C111";

    @Inclui
    private String numPro;

    @Inclui
    private String indProc;

    public RegC111(String numPro, String indProc) {
        this.numPro = numPro;
        this.indProc = indProc;
    }

    public RegC111(){}

    public String getReg() {
        return reg;
    }

    public String getNumPro() {
        return numPro;
    }

    public void setNumPro(String numPro) {
        this.numPro = numPro;
    }

    public String getIndProc() {
        return indProc;
    }

    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }
    
}
