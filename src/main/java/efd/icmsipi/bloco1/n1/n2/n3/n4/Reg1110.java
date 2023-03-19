package efd.icmsipi.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1110 implements Serializable {
	private static final long serialVersionUID = 4153514942598913588L;

	@Inclui
    private final String reg = "1110";

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Long numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private String chvNfe;

    @Inclui
    private Integer nrMemo;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private String unid;

    public Reg1110(String codPart, String codMod, String ser, Long numDoc, LocalDate dtDoc, String chvNfe, Integer nrMemo, BigDecimal qtd, String unid) {
        this.codPart = codPart;
        this.codMod = codMod;
        this.ser = ser;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.chvNfe = chvNfe;
        this.nrMemo = nrMemo;
        this.qtd = qtd;
        this.unid = unid;
    }

    public Reg1110(){}

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

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
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

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public Integer getNrMemo() {
        return nrMemo;
    }

    public void setNrMemo(Integer nrMemo) {
        this.nrMemo = nrMemo;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }
    
}