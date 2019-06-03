package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegC105 {

    @Inclui
    private final String reg = "C105";

    @Inclui
    private Integer oper;

    @Inclui
    private String uf;

    public RegC105(Integer oper, String uf) {
        this.oper = oper;
        this.uf = uf;
    }

    public RegC105(){}
}
