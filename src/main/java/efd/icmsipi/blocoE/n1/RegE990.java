package efd.icmsipi.blocoE.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegE990 implements Serializable {
	private static final long serialVersionUID = 3521234745114709229L;

	@Inclui
    private final String reg = "E990";

    @Inclui
    private Integer qtdLinE;

    public RegE990(Integer qtdLinE) {
        this.qtdLinE = qtdLinE;
    }

    public RegE990(){}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinE() {
        return qtdLinE;
    }

    public void setQtdLinE(Integer qtdLinE) {
        this.qtdLinE = qtdLinE;
    }
    
}