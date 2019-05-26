package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD355;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegD350 {

    @Inclui
    private final String reg = "D350";

    @Inclui
    private String codMod;

    @Inclui
    private String ecfMod;

    @Inclui
    private String ecfFab;

    @Inclui
    private Integer ecfCx;

    @Filho
    private List<RegD355> regD355;

}