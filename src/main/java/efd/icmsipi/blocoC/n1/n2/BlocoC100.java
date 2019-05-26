package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoC100 {


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

    @Filho
    private BlocoC101 blocoC101;

    @Filho
    private BlocoC105 blocoC105;

    @Filho
    private List<BlocoC110> blocoC110;

    @Filho
    private List<BlocoC120> blocoC120;

    @Filho
    private BlocoC130 blocoC130;

    @Filho
    private BlocoC140 blocoC140;

    @Filho
    private BlocoC160 blocoC160;

    @Filho
    private List<BlocoC165> blocoC165;

    @Filho
    private List<BlocoC170> blocoC170;

    @Filho
    private List<BlocoC190> blocoC190;

    @Filho
    private List<BlocoC195> blocoC195;

}
