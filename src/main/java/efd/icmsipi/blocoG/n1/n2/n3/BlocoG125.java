package efd.icmsipi.blocoG.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoG125 {

    @Inclui
    private final String reg = "G125";

    @Inclui
    private String codIndBem;

    @Inclui
    private LocalDate dtMov;

    @Inclui
    private String tipoMov;

    @Inclui
    private BigDecimal vlImobIcmsOp;

    @Inclui
    private BigDecimal vlImobicmsSt;

    @Inclui
    private BigDecimal vlImobIcmsFrt;

    @Inclui
    private BigDecimal vlImobIcmsDif;

    @Inclui
    private Integer numParc;

    @Inclui
    private  BigDecimal vlParcPass;

}