package efd.contribuicoes.blocoP.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegP110 implements Serializable {
	private static final long serialVersionUID = 1576155504418536275L;

	@Getter @Inclui
	private final String reg = "P110";

    @Getter @Setter @Inclui
    private String numCampo;

    @Getter @Setter @Inclui
    private String codDet;

    @Getter @Setter @Inclui
    private BigDecimal detValor;

    @Getter @Setter @Inclui
    private String infCompl;

    public RegP110(String numCampo, String codDet, BigDecimal detValor, String infCompl) {
        this.numCampo = numCampo;
        this.codDet = codDet;
        this.detValor = detValor;
        this.infCompl = infCompl;
    }

    public RegP110(){}
}
