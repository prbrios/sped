package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg0450 {

    @Inclui
    private final String reg = "0450";

    @Inclui
    private String codInf;

    @Inclui
    private String txt;

    public Reg0450(String codInf, String txt) {
        this.codInf = codInf;
        this.txt = txt;
    }

    public Reg0450(){}

}
