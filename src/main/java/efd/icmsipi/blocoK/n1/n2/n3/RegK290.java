package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK291;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK292;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class RegK290 implements Serializable {
	private static final long serialVersionUID = -4942167884255288342L;

	@Inclui
    private final String reg = "K290";

    @Inclui
    private LocalDate dtIniOp;

    @Inclui
    private LocalDate dtFinOp;

    @Inclui
    private String codDocOp;

    @Filho
    private List<RegK291> regK291;

    @Filho
    private List<RegK292> regK292;

    public RegK290(LocalDate dtIniOp, LocalDate dtFinOp, String codDocOp) {
        this.dtIniOp = dtIniOp;
        this.dtFinOp = dtFinOp;
        this.codDocOp = codDocOp;
    }

    public RegK290(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtIniOp() {
        return dtIniOp;
    }

    public void setDtIniOp(LocalDate dtIniOp) {
        this.dtIniOp = dtIniOp;
    }

    public LocalDate getDtFinOp() {
        return dtFinOp;
    }

    public void setDtFinOp(LocalDate dtFinOp) {
        this.dtFinOp = dtFinOp;
    }

    public String getCodDocOp() {
        return codDocOp;
    }

    public void setCodDocOp(String codDocOp) {
        this.codDocOp = codDocOp;
    }

    public List<RegK291> getRegK291() {
        return regK291;
    }

    public void setRegK291(List<RegK291> regK291) {
        this.regK291 = regK291;
    }

    public List<RegK292> getRegK292() {
        return regK292;
    }

    public void setRegK292(List<RegK292> regK292) {
        this.regK292 = regK292;
    }
    
}