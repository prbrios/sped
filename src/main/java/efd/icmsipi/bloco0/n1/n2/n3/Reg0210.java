package efd.icmsipi.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg0210 implements Serializable {
	private static final long serialVersionUID = 1755325632263507573L;

	@Inclui
    private final String reg = "0210";

    @Inclui
    private String codItemComp;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdComp;

    @Inclui(casasDecimais = 4)
    private BigDecimal perda;

    public Reg0210(String codItemComp, BigDecimal qtdComp, BigDecimal perda) {
        this.codItemComp = codItemComp;
        this.qtdComp = qtdComp;
        this.perda = perda;
    }

    public Reg0210(){}

    public String getReg() {
        return reg;
    }

    public String getCodItemComp() {
        return codItemComp;
    }

    public void setCodItemComp(String codItemComp) {
        this.codItemComp = codItemComp;
    }

    public BigDecimal getQtdComp() {
        return qtdComp;
    }

    public void setQtdComp(BigDecimal qtdComp) {
        this.qtdComp = qtdComp;
    }

    public BigDecimal getPerda() {
        return perda;
    }

    public void setPerda(BigDecimal perda) {
        this.perda = perda;
    }
    

}
