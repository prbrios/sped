package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1100 {

    @Getter @Inclui
    private final String reg = "1100";

    @Getter @Inclui(formatoData = "MMyyyy")
    private LocalDate perApuCred;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer origCred;

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpjSuc;

    @Getter @Inclui
    private Integer codCred;

    @Getter @Inclui
    private BigDecimal vlCredApu;

    @Getter @Inclui
    private BigDecimal vlCredExtApu;

    @Getter @Inclui
    private BigDecimal vlTotCredApu;

    @Getter @Inclui
    private BigDecimal vlCredDescPaAnt;

    @Getter @Inclui
    private BigDecimal vlCredPerPaAnt;

    @Getter @Inclui
    private BigDecimal vlCredDcoMpPaAnt;

    @Getter @Inclui
    private BigDecimal sdCredDispEfd;

    @Getter @Inclui
    private BigDecimal vlCredDescEfd;

    @Getter @Inclui
    private BigDecimal vlCredPerEfd;

    @Getter @Inclui
    private BigDecimal vlCredDcoMpEfd;

    @Getter @Inclui
    private BigDecimal vlCredTrans;

    @Getter @Inclui
    private BigDecimal vlCredOut;

    @Getter @Inclui
    private BigDecimal sldCredFim;

    public Reg1100(LocalDate perApuCred, Integer origCred, Long cnpjSuc, Integer codCred, BigDecimal vlCredApu, BigDecimal vlCredExtApu, BigDecimal vlTotCredApu, BigDecimal vlCredDescPaAnt, BigDecimal vlCredPerPaAnt, BigDecimal vlCredDcoMpPaAnt, BigDecimal sdCredDispEfd, BigDecimal vlCredDescEfd, BigDecimal vlCredPerEfd, BigDecimal vlCredDcoMpEfd, BigDecimal vlCredTrans, BigDecimal vlCredOut, BigDecimal sldCredFim) {
        this.perApuCred = perApuCred;
        this.origCred = origCred;
        this.cnpjSuc = cnpjSuc;
        this.codCred = codCred;
        this.vlCredApu = vlCredApu;
        this.vlCredExtApu = vlCredExtApu;
        this.vlTotCredApu = vlTotCredApu;
        this.vlCredDescPaAnt = vlCredDescPaAnt;
        this.vlCredPerPaAnt = vlCredPerPaAnt;
        this.vlCredDcoMpPaAnt = vlCredDcoMpPaAnt;
        this.sdCredDispEfd = sdCredDispEfd;
        this.vlCredDescEfd = vlCredDescEfd;
        this.vlCredPerEfd = vlCredPerEfd;
        this.vlCredDcoMpEfd = vlCredDcoMpEfd;
        this.vlCredTrans = vlCredTrans;
        this.vlCredOut = vlCredOut;
        this.sldCredFim = sldCredFim;
    }

    public Reg1100(){ }
}
