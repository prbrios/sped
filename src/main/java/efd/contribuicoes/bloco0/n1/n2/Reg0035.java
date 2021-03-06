package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0035 {

    @Getter @Inclui
    private final String reg = "0035";

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Integer codScp;

    @Getter @Setter @Inclui
    private String descScp;

    @Getter @Setter @Inclui
    private String infComp;

    public Reg0035(Integer codScp, String descScp, String infComp) {
        this.codScp = codScp;
        this.descScp = descScp;
        this.infComp = infComp;
    }

    public Reg0035(){}
}
