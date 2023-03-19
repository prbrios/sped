package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD100 implements Serializable {
	private static final long serialVersionUID = -7226238235200984779L;

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
    private LocalDate dtAp;

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
    private String codInf;

    @Inclui
    private String codCta;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Filho
    private RegD101 regD101;

    @Filho
    private List<RegD110> regD110;

    @Filho
    private List<RegD130> regD130;

    @Filho
    private RegD140 regD140;

    @Filho
    private RegD150 regD150;

    @Filho
    private List<RegD160> regD160;

    @Filho
    private RegD170 regD170;

    @Filho
    private List<RegD180> regD180;

    @Filho
    private List<RegD190> regD190;

    @Filho
    private List<RegD195> regD195;

    public RegD100(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser, String sub, Long numDoc, String chvCte, LocalDate dtDoc, LocalDate dtAp, Integer tpCte, String chvCteRef, BigDecimal vlDoc, BigDecimal vlDesc, String indFrt, BigDecimal vlServ, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlNt, String codInf, String codCta, Integer codMunOrig, Integer codMunDest) {
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
        this.dtAp = dtAp;
        this.tpCte = tpCte;
        this.chvCteRef = chvCteRef;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.indFrt = indFrt;
        this.vlServ = vlServ;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlNt = vlNt;
        this.codInf = codInf;
        this.codCta = codCta;
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
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

    public LocalDate getDtAp() {
        return dtAp;
    }

    public void setDtAp(LocalDate dtAp) {
        this.dtAp = dtAp;
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

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public Integer getCodMunOrig() {
        return codMunOrig;
    }

    public void setCodMunOrig(Integer codMunOrig) {
        this.codMunOrig = codMunOrig;
    }

    public Integer getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(Integer codMunDest) {
        this.codMunDest = codMunDest;
    }

    public RegD101 getRegD101() {
        return regD101;
    }

    public void setRegD101(RegD101 regD101) {
        this.regD101 = regD101;
    }

    public List<RegD110> getRegD110() {
        return regD110;
    }

    public void setRegD110(List<RegD110> regD110) {
        this.regD110 = regD110;
    }

    public List<RegD130> getRegD130() {
        return regD130;
    }

    public void setRegD130(List<RegD130> regD130) {
        this.regD130 = regD130;
    }

    public RegD140 getRegD140() {
        return regD140;
    }

    public void setRegD140(RegD140 regD140) {
        this.regD140 = regD140;
    }

    public RegD150 getRegD150() {
        return regD150;
    }

    public void setRegD150(RegD150 regD150) {
        this.regD150 = regD150;
    }

    public List<RegD160> getRegD160() {
        return regD160;
    }

    public void setRegD160(List<RegD160> regD160) {
        this.regD160 = regD160;
    }

    public RegD170 getRegD170() {
        return regD170;
    }

    public void setRegD170(RegD170 regD170) {
        this.regD170 = regD170;
    }

    public List<RegD180> getRegD180() {
        return regD180;
    }

    public void setRegD180(List<RegD180> regD180) {
        this.regD180 = regD180;
    }

    public List<RegD190> getRegD190() {
        return regD190;
    }

    public void setRegD190(List<RegD190> regD190) {
        this.regD190 = regD190;
    }

    public List<RegD195> getRegD195() {
        return regD195;
    }

    public void setRegD195(List<RegD195> regD195) {
        this.regD195 = regD195;
    }
    
}