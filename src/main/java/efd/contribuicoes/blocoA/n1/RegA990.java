package efd.contribuicoes.blocoA.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegA990 implements Serializable {
	private static final long serialVersionUID = 8379582393098418376L;

	@Inclui
	private final String reg = "A990";

    @Inclui
    private Integer qtdLinA;

    public RegA990(Integer qtdLinA) {
        this.qtdLinA = qtdLinA;
    }

    public RegA990(){ }

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinA() {
        return qtdLinA;
    }

    public void setQtdLinA(Integer qtdLinA) {
        this.qtdLinA = qtdLinA;
    }
    
}
