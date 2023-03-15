package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC501 implements Serializable {
	private static final long serialVersionUID = -4493938128163316773L;

	@Getter @Inclui
	private final String reg = "C501";

    @Getter @Setter @Inclui
    private Integer cstPis;

    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    @Getter @Setter @Inclui
    private String natBcCred;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private String codCta;

    public RegC501(Integer cstPis, BigDecimal vlItem, String natBcCred, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, String codCta) {
        this.cstPis = cstPis;
        this.vlItem = vlItem;
        this.natBcCred = natBcCred;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.codCta = codCta;
    }

    public RegC501(){}
}
