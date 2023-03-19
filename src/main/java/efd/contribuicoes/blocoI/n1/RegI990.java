package efd.contribuicoes.blocoI.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegI990 implements Serializable {
	private static final long serialVersionUID = 6296626116212521111L;

	@Inclui
	private final String reg = "I990";

    @Inclui
    private Integer qtdLinI;

    public RegI990(Integer qtdLinI) {
        this.qtdLinI = qtdLinI;
    }

    public RegI990(){}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinI() {
        return qtdLinI;
    }

    public void setQtdLinI(Integer qtdLinI) {
        this.qtdLinI = qtdLinI;
    }
    
}
