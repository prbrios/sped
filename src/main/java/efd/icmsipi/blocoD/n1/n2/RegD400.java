package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD410;
import efd.icmsipi.blocoD.n1.n2.n3.RegD420;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegD400 {

    @Getter @Inclui
    private final String reg = "D400";

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private Integer codSit;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer sub;

    @Getter @Setter @Inclui
    private Integer numDoc;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlServ;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Filho
    private List<RegD410> regD410;

    @Getter @Setter @Filho
    private List<RegD420> regD420;

    public RegD400(String codPart, String codMod, Integer codSit, String ser, Integer sub, Integer numDoc, LocalDate dtDoc, BigDecimal vlDoc, BigDecimal vlDesc, BigDecimal vlServ, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlPis, BigDecimal vlCofins, String codCta) {
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.vlServ = vlServ;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegD400(){}
}