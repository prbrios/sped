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

    public RegC160(String codPart, String veicId, Integer qtdVol, BigDecimal pesoBrt, BigDecimal pesoLiq, String ufId) {
        this.codPart = codPart;
        this.veicId = veicId;
        this.qtdVol = qtdVol;
        this.pesoBrt = pesoBrt;
        this.pesoLiq = pesoLiq;
        this.ufId = ufId;
    }

    public RegC160(){}
}
