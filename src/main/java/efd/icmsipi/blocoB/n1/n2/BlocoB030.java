package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoB030 {

    @Inclui
    private final String reg = "B030";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer numDocIni;

    @Inclui
    private Integer numDocFin;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Integer qtdCanc;

    @Inclui
    private BigDecimal vlCont;

    @Inclui
    private BigDecimal vlIsntIss;

    @Inclui
    private BigDecimal vlBcIss;

    @Inclui
    private BigDecimal vlIss;

    @Inclui
    private String codInfObs;

}
