package efd.icmsipi.bloco0.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg0990 {

    @Inclui
    private final String reg = "0990";

    @Inclui
    private Integer qtdLin0;

    public Reg0990(Integer qtdLin0) {
        this.qtdLin0 = qtdLin0;
    }

    public Reg0990(){}

}
