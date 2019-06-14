package efd.contribuicoes.bloco0.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg0208 {

    @Inclui
    private final String reg = "0208";

    @Inclui
    private String codTab;

    @Inclui
    private String codGru;

    @Inclui
    private String marcaCom;

    public Reg0208(String codTab, String codGru, String marcaCom) {
        this.codTab = codTab;
        this.codGru = codGru;
        this.marcaCom = marcaCom;
    }

    public Reg0208(){}
}
