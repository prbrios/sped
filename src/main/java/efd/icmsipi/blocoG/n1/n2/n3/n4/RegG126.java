package efd.icmsipi.blocoG.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegG126 {

    @Inclui
    private final String reg = "G126";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Inclui
    private Integer numParc;

    @Inclui
    private BigDecimal vlParcPass;

    @Inclui
    private BigDecimal clTribOc;

    @Inclui
    private BigDecimal vlTotal;

    @Inclui
    private BigDecimal indPerSai;

    @Inclui
    private BigDecimal vlParcAprop;

}