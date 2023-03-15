package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;



public class RegC120 implements Serializable {
	private static final long serialVersionUID = 2585691622861994189L;

	@Getter @Inclui
    private final String reg = "C120";

    @Getter @Setter @Inclui
    private String codDocImp;

    @Getter @Setter @Inclui
    private String numDocImp;

    @Getter @Setter @Inclui
    private BigDecimal pisImp;

    @Getter @Setter @Inclui
    private BigDecimal cofinsImp;

    @Getter @Setter @Inclui
    private String numAcdraw;

    public RegC120(String codDocImp, String numDocImp, BigDecimal pisImp, BigDecimal cofinsImp, String numAcdraw) {
        this.codDocImp = codDocImp;
        this.numDocImp = numDocImp;
        this.pisImp = pisImp;
        this.cofinsImp = cofinsImp;
        this.numAcdraw = numAcdraw;
    }

    public RegC120(){}
}
