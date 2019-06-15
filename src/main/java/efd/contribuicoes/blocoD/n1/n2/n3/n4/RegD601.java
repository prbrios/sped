package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegD601 {

    @Getter @Inclui
    private final String reg = "D601";

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer codClass;

    @Getter @Inclui
    private BigDecimal vlItem;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui
    private String codCta;

    public RegD601(Integer codClass, BigDecimal vlItem, BigDecimal vlDesc, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, String codCta) {
        this.codClass = codClass;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.codCta = codCta;
    }

    public RegD601(){ }
}
