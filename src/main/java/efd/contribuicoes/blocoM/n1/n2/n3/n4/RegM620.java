package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.n5.RegM625;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegM620 implements Serializable {
	private static final long serialVersionUID = 3133095555322426241L;

	@Inclui
	private final String reg = "M620";

    @Inclui
    private String indAj;

    @Inclui
    private BigDecimal vlAj;

    @Inclui
    private String codAj;

    @Inclui
    private String numDoc;

    @Inclui
    private String descrAj;

    @Inclui
    private LocalDate dtRef;

    @Filho
    private List<RegM625> regM625;

    public RegM620(String indAj, BigDecimal vlAj, String codAj, String numDoc, String descrAj, LocalDate dtRef) {
        this.indAj = indAj;
        this.vlAj = vlAj;
        this.codAj = codAj;
        this.numDoc = numDoc;
        this.descrAj = descrAj;
        this.dtRef = dtRef;
    }

    public RegM620(){}

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

    public LocalDate getDtRef() {
        return dtRef;
    }

    public void setDtRef(LocalDate dtRef) {
        this.dtRef = dtRef;
    }

    public List<RegM625> getRegM625() {
        return regM625;
    }

    public void setRegM625(List<RegM625> regM625) {
        this.regM625 = regM625;
    }

    
}
