package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegC791 {

    @Getter @Inclui
    private final String reg = "C791";

    @Getter @Setter @Inclui
    private String uf;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcmsSt;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsSt;

    public RegC791(String uf, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt) {
        this.uf = uf;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
    }

    public RegC791(){}
}