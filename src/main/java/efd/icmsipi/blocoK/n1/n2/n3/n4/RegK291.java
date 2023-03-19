package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegK291 implements Serializable {
	private static final long serialVersionUID = 4330317050135163419L;

	@Inclui
    private final String reg = "K291";

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    public RegK291(String codItem, BigDecimal qtd) {
        this.codItem = codItem;
        this.qtd = qtd;
    }

    public RegK291(){}

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