package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC501;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC505;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC509;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC500 {

    @Getter @Inclui
    private final String reg = "C500";

    @Getter @Inclui
    String codPart;

    @Getter @Inclui
    String codMod;

    @Getter @Inclui(zerosEsquerda = 2)
    Integer codSit;

    @Getter @Inclui
    String ser;

    @Getter @Inclui
    Integer sub;

    @Getter @Inclui
    Integer numDoc;

    @Getter @Inclui
    LocalDate dtDoc;

    @Getter @Inclui
    LocalDate dtEnt;

    @Getter @Inclui
    BigDecimal vlDoc;

    @Getter @Inclui
    BigDecimal vlIcms;

    @Getter @Inclui
    String codInf;

    @Getter @Inclui
    BigDecimal vlPis;

    @Getter @Inclui
    BigDecimal vlCofins;

    @Getter @Setter @Filho
    private List<RegC501> regC501;

    @Getter @Setter @Filho
    private List<RegC505> regC505;

    @Getter @Setter @Filho
    private List<RegC509> regC509;

    public RegC500(String codPart, String codMod, Integer codSit, String ser, Integer sub, Integer numDoc, LocalDate dtDoc, LocalDate dtEnt, BigDecimal vlDoc, BigDecimal vlIcms, String codInf, BigDecimal vlPis, BigDecimal vlCofins) {
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.dtEnt = dtEnt;
        this.vlDoc = vlDoc;
        this.vlIcms = vlIcms;
        this.codInf = codInf;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegC500(){ }
}
