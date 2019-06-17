package efd.contribuicoes.blocoC.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.RegC010;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class RegC001 {

    @Getter @Inclui
private final String reg = "C001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegC010> regC010;

    public RegC001(String indMov) {
        this.indMov = indMov;
    }

    public RegC001(){ }
}
