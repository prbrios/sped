package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC197 {

    @Inclui
    private final String reg = "C197";

    @Inclui
    private String codAj;

    @Inclui
    private String descrComplAj;

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlOutros;

    public RegC197(String codAj, String descrComplAj, String codItem, BigDecimal vlBcIcms, BigDecimal aliqIcms, BigDecimal vlIcms, BigDecimal vlOutros) {
        this.codAj = codAj;
        this.descrComplAj = descrComplAj;
        this.codItem = codItem;
        this.vlBcIcms = vlBcIcms;
        this.aliqIcms = aliqIcms;
        this.vlIcms = vlIcms;
        this.vlOutros = vlOutros;
    }

    public RegC197(){}
}
