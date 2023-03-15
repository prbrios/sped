package efd.contribuicoes.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1502 implements Serializable {
	private static final long serialVersionUID = 2811756418690204954L;

	@Getter @Inclui
	private final String reg = "1502";

    @Getter @Setter @Inclui
    private BigDecimal vlCredCofinsTribMi;

    @Getter @Setter @Inclui
    private BigDecimal vlCredCofinsNtMi;

    @Getter @Setter @Inclui
    private BigDecimal vlCredCofinsExp;

    public Reg1502(BigDecimal vlCredCofinsTribMi, BigDecimal vlCredCofinsNtMi, BigDecimal vlCredCofinsExp) {
        this.vlCredCofinsTribMi = vlCredCofinsTribMi;
        this.vlCredCofinsNtMi = vlCredCofinsNtMi;
        this.vlCredCofinsExp = vlCredCofinsExp;
    }

    public Reg1502(){ }
}
