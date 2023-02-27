package efd.ecd.blocoK.n1.n2.n3.n4.n5;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegK115 {
    
    @Getter @Inclui
    private final String reg = "K115";

    @Getter @Setter @Inclui
    private Integer empCodPart;

    @Getter @Setter @Inclui
    private Integer condPart;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal perEvt;

    public RegK115() {}

    public RegK115(Integer empCodPart, Integer condPart, BigDecimal perEvt) {
        this.empCodPart = empCodPart;
        this.condPart = condPart;
        this.perEvt = perEvt;
    }
    
}
