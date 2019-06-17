package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC100 {

    @Getter @Inclui
    private final String reg = "C100";

    @Getter @Inclui
    private String indOper;

    @Getter @Inclui
    private String indEmit;

    @Getter @Inclui
    private String codPart;

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Getter @Inclui
    private String ser;

    @Getter @Inclui
    private Integer numDoc;

    @Getter @Inclui
    private String chvNfe;

    @Getter @Inclui
    private LocalDate dtDoc;

    @Getter @Inclui
    private LocalDate dtES;

    @Getter @Inclui
    private BigDecimal vlDoc;

    @Getter @Inclui
    private String indPgto;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui
    private BigDecimal vlAbatNt;

    @Getter @Inclui
    private BigDecimal vlMerc;

    @Getter @Inclui
    private String indFrt;

    @Getter @Inclui
    private BigDecimal vlFrt;

    @Getter @Inclui
    private BigDecimal vlSeg;

    @Getter @Inclui
    private BigDecimal vlOutDa;

    @Getter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Inclui
    private BigDecimal vlIcms;

    @Getter @Inclui
    private BigDecimal vlBcIcmsSt;

    @Getter @Inclui
    private BigDecimal vlIcmsSt;

    @Getter @Inclui
    private BigDecimal vlIpi;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private BigDecimal vlPisSt;

    @Getter @Inclui
    private BigDecimal vlCofinsSt;

    @Getter @Setter @Filho
    private List<RegC110> regC110;

    @Getter @Setter @Filho
    private List<RegC111> regC111;

    @Getter @Setter @Filho
    private List<RegC120> regC120;

    @Getter @Setter @Filho
    private List<RegC170> regC170;

    @Getter @Setter @Filho
    private List<RegC175> regC175;

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

    public RegC100(){ }
}
