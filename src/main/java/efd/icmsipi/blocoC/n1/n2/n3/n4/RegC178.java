package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC178 implements Serializable {
	private static final long serialVersionUID = 3661440278605105432L;

	@Inclui
    private final String reg = "C178";

    @Inclui
    private String clEnq;

    @Inclui
    private BigDecimal vlUnid;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantPad;

    public RegC178(String clEnq, BigDecimal vlUnid, BigDecimal quantPad) {
        this.clEnq = clEnq;
        this.vlUnid = vlUnid;
        this.quantPad = quantPad;
    }

    public RegC178(){}

    public String getReg() {
        return reg;
    }

    public String getClEnq() {
        return clEnq;
    }

    public void setClEnq(String clEnq) {
        this.clEnq = clEnq;
    }

    public BigDecimal getVlUnid() {
        return vlUnid;
    }

    public void setVlUnid(BigDecimal vlUnid) {
        this.vlUnid = vlUnid;
    }

    public BigDecimal getQuantPad() {
        return quantPad;
    }

    public void setQuantPad(BigDecimal quantPad) {
        this.quantPad = quantPad;
    }
    
}
