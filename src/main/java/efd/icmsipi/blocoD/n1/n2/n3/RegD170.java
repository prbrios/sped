package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegD170 {

    @Getter @Inclui
    private final String reg = "D170";

    @Getter @Setter @Inclui
    private String codPartConsg;

    @Getter @Setter @Inclui
    private String codPartRed;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Getter @Setter @Inclui
    private String otm;

    @Getter @Setter @Inclui
    private String indNatFrt;

    @Getter @Setter @Inclui
    private BigDecimal vlLiqFrt;

    @Getter @Setter @Inclui
    private BigDecimal vlGris;

    @Getter @Setter @Inclui
    private BigDecimal vlPdg;

    @Getter @Setter @Inclui
    private BigDecimal vlOut;

    @Getter @Setter @Inclui
    private BigDecimal vlFrt;

    @Getter @Setter @Inclui
    private String veicId;

    @Getter @Setter @Inclui
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