package efd.contribuicoes.blocoA.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegA110 {

    @Getter @Inclui
private final String reg = "A110";

    @Getter @Setter @Inclui
    private String codInf;

    @Getter @Setter @Inclui
    private String txtCompl;

    public RegA110(String codInf, String txtCompl) {
        this.codInf = codInf;
        this.txtCompl = txtCompl;
    }

    public RegA110(){ }
}
