package efd.icmsipi.blocoG.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.n4.RegG126;
import efd.icmsipi.blocoG.n1.n2.n3.n4.RegG130;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegG125 {

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

    @Filho
    private List<RegG126> regG126;

    @Filho
    private List<RegG130> regG130;

    public RegG125(String codIndBem, LocalDate dtMov, String tipoMov, BigDecimal vlImobIcmsOp, BigDecimal vlImobicmsSt, BigDecimal vlImobIcmsFrt, BigDecimal vlImobIcmsDif, Integer numParc, BigDecimal vlParcPass) {
        this.codIndBem = codIndBem;
        this.dtMov = dtMov;
        this.tipoMov = tipoMov;
        this.vlImobIcmsOp = vlImobIcmsOp;
        this.vlImobicmsSt = vlImobicmsSt;
        this.vlImobIcmsFrt = vlImobIcmsFrt;
        this.vlImobIcmsDif = vlImobIcmsDif;
        this.numParc = numParc;
        this.vlParcPass = vlParcPass;
    }

    public RegG125(){}
}