package efd.ecd.bloco0.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0990 implements Serializable {
	private static final long serialVersionUID = 8694502670024389435L;

	@Inclui
    private final String reg = "0990";

    @Inclui
    private Integer qtdLin0;

    public Reg0990(Integer qtdLin0) {
        this.qtdLin0 = qtdLin0;
    }

    public Reg0990(){}

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
