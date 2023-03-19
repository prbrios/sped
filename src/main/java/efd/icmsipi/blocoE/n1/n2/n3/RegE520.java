package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE530;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegE520 implements Serializable {
	private static final long serialVersionUID = 6125596118941515883L;

	@Inclui
    private final String reg = "E520";

    @Inclui
    private BigDecimal vlSdAntIpi;

    @Inclui
    private BigDecimal vlDebIpi;

    @Inclui
    private BigDecimal vlCredIpi;

    @Inclui
    private BigDecimal vlodIpi;

    @Inclui
    private BigDecimal vlOcIpi;

    @Inclui
    private BigDecimal vlScIpi;

    @Inclui
    private BigDecimal vlSdIpi;

    @Filho
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

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlSdAntIpi() {
        return vlSdAntIpi;
    }

    public void setVlSdAntIpi(BigDecimal vlSdAntIpi) {
        this.vlSdAntIpi = vlSdAntIpi;
    }

    public BigDecimal getVlDebIpi() {
        return vlDebIpi;
    }

    public void setVlDebIpi(BigDecimal vlDebIpi) {
        this.vlDebIpi = vlDebIpi;
    }

    public BigDecimal getVlCredIpi() {
        return vlCredIpi;
    }

    public void setVlCredIpi(BigDecimal vlCredIpi) {
        this.vlCredIpi = vlCredIpi;
    }

    public BigDecimal getVlodIpi() {
        return vlodIpi;
    }

    public void setVlodIpi(BigDecimal vlodIpi) {
        this.vlodIpi = vlodIpi;
    }

    public BigDecimal getVlOcIpi() {
        return vlOcIpi;
    }

    public void setVlOcIpi(BigDecimal vlOcIpi) {
        this.vlOcIpi = vlOcIpi;
    }

    public BigDecimal getVlScIpi() {
        return vlScIpi;
    }

    public void setVlScIpi(BigDecimal vlScIpi) {
        this.vlScIpi = vlScIpi;
    }

    public BigDecimal getVlSdIpi() {
        return vlSdIpi;
    }

    public void setVlSdIpi(BigDecimal vlSdIpi) {
        this.vlSdIpi = vlSdIpi;
    }

    public List<RegE530> getRegE530() {
        return regE530;
    }

    public void setRegE530(List<RegE530> regE530) {
        this.regE530 = regE530;
    }
    
}