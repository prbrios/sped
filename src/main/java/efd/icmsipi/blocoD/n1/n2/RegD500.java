package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD510;
import efd.icmsipi.blocoD.n1.n2.n3.RegD530;
import efd.icmsipi.blocoD.n1.n2.n3.RegD590;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD500 implements Serializable {
	private static final long serialVersionUID = 8116403052497332296L;

	@Inclui
    private final String reg = "D500";

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
    private LocalDate dtDoc;

    @Inclui
    private LocalDate dtAp;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlServ;

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
    private String codInf;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    @Inclui
    private Integer tpAssinante;

    @Filho
    private List<RegD510> regD510;

    @Filho
    private List<RegD530> regD530;

    @Filho
    private List<RegD590> regD590;

    public RegD500(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser, String sub, Long numDoc, LocalDate dtDoc, LocalDate dtAp, BigDecimal vlDoc, BigDecimal vlDesc, BigDecimal vlServ, BigDecimal vlServNt, BigDecimal vlTerc, BigDecimal vlDa, BigDecimal vlBcIcms, BigDecimal vlIcms, String codInf, BigDecimal vlPis, BigDecimal vlCofins, String codCta, Integer tpAssinante) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.dtAp = dtAp;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.vlServ = vlServ;
        this.vlServNt = vlServNt;
        this.vlTerc = vlTerc;
        this.vlDa = vlDa;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.codInf = codInf;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
        this.tpAssinante = tpAssinante;
    }

    public RegD500(){}

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

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
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

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
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

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public Integer getTpAssinante() {
        return tpAssinante;
    }

    public void setTpAssinante(Integer tpAssinante) {
        this.tpAssinante = tpAssinante;
    }

    public List<RegD510> getRegD510() {
        return regD510;
    }

    public void setRegD510(List<RegD510> regD510) {
        this.regD510 = regD510;
    }

    public List<RegD530> getRegD530() {
        return regD530;
    }

    public void setRegD530(List<RegD530> regD530) {
        this.regD530 = regD530;
    }

    public List<RegD590> getRegD590() {
        return regD590;
    }

    public void setRegD590(List<RegD590> regD590) {
        this.regD590 = regD590;
    }
    
}