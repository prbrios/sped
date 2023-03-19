package efd.ecd.blocoK.n1.n2.n3.n4.n5;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;

public class RegK315 implements Serializable {
	private static final long serialVersionUID = -4603135862383021513L;

	@Inclui
    private final String reg = "K315";

    @Inclui
    private Integer empCodContra;

    @Inclui
    private String codContra;

    @Inclui
    private BigDecimal valor;

    @Inclui
    private String indValor;

    public RegK315(Integer empCodContra, String codContra, BigDecimal valor, String indValor) {
        this.empCodContra = empCodContra;
        this.codContra = codContra;
        this.valor = valor;
        this.indValor = indValor;
    }

    public RegK315(){}

    public String getReg() {
        return reg;
    }

    public Integer getEmpCodContra() {
        return empCodContra;
    }

    public void setEmpCodContra(Integer empCodContra) {
        this.empCodContra = empCodContra;
    }

    public String getCodContra() {
        return codContra;
    }

    public void setCodContra(String codContra) {
        this.codContra = codContra;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getIndValor() {
        return indValor;
    }

    public void setIndValor(String indValor) {
        this.indValor = indValor;
    }
    

}
