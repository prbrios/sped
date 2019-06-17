package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC405;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC489;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @Getter @Setter @Filho
    private List<RegC405> regC405;

    @Getter @Setter @Filho
    private List<RegC489> regC489;

    public RegC400(String codMod, String ecfMod, String ecfFab, Integer ecfCx) {
        this.codMod = codMod;
        this.ecfMod = ecfMod;
        this.ecfFab = ecfFab;
        this.ecfCx = ecfCx;
    }

    public RegC400(){ }
}
