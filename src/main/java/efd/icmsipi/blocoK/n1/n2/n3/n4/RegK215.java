package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegK215 implements Serializable {
	private static final long serialVersionUID = 8141437490331960924L;

	@Inclui
    private final String reg = "K215";

    @Inclui
    private String codItemDes;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdDes;

    public RegK215(String codItemDes, BigDecimal qtdDes) {
        this.codItemDes = codItemDes;
        this.qtdDes = qtdDes;
    }

    public RegK215(){}

    public String getReg() {
        return reg;
    }

    public String getCodItemDes() {
        return codItemDes;
    }

    public void setCodItemDes(String codItemDes) {
        this.codItemDes = codItemDes;
    }

    public BigDecimal getQtdDes() {
        return qtdDes;
    }

    public void setQtdDes(BigDecimal qtdDes) {
        this.qtdDes = qtdDes;
    }
    
}