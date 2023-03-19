package efd.contribuicoes.bloco1.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg1990 implements Serializable {
	private static final long serialVersionUID = -3125801279428614262L;

	@Inclui
	private final String reg = "1990";

    @Inclui
    private Integer qtdLin1;

    public Reg1990(Integer qtdLin1) {
        this.qtdLin1 = qtdLin1;
    }

    public Reg1990(){ }

    public String getReg() {
        return reg;
    }

    public Integer getQtdLin1() {
        return qtdLin1;
    }

    public void setQtdLin1(Integer qtdLin1) {
        this.qtdLin1 = qtdLin1;
    }
    
}
