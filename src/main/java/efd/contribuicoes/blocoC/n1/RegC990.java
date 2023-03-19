package efd.contribuicoes.blocoC.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC990 implements Serializable {
	private static final long serialVersionUID = -3886260134348675098L;

	@Inclui
	private final String reg = "C990";

    @Inclui
    private Integer qtdLinC;

    public RegC990(Integer qtdLinC) {
        this.qtdLinC = qtdLinC;
    }

    public RegC990(){ }

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinC() {
        return qtdLinC;
    }

    public void setQtdLinC(Integer qtdLinC) {
        this.qtdLinC = qtdLinC;
    }
    
}
