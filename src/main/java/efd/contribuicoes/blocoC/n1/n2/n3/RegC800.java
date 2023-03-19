package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC810;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC820;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC830;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC800 implements Serializable {
	private static final long serialVersionUID = 4126197879661618233L;

	@Inclui
	private final String reg = "C800";

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private Integer numCfe;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlCfe;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String cnpjCpf;

    @Inclui
    private Integer nrSat;

    @Inclui
    private String chvCfe;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlMerc;

    @Inclui
    private BigDecimal vlOutDa;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlPisSt;

    @Inclui
    private BigDecimal vlCofinsSt;

    @Filho
    private List<RegC810> regC810;

    @Filho
    private List<RegC820> regC820;

    @Filho
    private List<RegC830> regC830;

    public RegC800(String codMod, Integer codSit, Integer numCfe, LocalDate dtDoc, BigDecimal vlCfe, BigDecimal vlPis, BigDecimal vlCofins, String cnpjCpf, Integer nrSat, String chvCfe, BigDecimal vlDesc, BigDecimal vlMerc, BigDecimal vlOutDa, BigDecimal vlIcms, BigDecimal vlPisSt, BigDecimal vlCofinsSt) {
        this.codMod = codMod;
        this.codSit = codSit;
        this.numCfe = numCfe;
        this.dtDoc = dtDoc;
        this.vlCfe = vlCfe;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.cnpjCpf = cnpjCpf;
        this.nrSat = nrSat;
        this.chvCfe = chvCfe;
        this.vlDesc = vlDesc;
        this.vlMerc = vlMerc;
        this.vlOutDa = vlOutDa;
        this.vlIcms = vlIcms;
        this.vlPisSt = vlPisSt;
        this.vlCofinsSt = vlCofinsSt;
    }

    public RegC800(){ }

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

    public Integer getNumCfe() {
        return numCfe;
    }

    public void setNumCfe(Integer numCfe) {
        this.numCfe = numCfe;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlCfe() {
        return vlCfe;
    }

    public void setVlCfe(BigDecimal vlCfe) {
        this.vlCfe = vlCfe;
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

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public Integer getNrSat() {
        return nrSat;
    }

    public void setNrSat(Integer nrSat) {
        this.nrSat = nrSat;
    }

    public String getChvCfe() {
        return chvCfe;
    }

    public void setChvCfe(String chvCfe) {
        this.chvCfe = chvCfe;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
    }

    public BigDecimal getVlOutDa() {
        return vlOutDa;
    }

    public void setVlOutDa(BigDecimal vlOutDa) {
        this.vlOutDa = vlOutDa;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlPisSt() {
        return vlPisSt;
    }

    public void setVlPisSt(BigDecimal vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public BigDecimal getVlCofinsSt() {
        return vlCofinsSt;
    }

    public void setVlCofinsSt(BigDecimal vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
    }

    public List<RegC810> getRegC810() {
        return regC810;
    }

    public void setRegC810(List<RegC810> regC810) {
        this.regC810 = regC810;
    }

    public List<RegC820> getRegC820() {
        return regC820;
    }

    public void setRegC820(List<RegC820> regC820) {
        this.regC820 = regC820;
    }

    public List<RegC830> getRegC830() {
        return regC830;
    }

    public void setRegC830(List<RegC830> regC830) {
        this.regC830 = regC830;
    }
    
}
