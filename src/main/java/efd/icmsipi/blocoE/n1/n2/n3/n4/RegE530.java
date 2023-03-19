package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE531;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegE530 implements Serializable {
	private static final long serialVersionUID = 2714268030159211912L;

	@Inclui
    private final String reg = "E330";

    @Inclui
    private String indAj;

    @Inclui
    private BigDecimal vlAj;

    @Inclui
    private String codAj;

    @Inclui
    private String indDoc;

    @Inclui
    private String numDoc;

    @Inclui
    private String descrAj;

    @Filho
    private List<RegE531> regE531;

    public RegE530(String indAj, BigDecimal vlAj, String codAj, String indDoc, String numDoc, String descrAj) {
        this.indAj = indAj;
        this.vlAj = vlAj;
        this.codAj = codAj;
        this.indDoc = indDoc;
        this.numDoc = numDoc;
        this.descrAj = descrAj;
    }

    public RegE530(){}

    public String getReg() {
        return reg;
    }

    public String getIndAj() {
        return indAj;
    }

    public void setIndAj(String indAj) {
        this.indAj = indAj;
    }

    public BigDecimal getVlAj() {
        return vlAj;
    }

    public void setVlAj(BigDecimal vlAj) {
        this.vlAj = vlAj;
    }

    public String getCodAj() {
        return codAj;
    }

    public void setCodAj(String codAj) {
        this.codAj = codAj;
    }

    public String getIndDoc() {
        return indDoc;
    }

    public void setIndDoc(String indDoc) {
        this.indDoc = indDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getDescrAj() {
        return descrAj;
    }

    public void setDescrAj(String descrAj) {
        this.descrAj = descrAj;
    }

    public List<RegE531> getRegE531() {
        return regE531;
    }

    public void setRegE531(List<RegE531> regE531) {
        this.regE531 = regE531;
    }
    
}