package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class Reg1975 implements Serializable {
	private static final long serialVersionUID = 5326597734921825667L;

	@Getter @Inclui
    private final String reg = "1975";

    @Getter @Setter @Inclui
    private BigDecimal aliqImpBase;

    @Getter @Setter @Inclui
    private BigDecimal g310;

    @Getter @Setter @Inclui
    private BigDecimal g311;

    @Getter @Setter @Inclui
    private BigDecimal g312;

    public Reg1975(BigDecimal aliqImpBase, BigDecimal g310, BigDecimal g311, BigDecimal g312) {
        this.aliqImpBase = aliqImpBase;
        this.g310 = g310;
        this.g311 = g311;
        this.g312 = g312;
    }

    public Reg1975(){}

}