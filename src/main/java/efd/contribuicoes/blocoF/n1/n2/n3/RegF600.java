package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegF600 {

    @Getter @Inclui
    private final String reg = "F600";

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer indNatRet;

    @Getter @Inclui
    private LocalDate dtRet;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal vlBcRet;

    @Getter @Inclui
    private BigDecimal vlRet;

    @Getter @Inclui
    private String codRec;

    @Getter @Inclui
    private Integer indNatRec;

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Inclui
    private BigDecimal vlRetPis;

    @Getter @Inclui
    private BigDecimal vlRetCofins;

    @Getter @Inclui
    private Integer indDec;

    public RegF600(Integer indNatRet, LocalDate dtRet, BigDecimal vlBcRet, BigDecimal vlRet, String codRec, Integer indNatRec, Long cnpj, BigDecimal vlRetPis, BigDecimal vlRetCofins, Integer indDec) {
        this.indNatRet = indNatRet;
        this.dtRet = dtRet;
        this.vlBcRet = vlBcRet;
        this.vlRet = vlRet;
        this.codRec = codRec;
        this.indNatRec = indNatRec;
        this.cnpj = cnpj;
        this.vlRetPis = vlRetPis;
        this.vlRetCofins = vlRetCofins;
        this.indDec = indDec;
    }

    public RegF600(){}
}
