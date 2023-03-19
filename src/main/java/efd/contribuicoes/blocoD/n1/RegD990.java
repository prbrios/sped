package efd.contribuicoes.blocoD.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegD990 implements Serializable {
	private static final long serialVersionUID = 3643664653031451364L;

	@Inclui
	private final String reg = "D990";

    @Inclui
    private Integer qtdLinD;


    public RegD990(Integer qtdLinD) {
        this.qtdLinD = qtdLinD;
    }

    public RegD990(){}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinD() {
        return qtdLinD;
    }

    public void setQtdLinD(Integer qtdLinD) {
        this.qtdLinD = qtdLinD;
    }
    
}
