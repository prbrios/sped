package efd.ecd.blocoK.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.n4.n5.RegK315;

public class RegK310 implements Serializable {
	private static final long serialVersionUID = 2571866098862432089L;

	@Inclui
    private final String reg = "K310";

    @Inclui
    private Integer empCodParte;

    @Inclui
    private BigDecimal valor;

    @Inclui
    private String indValor;
    
    @Filho
    private List<RegK315> regK315;

    public RegK310(Integer empCodParte, BigDecimal valor, String indValor) {
        this.empCodParte = empCodParte;
        this.valor = valor;
        this.indValor = indValor;
    }

    public RegK310() {}

    public String getReg() {
        return reg;
    }

    public Integer getEmpCodParte() {
        return empCodParte;
    }

    public void setEmpCodParte(Integer empCodParte) {
        this.empCodParte = empCodParte;
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

    public List<RegK315> getRegK315() {
        return regK315;
    }

    public void setRegK315(List<RegK315> regK315) {
        this.regK315 = regK315;
    }
    

}
