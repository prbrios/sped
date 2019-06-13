package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegC500 {

    @Inclui
    private final String reg = "C500";

    @Inclui
    String codPart;

    @Inclui
    String codMod;

    @Inclui(zerosEsquerda = 2)
    Integer codSit;

    @Inclui
    String ser;

    @Inclui
    Integer sub;

    @Inclui
    Integer numDoc;

    @Inclui
    LocalDate dtDoc;

    @Inclui
    LocalDate dtEnt;

    @Inclui
    BigDecimal vlDoc;

    @Inclui
    BigDecimal vlIcms;

    @Inclui
    String codInf;

    @Inclui
    BigDecimal vlPis;

    @Inclui
    BigDecimal vlCofins;

}
