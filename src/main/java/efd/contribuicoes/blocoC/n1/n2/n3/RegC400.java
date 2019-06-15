package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC400 {

    @Getter @Inclui
    private final String reg = "C400";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private String ecfMod;

    @Getter @Inclui
    private String ecfFab;

    @Getter @Inclui
    private Integer ecfCx;

    public RegC400(String codMod, String ecfMod, String ecfFab, Integer ecfCx) {
        this.codMod = codMod;
        this.ecfMod = ecfMod;
        this.ecfFab = ecfFab;
        this.ecfCx = ecfCx;
    }

    public RegC400(){ }
}
