package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE312;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE313;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegE311 implements Serializable {
	private static final long serialVersionUID = -4633430079459077980L;

	@Inclui
    private final String reg = "E311";

    @Inclui
    private String codAjApur;

    @Inclui
    private String descrComplAj;

    @Inclui
    private BigDecimal vlAjApur;

    @Filho
    private List<RegE312> regE312;

    @Filho
    private List<RegE313> regE313;

    public RegE311(String codAjApur, String descrComplAj, BigDecimal vlAjApur) {
        this.codAjApur = codAjApur;
        this.descrComplAj = descrComplAj;
        this.vlAjApur = vlAjApur;
    }

    public RegE311(){}

    public String getReg() {
        return reg;
    }

    public String getCodAjApur() {
        return codAjApur;
    }

    public void setCodAjApur(String codAjApur) {
        this.codAjApur = codAjApur;
    }

    public String getDescrComplAj() {
        return descrComplAj;
    }

    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }

    public BigDecimal getVlAjApur() {
        return vlAjApur;
    }

    public void setVlAjApur(BigDecimal vlAjApur) {
        this.vlAjApur = vlAjApur;
    }

    public List<RegE312> getRegE312() {
        return regE312;
    }

    public void setRegE312(List<RegE312> regE312) {
        this.regE312 = regE312;
    }

    public List<RegE313> getRegE313() {
        return regE313;
    }

    public void setRegE313(List<RegE313> regE313) {
        this.regE313 = regE313;
    }
    
}