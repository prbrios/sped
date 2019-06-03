package efd.icmsipi.bloco1.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg1990 {

    @Inclui
    private final String reg = "1990";

    @Inclui
    private Integer qtdLin1;

    public Reg1990(Integer qtdLin1) {
        this.qtdLin1 = qtdLin1;
    }

    public Reg1990(){}

}