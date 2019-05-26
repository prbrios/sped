package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoD140 {

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

}