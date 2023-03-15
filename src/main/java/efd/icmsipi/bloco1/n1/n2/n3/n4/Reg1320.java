package efd.icmsipi.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class Reg1320 implements Serializable {
	private static final long serialVersionUID = 1912506546658040651L;

	@Getter @Inclui
    private final String reg = "1320";

    @Getter @Setter @Inclui
    private Integer numBico;

    @Getter @Setter @Inclui
    private Integer nrInterv;

    @Getter @Setter @Inclui
    private String motInterv;

    @Getter @Setter @Inclui
    private String nomInterv;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpjInterv;

    @Getter @Setter @Inclui(zerosEsquerda = 11)
    private Long cpfInterv;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal valFecha;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal valAbert;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal volAferi;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal volVendas;

    public Reg1320(Integer numBico, Integer nrInterv, String motInterv, String nomInterv, Long cnpjInterv, Long cpfInterv, BigDecimal valFecha, BigDecimal valAbert, BigDecimal volAferi, BigDecimal volVendas) {
        this.numBico = numBico;
        this.nrInterv = nrInterv;
        this.motInterv = motInterv;
        this.nomInterv = nomInterv;
        this.cnpjInterv = cnpjInterv;
        this.cpfInterv = cpfInterv;
        this.valFecha = valFecha;
        this.valAbert = valAbert;
        this.volAferi = volAferi;
        this.volVendas = volVendas;
    }

    public Reg1320(){}
}