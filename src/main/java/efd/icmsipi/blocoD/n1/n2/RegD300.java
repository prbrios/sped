package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD301;
import efd.icmsipi.blocoD.n1.n2.n3.RegD310;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD300 implements Serializable {
	private static final long serialVersionUID = 6563333814414913942L;

	@Inclui
    private final String reg = "D300";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private Long numDocIni;

    @Inclui
    private Long numDocFin;

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlOpr;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlSeg;

    @Inclui
    private BigDecimal vlOutDesp;

    @Inclui
    private BigDecimal vlbcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlRedBc;

    @Inclui
    private String codObs;

    @Inclui
    private String codCta;

    @Filho
    private List<RegD301> regD301;

    @Filho
    private List<RegD310> regD310;

    public RegD300(String codMod, String ser, Integer sub, Long numDocIni, Long numDocFin, Integer cstIcms, Integer cfop, BigDecimal aliqIcms, LocalDate dtDoc, BigDecimal vlOpr, BigDecimal vlDesc, BigDecimal vlServ, BigDecimal vlSeg, BigDecimal vlOutDesp, BigDecimal vlbcIcms, BigDecimal vlIcms, BigDecimal vlRedBc, String codObs, String codCta) {
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.dtDoc = dtDoc;
        this.vlOpr = vlOpr;
        this.vlDesc = vlDesc;
        this.vlServ = vlServ;
        this.vlSeg = vlSeg;
        this.vlOutDesp = vlOutDesp;
        this.vlbcIcms = vlbcIcms;
        this.vlIcms = vlIcms;
        this.vlRedBc = vlRedBc;
        this.codObs = codObs;
        this.codCta = codCta;
    }

    public RegD300(){}

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
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

    public Long getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(Long numDocIni) {
        this.numDocIni = numDocIni;
    }

    public Long getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(Long numDocFin) {
        this.numDocFin = numDocFin;
    }

    public Integer getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(Integer cstIcms) {
        this.cstIcms = cstIcms;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlOpr() {
        return vlOpr;
    }

    public void setVlOpr(BigDecimal vlOpr) {
        this.vlOpr = vlOpr;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
    }

    public BigDecimal getVlSeg() {
        return vlSeg;
    }

    public void setVlSeg(BigDecimal vlSeg) {
        this.vlSeg = vlSeg;
    }

    public BigDecimal getVlOutDesp() {
        return vlOutDesp;
    }

    public void setVlOutDesp(BigDecimal vlOutDesp) {
        this.vlOutDesp = vlOutDesp;
    }

    public BigDecimal getVlbcIcms() {
        return vlbcIcms;
    }

    public void setVlbcIcms(BigDecimal vlbcIcms) {
        this.vlbcIcms = vlbcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlRedBc() {
        return vlRedBc;
    }

    public void setVlRedBc(BigDecimal vlRedBc) {
        this.vlRedBc = vlRedBc;
    }

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public List<RegD301> getRegD301() {
        return regD301;
    }

    public void setRegD301(List<RegD301> regD301) {
        this.regD301 = regD301;
    }

    public List<RegD310> getRegD310() {
        return regD310;
    }

    public void setRegD310(List<RegD310> regD310) {
        this.regD310 = regD310;
    }
    
}