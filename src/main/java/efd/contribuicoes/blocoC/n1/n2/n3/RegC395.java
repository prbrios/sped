package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegC395 {

    @Inclui
    private final String reg = "C395";

    @Inclui
    private String codMod;

    @Inclui
    private String codPart;

    @Inclui
    private String ser;

    @Inclui
    private String subSer;

    @Inclui
    private String numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

}
