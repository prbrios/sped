package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalTime;

@Setter
@Getter
public class RegC165 {

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

    public RegC165(String codPart, String veidId, String codAut, String nrPasse, LocalTime hora, BigDecimal temper, Integer qtdVol, BigDecimal pesoBrt, BigDecimal pesoLiq, String nomMot, Long cpf, String ufId) {
        this.codPart = codPart;
        this.veidId = veidId;
        this.codAut = codAut;
        this.nrPasse = nrPasse;
        this.hora = hora;
        this.temper = temper;
        this.qtdVol = qtdVol;
        this.pesoBrt = pesoBrt;
        this.pesoLiq = pesoLiq;
        this.nomMot = nomMot;
        this.cpf = cpf;
        this.ufId = ufId;
    }

    public RegC165(){}
}
