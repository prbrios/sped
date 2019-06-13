package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegC100 {

    @Inclui
    private final String reg = "C100";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private String ser;

    @Inclui
    private Integer numDoc;

    @Inclui
    private String chvNfe;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private LocalDate dtES;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private String indPgto;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlAbatNt;

    @Inclui
    private BigDecimal vlMerc;

    @Inclui
    private String indFrt;

    @Inclui
    private BigDecimal vlFrt;

    @Inclui
    private BigDecimal vlSeg;

    @Inclui
    private BigDecimal vlOutDa;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlBcIcmsSt;

    @Inclui
    private BigDecimal vlIcmsSt;

    @Inclui
    private BigDecimal vlIpi;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private BigDecimal vlPisSt;

    @Inclui
    private BigDecimal vlCofinsSt;

}
