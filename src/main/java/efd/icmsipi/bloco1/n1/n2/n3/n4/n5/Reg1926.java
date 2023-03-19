package efd.icmsipi.bloco1.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg1926 implements Serializable {
	private static final long serialVersionUID = -3288312024347411712L;

	@Inclui
    private final String reg = "1926";

    @Inclui
    private String codOr;

    @Inclui
    private Integer vlOr;

    @Inclui
    private LocalDate dtVcto;

    @Inclui
    private String codRec;

    @Inclui
    private String nunProc;

    @Inclui
    private String indProc;

    @Inclui
    private String proc;

    @Inclui
    private String txtCompl;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate mesRef;

    public Reg1926(String codOr, Integer vlOr, LocalDate dtVcto, String codRec, String nunProc, String indProc, String proc, String txtCompl, LocalDate mesRef) {
        this.codOr = codOr;
        this.vlOr = vlOr;
        this.dtVcto = dtVcto;
        this.codRec = codRec;
        this.nunProc = nunProc;
        this.indProc = indProc;
        this.proc = proc;
        this.txtCompl = txtCompl;
        this.mesRef = mesRef;
    }

    public Reg1926(){}

    public String getReg() {
        return reg;
    }

    public String getCodOr() {
        return codOr;
    }

    public void setCodOr(String codOr) {
        this.codOr = codOr;
    }

    public Integer getVlOr() {
        return vlOr;
    }

    public void setVlOr(Integer vlOr) {
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

    public String getNunProc() {
        return nunProc;
    }

    public void setNunProc(String nunProc) {
        this.nunProc = nunProc;
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