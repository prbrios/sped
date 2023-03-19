package efd.icmsipi.blocoH.n1;

import efd.anotacoes.Inclui;

import java.io.Serializable;

public class RegH990 implements Serializable {
	private static final long serialVersionUID = 6713190012473513999L;

	@Inclui
    private final String reg = "H990";

    @Inclui
    private Integer qtdLinH;

    public RegH990(Integer qtdLinH) {
        this.qtdLinH = qtdLinH;
    }

    public RegH990(){}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinH() {
        return qtdLinH;
    }

    public void setQtdLinH(Integer qtdLinH) {
        this.qtdLinH = qtdLinH;
    }
    
}