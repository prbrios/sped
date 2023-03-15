package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegB440 implements Serializable {
	private static final long serialVersionUID = -7560813795894164582L;

	@Getter @Inclui
    private final String reg = "B440";

    @Getter @Setter @Inclui
    private Integer indOper;

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private BigDecimal vlContRt;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIssRt;

    @Getter @Setter @Inclui
    private BigDecimal vlIssRt;

    public RegB440(Integer indOper, String codPart, BigDecimal vlContRt, BigDecimal vlBcIssRt, BigDecimal vlIssRt) {
        this.indOper = indOper;
        this.codPart = codPart;
        this.vlContRt = vlContRt;
        this.vlBcIssRt = vlBcIssRt;
        this.vlIssRt = vlIssRt;
    }

    public RegB440(){}
}
