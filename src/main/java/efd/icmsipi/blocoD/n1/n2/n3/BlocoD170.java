package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoD170 {

    @Inclui
    private final String reg = "D170";

    @Inclui
    private String codPartConsg;

    @Inclui
    private String codPartRed;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Inclui
    private String otm;

    @Inclui
    private String indNatFrt;

    @Inclui
    private BigDecimal vlLiqFrt;

    @Inclui
    private BigDecimal vlGris;

    @Inclui
    private BigDecimal vlPdg;

    @Inclui
    private BigDecimal vlOut;

    @Inclui
    private BigDecimal vlFrt;

    @Inclui
    private String veicId;

    @Inclui
    private String ufId;

}