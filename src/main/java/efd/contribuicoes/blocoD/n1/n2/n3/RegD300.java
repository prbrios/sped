package efd.contribuicoes.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegD300 {

    @Inclui
    private final String reg = "D300";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private Integer numDocIni;

    @Inclui
    private Integer numDocFin;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private LocalDate dtRef;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui(zerosEsquerda = 2)
    Integer cstCofins;

    @Inclui
    BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    BigDecimal aliqCofins;

    @Inclui
    BigDecimal vlCofins;

    @Inclui
    String codCta;

}
