package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF111;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegF100 implements Serializable {
	private static final long serialVersionUID = 1827464906336733212L;

	@Inclui
	private final String reg = "F100";

    @Inclui
    private String indOper;

    @Inclui
    private String codPart;

    @Inclui
    private String codItem;

    @Inclui
    private LocalDate dtOper;

    @Inclui
    private BigDecimal vlOper;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String natBcCred;

    @Inclui
    private String indOrigCred;

    @Inclui
    private String codCta;

    @Inclui
    private String codCcus;

    @Inclui
    private String descDocOper;

    @Filho
    private List<RegF111> regF111;

    public RegF100(String indOper, String codPart, String codItem, LocalDate dtOper, BigDecimal vlOper, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String natBcCred, String indOrigCred, String codCta, String codCcus, String descDocOper) {
        this.indOper = indOper;
        this.codPart = codPart;
        this.codItem = codItem;
        this.dtOper = dtOper;
        this.vlOper = vlOper;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.natBcCred = natBcCred;
        this.indOrigCred = indOrigCred;
        this.codCta = codCta;
        this.codCcus = codCcus;
        this.descDocOper = descDocOper;
    }

    public RegF100(){}

    public String getReg() {
        return reg;
    }

    public String getIndOper() {
        return indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public LocalDate getDtOper() {
        return dtOper;
    }

    public void setDtOper(LocalDate dtOper) {
        this.dtOper = dtOper;
    }

    public BigDecimal getVlOper() {
        return vlOper;
    }

    public void setVlOper(BigDecimal vlOper) {
        this.vlOper = vlOper;
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

    public String getNatBcCred() {
        return natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }

    public String getIndOrigCred() {
        return indOrigCred;
    }

    public void setIndOrigCred(String indOrigCred) {
        this.indOrigCred = indOrigCred;
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

    public String getDescDocOper() {
        return descDocOper;
    }

    public void setDescDocOper(String descDocOper) {
        this.descDocOper = descDocOper;
    }

    public List<RegF111> getRegF111() {
        return regF111;
    }

    public void setRegF111(List<RegF111> regF111) {
        this.regF111 = regF111;
    }
    
}
