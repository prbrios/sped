package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoB.n1.n2.n3.RegB025;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegB020 {

    @Getter @Inclui
    private final String reg = "B020";

    @Getter @Setter @Inclui
    private String indOper;

    @Getter @Setter @Inclui
    private String indEmit;

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String codSit;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer numDoc;

    @Getter @Setter @Inclui
    private String chvNfe;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunServ;

    @Getter @Setter @Inclui
    private BigDecimal vlCont;

    @Getter @Setter @Inclui
    private BigDecimal vlMatTerc;

    @Getter @Setter @Inclui
    private BigDecimal vlSub;

    @Getter @Setter @Inclui
    private BigDecimal vlInstIss;

    @Getter @Setter @Inclui
    private BigDecimal vlDedBc;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIss;

    @Getter @Setter @Inclui
    private BigDecimal vlBsIssRt;

    @Getter @Setter @Inclui
    private BigDecimal vlIssRt;

    @Getter @Setter @Inclui
    private BigDecimal vlIss;

    @Getter @Setter @Inclui
    private String codInfObs;

    @Getter @Setter @Filho
    private List<RegB025> regB025;

    public RegB020(String indOper, String indEmit, String codPart, String codMod, String codSit, String ser, Integer numDoc, String chvNfe, LocalDate dtDoc, Integer codMunServ, BigDecimal vlCont, BigDecimal vlMatTerc, BigDecimal vlSub, BigDecimal vlInstIss, BigDecimal vlDedBc, BigDecimal vlBcIss, BigDecimal vlBsIssRt, BigDecimal vlIssRt, BigDecimal vlIss, String codInfObs) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.numDoc = numDoc;
        this.chvNfe = chvNfe;
        this.dtDoc = dtDoc;
        this.codMunServ = codMunServ;
        this.vlCont = vlCont;
        this.vlMatTerc = vlMatTerc;
        this.vlSub = vlSub;
        this.vlInstIss = vlInstIss;
        this.vlDedBc = vlDedBc;
        this.vlBcIss = vlBcIss;
        this.vlBsIssRt = vlBsIssRt;
        this.vlIssRt = vlIssRt;
        this.vlIss = vlIss;
        this.codInfObs = codInfObs;
    }

    public RegB020(){}
}
