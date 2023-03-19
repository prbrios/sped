package efd.icmsipi.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0450 implements Serializable {
	private static final long serialVersionUID = 8848760296396520604L;

	@Inclui
    private final String reg = "0450";

    @Inclui
    private String codInf;

    @Inclui
    private String txt;

    public Reg0450(String codInf, String txt) {
        this.codInf = codInf;
        this.txt = txt;
    }

    public Reg0450(){}

    public String getReg() {
        return reg;
    }

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
    

}
