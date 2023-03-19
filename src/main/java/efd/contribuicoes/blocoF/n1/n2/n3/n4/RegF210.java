package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegF210 implements Serializable {
	private static final long serialVersionUID = 5136676108235881360L;

	@Inclui
	private final String reg = "F210";

    @Inclui
    private BigDecimal vlCusOrc;

    @Inclui
    private BigDecimal vlExc;

    @Inclui
    private BigDecimal vlCusOrcAju;

    @Inclui
    private BigDecimal vlBcCred;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlCredPisUtil;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCredCofinsUtil;

    public RegF210(BigDecimal vlCusOrc, BigDecimal vlExc, BigDecimal vlCusOrcAju, BigDecimal vlBcCred, Integer cstPis, BigDecimal aliqPis, BigDecimal vlCredPisUtil, Integer cstCofins, BigDecimal aliqCofins, BigDecimal vlCredCofinsUtil) {
        this.vlCusOrc = vlCusOrc;
        this.vlExc = vlExc;
        this.vlCusOrcAju = vlCusOrcAju;
        this.vlBcCred = vlBcCred;
        this.cstPis = cstPis;
        this.aliqPis = aliqPis;
        this.vlCredPisUtil = vlCredPisUtil;
        this.cstCofins = cstCofins;
        this.aliqCofins = aliqCofins;
        this.vlCredCofinsUtil = vlCredCofinsUtil;
    }

    public RegF210(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlCusOrc() {
        return vlCusOrc;
    }

    public void setVlCusOrc(BigDecimal vlCusOrc) {
        this.vlCusOrc = vlCusOrc;
    }

    public BigDecimal getVlExc() {
        return vlExc;
    }

    public void setVlExc(BigDecimal vlExc) {
        this.vlExc = vlExc;
    }

    public BigDecimal getVlCusOrcAju() {
        return vlCusOrcAju;
    }

    public void setVlCusOrcAju(BigDecimal vlCusOrcAju) {
        this.vlCusOrcAju = vlCusOrcAju;
    }

    public BigDecimal getVlBcCred() {
        return vlBcCred;
    }

    public void setVlBcCred(BigDecimal vlBcCred) {
        this.vlBcCred = vlBcCred;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getVlCredPisUtil() {
        return vlCredPisUtil;
    }

    public void setVlCredPisUtil(BigDecimal vlCredPisUtil) {
        this.vlCredPisUtil = vlCredPisUtil;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getVlCredCofinsUtil() {
        return vlCredCofinsUtil;
    }

    public void setVlCredCofinsUtil(BigDecimal vlCredCofinsUtil) {
        this.vlCredCofinsUtil = vlCredCofinsUtil;
    }
    
}
