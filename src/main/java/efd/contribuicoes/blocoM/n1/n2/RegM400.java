package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM400 {

    @Inclui
    private final String reg = "M400";

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlTotRec;

    @Inclui
    private String codCta;

    @Inclui
    private String descCompl;

}
