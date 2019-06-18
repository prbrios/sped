package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg0460 {

    @Getter @Inclui
    private final String reg = "0460";

    @Getter @Setter @Inclui
    private String codObs;

    @Getter @Setter @Inclui
    private String txt;

    public Reg0460(String codObs, String txt) {
        this.codObs = codObs;
        this.txt = txt;
    }

    public Reg0460(){}
}
