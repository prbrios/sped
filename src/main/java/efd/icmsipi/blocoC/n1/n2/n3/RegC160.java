package efd.icmsipi.blocoC.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegC160 {

    @Getter @Inclui
    private final String reg = "C160";

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String veicId;

    @Getter @Setter @Inclui
    private Integer qtdVol;

    @Getter @Setter @Inclui
    private BigDecimal pesoBrt;

    @Getter @Setter @Inclui
    private BigDecimal pesoLiq;

    @Getter @Setter @Inclui
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
