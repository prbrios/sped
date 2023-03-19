package efd.ecd.blocoK.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegK990 implements Serializable {
	private static final long serialVersionUID = -3534852196826148127L;

	@Inclui
    private final String reg = "K990";

    @Inclui
    private Integer qtdLinK;

    public RegK990(Integer qtdLinK) {
        this.qtdLinK = qtdLinK;
    }

    public RegK990() {}

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinK() {
        return qtdLinK;
    }

    public void setQtdLinK(Integer qtdLinK) {
        this.qtdLinK = qtdLinK;
    }

}
