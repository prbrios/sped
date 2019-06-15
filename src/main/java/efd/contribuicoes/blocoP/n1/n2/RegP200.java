package efd.contribuicoes.blocoP.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegP200 {

    //TODO: verificar layout

    @Inclui
    private final String reg = "P200";

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perRef;

    @Inclui
    private BigDecimal vlTotContApu;

    @Inclui
    private BigDecimal vlTotAjAcres;

    @Inclui
    private BigDecimal vlTotContDev;

    @Inclui
    private String codRec;

}
