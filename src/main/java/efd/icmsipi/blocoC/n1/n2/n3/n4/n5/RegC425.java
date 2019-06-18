package efd.icmsipi.blocoC.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegC425 {

    @Getter @Inclui
    private final String reg = "C425";

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Getter @Setter @Inclui
    private String unid;

    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    public RegC425(String codItem, BigDecimal qtd, String unid, BigDecimal vlItem, BigDecimal vlPis, BigDecimal vlCofins) {
        this.codItem = codItem;
        this.qtd = qtd;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegC425(){}
}