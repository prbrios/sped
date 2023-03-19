package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE230;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE240;

import java.io.Serializable;
import java.math.BigDecimal;

import java.util.List;

public class RegE220 implements Serializable {
	private static final long serialVersionUID = -7498026840575874663L;

	@Inclui
    private final String reg = "E220";

    @Inclui
    private String codAjApur;

    @Inclui
    private String descrComplAj;

    @Inclui
    private BigDecimal vlAjApur;

    @Filho
    private List<RegE230> regE230;

    @Filho
    private List<RegE240> regE240;

    public RegE220(String codAjApur, String descrComplAj, BigDecimal vlAjApur) {
        this.codAjApur = codAjApur;
        this.descrComplAj = descrComplAj;
        this.vlAjApur = vlAjApur;
    }

    public RegE220(){}

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

    public List<RegE230> getRegE230() {
        return regE230;
    }

    public void setRegE230(List<RegE230> regE230) {
        this.regE230 = regE230;
    }

    public List<RegE240> getRegE240() {
        return regE240;
    }

    public void setRegE240(List<RegE240> regE240) {
        this.regE240 = regE240;
    }
    
}