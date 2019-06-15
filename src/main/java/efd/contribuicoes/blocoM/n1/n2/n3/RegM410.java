package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM410 {

    @Inclui
    private final String reg = "M410";

    @Inclui
    private String natRec;

    @Inclui
    private BigDecimal vlRec;

    @Inclui
    private String codCta;

    @Inclui
    private String descCompl;

}
