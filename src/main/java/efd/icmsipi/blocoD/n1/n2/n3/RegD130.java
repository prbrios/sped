package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegD130 implements Serializable {
	private static final long serialVersionUID = 1281485750075852594L;

	@Getter @Inclui
    private final String reg = "D130";

    @Getter @Setter @Inclui
    private String codPartConsg;

    @Getter @Setter @Inclui
    private String codPartRed;

    @Getter @Setter @Inclui
    private String indFrtRed;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Getter @Setter @Inclui
    private String veicId;

    @Getter @Setter @Inclui
    private BigDecimal vlLiqFrt;

    @Getter @Setter @Inclui
    private BigDecimal vlSecCat;

    @Getter @Setter @Inclui
    private BigDecimal vlDesp;

    @Getter @Setter @Inclui
    private BigDecimal vlPedg;

    @Getter @Setter @Inclui
    private BigDecimal vlOut;

    @Getter @Setter @Inclui
    private BigDecimal vlFrt;

    @Getter @Setter @Inclui
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