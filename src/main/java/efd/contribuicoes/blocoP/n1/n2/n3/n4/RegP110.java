package efd.contribuicoes.blocoP.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegP110 {

    @Inclui
    private final String reg = "P110";

    @Inclui
    private String numCampo;

    @Inclui
    private String codDet;

    @Inclui
    private BigDecimal detValor;

    @Inclui
    private String infCompl;

}
