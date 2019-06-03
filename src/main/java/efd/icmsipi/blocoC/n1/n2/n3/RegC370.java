package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC370 {

    @Inclui
    private final String reg = "C370";

    @Inclui
    private Integer numItem;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

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