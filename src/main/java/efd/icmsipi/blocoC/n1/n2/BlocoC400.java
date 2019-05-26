package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC310;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC405;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlocoC400 {

    @Inclui
    private final String reg = "C400";

    @Inclui
    private String codMod;

    @Inclui
    private String ecfMod;

    @Inclui
    private String ecfFab;

    @Inclui
    private Integer ecfCx;

    @Filho
    private List<BlocoC405> blocoC405;

}