package efd.ecd.blocoK.n1.n2.n3.n4.n5;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegK315 {
    
    @Getter @Inclui
    private final String reg = "K315";

    @Getter @Setter @Inclui
    private Integer empCodContra;

    @Getter @Setter @Inclui
    private String codContra;

    @Getter @Setter @Inclui
    private BigDecimal valor;

    @Getter @Setter @Inclui
    private String indValor;

    public RegK315(){}

    public RegK315(Integer empCodContra, String codContra, BigDecimal valor, String indValor) {
        this.empCodContra = empCodContra;
        this.codContra = codContra;
        this.valor = valor;
        this.indValor = indValor;
    }

}
