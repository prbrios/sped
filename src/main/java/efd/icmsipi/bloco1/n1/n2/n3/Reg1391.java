package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Reg1391 {

    @Inclui
    private final String reg = "1391";

    @Inclui
    private LocalDate dtRegistro;

    @Inclui
    private BigDecimal qtdMoid;

    @Inclui
    private BigDecimal estqIni;

    @Inclui
    private BigDecimal qtdProduz;

    @Inclui
    private BigDecimal entAnidHid;

    @Inclui
    private BigDecimal outrEntr;

    @Inclui
    private BigDecimal perda;

    @Inclui
    private BigDecimal cons;

    @Inclui
    private BigDecimal saiAniHid;

    @Inclui
    private Integer saidas;

    @Inclui
    private BigDecimal estqFin;

    @Inclui
    private BigDecimal estqIniMel;

    @Inclui
    private BigDecimal prodDiaMel;

    @Inclui
    private BigDecimal utilMel;

    @Inclui
    private BigDecimal prodAlcMel;

    @Inclui
    private String obs;

}