package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE112;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE113;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegE111 implements Serializable {
	private static final long serialVersionUID = -3585467234686335155L;

	@Inclui
    private final String reg = "E111";

    @Inclui
    private String codAjApur;

    @Inclui
    private String descrComplAj;

    @Inclui
    private BigDecimal vlAjApur;

    @Filho
    private List<RegE112> regE112;

    @Filho
    private List<RegE113> regE113;

    public RegE111(String codAjApur, String descrComplAj, BigDecimal vlAjApur) {
        this.codAjApur = codAjApur;
        this.descrComplAj = descrComplAj;
        this.vlAjApur = vlAjApur;
    }

    public RegE111(){}

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

    public List<RegE112> getRegE112() {
        return regE112;
    }

    public void setRegE112(List<RegE112> regE112) {
        this.regE112 = regE112;
    }

    public List<RegE113> getRegE113() {
        return regE113;
    }

    public void setRegE113(List<RegE113> regE113) {
        this.regE113 = regE113;
    }
    
}