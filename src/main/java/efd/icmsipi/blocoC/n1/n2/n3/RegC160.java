package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class RegC160 {

    @Inclui
    private final String reg = "C160";

    @Inclui
    private String codPart;

    @Inclui
    private String veicId;

    @Inclui
    private Integer qtdVol;

    @Inclui
    private BigDecimal pesoBrt;

    @Inclui
    private BigDecimal pesoLiq;

    @Inclui
    private String ufId;

}
