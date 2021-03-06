package efd.contribuicoes.blocoF.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.RegF010;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class RegF001 {

    @Getter @Inclui
private final String reg = "F001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegF010> regF010;

    public RegF001(String indMov) {
        this.indMov = indMov;
    }

    public RegF001(){ }
}
