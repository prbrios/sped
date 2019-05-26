package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalTime;

@Setter
@Getter
public class BlocoC165 {

    @Inclui
    private final String reg = "C165";

    @Inclui
    private String codPart;

    @Inclui
    private String veidId;

    @Inclui
    private String codAut;

    @Inclui
    private String nrPasse;

    @Inclui
    private LocalTime hora;

    @Inclui(casasDecimais = 1)
    private BigDecimal temper;

    @Inclui
    private Integer qtdVol;

    @Inclui
    private BigDecimal pesoBrt;

    @Inclui
    private BigDecimal pesoLiq;

    @Inclui
    private String nomMot;

    @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Inclui
    private String ufId;

}
