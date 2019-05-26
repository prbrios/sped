package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoD130 {

    @Inclui
    private final String reg = "D130";

    @Inclui
    private String codPartConsg;

    @Inclui
    private String codPartRed;

    @Inclui
    private String indFrtRed;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Inclui
    private String veicId;

    @Inclui
    private BigDecimal vlLiqFrt;

    @Inclui
    private BigDecimal vlSecCat;

    @Inclui
    private BigDecimal vlDesp;

    @Inclui
    private BigDecimal vlPedg;

    @Inclui
    private BigDecimal vlOut;

    @Inclui
    private BigDecimal vlFrt;

    @Inclui
    private String ufId;

}