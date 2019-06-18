package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC105 {

    @Getter @Inclui
    private final String reg = "C105";

    @Getter @Setter @Inclui
    private Integer oper;

    @Getter @Setter @Inclui
    private String uf;

    public RegC105(Integer oper, String uf) {
        this.oper = oper;
        this.uf = uf;
    }

    public RegC105(){}
}
