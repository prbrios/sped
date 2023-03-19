package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC370;
import efd.icmsipi.blocoC.n1.n2.n3.RegC390;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC350 implements Serializable {
	private static final long serialVersionUID = 569231195917346984L;

	@Inclui
    private final String reg = "C350";

    @Inclui
    private String ser;

    @Inclui
    private String subSer;

    @Inclui
    private Long numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private String cnpjCpf;

    @Inclui
    private BigDecimal vlMerc;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    @Filho
    private List<RegC370> regC370;

    @Filho
    private List<RegC390> regC390;

    public RegC350(String ser, String subSer, Long numDoc, LocalDate dtDoc, String cnpjCpf, BigDecimal vlMerc, BigDecimal vlDoc, BigDecimal vlDesc, BigDecimal vlPis, BigDecimal vlCofins, String codCta) {
        this.ser = ser;
        this.subSer = subSer;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.cnpjCpf = cnpjCpf;
        this.vlMerc = vlMerc;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegC350(){}

    public String getReg() {
        return reg;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSubSer() {
        return subSer;
    }

    public void setSubSer(String subSer) {
        this.subSer = subSer;
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

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
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

    public List<RegC370> getRegC370() {
        return regC370;
    }

    public void setRegC370(List<RegC370> regC370) {
        this.regC370 = regC370;
    }

    public List<RegC390> getRegC390() {
        return regC390;
    }

    public void setRegC390(List<RegC390> regC390) {
        this.regC390 = regC390;
    }
    
}
