package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class RegC171 implements Serializable {
	private static final long serialVersionUID = -1659578247789460906L;

	@Getter @Inclui
    private final String reg = "C171";

    @Getter @Setter @Inclui
    private String numTanque;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtde;

    public RegC171(String numTanque, BigDecimal qtde) {
        this.numTanque = numTanque;
        this.qtde = qtde;
    }

    public RegC171(){}
}
