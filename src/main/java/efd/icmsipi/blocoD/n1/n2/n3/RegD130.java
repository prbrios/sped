package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD130 {

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

    public RegD130(String codPartConsg, String codPartRed, String indFrtRed, Integer codMunOrig, Integer codMunDest, String veicId, BigDecimal vlLiqFrt, BigDecimal vlSecCat, BigDecimal vlDesp, BigDecimal vlPedg, BigDecimal vlOut, BigDecimal vlFrt, String ufId) {
        this.codPartConsg = codPartConsg;
        this.codPartRed = codPartRed;
        this.indFrtRed = indFrtRed;
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
        this.veicId = veicId;
        this.vlLiqFrt = vlLiqFrt;
        this.vlSecCat = vlSecCat;
        this.vlDesp = vlDesp;
        this.vlPedg = vlPedg;
        this.vlOut = vlOut;
        this.vlFrt = vlFrt;
        this.ufId = ufId;
    }

    public RegD130(){}
}