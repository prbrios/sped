package efd.contribuicoes.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD101;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD105;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD111;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD100 implements Serializable {
	private static final long serialVersionUID = 2957945551743374087L;

	@Inclui
	private final String reg = "D100";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private String ser;

    @Inclui
    private String sub;

    @Inclui
    private Long numDoc;

    @Inclui
    private String chvCte;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private LocalDate dtAP;

    @Inclui
    private Integer tpCte;

    @Inclui
    private String chvCteRef;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private String indFrt;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlNt;

    @Inclui
    private String coInf;

    @Inclui
    private String codCta;

    @Filho
    private List<RegD101> regD101;

    @Filho
    private List<RegD105> regD105;

    @Filho
    private List<RegD111> regD111;

    public RegD100(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser, String sub, Long numDoc, String chvCte, LocalDate dtDoc, LocalDate dtAP, Integer tpCte, String chvCteRef, BigDecimal vlDoc, BigDecimal vlDesc, String indFrt, BigDecimal vlServ, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlNt, String coInf, String codCta) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.chvCte = chvCte;
        this.dtDoc = dtDoc;
        this.dtAP = dtAP;
        this.tpCte = tpCte;
        this.chvCteRef = chvCteRef;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.indFrt = indFrt;
        this.vlServ = vlServ;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlNt = vlNt;
        this.coInf = coInf;
        this.codCta = codCta;
    }

    public RegD100(){}

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

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
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

    public Long getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Long numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvCte() {
        return chvCte;
    }

    public void setChvCte(String chvCte) {
        this.chvCte = chvCte;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public LocalDate getDtAP() {
        return dtAP;
    }

    public void setDtAP(LocalDate dtAP) {
        this.dtAP = dtAP;
    }

    public Integer getTpCte() {
        return tpCte;
    }

    public void setTpCte(Integer tpCte) {
        this.tpCte = tpCte;
    }

    public String getChvCteRef() {
        return chvCteRef;
    }

    public void setChvCteRef(String chvCteRef) {
        this.chvCteRef = chvCteRef;
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

    public String getIndFrt() {
        return indFrt;
    }

    public void setIndFrt(String indFrt) {
        this.indFrt = indFrt;
    }

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
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

    public BigDecimal getVlNt() {
        return vlNt;
    }

    public void setVlNt(BigDecimal vlNt) {
        this.vlNt = vlNt;
    }

    public String getCoInf() {
        return coInf;
    }

    public void setCoInf(String coInf) {
        this.coInf = coInf;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public List<RegD101> getRegD101() {
        return regD101;
    }

    public void setRegD101(List<RegD101> regD101) {
        this.regD101 = regD101;
    }

    public List<RegD105> getRegD105() {
        return regD105;
    }

    public void setRegD105(List<RegD105> regD105) {
        this.regD105 = regD105;
    }

    public List<RegD111> getRegD111() {
        return regD111;
    }

    public void setRegD111(List<RegD111> regD111) {
        this.regD111 = regD111;
    }
    
}
