package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC197 implements Serializable {
	private static final long serialVersionUID = -7856499839393827407L;

	@Inclui
    private final String reg = "C197";

    @Inclui
    private String codAj;

    @Inclui
    private String descrComplAj;

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlOutros;

    public RegC197(String codAj, String descrComplAj, String codItem, BigDecimal vlBcIcms, BigDecimal aliqIcms, BigDecimal vlIcms, BigDecimal vlOutros) {
        this.codAj = codAj;
        this.descrComplAj = descrComplAj;
        this.codItem = codItem;
        this.vlBcIcms = vlBcIcms;
        this.aliqIcms = aliqIcms;
        this.vlIcms = vlIcms;
        this.vlOutros = vlOutros;
    }

    public RegC197(){}

    public String getReg() {
        return reg;
    }

    public String getCodAj() {
        return codAj;
    }

    public void setCodAj(String codAj) {
        this.codAj = codAj;
    }

    public String getDescrComplAj() {
        return descrComplAj;
    }

    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlOutros() {
        return vlOutros;
    }

    public void setVlOutros(BigDecimal vlOutros) {
        this.vlOutros = vlOutros;
    }
    
}
