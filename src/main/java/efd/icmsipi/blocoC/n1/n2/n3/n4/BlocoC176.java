package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoC176 {

    @Inclui
    private final String reg = "C176";

    @Inclui
    private String codModUltE;

    @Inclui
    private Integer numDocUltE;

    @Inclui
    private String serUltE;

    @Inclui
    private LocalDate dtUltE;

    @Inclui
    private String codPartUltE;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantUltE;

    @Inclui(casasDecimais = 3)
    private BigDecimal vlUnitUltE;

    @Inclui(casasDecimais = 3)
    private BigDecimal vlUnitBcSt;

    @Inclui
    private String chaveNfeUltE;

    @Inclui
    private Integer numItemUltE;

    @Inclui
    private BigDecimal vlUnitBcIcmsUltE;

    @Inclui
    private BigDecimal aliqIcmsUltE;

    @Inclui
    private BigDecimal vlUnitLimiteBcIcmsUltE;

    @Inclui
    private BigDecimal vlUnitIcmsUltE;

    @Inclui
    private BigDecimal aliqStUltE;

    @Inclui
    private BigDecimal vlUnitRes;

    @Inclui
    private Integer codRespRet;

    @Inclui
    private Integer codMotRes;

    @Inclui
    private String chaveNfeRet;

    @Inclui
    private String codParNfeRet;

    @Inclui
    private String serNfeRet;

    @Inclui
    private Integer numNfeRet;

    @Inclui
    private Integer itemNfeRet;

    @Inclui
    private String codDa;

    @Inclui
    private String numDa;

    @Inclui
    private BigDecimal vlUnitResFcpSt;

}
