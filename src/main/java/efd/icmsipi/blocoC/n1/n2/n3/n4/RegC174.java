package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegC174 {

    @Getter @Inclui
    private final String reg = "C174";

    @Getter @Setter @Inclui
    private String indArm;

    @Getter @Setter @Inclui
    private String numArm;

    @Getter @Setter @Inclui
    private String descrCompl;

    public RegC174(String indArm, String numArm, String descrCompl) {
        this.indArm = indArm;
        this.numArm = numArm;
        this.descrCompl = descrCompl;
    }

    public RegC174(){}
}
