package efd.icmsipi.blocoG.n1.n2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.RegG125;
import lombok.Getter;
import lombok.Setter;


public class RegG110 {

    @Getter @Inclui
    private final String reg = "G110";

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFin;

    @Getter @Setter @Inclui
    private BigDecimal saldoInIcms;

    @Getter @Setter @Inclui
    private BigDecimal somParc;

    @Getter @Setter @Inclui
    private BigDecimal vlTribExp;

    @Getter @Setter @Inclui
    private BigDecimal vlTotal;

    @Getter @Setter @Inclui(casasDecimais = 8)
    private BigDecimal indPerSai;

    @Getter @Setter @Inclui
    private BigDecimal icmsAprop;

    @Getter @Setter @Inclui
    private BigDecimal somIcmsOc;

    @Getter @Setter @Filho
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