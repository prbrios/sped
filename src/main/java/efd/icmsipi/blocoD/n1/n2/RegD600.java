package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD610;
import efd.icmsipi.blocoD.n1.n2.n3.RegD690;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegD600 {

    @Getter @Inclui
    private final String reg = "D600";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private Integer codMun;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer sub;

    @Getter @Setter @Inclui
    private Integer codCons;

    @Getter @Setter @Inclui
    private Integer qtdCons;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlServ;

    @Getter @Setter @Inclui
    private BigDecimal vlServNt;

    @Getter @Setter @Inclui
    private BigDecimal vlTerc;

    @Getter @Setter @Inclui
    private BigDecimal vlDa;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Filho
    private List<RegD610> regD610;

    @Getter @Setter @Filho
    private List<RegD690> regD690;

    public RegD600(String codMod, Integer codMun, String ser, Integer sub, Integer codCons, Integer qtdCons, LocalDate dtDoc, BigDecimal vlDoc, BigDecimal vlDesc, BigDecimal vlServ, BigDecimal vlServNt, BigDecimal vlTerc, BigDecimal vlDa, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlPis, BigDecimal vlCofins) {
        this.codMod = codMod;
        this.codMun = codMun;
        this.ser = ser;
        this.sub = sub;
        this.codCons = codCons;
        this.qtdCons = qtdCons;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.vlServ = vlServ;
        this.vlServNt = vlServNt;
        this.vlTerc = vlTerc;
        this.vlDa = vlDa;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegD600(){}
}
