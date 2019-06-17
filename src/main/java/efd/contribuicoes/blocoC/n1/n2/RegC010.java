package efd.contribuicoes.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class RegC010 {

    @Getter @Inclui
    private final String reg = "C010";

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Inclui
    private String indEscri;

    @Getter @Setter @Filho
    private List<RegC100> regC100;

    @Getter @Setter @Filho
    private List<RegC180> regC180;

    @Getter @Setter @Filho
    private List<RegC190> regC190;

    @Getter @Setter @Filho
    private List<RegC380> regC380;

    @Getter @Setter @Filho
    private List<RegC395> regC395;

    @Getter @Setter @Filho
    private List<RegC400> regC400;

    @Getter @Setter @Filho
    private List<RegC490> regC490;

    @Getter @Setter @Filho
    private List<RegC500> regC500;

    @Getter @Setter @Filho
    private List<RegC600> regC600;

    @Getter @Setter @Filho
    private List<RegC800> regC800;

    @Getter @Setter @Filho
    private List<RegC860> regC860;

    public RegC010(Long cnpj, String indEscri) {
        this.cnpj = cnpj;
        this.indEscri = indEscri;
    }

    public RegC010(){ }
}
