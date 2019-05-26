package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.BlocoD355;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlocoD350 {

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
    private List<BlocoD355> blocoD355;

}