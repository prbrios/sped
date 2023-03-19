package efd.icmsipi.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg0220 implements Serializable {
	private static final long serialVersionUID = 2895750169638281686L;

	@Inclui
    private final String reg = "0220";

    @Inclui
    private String unidConv;

    @Inclui(casasDecimais = 6)
    private BigDecimal fatConv;

    @Inclui
    private String codBarra;

    public Reg0220(String unidConv, BigDecimal fatConv) {
        this.unidConv = unidConv;
        this.fatConv = fatConv;
    }
    
    public Reg0220(String unidConv, BigDecimal fatConv, String codBarra) {
        this.unidConv = unidConv;
        this.fatConv = fatConv;
        this.codBarra = codBarra;
    }

    public Reg0220(){}

    public String getReg() {
        return reg;
    }

    public String getUnidConv() {
        return unidConv;
    }

    public void setUnidConv(String unidConv) {
        this.unidConv = unidConv;
    }

    public BigDecimal getFatConv() {
        return fatConv;
    }

    public void setFatConv(BigDecimal fatConv) {
        this.fatConv = fatConv;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }
    

}
