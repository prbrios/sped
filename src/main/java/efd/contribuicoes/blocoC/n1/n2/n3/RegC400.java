package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegC400 {

    @Inclui
    private final String reg = "C400";

    @Inclui
    private String codMod;

    @Inclui
    private String ecfMod;

    @Inclui
    private String ecfFab;

    @Inclui
    private Integer ecfCx;

}
