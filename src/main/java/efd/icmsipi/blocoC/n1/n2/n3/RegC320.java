package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC321;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegC320 implements Serializable {
	private static final long serialVersionUID = 1674411166655108298L;

	@Inclui
    private final String reg = "C320";

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlOpr;

    @Inclui
    private BigDecimal vlbcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlRedBc;

    @Inclui
    private String codObs;

    @Filho
    private List<RegC321> regC321;

    public RegC320(Integer cstIcms, Integer cfop, BigDecimal aliqIcms, BigDecimal vlOpr, BigDecimal vlbcIcms, BigDecimal vlIcms, BigDecimal vlRedBc, String codObs) {
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlOpr = vlOpr;
        this.vlbcIcms = vlbcIcms;
        this.vlIcms = vlIcms;
        this.vlRedBc = vlRedBc;
        this.codObs = codObs;
    }

    public RegC320(){}

    public String getReg() {
        return reg;
    }

    public Integer getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(Integer cstIcms) {
        this.cstIcms = cstIcms;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlOpr() {
        return vlOpr;
    }

    public void setVlOpr(BigDecimal vlOpr) {
        this.vlOpr = vlOpr;
    }

    public BigDecimal getVlbcIcms() {
        return vlbcIcms;
    }

    public void setVlbcIcms(BigDecimal vlbcIcms) {
        this.vlbcIcms = vlbcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlRedBc() {
        return vlRedBc;
    }

    public void setVlRedBc(BigDecimal vlRedBc) {
        this.vlRedBc = vlRedBc;
    }

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }

    public List<RegC321> getRegC321() {
        return regC321;
    }

    public void setRegC321(List<RegC321> regC321) {
        this.regC321 = regC321;
    }
    
}
