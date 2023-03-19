package efd.ecd.blocoC.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC990 implements Serializable {
	private static final long serialVersionUID = 6111131976646086940L;

	@Inclui
    private final String reg = "C990";

    @Inclui
    private Integer qtdLin0;

    public RegC990(Integer qtdLin0) {
        this.qtdLin0 = qtdLin0;
    }

    public RegC990(){}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLin0() {
        return qtdLin0;
    }

    public void setQtdLin0(Integer qtdLin0) {
        this.qtdLin0 = qtdLin0;
    }
    
    
}
