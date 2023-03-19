package efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg1922 implements Serializable {
	private static final long serialVersionUID = -7425120055903762660L;

	@Inclui
    private final String reg = "1922";

    @Inclui
    private String numDa;

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    @Inclui
    private String proc;

    @Inclui
    private String txtCompl;

    public Reg1922(String numDa, String numProc, String indProc, String proc, String txtCompl) {
        this.numDa = numDa;
        this.numProc = numProc;
        this.indProc = indProc;
        this.proc = proc;
        this.txtCompl = txtCompl;
    }

    public Reg1922(){}

    public String getReg() {
        return reg;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
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

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }
    
}