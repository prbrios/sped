package efd.icmsipi.blocoC.n1.n2.n3;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC141;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegC140 {

    @Getter @Inclui
    private final String reg = "C140";

    @Getter @Setter @Inclui
    private String indEmit;

    @Getter @Setter @Inclui
    private String indTit;

    @Getter @Setter @Inclui
    private String descTit;

    @Getter @Setter @Inclui
    private String numTit;

    @Getter @Setter @Inclui
    private Integer qtdParc;

    @Getter @Setter @Inclui
    private BigDecimal vlTit;

    @Getter @Setter @Filho
    private List<RegC141> regC141;

    public RegC140(String indEmit, String indTit, String descTit, String numTit, Integer qtdParc, BigDecimal vlTit) {
        this.indEmit = indEmit;
        this.indTit = indTit;
        this.descTit = descTit;
        this.numTit = numTit;
        this.qtdParc = qtdParc;
        this.vlTit = vlTit;
    }

    public RegC140(){}
}
