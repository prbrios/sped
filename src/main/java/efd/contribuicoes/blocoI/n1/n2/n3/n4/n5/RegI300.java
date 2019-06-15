package efd.contribuicoes.blocoI.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegI300 {

    @Getter @Inclui
    private final String reg = "I300";

    @Getter @Inclui
    private String codComp;

    @Getter @Inclui
    private BigDecimal detValor;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String infoCompl;

    public RegI300(String codComp, BigDecimal detValor, String codCta, String infoCompl) {
        this.codComp = codComp;
        this.detValor = detValor;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegI300(){}
}
