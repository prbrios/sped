package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC141;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
public class RegC140 implements Serializable {
	private static final long serialVersionUID = 5218036644729704452L;

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
