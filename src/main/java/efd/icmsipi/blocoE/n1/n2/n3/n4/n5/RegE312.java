package efd.icmsipi.blocoE.n1.n2.n3.n4.n5;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegE312 implements Serializable {
	private static final long serialVersionUID = -3038835280151211883L;

	@Inclui
    private final String reg = "E312";

    @Inclui
    private String numDa;

    @Inclui
    private String numProc;

    @Inclui
    private Integer indProc;

    @Inclui
    private String proc;

    @Inclui
    private String txtCompl;

    public RegE312(String numDa, String numProc, Integer indProc, String proc, String txtCompl) {
        this.numDa = numDa;
        this.numProc = numProc;
        this.indProc = indProc;
        this.proc = proc;
        this.txtCompl = txtCompl;
    }

    public RegE312(){}

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

    public Integer getIndProc() {
        return indProc;
    }

    public void setIndProc(Integer indProc) {
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