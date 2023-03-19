package efd.ecd.blocoJ.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;

public class RegJ215 implements Serializable {
	private static final long serialVersionUID = 2571913113640678357L;

	@Inclui
    private final String reg = "J215";

    @Inclui
    private String codHistFat;

    @Inclui
    private String descFat;

    @Inclui
    private BigDecimal vlFatCont;

    @Inclui
    private String indDcFat;

    public RegJ215(String codHistFat, String descFat, BigDecimal vlFatCont, String indDcFat) {
        this.codHistFat = codHistFat;
        this.descFat = descFat;
        this.vlFatCont = vlFatCont;
        this.indDcFat = indDcFat;
    }

    public RegJ215() {}

    public String getReg() {
        return reg;
    }

    public String getCodHistFat() {
        return codHistFat;
    }

    public void setCodHistFat(String codHistFat) {
        this.codHistFat = codHistFat;
    }

    public String getDescFat() {
        return descFat;
    }

    public void setDescFat(String descFat) {
        this.descFat = descFat;
    }

    public BigDecimal getVlFatCont() {
        return vlFatCont;
    }

    public void setVlFatCont(BigDecimal vlFatCont) {
        this.vlFatCont = vlFatCont;
    }

    public String getIndDcFat() {
        return indDcFat;
    }

    public void setIndDcFat(String indDcFat) {
        this.indDcFat = indDcFat;
    }
    
    

}
