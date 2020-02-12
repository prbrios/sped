package efd.contribuicoes.blocoC.n1.n2.n3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC501;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC505;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC509;
import lombok.Getter;
import lombok.Setter;

public class RegC500 {

    @Getter @Inclui
private final String reg = "C500";

    @Getter @Setter @Inclui
    String codPart;

    @Getter @Setter @Inclui
    String codMod;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    Integer codSit;

    @Getter @Setter @Inclui
    String ser;

    @Getter @Setter @Inclui
    Integer sub;

    @Getter @Setter @Inclui
    Integer numDoc;

    @Getter @Setter @Inclui
    LocalDate dtDoc;

    @Getter @Setter @Inclui
    LocalDate dtEnt;

    @Getter @Setter @Inclui
    BigDecimal vlDoc;

    @Getter @Setter @Inclui
    BigDecimal vlIcms;

    @Getter @Setter @Inclui
    String codInf;

    @Getter @Setter @Inclui
    BigDecimal vlPis;

    @Getter @Setter @Inclui
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
