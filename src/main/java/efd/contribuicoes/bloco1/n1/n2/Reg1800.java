package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1809;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Reg1800 implements Serializable {
	private static final long serialVersionUID = 218122543739445591L;

	@Inclui
	private final String reg = "1800";

    @Inclui
    private String incImob;

    @Inclui
    private BigDecimal recRecebRet;

    @Inclui
    private BigDecimal recFinRet;

    @Inclui
    private BigDecimal bcRet;

    @Inclui
    private BigDecimal aliqRet;

    @Inclui
    private BigDecimal vlRecUni;

    @Inclui
    private LocalDate dtRecUni;

    @Inclui
    private String codRec;

    @Filho
    private List<Reg1809> reg1809;

    public Reg1800(String incImob, BigDecimal recRecebRet, BigDecimal recFinRet, BigDecimal bcRet, BigDecimal aliqRet, BigDecimal vlRecUni, LocalDate dtRecUni, String codRec) {
        this.incImob = incImob;
        this.recRecebRet = recRecebRet;
        this.recFinRet = recFinRet;
        this.bcRet = bcRet;
        this.aliqRet = aliqRet;
        this.vlRecUni = vlRecUni;
        this.dtRecUni = dtRecUni;
        this.codRec = codRec;
    }

    public Reg1800(){ }

    public String getReg() {
        return reg;
    }

    public String getIncImob() {
        return incImob;
    }

    public void setIncImob(String incImob) {
        this.incImob = incImob;
    }

    public BigDecimal getRecRecebRet() {
        return recRecebRet;
    }

    public void setRecRecebRet(BigDecimal recRecebRet) {
        this.recRecebRet = recRecebRet;
    }

    public BigDecimal getRecFinRet() {
        return recFinRet;
    }

    public void setRecFinRet(BigDecimal recFinRet) {
        this.recFinRet = recFinRet;
    }

    public BigDecimal getBcRet() {
        return bcRet;
    }

    public void setBcRet(BigDecimal bcRet) {
        this.bcRet = bcRet;
    }

    public BigDecimal getAliqRet() {
        return aliqRet;
    }

    public void setAliqRet(BigDecimal aliqRet) {
        this.aliqRet = aliqRet;
    }

    public BigDecimal getVlRecUni() {
        return vlRecUni;
    }

    public void setVlRecUni(BigDecimal vlRecUni) {
        this.vlRecUni = vlRecUni;
    }

    public LocalDate getDtRecUni() {
        return dtRecUni;
    }

    public void setDtRecUni(LocalDate dtRecUni) {
        this.dtRecUni = dtRecUni;
    }

    public String getCodRec() {
        return codRec;
    }

    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }

    public List<Reg1809> getReg1809() {
        return reg1809;
    }

    public void setReg1809(List<Reg1809> reg1809) {
        this.reg1809 = reg1809;
    }
    
}
