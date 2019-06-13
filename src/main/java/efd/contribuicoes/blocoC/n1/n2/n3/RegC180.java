package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegC180 {

    @Inclui
    private final String reg = "C180";

    @Inclui
    private String codMod;

    @Inclui
    private LocalDate dtDocIni;

    @Inclui
    private LocalDate dtDocFin;

    @Inclui
    private String codItem;

    @Inclui
    private String codNcm;

    @Inclui
    private String exIpi;

    @Inclui
    private BigDecimal vlTotItem;

}
