package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegF800 {

    @Getter @Inclui
    private final String reg = "F800";

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer indNatEven;

    @Getter @Inclui
    private LocalDate dtEven;

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpjSuced;

    @Getter @Inclui(formatoData = "MMyyyy")
    private LocalDate paContCred;

    @Getter @Inclui(zerosEsquerda = 3)
    private Integer codCred;

    @Getter @Inclui
    private BigDecimal vlCredPis;

    @Getter @Inclui
    private BigDecimal vlCredCofins;

    @Getter @Inclui
    private BigDecimal perCredCis;

    public RegF800(Integer indNatEven, LocalDate dtEven, Long cnpjSuced, LocalDate paContCred, Integer codCred, BigDecimal vlCredPis, BigDecimal vlCredCofins, BigDecimal perCredCis) {
        this.indNatEven = indNatEven;
        this.dtEven = dtEven;
        this.cnpjSuced = cnpjSuced;
        this.paContCred = paContCred;
        this.codCred = codCred;
        this.vlCredPis = vlCredPis;
        this.vlCredCofins = vlCredCofins;
        this.perCredCis = perCredCis;
    }

    public RegF800(){}
}
