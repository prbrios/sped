package efd.contribuicoes.blocoA.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoA.n1.n2.n3.n4.RegA110;
import efd.contribuicoes.blocoA.n1.n2.n3.n4.RegA111;
import efd.contribuicoes.blocoA.n1.n2.n3.n4.RegA120;
import efd.contribuicoes.blocoA.n1.n2.n3.n4.RegA170;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegA100 implements Serializable {
	private static final long serialVersionUID = -5028201280471376554L;

	@Inclui
	private final String reg = "A100";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private String ser;

    @Inclui
    private String sub;

    @Inclui
    private String numDoc;

    @Inclui
    private String chvNfse;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private LocalDate dtExeServ;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private String indPgto;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlbcPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private BigDecimal vlPisRet;

    @Inclui
    private BigDecimal vlCofinsRet;

    @Inclui
    private BigDecimal vlIss;

    @Filho
    private List<RegA110> regA110;

    @Filho
    private List<RegA111> regA111;

    @Filho
    private List<RegA120> regA120;

    @Filho
    private List<RegA170> regA170;

    public RegA100(String indOper, String indEmit, String codPart, Integer codSit, String ser, String sub, String numDoc, String chvNfse, LocalDate dtDoc, LocalDate dtExeServ, BigDecimal vlDoc, String indPgto, BigDecimal vlDesc, BigDecimal vlbcPis, BigDecimal vlPis, BigDecimal vlBcCofins, BigDecimal vlCofins, BigDecimal vlPisRet, BigDecimal vlCofinsRet, BigDecimal vlIss) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.chvNfse = chvNfse;
        this.dtDoc = dtDoc;
        this.dtExeServ = dtExeServ;
        this.vlDoc = vlDoc;
        this.indPgto = indPgto;
        this.vlDesc = vlDesc;
        this.vlbcPis = vlbcPis;
        this.vlPis = vlPis;
        this.vlBcCofins = vlBcCofins;
        this.vlCofins = vlCofins;
        this.vlPisRet = vlPisRet;
        this.vlCofinsRet = vlCofinsRet;
        this.vlIss = vlIss;
    }

    public RegA100(){ }

    public String getReg() {
        return reg;
    }

    public String getIndOper() {
        return indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public Integer getCodSit() {
        return codSit;
    }

    public void setCodSit(Integer codSit) {
        this.codSit = codSit;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvNfse() {
        return chvNfse;
    }

    public void setChvNfse(String chvNfse) {
        this.chvNfse = chvNfse;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public LocalDate getDtExeServ() {
        return dtExeServ;
    }

    public void setDtExeServ(LocalDate dtExeServ) {
        this.dtExeServ = dtExeServ;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public String getIndPgto() {
        return indPgto;
    }

    public void setIndPgto(String indPgto) {
        this.indPgto = indPgto;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlbcPis() {
        return vlbcPis;
    }

    public void setVlbcPis(BigDecimal vlbcPis) {
        this.vlbcPis = vlbcPis;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public BigDecimal getVlPisRet() {
        return vlPisRet;
    }

    public void setVlPisRet(BigDecimal vlPisRet) {
        this.vlPisRet = vlPisRet;
    }

    public BigDecimal getVlCofinsRet() {
        return vlCofinsRet;
    }

    public void setVlCofinsRet(BigDecimal vlCofinsRet) {
        this.vlCofinsRet = vlCofinsRet;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public List<RegA110> getRegA110() {
        return regA110;
    }

    public void setRegA110(List<RegA110> regA110) {
        this.regA110 = regA110;
    }

    public List<RegA111> getRegA111() {
        return regA111;
    }

    public void setRegA111(List<RegA111> regA111) {
        this.regA111 = regA111;
    }

    public List<RegA120> getRegA120() {
        return regA120;
    }

    public void setRegA120(List<RegA120> regA120) {
        this.regA120 = regA120;
    }

    public List<RegA170> getRegA170() {
        return regA170;
    }

    public void setRegA170(List<RegA170> regA170) {
        this.regA170 = regA170;
    }
    
}
