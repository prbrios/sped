package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1210 implements Serializable {
	private static final long serialVersionUID = 3424891405491057200L;

	@Inclui
    private final String reg = "1210";

    @Inclui
    private String tipoUtil;

    @Inclui
    private String nrDoc;

    @Inclui
    private BigDecimal vlCredUtil;

    @Inclui
    private String chvDoce;

    public Reg1210(String tipoUtil, String nrDoc, BigDecimal vlCredUtil, String chvDoce) {
        this.tipoUtil = tipoUtil;
        this.nrDoc = nrDoc;
        this.vlCredUtil = vlCredUtil;
        this.chvDoce = chvDoce;
    }

    public Reg1210(){}

    public String getReg() {
        return reg;
    }

    public String getTipoUtil() {
        return tipoUtil;
    }

    public void setTipoUtil(String tipoUtil) {
        this.tipoUtil = tipoUtil;
    }

    public String getNrDoc() {
        return nrDoc;
    }

    public void setNrDoc(String nrDoc) {
        this.nrDoc = nrDoc;
    }

    public BigDecimal getVlCredUtil() {
        return vlCredUtil;
    }

    public void setVlCredUtil(BigDecimal vlCredUtil) {
        this.vlCredUtil = vlCredUtil;
    }

    public String getChvDoce() {
        return chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
    }
    
}