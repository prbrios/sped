package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegK292 implements Serializable {
	private static final long serialVersionUID = 8990291766154464409L;

	@Inclui
    private final String reg = "K292";

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    public RegK292(String codItem, BigDecimal qtd) {
        this.codItem = codItem;
        this.qtd = qtd;
    }

    public RegK292(){}

    public String getReg() {
        return reg;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }
    
}