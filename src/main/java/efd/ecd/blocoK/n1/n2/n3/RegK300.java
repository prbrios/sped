package efd.ecd.blocoK.n1.n2.n3;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.n4.RegK310;
import lombok.Getter;
import lombok.Setter;

public class RegK300 {
    
    @Getter @Inclui
    private final String reg = "K300";

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private BigDecimal valAg;

    @Getter @Setter @Inclui
    private String indValAg;

    @Getter @Setter @Inclui
    private BigDecimal valEl;

    @Getter @Setter @Inclui
    private String indValEl;

    @Getter @Setter @Inclui
    private BigDecimal valCs;

    @Getter @Setter @Inclui
    private String indValCs;

    @Getter @Setter @Filho
    private List<RegK310> regK310;

    public RegK300() {}
    
    public RegK300(String codCta, BigDecimal valAg, String indValAg, BigDecimal valEl, String indValEl,
            BigDecimal valCs, String indValCs) {
        this.codCta = codCta;
        this.valAg = valAg;
        this.indValAg = indValAg;
        this.valEl = valEl;
        this.indValEl = indValEl;
        this.valCs = valCs;
        this.indValCs = indValCs;
    }

}
