package efd.ecd.bloco9;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg9999 implements Serializable {
	private static final long serialVersionUID = 2153684008740357390L;

	@Inclui
	private final String reg = "9999";

    @Inclui
    private Integer qtdLin;

    public Reg9999(Integer qtdLin) {
        this.qtdLin = qtdLin;
    }
    
    public Reg9999(){}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLin() {
        return qtdLin;
    }

    public void setQtdLin(Integer qtdLin) {
        this.qtdLin = qtdLin;
    }
    
}
