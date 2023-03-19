package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegB420 implements Serializable {
	private static final long serialVersionUID = 6246529471574124322L;

	@Inclui
    private final String reg = "B420";

    @Inclui
    private BigDecimal vlCont;

    @Inclui
    private BigDecimal vlBcIss;

    @Inclui
    private BigDecimal aliqIss;

    @Inclui
    private BigDecimal vlIsntIss;

    @Inclui
    private BigDecimal vlIss;

    @Inclui
    private String codServ;

    public RegB420(BigDecimal vlCont, BigDecimal vlBcIss, BigDecimal aliqIss, BigDecimal vlIsntIss, BigDecimal vlIss, String codServ) {
        this.vlCont = vlCont;
        this.vlBcIss = vlBcIss;
        this.aliqIss = aliqIss;
        this.vlIsntIss = vlIsntIss;
        this.vlIss = vlIss;
        this.codServ = codServ;
    }

    public RegB420(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
    }

    public BigDecimal getAliqIss() {
        return aliqIss;
    }

    public void setAliqIss(BigDecimal aliqIss) {
        this.aliqIss = aliqIss;
    }

    public BigDecimal getVlIsntIss() {
        return vlIsntIss;
    }

    public void setVlIsntIss(BigDecimal vlIsntIss) {
        this.vlIsntIss = vlIsntIss;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public String getCodServ() {
        return codServ;
    }

    public void setCodServ(String codServ) {
        this.codServ = codServ;
    }
    
}
