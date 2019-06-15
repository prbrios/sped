package efd.contribuicoes.blocoI.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegI300 {

    @Inclui
    private final String reg = "I300";

    @Inclui
    private String codComp;

    @Inclui
    private BigDecimal detValor;

    @Inclui
    private String codCta;

    @Inclui
    private String infoCompl;

}
