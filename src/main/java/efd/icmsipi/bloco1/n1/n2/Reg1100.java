package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1105;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Reg1100 implements Serializable {
	private static final long serialVersionUID = -6237447753372042347L;

	@Inclui
    private final String reg = "1100";

    @Inclui
    private Integer indDoc;

    @Inclui
    private String nroDe;

    @Inclui
    private LocalDate dtDe;

    @Inclui
    private Integer natExp;

    @Inclui
    private Integer nroRe;

    @Inclui
    private LocalDate dtRe;

    @Inclui
    private String chcEmb;

    @Inclui
    private LocalDate dtChc;

    @Inclui
    private LocalDate dtAvb;

    @Inclui(zerosEsquerda = 2)
    private Integer tpChc;

    @Inclui
    private Integer pais;

    @Filho
    private List<Reg1105> reg1105;

    public Reg1100(Integer indDoc, String nroDe, LocalDate dtDe, Integer natExp, Integer nroRe, LocalDate dtRe, String chcEmb, LocalDate dtChc, LocalDate dtAvb, Integer tpChc, Integer pais) {
        this.indDoc = indDoc;
        this.nroDe = nroDe;
        this.dtDe = dtDe;
        this.natExp = natExp;
        this.nroRe = nroRe;
        this.dtRe = dtRe;
        this.chcEmb = chcEmb;
        this.dtChc = dtChc;
        this.dtAvb = dtAvb;
        this.tpChc = tpChc;
        this.pais = pais;
    }

    public Reg1100(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndDoc() {
        return indDoc;
    }

    public void setIndDoc(Integer indDoc) {
        this.indDoc = indDoc;
    }

    public String getNroDe() {
        return nroDe;
    }

    public void setNroDe(String nroDe) {
        this.nroDe = nroDe;
    }

    public LocalDate getDtDe() {
        return dtDe;
    }

    public void setDtDe(LocalDate dtDe) {
        this.dtDe = dtDe;
    }

    public Integer getNatExp() {
        return natExp;
    }

    public void setNatExp(Integer natExp) {
        this.natExp = natExp;
    }

    public Integer getNroRe() {
        return nroRe;
    }

    public void setNroRe(Integer nroRe) {
        this.nroRe = nroRe;
    }

    public LocalDate getDtRe() {
        return dtRe;
    }

    public void setDtRe(LocalDate dtRe) {
        this.dtRe = dtRe;
    }

    public String getChcEmb() {
        return chcEmb;
    }

    public void setChcEmb(String chcEmb) {
        this.chcEmb = chcEmb;
    }

    public LocalDate getDtChc() {
        return dtChc;
    }

    public void setDtChc(LocalDate dtChc) {
        this.dtChc = dtChc;
    }

    public LocalDate getDtAvb() {
        return dtAvb;
    }

    public void setDtAvb(LocalDate dtAvb) {
        this.dtAvb = dtAvb;
    }

    public Integer getTpChc() {
        return tpChc;
    }

    public void setTpChc(Integer tpChc) {
        this.tpChc = tpChc;
    }

    public Integer getPais() {
        return pais;
    }

    public void setPais(Integer pais) {
        this.pais = pais;
    }

    public List<Reg1105> getReg1105() {
        return reg1105;
    }

    public void setReg1105(List<Reg1105> reg1105) {
        this.reg1105 = reg1105;
    }
    
}