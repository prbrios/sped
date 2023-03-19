package efd.contribuicoes.blocoF.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegF990 implements Serializable {
	private static final long serialVersionUID = 3717448237130392298L;

	@Inclui
	private final String reg = "F990";

    @Inclui
    private Integer qtdLinF;

    public RegF990(Integer qtdLinF) {
        this.qtdLinF = qtdLinF;
    }

    public RegF990(){}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinF() {
        return qtdLinF;
    }

    public void setQtdLinF(Integer qtdLinF) {
        this.qtdLinF = qtdLinF;
    }
    
}
