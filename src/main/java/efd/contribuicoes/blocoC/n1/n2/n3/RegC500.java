package efd.contribuicoes.blocoC.n1.n2.n3;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.Grupo;
import efd.anotacoes.Filho;
import efd.anotacoes.G1;
import efd.anotacoes.G2;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC501;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC505;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC509;

public class RegC500 implements Serializable {
	private static final long serialVersionUID = -6283982160366421192L;

	@SuppressWarnings("unused")
	private Grupo grupo;
	
    @Inclui @G1 @G2
    private final String reg = "C500";

    @Inclui @G1 @G2
    String codPart;

    @Inclui @G1 @G2
    String codMod;

    @Inclui(zerosEsquerda = 2) @G1 @G2
    Integer codSit;

    @Inclui @G1 @G2
    String ser;

    @Inclui @G1 @G2
    Integer sub;

    @Inclui @G1 @G2
    Long numDoc;

    @Inclui @G1 @G2
    LocalDate dtDoc;

    @Inclui @G1 @G2
    LocalDate dtEnt;

    @Inclui @G1 @G2
    BigDecimal vlDoc;

    @Inclui @G1 @G2
    BigDecimal vlIcms;

    @Inclui @G1 @G2
    String codInf;

    @Inclui @G1 @G2
    BigDecimal vlPis;

    @Inclui @G1 @G2
    BigDecimal vlCofins;
    
    @Inclui @G2
    String chvDoce;

    @Filho
    private List<RegC501> regC501;

    @Filho
    private List<RegC505> regC505;

    @Filho
    private List<RegC509> regC509;

    public RegC500(String codPart, String codMod, Integer codSit, String ser, Integer sub, Long numDoc, LocalDate dtDoc, LocalDate dtEnt, BigDecimal vlDoc, BigDecimal vlIcms, String codInf, BigDecimal vlPis, BigDecimal vlCofins) {
    	this.grupo = Grupo.G1;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.dtEnt = dtEnt;
        this.vlDoc = vlDoc;
        this.vlIcms = vlIcms;
        this.codInf = codInf;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }
    
    public RegC500(String codPart, String codMod, Integer codSit, String ser, Integer sub, Long numDoc, LocalDate dtDoc, LocalDate dtEnt, BigDecimal vlDoc, BigDecimal vlIcms, String codInf, BigDecimal vlPis, BigDecimal vlCofins, String chvDoce) {
    	this.grupo = Grupo.G2;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.dtEnt = dtEnt;
        this.vlDoc = vlDoc;
        this.vlIcms = vlIcms;
        this.codInf = codInf;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.chvDoce = chvDoce;
    }

    public RegC500(){ }

    public String getReg() {
        return reg;
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

    public Integer getSub() {
        return sub;
    }

    public void setSub(Integer sub) {
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

    public LocalDate getDtEnt() {
        return dtEnt;
    }

    public void setDtEnt(LocalDate dtEnt) {
        this.dtEnt = dtEnt;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
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

    public String getChvDoce() {
        return chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
    }

    public List<RegC501> getRegC501() {
        return regC501;
    }

    public void setRegC501(List<RegC501> regC501) {
        this.regC501 = regC501;
    }

    public List<RegC505> getRegC505() {
        return regC505;
    }

    public void setRegC505(List<RegC505> regC505) {
        this.regC505 = regC505;
    }

    public List<RegC509> getRegC509() {
        return regC509;
    }

    public void setRegC509(List<RegC509> regC509) {
        this.regC509 = regC509;
    }
    
}
