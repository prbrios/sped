package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1300 {

    @Getter @Inclui
private final String reg = "1300";

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer indNatRet;

    @Getter @Setter @Inclui(formatoData = "MMyyyy")
    private LocalDate prRecRet;

    @Getter @Setter @Inclui
    private BigDecimal vlRetApu;

    @Getter @Setter @Inclui
    private BigDecimal vlRetDed;

    @Getter @Setter @Inclui
    private BigDecimal vlRetPer;

    @Getter @Setter @Inclui
    private BigDecimal vlRetDcomp;

    @Getter @Setter @Inclui
    private BigDecimal sldRet;

    public Reg1300(Integer indNatRet, LocalDate prRecRet, BigDecimal vlRetApu, BigDecimal vlRetDed, BigDecimal vlRetPer, BigDecimal vlRetDcomp, BigDecimal sldRet) {
        this.indNatRet = indNatRet;
        this.prRecRet = prRecRet;
        this.vlRetApu = vlRetApu;
        this.vlRetDed = vlRetDed;
        this.vlRetPer = vlRetPer;
        this.vlRetDcomp = vlRetDcomp;
        this.sldRet = sldRet;
    }

    public Reg1300(){ }
}
