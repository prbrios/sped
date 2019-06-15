package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegM800 {

    @Getter @Inclui
    private final String reg = "M800";

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private BigDecimal vlTotRec;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String descCompl;

    public RegM800(Integer cstCofins, BigDecimal vlTotRec, String codCta, String descCompl) {
        this.cstCofins = cstCofins;
        this.vlTotRec = vlTotRec;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public RegM800(){}
}
