package efd.icmsipi.blocoG.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.RegG125;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegG110 {

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

    @Filho
    private List<RegG125> regG125;

    public RegG110(LocalDate dtIni, LocalDate dtFin, BigDecimal saldoInIcms, BigDecimal somParc, BigDecimal vlTribExp, BigDecimal vlTotal, BigDecimal indPerSai, BigDecimal icmsAprop, BigDecimal somIcmsOc) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
        this.saldoInIcms = saldoInIcms;
        this.somParc = somParc;
        this.vlTribExp = vlTribExp;
        this.vlTotal = vlTotal;
        this.indPerSai = indPerSai;
        this.icmsAprop = icmsAprop;
        this.somIcmsOc = somIcmsOc;
    }

    public RegG110(){}
}