package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD197;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegD195 {

    @Inclui
    private final String reg = "D195";

    @Inclui
    private String codObs;

    @Inclui
    private String txtCompl;

    @Filho
    private List<RegD197> regD197;

}