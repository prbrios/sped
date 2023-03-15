package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC199 implements Serializable {
	private static final long serialVersionUID = -7681184587320698794L;

	@Getter @Inclui
	private final String reg = "C199";

    @Getter @Setter @Inclui
    private String codDocImp;

    @Getter @Setter @Inclui
    private String numDocImp;

    @Getter @Setter @Inclui
    private BigDecimal vlPisImp;

    @Getter @Setter @Inclui
    private BigDecimal vlCofinsImp;

    @Getter @Setter @Inclui
    private String numAcdraw;

    public RegC199(String codDocImp, String numDocImp, BigDecimal vlPisImp, BigDecimal vlCofinsImp, String numAcdraw) {
        this.codDocImp = codDocImp;
        this.numDocImp = numDocImp;
        this.vlPisImp = vlPisImp;
        this.vlCofinsImp = vlCofinsImp;
        this.numAcdraw = numAcdraw;
    }

    public RegC199(){}
}
