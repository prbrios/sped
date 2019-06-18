package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegC100 {


    @Getter @Inclui
    private final String reg = "C100";

    @Getter @Setter @Inclui
    private String indOper;

    @Getter @Setter @Inclui
    private String indEmit;

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer numDoc;

    @Getter @Setter @Inclui
    private String chvNfe;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private LocalDate dtES;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private String indPgto;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlAbatNt;

    @Getter @Setter @Inclui
    private BigDecimal vlMerc;

    @Getter @Setter @Inclui
    private String indFrt;

    @Getter @Setter @Inclui
    private BigDecimal vlFrt;

    @Getter @Setter @Inclui
    private BigDecimal vlSeg;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDa;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcmsSt;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsSt;

    @Getter @Setter @Inclui
    private BigDecimal vlIpi;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlPisSt;

    @Getter @Setter @Inclui
    private BigDecimal vlCofinsSt;

    @Getter @Setter @Filho
    private RegC101 regC101;

    @Getter @Setter @Filho
    private RegC105 regC105;

    @Getter @Setter @Filho
    private List<RegC110> regC110;

    @Getter @Setter @Filho
    private List<RegC120> regC120;

    @Getter @Setter @Filho
    private RegC130 regC130;

    @Getter @Setter @Filho
    private RegC140 regC140;

    @Getter @Setter @Filho
    private RegC160 regC160;

    @Getter @Setter @Filho
    private List<RegC165> regC165;

    @Getter @Setter @Filho
    private List<RegC170> regC170;

    @Getter @Setter @Filho
    private List<RegC190> regC190;

    @Getter @Setter @Filho
    private List<RegC195> regC195;

    public RegC100(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser, Integer numDoc, String chvNfe, LocalDate dtDoc, LocalDate dtES, BigDecimal vlDoc, String indPgto, BigDecimal vlDesc, BigDecimal vlAbatNt, BigDecimal vlMerc, String indFrt, BigDecimal vlFrt, BigDecimal vlSeg, BigDecimal vlOutDa, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, BigDecimal vlIpi, BigDecimal vlPis, BigDecimal vlCofins, BigDecimal vlPisSt, BigDecimal vlCofinsSt) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.numDoc = numDoc;
        this.chvNfe = chvNfe;
        this.dtDoc = dtDoc;
        this.dtES = dtES;
        this.vlDoc = vlDoc;
        this.indPgto = indPgto;
        this.vlDesc = vlDesc;
        this.vlAbatNt = vlAbatNt;
        this.vlMerc = vlMerc;
        this.indFrt = indFrt;
        this.vlFrt = vlFrt;
        this.vlSeg = vlSeg;
        this.vlOutDa = vlOutDa;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.vlIpi = vlIpi;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.vlPisSt = vlPisSt;
        this.vlCofinsSt = vlCofinsSt;
    }

    public RegC100(){}
}
