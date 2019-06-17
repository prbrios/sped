package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC601;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC605;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC609;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC600 {

    @Getter @Inclui
    private final String reg = "C600";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Getter @Inclui
    private String ser;

    @Getter @Inclui
    private Integer sub;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer codCons;

    @Getter @Inclui
    private Integer qtdCons;

    @Getter @Inclui
    private Integer qtdCanc;

    @Getter @Inclui
    private LocalDate dtDoc;

    @Getter @Inclui
    private BigDecimal vlDoc;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui
    private Integer cons;

    @Getter @Inclui
    private BigDecimal vlForn;

    @Getter @Inclui
    private BigDecimal vlServNt;

    @Getter @Inclui
    private BigDecimal vlTerc;

    @Getter @Inclui
    private BigDecimal vlDa;

    @Getter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Inclui
    private BigDecimal vlIcms;

    @Getter @Inclui
    private BigDecimal vlBcIcmsSt;

    @Getter @Inclui
    private BigDecimal vlIcmsSt;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Filho
    private List<RegC601> regC601;

    @Getter @Setter @Filho
    private List<RegC605> regC605;

    @Getter @Setter @Filho
    private List<RegC609> regC609;

    public RegC600(String codMod, Integer codMun, String ser, Integer sub, Integer codCons, Integer qtdCons, Integer qtdCanc, LocalDate dtDoc, BigDecimal vlDoc, BigDecimal vlDesc, Integer cons, BigDecimal vlForn, BigDecimal vlServNt, BigDecimal vlTerc, BigDecimal vlDa, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, BigDecimal vlPis, BigDecimal vlCofins) {
        this.codMod = codMod;
        this.codMun = codMun;
        this.ser = ser;
        this.sub = sub;
        this.codCons = codCons;
        this.qtdCons = qtdCons;
        this.qtdCanc = qtdCanc;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.cons = cons;
        this.vlForn = vlForn;
        this.vlServNt = vlServNt;
        this.vlTerc = vlTerc;
        this.vlDa = vlDa;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegC600(){ }
}
