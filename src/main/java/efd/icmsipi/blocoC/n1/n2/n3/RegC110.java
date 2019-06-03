package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegC110 {

    @Inclui
    private final String reg = "C110";

    @Inclui
    private String codInf;

    @Inclui
    private String txtCompl;

    @Filho
    private List<RegC111> regC111;

    @Filho
    private List<RegC112> regC112;

    @Filho
    private List<RegC113> regC113;

    @Filho
    private List<RegC114> regC114;

    @Filho
    private List<RegC115> regC115;

    @Filho
    private List<RegC116> regC116;

    public RegC110(String codInf, String txtCompl) {
        this.codInf = codInf;
        this.txtCompl = txtCompl;
    }

    public RegC110(){}
}
