package efd.icmsipi.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0460 implements Serializable {
	private static final long serialVersionUID = 2106408951709503523L;

	@Inclui
    private final String reg = "0460";

    @Inclui
    private String codObs;

    @Inclui
    private String txt;

    public Reg0460(String codObs, String txt) {
        this.codObs = codObs;
        this.txt = txt;
    }

    public Reg0460(){}

    public String getReg() {
        return reg;
    }

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
    
}
