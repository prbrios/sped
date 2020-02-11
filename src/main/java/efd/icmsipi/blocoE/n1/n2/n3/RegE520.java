package efd.icmsipi.blocoE.n1.n2.n3;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE530;
import lombok.Getter;
import lombok.Setter;


public class RegE520 {

    @Getter @Inclui
    private final String reg = "E520";

    @Getter @Setter @Inclui
    private BigDecimal vlSdAntIpi;

    @Getter @Setter @Inclui
    private BigDecimal vlDebIpi;

    @Getter @Setter @Inclui
    private BigDecimal vlCredIpi;

    @Getter @Setter @Inclui
    private BigDecimal vlodIpi;

    @Getter @Setter @Inclui
    private BigDecimal vlOcIpi;

    @Getter @Setter @Inclui
    private BigDecimal vlScIpi;

    @Getter @Setter @Inclui
    private BigDecimal vlSdIpi;

    @Getter @Setter @Filho
    private List<RegE530> regE530;

    public RegE520(BigDecimal vlSdAntIpi, BigDecimal vlDebIpi, BigDecimal vlCredIpi, BigDecimal vlodIpi, BigDecimal vlOcIpi, BigDecimal vlScIpi, BigDecimal vlSdIpi) {
        this.vlSdAntIpi = vlSdAntIpi;
        this.vlDebIpi = vlDebIpi;
        this.vlCredIpi = vlCredIpi;
        this.vlodIpi = vlodIpi;
        this.vlOcIpi = vlOcIpi;
        this.vlScIpi = vlScIpi;
        this.vlSdIpi = vlSdIpi;
    }

    public RegE520(){}
}