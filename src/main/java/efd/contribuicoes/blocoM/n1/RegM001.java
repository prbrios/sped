package efd.contribuicoes.blocoM.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.RegM100;
import efd.contribuicoes.blocoM.n1.n2.RegM200;
import efd.contribuicoes.blocoM.n1.n2.RegM300;
import efd.contribuicoes.blocoM.n1.n2.RegM350;
import efd.contribuicoes.blocoM.n1.n2.RegM400;
import efd.contribuicoes.blocoM.n1.n2.RegM500;
import efd.contribuicoes.blocoM.n1.n2.RegM600;
import efd.contribuicoes.blocoM.n1.n2.RegM700;
import efd.contribuicoes.blocoM.n1.n2.RegM800;
import lombok.Getter;
import lombok.Setter;


public class RegM001 {

    @Getter @Inclui
private final String reg = "M001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegM100> regM100;

    @Getter @Setter @Filho
    private RegM200 regM200;

    @Getter @Setter @Filho
    private List<RegM300> regM300;

    @Getter @Setter @Filho
    private RegM350 regM350;

    @Getter @Setter @Filho
    private List<RegM400> regM400;

    @Getter @Setter @Filho
    private List<RegM500> regM500;

    @Getter @Setter @Filho
    private RegM600 regM600;

    @Getter @Setter @Filho
    private List<RegM700> regM700;

    @Getter @Setter @Filho
    private List<RegM800> regM800;

    public RegM001(String indMov) {
        this.indMov = indMov;
    }

    public RegM001(){}
}
