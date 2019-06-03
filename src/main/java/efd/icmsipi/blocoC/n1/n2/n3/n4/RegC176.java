package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegC176 {

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

    public RegC176(String codModUltE, Integer numDocUltE, String serUltE, LocalDate dtUltE, String codPartUltE, BigDecimal quantUltE, BigDecimal vlUnitUltE, BigDecimal vlUnitBcSt, String chaveNfeUltE, Integer numItemUltE, BigDecimal vlUnitBcIcmsUltE, BigDecimal aliqIcmsUltE, BigDecimal vlUnitLimiteBcIcmsUltE, BigDecimal vlUnitIcmsUltE, BigDecimal aliqStUltE, BigDecimal vlUnitRes, Integer codRespRet, Integer codMotRes, String chaveNfeRet, String codParNfeRet, String serNfeRet, Integer numNfeRet, Integer itemNfeRet, String codDa, String numDa, BigDecimal vlUnitResFcpSt) {
        this.codModUltE = codModUltE;
        this.numDocUltE = numDocUltE;
        this.serUltE = serUltE;
        this.dtUltE = dtUltE;
        this.codPartUltE = codPartUltE;
        this.quantUltE = quantUltE;
        this.vlUnitUltE = vlUnitUltE;
        this.vlUnitBcSt = vlUnitBcSt;
        this.chaveNfeUltE = chaveNfeUltE;
        this.numItemUltE = numItemUltE;
        this.vlUnitBcIcmsUltE = vlUnitBcIcmsUltE;
        this.aliqIcmsUltE = aliqIcmsUltE;
        this.vlUnitLimiteBcIcmsUltE = vlUnitLimiteBcIcmsUltE;
        this.vlUnitIcmsUltE = vlUnitIcmsUltE;
        this.aliqStUltE = aliqStUltE;
        this.vlUnitRes = vlUnitRes;
        this.codRespRet = codRespRet;
        this.codMotRes = codMotRes;
        this.chaveNfeRet = chaveNfeRet;
        this.codParNfeRet = codParNfeRet;
        this.serNfeRet = serNfeRet;
        this.numNfeRet = numNfeRet;
        this.itemNfeRet = itemNfeRet;
        this.codDa = codDa;
        this.numDa = numDa;
        this.vlUnitResFcpSt = vlUnitResFcpSt;
    }

    public RegC176(){}
}
