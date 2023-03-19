package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF129;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegF120 implements Serializable {
	private static final long serialVersionUID = 8047661517720311451L;

	@Inclui
	private final String reg = "F120";

    @Inclui
    private String natBcCred;

    @Inclui(zerosEsquerda = 2)
    private Integer identBemMob;

    @Inclui
    private String indOrigCred;

    @Inclui
    private Integer indUtilBemImob;

    @Inclui
    private BigDecimal vlOperDep;

    @Inclui
    private BigDecimal parcOperNaoBcCred;

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
    private List<RegF129> regF129;

    public RegF120(String natBcCred, Integer identBemMob, String indOrigCred, Integer indUtilBemImob, BigDecimal vlOperDep, BigDecimal parcOperNaoBcCred, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta, String codCcus, String descBemImob) {
        this.natBcCred = natBcCred;
        this.identBemMob = identBemMob;
        this.indOrigCred = indOrigCred;
        this.indUtilBemImob = indUtilBemImob;
        this.vlOperDep = vlOperDep;
        this.parcOperNaoBcCred = parcOperNaoBcCred;
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

    public RegF120(){}

    public String getReg() {
        return reg;
    }

    public String getNatBcCred() {
        return natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }

    public Integer getIdentBemMob() {
        return identBemMob;
    }

    public void setIdentBemMob(Integer identBemMob) {
        this.identBemMob = identBemMob;
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

    public BigDecimal getVlOperDep() {
        return vlOperDep;
    }

    public void setVlOperDep(BigDecimal vlOperDep) {
        this.vlOperDep = vlOperDep;
    }

    public BigDecimal getParcOperNaoBcCred() {
        return parcOperNaoBcCred;
    }

    public void setParcOperNaoBcCred(BigDecimal parcOperNaoBcCred) {
        this.parcOperNaoBcCred = parcOperNaoBcCred;
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

    public List<RegF129> getRegF129() {
        return regF129;
    }

    public void setRegF129(List<RegF129> regF129) {
        this.regF129 = regF129;
    }
    
}
