package efd.contribuicoes.bloco9.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg9900 {

    @Getter @Inclui
private final String reg = "9900";
    
    @Getter @Setter @Inclui
    private String regBlc;
    
    @Getter @Setter @Inclui
    private Integer qtdRegBlc;

    public Reg9900(String regBlc, Integer qtdRegBlc) {
        this.regBlc = regBlc;
        this.qtdRegBlc = qtdRegBlc;
    }

    public Reg9900(){ }
}
