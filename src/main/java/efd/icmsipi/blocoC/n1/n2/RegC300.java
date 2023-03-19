package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC310;
import efd.icmsipi.blocoC.n1.n2.n3.RegC320;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC300 implements Serializable {
	private static final long serialVersionUID = -7757052990099901019L;

	@Inclui
    private final String reg = "C300";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private String sub;

    @Inclui
    private Long numDocIni;

    @Inclui
    private Long numDocFin;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    @Filho
    private List<RegC310> regC310;

    @Filho
    private List<RegC320> regC320;

    public RegC300(String codMod, String ser, String sub, Long numDocIni, Long numDocFin, LocalDate dtDoc, BigDecimal vlDoc, BigDecimal vlPis, BigDecimal vlCofins, String codCta) {
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegC300(){}

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

    public List<RegC310> getRegC310() {
        return regC310;
    }

    public void setRegC310(List<RegC310> regC310) {
        this.regC310 = regC310;
    }

    public List<RegC320> getRegC320() {
        return regC320;
    }

    public void setRegC320(List<RegC320> regC320) {
        this.regC320 = regC320;
    }
    
}
