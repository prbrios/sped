package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF139;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegF130 implements Serializable {
	private static final long serialVersionUID = 4497350747869308775L;

	@Inclui
	private final String reg = "F130";

    @Inclui
    private String natBcCred;

    @Inclui(zerosEsquerda = 2)
    private Integer identBemImob;

    @Inclui
    private String indOrigCred;

    @Inclui
    private Integer indUtilBemImob;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate mesOperAquis;

    @Inclui
    private BigDecimal vlOperAquis;

    @Inclui
    private BigDecimal parcOperNaoBcCred;

    @Inclui
    private BigDecimal vlBcCred;

    @Inclui
    private Integer indNrParc;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    @Inclui
    private String codCcus;

    @Inclui
    private String descBemImob;

    @Filho
    private List<RegF139> regF139;

    public RegF130(String natBcCred, Integer identBemImob, String indOrigCred, Integer indUtilBemImob, LocalDate mesOperAquis, BigDecimal vlOperAquis, BigDecimal parcOperNaoBcCred, BigDecimal vlBcCred, Integer indNrParc, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta, String codCcus, String descBemImob) {
        this.natBcCred = natBcCred;
        this.identBemImob = identBemImob;
        this.indOrigCred = indOrigCred;
        this.indUtilBemImob = indUtilBemImob;
        this.mesOperAquis = mesOperAquis;
        this.vlOperAquis = vlOperAquis;
        this.parcOperNaoBcCred = parcOperNaoBcCred;
        this.vlBcCred = vlBcCred;
        this.indNrParc = indNrParc;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
        this.codCcus = codCcus;
        this.descBemImob = descBemImob;
    }

    public RegF130(){ }

    public String getReg() {
        return reg;
    }

    public String getNatBcCred() {
        return natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }

    public Integer getIdentBemImob() {
        return identBemImob;
    }

    public void setIdentBemImob(Integer identBemImob) {
        this.identBemImob = identBemImob;
    }

    public String getIndOrigCred() {
        return indOrigCred;
    }

    public void setIndOrigCred(String indOrigCred) {
        this.indOrigCred = indOrigCred;
    }

    public Integer getIndUtilBemImob() {
        return indUtilBemImob;
    }

    public void setIndUtilBemImob(Integer indUtilBemImob) {
        this.indUtilBemImob = indUtilBemImob;
    }

    public LocalDate getMesOperAquis() {
        return mesOperAquis;
    }

    public void setMesOperAquis(LocalDate mesOperAquis) {
        this.mesOperAquis = mesOperAquis;
    }

    public BigDecimal getVlOperAquis() {
        return vlOperAquis;
    }

    public void setVlOperAquis(BigDecimal vlOperAquis) {
        this.vlOperAquis = vlOperAquis;
    }

    public BigDecimal getParcOperNaoBcCred() {
        return parcOperNaoBcCred;
    }

    public void setParcOperNaoBcCred(BigDecimal parcOperNaoBcCred) {
        this.parcOperNaoBcCred = parcOperNaoBcCred;
    }

    public BigDecimal getVlBcCred() {
        return vlBcCred;
    }

    public void setVlBcCred(BigDecimal vlBcCred) {
        this.vlBcCred = vlBcCred;
    }

    public Integer getIndNrParc() {
        return indNrParc;
    }

    public void setIndNrParc(Integer indNrParc) {
        this.indNrParc = indNrParc;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
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

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getCodCcus() {
        return codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    public String getDescBemImob() {
        return descBemImob;
    }

    public void setDescBemImob(String descBemImob) {
        this.descBemImob = descBemImob;
    }

    public List<RegF139> getRegF139() {
        return regF139;
    }

    public void setRegF139(List<RegF139> regF139) {
        this.regF139 = regF139;
    }
    
}
