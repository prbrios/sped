package efd.icmsipi.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg1320 {

    @Inclui
    private final String reg = "1320";

    @Inclui
    private Integer numBico;

    @Inclui
    private Integer nrInterv;

    @Inclui
    private String motInterv;

    @Inclui
    private String nomInterv;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjInterv;

    @Inclui(zerosEsquerda = 11)
    private Long cpfInterv;

    @Inclui(casasDecimais = 3)
    private BigDecimal valFecha;

    @Inclui(casasDecimais = 3)
    private BigDecimal valAbert;

    @Inclui(casasDecimais = 3)
    private BigDecimal volAferi;

    @Inclui(casasDecimais = 3)
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