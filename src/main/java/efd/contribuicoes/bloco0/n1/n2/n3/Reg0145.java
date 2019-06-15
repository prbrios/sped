package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Reg0145 {

    @Getter @Inclui
    private final String reg = "0145";

    @Getter @Inclui
    private Integer codIncTrib;

    @Getter @Inclui
    private BigDecimal vlRecTot;

    @Getter @Inclui
    private BigDecimal vlRecAtiv;

    @Getter @Inclui
    private BigDecimal vlRecDemaisAtiv;

    @Getter @Inclui
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
