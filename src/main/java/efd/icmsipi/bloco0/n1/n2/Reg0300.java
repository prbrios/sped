package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0305;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg0300 {

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
    private Reg0305 bloco0350;

    public Reg0300(String codIndBem, String identMerc, String descrItem, String codPrnc, String codCta, Integer nrParc) {

        this.codIndBem = codIndBem;
        this.identMerc = identMerc;
        this.descrItem = descrItem;
        this.codPrnc = codPrnc;
        this.codCta = codCta;
        this.nrParc = nrParc;
    }

    public Reg0300(){}

}
