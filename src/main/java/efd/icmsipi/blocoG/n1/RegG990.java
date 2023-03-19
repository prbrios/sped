package efd.icmsipi.blocoG.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegG990 implements Serializable {
	private static final long serialVersionUID = 4777928991690769950L;

	@Inclui
    private final String reg = "G990";

    @Inclui
    private Integer qtdLinG;

    public RegG990(Integer qtdLinG) {
        this.qtdLinG = qtdLinG;
    }

    public RegG990(){}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinG() {
        return qtdLinG;
    }

    public void setQtdLinG(Integer qtdLinG) {
        this.qtdLinG = qtdLinG;
    }
    
}