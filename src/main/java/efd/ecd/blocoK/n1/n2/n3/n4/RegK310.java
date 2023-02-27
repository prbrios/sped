package efd.ecd.blocoK.n1.n2.n3.n4;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.n4.n5.RegK315;
import lombok.Getter;
import lombok.Setter;

public class RegK310 {
    
    @Getter @Inclui
    private final String reg = "K310";

    @Getter @Setter @Inclui
    private Integer empCodParte;

    @Getter @Setter @Inclui
    private BigDecimal valor;

    @Getter @Setter @Inclui
    private String indValor;
    
    @Getter @Setter @Filho
    private List<RegK315> regK315;

    public RegK310() {}

    public RegK310(Integer empCodParte, BigDecimal valor, String indValor) {
        this.empCodParte = empCodParte;
        this.valor = valor;
        this.indValor = indValor;
    }

}
