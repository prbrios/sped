package efd.icmsipi.blocoB.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegB990 implements Serializable {
	private static final long serialVersionUID = 5768048010076714442L;

	@Inclui
    private final String reg = "B990";

    @Inclui
    private Integer qtdLinB;

    public RegB990(Integer qtdLinB) {
        this.qtdLinB = qtdLinB;
    }

    public RegB990(){}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinB() {
        return qtdLinB;
    }

    public void setQtdLinB(Integer qtdLinB) {
        this.qtdLinB = qtdLinB;
    }
    
}
