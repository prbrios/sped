package efd.icmsipi.blocoC.n1.n2.n3;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC111;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC112;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC113;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC114;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC115;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC116;
import lombok.Getter;
import lombok.Setter;


public class RegC110 {

    @Getter @Inclui
    private final String reg = "C110";

    @Getter @Setter @Inclui
    private String codInf;

    @Getter @Setter @Inclui
    private String txtCompl;

    @Getter @Setter @Filho
    private List<RegC111> regC111;

    @Getter @Setter @Filho
    private List<RegC112> regC112;

    @Getter @Setter @Filho
    private List<RegC113> regC113;

    @Getter @Setter @Filho
    private List<RegC114> regC114;

    @Getter @Setter @Filho
    private List<RegC115> regC115;

    @Getter @Setter @Filho
    private List<RegC116> regC116;

    public RegC110(String codInf, String txtCompl) {
        this.codInf = codInf;
        this.txtCompl = txtCompl;
    }

    public RegC110(){}
}
