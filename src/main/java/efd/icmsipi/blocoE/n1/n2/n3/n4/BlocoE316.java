package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoE316 {

    @Inclui
    private final String reg = "E316";

    @Inclui
    private String codOr;

    @Inclui
    private BigDecimal vlOr;

    @Inclui
    private LocalDate dtVcto;

    @Inclui
    private String codRec;

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    @Inclui
    private String proc;

    @Inclui
    private String txtCompl;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate mesRef;

}