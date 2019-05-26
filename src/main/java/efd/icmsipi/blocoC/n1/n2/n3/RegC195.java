package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC197;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegC195 {

    @Inclui
    private final String reg = "C195";

    @Inclui
    private String codObs;

    @Inclui
    private String txtCompl;

    @Filho
    private List<RegC197> regC197;

}
