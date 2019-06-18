package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg0015 {

    @Getter @Inclui
    private final String reg = "0015";

    @Getter @Setter @Inclui
    private String ufSt;

    @Getter @Setter @Inclui
    private String ieSt;

    public Reg0015(String ufSt, String ieSt) {
        this.ufSt = ufSt;
        this.ieSt = ieSt;
    }

    public Reg0015(){}

}
