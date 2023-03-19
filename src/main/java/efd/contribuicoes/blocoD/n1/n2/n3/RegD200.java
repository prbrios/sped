package efd.contribuicoes.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD201;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD205;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD209;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD200 implements Serializable {
	private static final long serialVersionUID = -8742415110912633554L;

	@Inclui
	private final String reg = "D200";

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private String ser;

    @Inclui
    private String sub;

    @Inclui
    private Long numDocIni;

    @Inclui
    private Long numDocFin;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private LocalDate dtRef;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Filho
    private List<RegD201> regD201;

    @Filho
    private List<RegD205> regD205;

    @Filho
    private List<RegD209> regD209;

    public RegD200(String codMod, Integer codSit, String ser, String sub, Long numDocIni, Long numDocFin, Integer cfop, LocalDate dtRef, BigDecimal vlDoc, BigDecimal vlDesc) {
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.cfop = cfop;
        this.dtRef = dtRef;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
    }

    public RegD200(){}

    public String getReg() {
        return reg;
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

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public LocalDate getDtRef() {
        return dtRef;
    }

    public void setDtRef(LocalDate dtRef) {
        this.dtRef = dtRef;
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

    public List<RegD201> getRegD201() {
        return regD201;
    }

    public void setRegD201(List<RegD201> regD201) {
        this.regD201 = regD201;
    }

    public List<RegD205> getRegD205() {
        return regD205;
    }

    public void setRegD205(List<RegD205> regD205) {
        this.regD205 = regD205;
    }

    public List<RegD209> getRegD209() {
        return regD209;
    }

    public void setRegD209(List<RegD209> regD209) {
        this.regD209 = regD209;
    }
    
}
