package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1700 {

    @Getter @Inclui
    private final String reg = "1700";

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer indNatRet;

    @Getter @Inclui(formatoData = "MMyyyy")
    private LocalDate prRecRet;

    @Getter @Inclui
    private BigDecimal vlRetApu;

    @Getter @Inclui
    private BigDecimal vlRetDed;

    @Getter @Inclui
    private BigDecimal vlRetPer;

    @Getter @Inclui
    private BigDecimal vlRetDcomp;

    @Getter @Inclui
    private BigDecimal sldRet;

    public Reg1700(Integer indNatRet, LocalDate prRecRet, BigDecimal vlRetApu, BigDecimal vlRetDed, BigDecimal vlRetPer, BigDecimal vlRetDcomp, BigDecimal sldRet) {
        this.indNatRet = indNatRet;
        this.prRecRet = prRecRet;
        this.vlRetApu = vlRetApu;
        this.vlRetDed = vlRetDed;
        this.vlRetPer = vlRetPer;
        this.vlRetDcomp = vlRetDcomp;
        this.sldRet = sldRet;
    }

    public Reg1700(){ }
}
