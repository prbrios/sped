package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC601;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC605;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC609;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC600 implements Serializable {
	private static final long serialVersionUID = -680669905232941402L;

	@Inclui
	private final String reg = "C600";

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui(zerosEsquerda = 2)
    private Integer codCons;

    @Inclui
    private Integer qtdCons;

    @Inclui
    private Integer qtdCanc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private Integer cons;

    @Inclui
    private BigDecimal vlForn;

    @Inclui
    private BigDecimal vlServNt;

    @Inclui
    private BigDecimal vlTerc;

    @Inclui
    private BigDecimal vlDa;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlBcIcmsSt;

    @Inclui
    private BigDecimal vlIcmsSt;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Filho
    private List<RegC601> regC601;

    @Filho
    private List<RegC605> regC605;

    @Filho
    private List<RegC609> regC609;

    public RegC600(String codMod, Integer codMun, String ser, Integer sub, Integer codCons, Integer qtdCons, Integer qtdCanc, LocalDate dtDoc, BigDecimal vlDoc, BigDecimal vlDesc, Integer cons, BigDecimal vlForn, BigDecimal vlServNt, BigDecimal vlTerc, BigDecimal vlDa, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, BigDecimal vlPis, BigDecimal vlCofins) {
        this.codMod = codMod;
        this.codMun = codMun;
        this.ser = ser;
        this.sub = sub;
        this.codCons = codCons;
        this.qtdCons = qtdCons;
        this.qtdCanc = qtdCanc;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.cons = cons;
        this.vlForn = vlForn;
        this.vlServNt = vlServNt;
        this.vlTerc = vlTerc;
        this.vlDa = vlDa;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegC600(){ }

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public Integer getCodMun() {
        return codMun;
    }

    public void setCodMun(Integer codMun) {
        this.codMun = codMun;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public Integer getSub() {
        return sub;
    }

    public void setSub(Integer sub) {
        this.sub = sub;
    }

    public Integer getCodCons() {
        return codCons;
    }

    public void setCodCons(Integer codCons) {
        this.codCons = codCons;
    }

    public Integer getQtdCons() {
        return qtdCons;
    }

    public void setQtdCons(Integer qtdCons) {
        this.qtdCons = qtdCons;
    }

    public Integer getQtdCanc() {
        return qtdCanc;
    }

    public void setQtdCanc(Integer qtdCanc) {
        this.qtdCanc = qtdCanc;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public Integer getCons() {
        return cons;
    }

    public void setCons(Integer cons) {
        this.cons = cons;
    }

    public BigDecimal getVlForn() {
        return vlForn;
    }

    public void setVlForn(BigDecimal vlForn) {
        this.vlForn = vlForn;
    }

    public BigDecimal getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }

    public BigDecimal getVlTerc() {
        return vlTerc;
    }

    public void setVlTerc(BigDecimal vlTerc) {
        this.vlTerc = vlTerc;
    }

    public BigDecimal getVlDa() {
        return vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public List<RegC601> getRegC601() {
        return regC601;
    }

    public void setRegC601(List<RegC601> regC601) {
        this.regC601 = regC601;
    }

    public List<RegC605> getRegC605() {
        return regC605;
    }

    public void setRegC605(List<RegC605> regC605) {
        this.regC605 = regC605;
    }

    public List<RegC609> getRegC609() {
        return regC609;
    }

    public void setRegC609(List<RegC609> regC609) {
        this.regC609 = regC609;
    }
    
}
