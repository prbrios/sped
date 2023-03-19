package efd.contribuicoes.blocoM.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegM990 implements Serializable {
	private static final long serialVersionUID = 3477043355053762104L;

	@Inclui
    private final String reg = "M990";

    @Inclui
    private Integer qtdLinM;

    public RegM990(Integer qtdLinM) {
        this.qtdLinM = qtdLinM;
    }

    public RegM990(){}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinM() {
        return qtdLinM;
    }

    public void setQtdLinM(Integer qtdLinM) {
        this.qtdLinM = qtdLinM;
    }
    
}
