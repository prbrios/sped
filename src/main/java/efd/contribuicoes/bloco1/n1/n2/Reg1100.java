package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1101;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Reg1100 {

    @Getter @Inclui
private final String reg = "1100";

    @Getter @Setter @Inclui(formatoData = "MMyyyy")
    private LocalDate perApuCred;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer origCred;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpjSuc;

    @Getter @Setter @Inclui
    private Integer codCred;

    @Getter @Setter @Inclui
    private BigDecimal vlCredApu;

    @Getter @Setter @Inclui
    private BigDecimal vlCredExtApu;

    @Getter @Setter @Inclui
    private BigDecimal vlTotCredApu;

    @Getter @Setter @Inclui
    private BigDecimal vlCredDescPaAnt;

    @Getter @Setter @Inclui
    private BigDecimal vlCredPerPaAnt;

    @Getter @Setter @Inclui
    private BigDecimal vlCredDcoMpPaAnt;

    @Getter @Setter @Inclui
    private BigDecimal sdCredDispEfd;

    @Getter @Setter @Inclui
    private BigDecimal vlCredDescEfd;

    @Getter @Setter @Inclui
    private BigDecimal vlCredPerEfd;

    @Getter @Setter @Inclui
    private BigDecimal vlCredDcoMpEfd;

    @Getter @Setter @Inclui
    private BigDecimal vlCredTrans;

    @Getter @Setter @Inclui
    private BigDecimal vlCredOut;

    @Getter @Setter @Inclui
    private BigDecimal sldCredFim;

    @Getter @Setter @Filho
    private List<Reg1101> reg1101;

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
