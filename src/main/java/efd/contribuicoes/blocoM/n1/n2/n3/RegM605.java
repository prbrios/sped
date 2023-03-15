package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM605 implements Serializable {
	private static final long serialVersionUID = 4313931287339915996L;

	@Getter @Inclui
	private final String reg = "M605";

    @Getter @Setter @Inclui
    private String numCampo;

    @Getter @Setter @Inclui
    private String codRec;

    @Getter @Setter @Inclui
    private BigDecimal vlDebito;

    public RegM605(String numCampo, String codRec, BigDecimal vlDebito) {
        this.numCampo = numCampo;
        this.codRec = codRec;
        this.vlDebito = vlDebito;
    }

    public RegM605(){}
}
