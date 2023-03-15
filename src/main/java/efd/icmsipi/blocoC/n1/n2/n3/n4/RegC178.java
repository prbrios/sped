package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegC178 implements Serializable {
	private static final long serialVersionUID = 3661440278605105432L;

	@Getter @Inclui
    private final String reg = "C178";

    @Getter @Setter @Inclui
    private String clEnq;

    @Getter @Setter @Inclui
    private BigDecimal vlUnid;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal quantPad;

    public RegC178(String clEnq, BigDecimal vlUnid, BigDecimal quantPad) {
        this.clEnq = clEnq;
        this.vlUnid = vlUnid;
        this.quantPad = quantPad;
    }

    public RegC178(){}
}
