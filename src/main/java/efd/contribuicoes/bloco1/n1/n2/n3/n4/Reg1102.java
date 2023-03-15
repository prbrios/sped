package efd.contribuicoes.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1102 implements Serializable {
	private static final long serialVersionUID = -8670415153774807600L;

	@Getter @Inclui
	private final String reg = "1102";

    @Getter @Setter @Inclui
    private BigDecimal vlCredPisTribMi;

    @Getter @Setter @Inclui
    private BigDecimal vlCredPisNtMi;

    @Getter @Setter @Inclui
    private BigDecimal vlCredPisExp;

    public Reg1102(BigDecimal vlCredPisTribMi, BigDecimal vlCredPisNtMi, BigDecimal vlCredPisExp) {
        this.vlCredPisTribMi = vlCredPisTribMi;
        this.vlCredPisNtMi = vlCredPisNtMi;
        this.vlCredPisExp = vlCredPisExp;
    }

    public Reg1102(){ }
}
