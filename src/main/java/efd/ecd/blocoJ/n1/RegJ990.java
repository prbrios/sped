package efd.ecd.blocoJ.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegJ990 implements Serializable {
	private static final long serialVersionUID = -894653821521419297L;

	@Inclui
    private final String reg = "J990";

    @Inclui
    private Integer qtdLinJ;

    public RegJ990(Integer qtdLinJ) {
        this.qtdLinJ = qtdLinJ;
    }
    
    public RegJ990() {}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinJ() {
        return qtdLinJ;
    }

    public void setQtdLinJ(Integer qtdLinJ) {
        this.qtdLinJ = qtdLinJ;
    }
    

}