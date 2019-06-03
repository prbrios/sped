package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD140 {

    @Inclui
    private final String reg = "D140";

    @Inclui
    private String codPartConsg;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Inclui
    private String indVeic;

    @Inclui
    private String veicId;

    @Inclui
    private String indNav;

    @Inclui
    private Integer viagem;

    @Inclui
    private BigDecimal vlFrtLiq;

    @Inclui
    private BigDecimal vlDespPort;

    @Inclui
    private BigDecimal vlDespCarDesc;

    @Inclui
    private BigDecimal vlOut;

    @Inclui
    private BigDecimal vlfrtBr;

    @Inclui
    private BigDecimal vlFrtMm;

    public RegD140(String codPartConsg, Integer codMunOrig, Integer codMunDest, String indVeic, String veicId, String indNav, Integer viagem, BigDecimal vlFrtLiq, BigDecimal vlDespPort, BigDecimal vlDespCarDesc, BigDecimal vlOut, BigDecimal vlfrtBr, BigDecimal vlFrtMm) {
        this.codPartConsg = codPartConsg;
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
        this.indVeic = indVeic;
        this.veicId = veicId;
        this.indNav = indNav;
        this.viagem = viagem;
        this.vlFrtLiq = vlFrtLiq;
        this.vlDespPort = vlDespPort;
        this.vlDespCarDesc = vlDespCarDesc;
        this.vlOut = vlOut;
        this.vlfrtBr = vlfrtBr;
        this.vlFrtMm = vlFrtMm;
    }

    public RegD140(){}
}