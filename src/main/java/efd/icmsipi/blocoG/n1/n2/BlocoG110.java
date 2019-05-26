package efd.icmsipi.blocoG.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoG110 {

    @Inclui
    private final String reg = "G110";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Inclui
    private BigDecimal saldoInIcms;

    @Inclui
    private BigDecimal somParc;

    @Inclui
    private BigDecimal vlTribExp;

    @Inclui
    private BigDecimal vlTotal;

    @Inclui(casasDecimais = 8)
    private BigDecimal indPerSai;

    @Inclui
    private BigDecimal icmsAprop;

    @Inclui
    private BigDecimal somIcmsOc;

}