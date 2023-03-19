package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;

import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF559;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegF550 implements Serializable {
	private static final long serialVersionUID = 2492335714786225351L;

	@Inclui
	private final String reg = "F550";

    @Inclui
    private BigDecimal vlRecComp;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlDescPis;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlDescCofins;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private String codCta;

    @Inclui
    private String infoCompl;

    @Filho
    private List<RegF559> regF559;

    public RegF550(BigDecimal vlRecComp, Integer cstPis, BigDecimal vlDescPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlDescCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codMod, Integer cfop, String codCta, String infoCompl) {
        this.vlRecComp = vlRecComp;
        this.cstPis = cstPis;
        this.vlDescPis = vlDescPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlDescCofins = vlDescCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codMod = codMod;
        this.cfop = cfop;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegF550(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlRecComp() {
        return vlRecComp;
    }

    public void setVlRecComp(BigDecimal vlRecComp) {
        this.vlRecComp = vlRecComp;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
    }

    public BigDecimal getVlDescPis() {
        return vlDescPis;
    }

    public void setVlDescPis(BigDecimal vlDescPis) {
        this.vlDescPis = vlDescPis;
    }

    public BigDecimal getVlBcPis() {
        return vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
    }

    public BigDecimal getVlDescCofins() {
        return vlDescCofins;
    }

    public void setVlDescCofins(BigDecimal vlDescCofins) {
        this.vlDescCofins = vlDescCofins;
    }

    public BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getInfoCompl() {
        return infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }

    public List<RegF559> getRegF559() {
        return regF559;
    }

    public void setRegF559(List<RegF559> regF559) {
        this.regF559 = regF559;
    }
    
}
