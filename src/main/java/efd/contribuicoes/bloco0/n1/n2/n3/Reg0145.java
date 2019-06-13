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

}
