package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegF800 {

    @Inclui
    private final String reg = "F800";

    @Inclui(zerosEsquerda = 2)
    private Integer indNatEven;

    @Inclui
    private LocalDate dtEven;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjSuced;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate paContCred;

    @Inclui(zerosEsquerda = 3)
    private Integer codCred;

    @Inclui
    private BigDecimal vlCredPis;

    @Inclui
    private BigDecimal vlCredCofins;

    @Inclui
    private BigDecimal perCredCis;

}
