package efd.contribuicoes.blocoP.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegP110 {

    @Getter @Inclui
    private final String reg = "P110";

    @Getter @Inclui
    private String numCampo;

    @Getter @Inclui
    private String codDet;

    @Getter @Inclui
    private BigDecimal detValor;

    @Getter @Inclui
    private String infCompl;

    public RegP110(String numCampo, String codDet, BigDecimal detValor, String infCompl) {
        this.numCampo = numCampo;
        this.codDet = codDet;
        this.detValor = detValor;
        this.infCompl = infCompl;
    }

    public RegP110(){}
}
