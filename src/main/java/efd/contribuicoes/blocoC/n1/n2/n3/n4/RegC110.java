package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC110 implements Serializable {
	private static final long serialVersionUID = 8234729817162666043L;

	@Inclui
	private final String reg = "C110";

    @Inclui
    private String codInf;

    @Inclui
    private String txtCompl;

    public RegC110(String codInf, String txtCompl) {
        this.codInf = codInf;
        this.txtCompl = txtCompl;
    }

    public RegC110(){}

    public String getReg() {
        return reg;
    }

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }
    
}
