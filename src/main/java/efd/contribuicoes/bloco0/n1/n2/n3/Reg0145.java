package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg0145 {

    @Inclui
    private final String reg = "0145";

    @Inclui
    private Integer codIncTrib;

    @Inclui
    private BigDecimal vlRecTot;

    @Inclui
    private BigDecimal vlRecAtiv;

    @Inclui
    private BigDecimal vlRecDemaisAtiv;

    @Inclui
    private String infoCompl;

    public Reg0145(Integer codIncTrib, BigDecimal vlRecTot, BigDecimal vlRecAtiv, BigDecimal vlRecDemaisAtiv, String infoCompl) {
        this.codIncTrib = codIncTrib;
        this.vlRecTot = vlRecTot;
        this.vlRecAtiv = vlRecAtiv;
        this.vlRecDemaisAtiv = vlRecDemaisAtiv;
        this.infoCompl = infoCompl;
    }

    public Reg0145(){}
}
