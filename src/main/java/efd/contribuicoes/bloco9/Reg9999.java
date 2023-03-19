package efd.contribuicoes.bloco9;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg9999 implements Serializable {
	private static final long serialVersionUID = 4510978281110323149L;

	@Inclui
	private final String reg = "9999";
    
    @Inclui
    private Integer qtdLin;

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
