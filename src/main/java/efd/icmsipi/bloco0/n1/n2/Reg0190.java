package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg0190 {

    @Getter @Inclui
    private final String reg = "0190";

    @Getter @Setter @Inclui
    private String unid;

    @Getter @Setter @Inclui
    private String descr;

    public Reg0190(String unid, String descr) {
        this.unid = unid;
        this.descr = descr;
    }

    public Reg0190(){}

}
