package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalTime;



public class RegC165 implements Serializable {
	private static final long serialVersionUID = -3688667555198158588L;

	@Getter @Inclui
    private final String reg = "C165";

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String veidId;

    @Getter @Setter @Inclui
    private String codAut;

    @Getter @Setter @Inclui
    private String nrPasse;

    @Getter @Setter @Inclui
    private LocalTime hora;

    @Getter @Setter @Inclui(casasDecimais = 1)
    private BigDecimal temper;

    @Getter @Setter @Inclui
    private Integer qtdVol;

    @Getter @Setter @Inclui
    private BigDecimal pesoBrt;

    @Getter @Setter @Inclui
    private BigDecimal pesoLiq;

    @Getter @Setter @Inclui
    private String nomMot;

    @Getter @Setter @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Getter @Setter @Inclui
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
