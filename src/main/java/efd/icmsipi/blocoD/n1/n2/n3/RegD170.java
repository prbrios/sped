package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD170 {

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

    public RegD170(String codPartConsg, String codPartRed, Integer codMunOrig, Integer codMunDest, String otm, String indNatFrt, BigDecimal vlLiqFrt, BigDecimal vlGris, BigDecimal vlPdg, BigDecimal vlOut, BigDecimal vlFrt, String veicId, String ufId) {
        this.codPartConsg = codPartConsg;
        this.codPartRed = codPartRed;
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
        this.otm = otm;
        this.indNatFrt = indNatFrt;
        this.vlLiqFrt = vlLiqFrt;
        this.vlGris = vlGris;
        this.vlPdg = vlPdg;
        this.vlOut = vlOut;
        this.vlFrt = vlFrt;
        this.veicId = veicId;
        this.ufId = ufId;
    }

    public RegD170(){}
}