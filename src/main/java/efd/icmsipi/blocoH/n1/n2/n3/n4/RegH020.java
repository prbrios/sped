package efd.icmsipi.blocoH.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegH020 implements Serializable {
	private static final long serialVersionUID = 1872960304291722755L;

	@Inclui
    private final String reg = "H020";

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui
    private BigDecimal bcIcms;

    @Inclui
    private BigDecimal vlIcms;

    public RegH020(Integer cstIcms, BigDecimal bcIcms, BigDecimal vlIcms) {
        this.cstIcms = cstIcms;
        this.bcIcms = bcIcms;
        this.vlIcms = vlIcms;
    }

    public RegH020(){}

    public String getReg() {
        return reg;
    }

    public Integer getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(Integer cstIcms) {
        this.cstIcms = cstIcms;
    }

    public BigDecimal getBcIcms() {
        return bcIcms;
    }

    public void setBcIcms(BigDecimal bcIcms) {
        this.bcIcms = bcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }
    
}