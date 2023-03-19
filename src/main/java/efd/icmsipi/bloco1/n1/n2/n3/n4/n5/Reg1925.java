package efd.icmsipi.bloco1.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1925 implements Serializable {
	private static final long serialVersionUID = 4597840382006005280L;

	@Inclui
    private final String reg = "1925";

    @Inclui
    private String codInfAdic;

    @Inclui
    private BigDecimal vlInfAdic;

    @Inclui
    private String descrComplAj;

    public Reg1925(String codInfAdic, BigDecimal vlInfAdic, String descrComplAj) {
        this.codInfAdic = codInfAdic;
        this.vlInfAdic = vlInfAdic;
        this.descrComplAj = descrComplAj;
    }

    public Reg1925(){}

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