package efd.contribuicoes.bloco9.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg9990 implements Serializable {
	private static final long serialVersionUID = -4292130050846116038L;

	@Inclui
	private final String reg = "9990";
    
    @Inclui
    private Integer qtdLin9;

    public Reg9990(Integer qtdLin9) {
        this.qtdLin9 = qtdLin9;
    }

    public Reg9990(){ }

    public String getReg() {
        return reg;
    }

    public Integer getQtdLin9() {
        return qtdLin9;
    }

    public void setQtdLin9(Integer qtdLin9) {
        this.qtdLin9 = qtdLin9;
    }
    
}
