package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegE115 implements Serializable {
	private static final long serialVersionUID = 8964512841395206021L;

	@Inclui
    private final String reg = "E115";

    @Inclui
    private String codInfAdic;

    @Inclui
    private BigDecimal vlInfAdic;

    @Inclui
    private String descrComplAj;

    public RegE115(String codInfAdic, BigDecimal vlInfAdic, String descrComplAj) {
        this.codInfAdic = codInfAdic;
        this.vlInfAdic = vlInfAdic;
        this.descrComplAj = descrComplAj;
    }

    public RegE115(){}

    public String getReg() {
        return reg;
    }

    public String getCodInfAdic() {
        return codInfAdic;
    }

    public void setCodInfAdic(String codInfAdic) {
        this.codInfAdic = codInfAdic;
    }

    public BigDecimal getVlInfAdic() {
        return vlInfAdic;
    }

    public void setVlInfAdic(BigDecimal vlInfAdic) {
        this.vlInfAdic = vlInfAdic;
    }

    public String getDescrComplAj() {
        return descrComplAj;
    }

    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }
    
}