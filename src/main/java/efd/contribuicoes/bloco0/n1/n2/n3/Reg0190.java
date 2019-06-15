package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0190 {

    @Getter @Inclui
    private final String reg = "0190";

    @Getter @Inclui
    private String unid;

    @Getter @Inclui
    private String descr;

    public Reg0190(String unid, String descr) {
        this.unid = unid;
        this.descr = descr;
    }

    public Reg0190(){}
}
