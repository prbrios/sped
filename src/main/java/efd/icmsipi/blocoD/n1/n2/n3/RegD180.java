package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegD180 implements Serializable {
	private static final long serialVersionUID = 5574868341040624856L;

	@Inclui
    private final String reg = "D180";

    @Inclui
    private Integer numSeq;

    @Inclui
    private String indEmit;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjCpfEmit;

    @Inclui
    private String ufEmit;

    @Inclui
    private String ieEmit;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui
    private String cnpjCpfTom;

    @Inclui
    private String ufTom;

    @Inclui
    private String ieTom;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private Long numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

    public RegD180(Integer numSeq, String indEmit, Long cnpjCpfEmit, String ufEmit, String ieEmit, Integer codMunOrig, String cnpjCpfTom, String ufTom, String ieTom, Integer codMunDest, String codMod, String ser, Integer sub, Long numDoc, LocalDate dtDoc, BigDecimal vlDoc) {
        this.numSeq = numSeq;
        this.indEmit = indEmit;
        this.cnpjCpfEmit = cnpjCpfEmit;
        this.ufEmit = ufEmit;
        this.ieEmit = ieEmit;
        this.codMunOrig = codMunOrig;
        this.cnpjCpfTom = cnpjCpfTom;
        this.ufTom = ufTom;
        this.ieTom = ieTom;
        this.codMunDest = codMunDest;
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
    }

    public RegD180(){}

    public String getReg() {
        return reg;
    }

    public Integer getNumSeq() {
        return numSeq;
    }

    public void setNumSeq(Integer numSeq) {
        this.numSeq = numSeq;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public Long getCnpjCpfEmit() {
        return cnpjCpfEmit;
    }

    public void setCnpjCpfEmit(Long cnpjCpfEmit) {
        this.cnpjCpfEmit = cnpjCpfEmit;
    }

    public String getUfEmit() {
        return ufEmit;
    }

    public void setUfEmit(String ufEmit) {
        this.ufEmit = ufEmit;
    }

    public String getIeEmit() {
        return ieEmit;
    }

    public void setIeEmit(String ieEmit) {
        this.ieEmit = ieEmit;
    }

    public Integer getCodMunOrig() {
        return codMunOrig;
    }

    public void setCodMunOrig(Integer codMunOrig) {
        this.codMunOrig = codMunOrig;
    }

    public String getCnpjCpfTom() {
        return cnpjCpfTom;
    }

    public void setCnpjCpfTom(String cnpjCpfTom) {
        this.cnpjCpfTom = cnpjCpfTom;
    }

    public String getUfTom() {
        return ufTom;
    }

    public void setUfTom(String ufTom) {
        this.ufTom = ufTom;
    }

    public String getIeTom() {
        return ieTom;
    }

    public void setIeTom(String ieTom) {
        this.ieTom = ieTom;
    }

    public Integer getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(Integer codMunDest) {
        this.codMunDest = codMunDest;
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

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }
    
}