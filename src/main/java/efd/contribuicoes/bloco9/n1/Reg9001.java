package efd.contribuicoes.bloco9.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg9001 {

    @Getter @Inclui
    private final String reg = "9001";
    
    @Getter @Inclui
    private Integer indMov;

    public Reg9001(Integer indMov) {
        this.indMov = indMov;
    }

    public Reg9001(){ }
}
