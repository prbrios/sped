package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC111 implements Serializable {
	private static final long serialVersionUID = 544973953992824610L;

	@Inclui
    private final String reg = "C111";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegC111(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegC111(){}

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
