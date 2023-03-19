package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1050 implements Serializable {
	private static final long serialVersionUID = 1736780896955279789L;

	@Inclui
	private final String reg = "1050";

    @Inclui
    private LocalDate dtRef;

    @Inclui
    private String indAjBc;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private BigDecimal vlAjCst01;

    @Inclui
    private BigDecimal vlAjCst02;

    @Inclui
    private BigDecimal vlAjCst03;

    @Inclui
    private BigDecimal vlAjCst04;

    @Inclui
    private BigDecimal vlAjCst05;

    @Inclui
    private BigDecimal vlAjCst06;

    @Inclui
    private BigDecimal vlAjCst07;

    @Inclui
    private BigDecimal vlAjCst08;

    @Inclui
    private BigDecimal vlAjCst09;

    @Inclui
    private BigDecimal vlAjCst49;

    @Inclui
    private BigDecimal vlAjCst99;

    @Inclui
    private String indAprop;

    @Inclui
    private String numRec;

    @Inclui
    private String infoCompl;

    public Reg1050(LocalDate dtRef, String indAjBc, Long cnpj, BigDecimal vlAjCst01, BigDecimal vlAjCst02, BigDecimal vlAjCst03, BigDecimal vlAjCst04, BigDecimal vlAjCst05, BigDecimal vlAjCst06, BigDecimal vlAjCst07, BigDecimal vlAjCst08, BigDecimal vlAjCst09, BigDecimal vlAjCst49, BigDecimal vlAjCst99, String indAprop, String numRec, String infoCompl) {
        this.dtRef = dtRef;
        this.indAjBc = indAjBc;
        this.cnpj = cnpj;
        this.vlAjCst01 = vlAjCst01;
        this.vlAjCst02 = vlAjCst02;
        this.vlAjCst03 = vlAjCst03;
        this.vlAjCst04 = vlAjCst04;
        this.vlAjCst05 = vlAjCst05;
        this.vlAjCst06 = vlAjCst06;
        this.vlAjCst07 = vlAjCst07;
        this.vlAjCst08 = vlAjCst08;
        this.vlAjCst09 = vlAjCst09;
        this.vlAjCst49 = vlAjCst49;
        this.vlAjCst99 = vlAjCst99;
        this.indAprop = indAprop;
        this.numRec = numRec;
        this.infoCompl = infoCompl;
    }

    public Reg1050(){ }

    public String getReg() {
        return reg;
    }

    public LocalDate getDtRef() {
        return dtRef;
    }

    public void setDtRef(LocalDate dtRef) {
        this.dtRef = dtRef;
    }

    public String getIndAjBc() {
        return indAjBc;
    }

    public void setIndAjBc(String indAjBc) {
        this.indAjBc = indAjBc;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public BigDecimal getVlAjCst01() {
        return vlAjCst01;
    }

    public void setVlAjCst01(BigDecimal vlAjCst01) {
        this.vlAjCst01 = vlAjCst01;
    }

    public BigDecimal getVlAjCst02() {
        return vlAjCst02;
    }

    public void setVlAjCst02(BigDecimal vlAjCst02) {
        this.vlAjCst02 = vlAjCst02;
    }

    public BigDecimal getVlAjCst03() {
        return vlAjCst03;
    }

    public void setVlAjCst03(BigDecimal vlAjCst03) {
        this.vlAjCst03 = vlAjCst03;
    }

    public BigDecimal getVlAjCst04() {
        return vlAjCst04;
    }

    public void setVlAjCst04(BigDecimal vlAjCst04) {
        this.vlAjCst04 = vlAjCst04;
    }

    public BigDecimal getVlAjCst05() {
        return vlAjCst05;
    }

    public void setVlAjCst05(BigDecimal vlAjCst05) {
        this.vlAjCst05 = vlAjCst05;
    }

    public BigDecimal getVlAjCst06() {
        return vlAjCst06;
    }

    public void setVlAjCst06(BigDecimal vlAjCst06) {
        this.vlAjCst06 = vlAjCst06;
    }

    public BigDecimal getVlAjCst07() {
        return vlAjCst07;
    }

    public void setVlAjCst07(BigDecimal vlAjCst07) {
        this.vlAjCst07 = vlAjCst07;
    }

    public BigDecimal getVlAjCst08() {
        return vlAjCst08;
    }

    public void setVlAjCst08(BigDecimal vlAjCst08) {
        this.vlAjCst08 = vlAjCst08;
    }

    public BigDecimal getVlAjCst09() {
        return vlAjCst09;
    }

    public void setVlAjCst09(BigDecimal vlAjCst09) {
        this.vlAjCst09 = vlAjCst09;
    }

    public BigDecimal getVlAjCst49() {
        return vlAjCst49;
    }

    public void setVlAjCst49(BigDecimal vlAjCst49) {
        this.vlAjCst49 = vlAjCst49;
    }

    public BigDecimal getVlAjCst99() {
        return vlAjCst99;
    }

    public void setVlAjCst99(BigDecimal vlAjCst99) {
        this.vlAjCst99 = vlAjCst99;
    }

    public String getIndAprop() {
        return indAprop;
    }

    public void setIndAprop(String indAprop) {
        this.indAprop = indAprop;
    }

    public String getNumRec() {
        return numRec;
    }

    public void setNumRec(String numRec) {
        this.numRec = numRec;
    }

    public String getInfoCompl() {
        return infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }
    
}
