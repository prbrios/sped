package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlocoC110 {

    @Inclui
    private final String reg = "C110";

    @Inclui
    private String codInf;

    @Inclui
    private String txtCompl;

    @Filho
    private List<BlocoC111> blocoC111;

    @Filho
    private List<BlocoC112> blocoC112;

    @Filho
    private List<BlocoC113> blocoC113;

    @Filho
    private List<BlocoC114> blocoC114;

    @Filho
    private List<BlocoC115> blocoC115;

    @Filho
    private List<BlocoC116> blocoC116;

}
