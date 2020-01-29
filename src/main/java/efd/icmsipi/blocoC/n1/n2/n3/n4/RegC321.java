package efd.icmsipi.blocoC.n1.n2.n3.n4;


import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.RegC330;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegC321 {

    @Getter @Inclui
    private final String reg = "C321";

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Getter @Setter @Inclui
    private String unid;

    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Filho
    private RegC330 regC330;

    public RegC321(String codItem, BigDecimal qtd, String unid, BigDecimal vlItem, BigDecimal vlDesc, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlPis, BigDecimal vlCofins) {
        this.codItem = codItem;
        this.qtd = qtd;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegC321(){}
}
