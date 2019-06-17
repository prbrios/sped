package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1501;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Reg1500 {

    @Getter @Inclui
    private final String reg = "1500";

    @Getter @Inclui(formatoData = "MMyyyy")
    private LocalDate perApuCred;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer origCred;

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpjSuc;

    @Getter @Inclui(zerosEsquerda = 3)
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
    private BigDecimal vlCredDcompPaAnt;

    @Getter @Inclui
    private BigDecimal sdCredDispEfd;

    @Getter @Inclui
    private BigDecimal vlCredDescEfd;

    @Getter @Inclui
    private BigDecimal vlCredPerEfd;

    @Getter @Inclui
    private BigDecimal vlCredDcompEfd;

    @Getter @Inclui
    private BigDecimal vlCredTrans;

    @Getter @Inclui
    private BigDecimal vlCredOut;

    @Getter @Inclui
    private BigDecimal sldCredFim;

    @Getter @Setter @Filho
    private List<Reg1501> reg1501;

    public Reg1500(LocalDate perApuCred, Integer origCred, Long cnpjSuc, Integer codCred, BigDecimal vlCredApu, BigDecimal vlCredExtApu, BigDecimal vlTotCredApu, BigDecimal vlCredDescPaAnt, BigDecimal vlCredPerPaAnt, BigDecimal vlCredDcompPaAnt, BigDecimal sdCredDispEfd, BigDecimal vlCredDescEfd, BigDecimal vlCredPerEfd, BigDecimal vlCredDcompEfd, BigDecimal vlCredTrans, BigDecimal vlCredOut, BigDecimal sldCredFim) {
        this.perApuCred = perApuCred;
        this.origCred = origCred;
        this.cnpjSuc = cnpjSuc;
        this.codCred = codCred;
        this.vlCredApu = vlCredApu;
        this.vlCredExtApu = vlCredExtApu;
        this.vlTotCredApu = vlTotCredApu;
        this.vlCredDescPaAnt = vlCredDescPaAnt;
        this.vlCredPerPaAnt = vlCredPerPaAnt;
        this.vlCredDcompPaAnt = vlCredDcompPaAnt;
        this.sdCredDispEfd = sdCredDispEfd;
        this.vlCredDescEfd = vlCredDescEfd;
        this.vlCredPerEfd = vlCredPerEfd;
        this.vlCredDcompEfd = vlCredDcompEfd;
        this.vlCredTrans = vlCredTrans;
        this.vlCredOut = vlCredOut;
        this.sldCredFim = sldCredFim;
    }

    public Reg1500(){ }
}
