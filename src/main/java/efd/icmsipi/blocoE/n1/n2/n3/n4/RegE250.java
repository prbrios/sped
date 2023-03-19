package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegE250 implements Serializable {
	private static final long serialVersionUID = -4584110669319428253L;

	@Inclui
    private final String reg = "E250";

    @Inclui
    private String codOr;

    @Inclui
    private BigDecimal vlOr;

    @Inclui
    private LocalDate dtVcto;

    @Inclui
    private String codRec;

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    @Inclui
    private String proc;

    @Inclui
    private String txtCompl;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate mesRef;

    public RegE250(String codOr, BigDecimal vlOr, LocalDate dtVcto, String codRec, String numProc, String indProc, String proc, String txtCompl, LocalDate mesRef) {
        this.codOr = codOr;
        this.vlOr = vlOr;
        this.dtVcto = dtVcto;
        this.codRec = codRec;
        this.numProc = numProc;
        this.indProc = indProc;
        this.proc = proc;
        this.txtCompl = txtCompl;
        this.mesRef = mesRef;
    }

    public RegE250(){}

    public String getReg() {
        return reg;
    }

    public String getCodOr() {
        return codOr;
    }

    public void setCodOr(String codOr) {
        this.codOr = codOr;
    }

    public BigDecimal getVlOr() {
        return vlOr;
    }

    public void setVlOr(BigDecimal vlOr) {
        this.vlOr = vlOr;
    }

    public LocalDate getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(LocalDate dtVcto) {
        this.dtVcto = dtVcto;
    }

    public String getCodRec() {
        return codRec;
    }

    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public String getIndProc() {
        return indProc;
    }

    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }

    public LocalDate getMesRef() {
        return mesRef;
    }

    public void setMesRef(LocalDate mesRef) {
        this.mesRef = mesRef;
    }
    
}