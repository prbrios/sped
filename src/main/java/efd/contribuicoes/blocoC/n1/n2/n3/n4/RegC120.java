package efd.contribuicoes.blocoC.n1.n2.n3.n4;


import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC120 implements Serializable {
	private static final long serialVersionUID = 5121992637141722174L;

	@Getter @Inclui
	private final String reg = "C120";

    @Getter @Setter @Inclui
    private String codDocImp;

    @Getter @Setter @Inclui
    private String numDocImp;

    @Getter @Setter @Inclui
    private BigDecimal vlPisImp;

    @Getter @Setter @Inclui
    private BigDecimal vlCofinsImp;

    @Getter @Setter @Inclui
    private String numAcdRaw;

    public RegC120(String codDocImp, String numDocImp, BigDecimal vlPisImp, BigDecimal vlCofinsImp, String numAcdRaw) {
        this.codDocImp = codDocImp;
        this.numDocImp = numDocImp;
        this.vlPisImp = vlPisImp;
        this.vlCofinsImp = vlCofinsImp;
        this.numAcdRaw = numAcdRaw;
    }

    public RegC120(){}
}
