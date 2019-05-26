package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.n3.Bloco0305;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bloco0300 {

    @Inclui
    private final String reg = "0300";

    @Inclui
    private String codIndBem;

    @Inclui
    private String identMerc;

    @Inclui
    private String descrItem;

    @Inclui
    private String codPrnc;

    @Inclui
    private String codCta;

    @Inclui
    private Integer nrParc;

    @Filho
    private Bloco0305 bloco0350;

}
