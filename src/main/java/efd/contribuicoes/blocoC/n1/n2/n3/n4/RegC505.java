package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC505 implements Serializable {
	private static final long serialVersionUID = -2993718949747823219L;

	@Getter @Inclui
	private final String reg = "C505";

    @Getter @Setter @Inclui
    private Integer cstCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    @Getter @Setter @Inclui
    private String natBcCred;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codCta;

    public RegC505(Integer cstCofins, BigDecimal vlItem, String natBcCred, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta) {
        this.cstCofins = cstCofins;
        this.vlItem = vlItem;
        this.natBcCred = natBcCred;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegC505(){ }
}
