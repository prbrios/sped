package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegF150 implements Serializable {
	private static final long serialVersionUID = 5285283706934273648L;

	@Inclui
	private final String reg = "F150";

    @Inclui
    private String natBcCred;

    @Inclui
    private BigDecimal vlTotEst;

    @Inclui
    private BigDecimal estImp;

    @Inclui
    private BigDecimal vlBcEst;

    @Inclui
    private BigDecimal vlBcMenEst;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlCredPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCredCofins;

    @Inclui
    private String descEst;

    @Inclui
    private String codCta;

    public RegF150(String natBcCred, BigDecimal vlTotEst, BigDecimal estImp, BigDecimal vlBcEst, BigDecimal vlBcMenEst, Integer cstPis, BigDecimal aliqPis, BigDecimal vlCredPis, Integer cstCofins, BigDecimal aliqCofins, BigDecimal vlCredCofins, String descEst, String codCta) {
        this.natBcCred = natBcCred;
        this.vlTotEst = vlTotEst;
        this.estImp = estImp;
        this.vlBcEst = vlBcEst;
        this.vlBcMenEst = vlBcMenEst;
        this.cstPis = cstPis;
        this.aliqPis = aliqPis;
        this.vlCredPis = vlCredPis;
        this.cstCofins = cstCofins;
        this.aliqCofins = aliqCofins;
        this.vlCredCofins = vlCredCofins;
        this.descEst = descEst;
        this.codCta = codCta;
    }

    public RegF150(){ }

    public String getReg() {
        return reg;
    }

    public String getNatBcCred() {
        return natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }

    public BigDecimal getVlTotEst() {
        return vlTotEst;
    }

    public void setVlTotEst(BigDecimal vlTotEst) {
        this.vlTotEst = vlTotEst;
    }

    public BigDecimal getEstImp() {
        return estImp;
    }

    public void setEstImp(BigDecimal estImp) {
        this.estImp = estImp;
    }

    public BigDecimal getVlBcEst() {
        return vlBcEst;
    }

    public void setVlBcEst(BigDecimal vlBcEst) {
        this.vlBcEst = vlBcEst;
    }

    public BigDecimal getVlBcMenEst() {
        return vlBcMenEst;
    }

    public void setVlBcMenEst(BigDecimal vlBcMenEst) {
        this.vlBcMenEst = vlBcMenEst;
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

    public BigDecimal getVlCredPis() {
        return vlCredPis;
    }

    public void setVlCredPis(BigDecimal vlCredPis) {
        this.vlCredPis = vlCredPis;
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

    public BigDecimal getVlCredCofins() {
        return vlCredCofins;
    }

    public void setVlCredCofins(BigDecimal vlCredCofins) {
        this.vlCredCofins = vlCredCofins;
    }

    public String getDescEst() {
        return descEst;
    }

    public void setDescEst(String descEst) {
        this.descEst = descEst;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
}
