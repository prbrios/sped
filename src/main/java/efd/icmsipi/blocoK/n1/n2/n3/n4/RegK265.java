package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegK265 implements Serializable {
	private static final long serialVersionUID = 6029454640830596652L;

	@Inclui
    private final String reg = "K265";

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCons;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdRet;

    public RegK265(String codItem, BigDecimal qtdCons, BigDecimal qtdRet) {
        this.codItem = codItem;
        this.qtdCons = qtdCons;
        this.qtdRet = qtdRet;
    }

    public RegK265(){}

    public String getReg() {
        return reg;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtdCons() {
        return qtdCons;
    }

    public void setQtdCons(BigDecimal qtdCons) {
        this.qtdCons = qtdCons;
    }

    public BigDecimal getQtdRet() {
        return qtdRet;
    }

    public void setQtdRet(BigDecimal qtdRet) {
        this.qtdRet = qtdRet;
    }
    
}