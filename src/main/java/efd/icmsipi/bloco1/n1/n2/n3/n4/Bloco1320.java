package efd.icmsipi.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Bloco1320 {

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

}