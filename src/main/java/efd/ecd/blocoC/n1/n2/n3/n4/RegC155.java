package efd.ecd.blocoC.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;

public class RegC155 implements Serializable {
	private static final long serialVersionUID = 54202026575163382L;

	@Inclui
    private final String reg = "C155";

    @Inclui
    private String codCtaRec;

    @Inclui
    private String codCcusRec;

    @Inclui
    private BigDecimal vlSldIniRec;

    @Inclui
    private String indDcIniRec;

    @Inclui
    private BigDecimal vlDebRec;

    @Inclui
    private BigDecimal vlCredRec;

    @Inclui
    private BigDecimal vlSldFinRec;

    @Inclui
    private String indDcFinRec;

    public RegC155(String codCtaRec, String codCcusRec, BigDecimal vlSldIniRec, String indDcIniRec, BigDecimal vlDebRec,
            BigDecimal vlCredRec, BigDecimal vlSldFinRec, String indDcFinRec) {
        this.codCtaRec = codCtaRec;
        this.codCcusRec = codCcusRec;
        this.vlSldIniRec = vlSldIniRec;
        this.indDcIniRec = indDcIniRec;
        this.vlDebRec = vlDebRec;
        this.vlCredRec = vlCredRec;
        this.vlSldFinRec = vlSldFinRec;
        this.indDcFinRec = indDcFinRec;
    }
    
    public RegC155() {}

    public String getReg() {
        return reg;
    }

    public String getCodCtaRec() {
        return codCtaRec;
    }

    public void setCodCtaRec(String codCtaRec) {
        this.codCtaRec = codCtaRec;
    }

    public String getCodCcusRec() {
        return codCcusRec;
    }

    public void setCodCcusRec(String codCcusRec) {
        this.codCcusRec = codCcusRec;
    }

    public BigDecimal getVlSldIniRec() {
        return vlSldIniRec;
    }

    public void setVlSldIniRec(BigDecimal vlSldIniRec) {
        this.vlSldIniRec = vlSldIniRec;
    }

    public String getIndDcIniRec() {
        return indDcIniRec;
    }

    public void setIndDcIniRec(String indDcIniRec) {
        this.indDcIniRec = indDcIniRec;
    }

    public BigDecimal getVlDebRec() {
        return vlDebRec;
    }

    public void setVlDebRec(BigDecimal vlDebRec) {
        this.vlDebRec = vlDebRec;
    }

    public BigDecimal getVlCredRec() {
        return vlCredRec;
    }

    public void setVlCredRec(BigDecimal vlCredRec) {
        this.vlCredRec = vlCredRec;
    }

    public BigDecimal getVlSldFinRec() {
        return vlSldFinRec;
    }

    public void setVlSldFinRec(BigDecimal vlSldFinRec) {
        this.vlSldFinRec = vlSldFinRec;
    }

    public String getIndDcFinRec() {
        return indDcFinRec;
    }

    public void setIndDcFinRec(String indDcFinRec) {
        this.indDcFinRec = indDcFinRec;
    }
    

}
