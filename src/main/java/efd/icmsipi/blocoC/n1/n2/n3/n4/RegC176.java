package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public class RegC176 implements Serializable {
	private static final long serialVersionUID = -4724971126856417199L;

	@Getter @Inclui
    private final String reg = "C176";

    @Getter @Setter @Inclui
    private String codModUltE;

    @Getter @Setter @Inclui
    private Long numDocUltE;

    @Getter @Setter @Inclui
    private String serUltE;

    @Getter @Setter @Inclui
    private LocalDate dtUltE;

    @Getter @Setter @Inclui
    private String codPartUltE;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal quantUltE;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal vlUnitUltE;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal vlUnitBcSt;

    @Getter @Setter @Inclui
    private String chaveNfeUltE;

    @Getter @Setter @Inclui
    private Integer numItemUltE;

    @Getter @Setter @Inclui
    private BigDecimal vlUnitBcIcmsUltE;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcmsUltE;

    @Getter @Setter @Inclui
    private BigDecimal vlUnitLimiteBcIcmsUltE;

    @Getter @Setter @Inclui
    private BigDecimal vlUnitIcmsUltE;

    @Getter @Setter @Inclui
    private BigDecimal aliqStUltE;

    @Getter @Setter @Inclui
    private BigDecimal vlUnitRes;

    @Getter @Setter @Inclui
    private Integer codRespRet;

    @Getter @Setter @Inclui
    private Integer codMotRes;

    @Getter @Setter @Inclui
    private String chaveNfeRet;

    @Getter @Setter @Inclui
    private String codParNfeRet;

    @Getter @Setter @Inclui
    private String serNfeRet;

    @Getter @Setter @Inclui
    private Integer numNfeRet;

    @Getter @Setter @Inclui
    private Integer itemNfeRet;

    @Getter @Setter @Inclui
    private String codDa;

    @Getter @Setter @Inclui
    private String numDa;

    @Getter @Setter @Inclui
    private BigDecimal vlUnitResFcpSt;

    public RegC176(String codModUltE, Long numDocUltE, String serUltE, LocalDate dtUltE, String codPartUltE, BigDecimal quantUltE, BigDecimal vlUnitUltE, BigDecimal vlUnitBcSt, String chaveNfeUltE, Integer numItemUltE, BigDecimal vlUnitBcIcmsUltE, BigDecimal aliqIcmsUltE, BigDecimal vlUnitLimiteBcIcmsUltE, BigDecimal vlUnitIcmsUltE, BigDecimal aliqStUltE, BigDecimal vlUnitRes, Integer codRespRet, Integer codMotRes, String chaveNfeRet, String codParNfeRet, String serNfeRet, Integer numNfeRet, Integer itemNfeRet, String codDa, String numDa, BigDecimal vlUnitResFcpSt) {
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
