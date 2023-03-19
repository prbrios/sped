package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC396;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC395 implements Serializable {
	private static final long serialVersionUID = 6581318586314804253L;

	@Inclui
	private final String reg = "C395";

    @Inclui
    private String codMod;

    @Inclui
    private String codPart;

    @Inclui
    private String ser;

    @Inclui
    private String subSer;

    @Inclui
    private String numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

    @Filho
    private List<RegC396> regC396;

    public RegC395(String codMod, String codPart, String ser, String subSer, String numDoc, LocalDate dtDoc, BigDecimal vlDoc) {
        this.codMod = codMod;
        this.codPart = codPart;
        this.ser = ser;
        this.subSer = subSer;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
    }

    public RegC395(){ }

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
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

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
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

    public List<RegC396> getRegC396() {
        return regC396;
    }

    public void setRegC396(List<RegC396> regC396) {
        this.regC396 = regC396;
    }
    
}
