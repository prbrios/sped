package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegM400 {

    @Getter @Inclui
    private final String reg = "M400";

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private BigDecimal vlTotRec;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String descCompl;

    public RegM400(Integer cstPis, BigDecimal vlTotRec, String codCta, String descCompl) {
        this.cstPis = cstPis;
        this.vlTotRec = vlTotRec;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public RegM400(){}
}
