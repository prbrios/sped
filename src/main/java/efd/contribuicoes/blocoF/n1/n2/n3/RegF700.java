package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegF700 {

    @Getter @Inclui
private final String reg = "F700";

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer indOriDed;

    @Getter @Setter @Inclui
    private Integer indNatDed;

    @Getter @Setter @Inclui
    private BigDecimal vlDedPis;

    @Getter @Setter @Inclui
    private BigDecimal vlDedCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlBcOper;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui
    private String infComp;

    public RegF700(Integer indOriDed, Integer indNatDed, BigDecimal vlDedPis, BigDecimal vlDedCofins, BigDecimal vlBcOper, Long cnpj, String infComp) {
        this.indOriDed = indOriDed;
        this.indNatDed = indNatDed;
        this.vlDedPis = vlDedPis;
        this.vlDedCofins = vlDedCofins;
        this.vlBcOper = vlBcOper;
        this.cnpj = cnpj;
        this.infComp = infComp;
    }

    public RegF700(){}
}
