package efd.icmsipi.blocoC.n1.n2.n3;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC197;
import lombok.Getter;
import lombok.Setter;


public class RegC195 {

    @Getter @Inclui
    private final String reg = "C195";

    @Getter @Setter @Inclui
    private String codObs;

    @Getter @Setter @Inclui
    private String txtCompl;

    @Getter @Setter @Filho
    private List<RegC197> regC197;

    public RegC195(String codObs, String txtCompl) {
        this.codObs = codObs;
        this.txtCompl = txtCompl;
    }

    public RegC195(){}
}
