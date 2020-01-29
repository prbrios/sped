package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC380;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegC370 {

    @Getter @Inclui
    private final String reg = "C370";

    @Getter @Setter @Inclui
    private Integer numItem;

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

    @Getter @Setter @Filho
    private RegC380 regC380;

    public RegC370(Integer numItem, String codItem, BigDecimal qtd, String unid, BigDecimal vlItem, BigDecimal vlDesc) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.qtd = qtd;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
    }

    public RegC370(){}
}