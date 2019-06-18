package efd.icmsipi.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg0305 {

    @Getter @Inclui
    private final String reg = "0305";

    @Getter @Setter @Inclui
    private String codCcus;

    @Getter @Setter @Inclui
    private String func;

    @Getter @Setter @Inclui
    private Integer vidaUtil;

    public Reg0305(String codCcus, String func, Integer vidaUtil) {
        this.codCcus = codCcus;
        this.func = func;
        this.vidaUtil = vidaUtil;
    }

    public Reg0305(){}

}
