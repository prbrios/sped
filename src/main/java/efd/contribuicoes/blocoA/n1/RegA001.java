package efd.contribuicoes.blocoA.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoA.n1.n2.RegA010;
import lombok.Getter;
import lombok.Setter;

public class RegA001 {

    @Getter @Inclui
private final String reg = "A001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegA010> regA010;

    public RegA001(String indMov) {
        this.indMov = indMov;
    }

    public RegA001(){ }
}
