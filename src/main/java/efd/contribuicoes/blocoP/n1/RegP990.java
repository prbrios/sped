package efd.contribuicoes.blocoP.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegP990 implements Serializable {
	private static final long serialVersionUID = 5770929494801424209L;

	@Inclui
	private final String reg = "P990";

    @Inclui
    private Integer qtdLinP;

    public RegP990(Integer qtdLinP) {
        this.qtdLinP = qtdLinP;
    }

    public RegP990(){}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinP() {
        return qtdLinP;
    }

    public void setQtdLinP(Integer qtdLinP) {
        this.qtdLinP = qtdLinP;
    }
    
}
