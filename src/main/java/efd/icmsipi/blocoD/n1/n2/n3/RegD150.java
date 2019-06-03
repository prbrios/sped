package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD150 {

    @Inclui
    private final String reg = "D150";

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Inclui
    private String veicId;

    @Inclui
    private Integer viagem;

    @Inclui
    private String indTfa;

    @Inclui
    private BigDecimal vlPesoTx;

    @Inclui
    private BigDecimal vlTxTerr;

    @Inclui
    private BigDecimal vlTxRed;

    @Inclui
    private BigDecimal vlOut;

    @Inclui
    private BigDecimal vlTxAdv;

    public RegD150(Integer codMunOrig, Integer codMunDest, String veicId, Integer viagem, String indTfa, BigDecimal vlPesoTx, BigDecimal vlTxTerr, BigDecimal vlTxRed, BigDecimal vlOut, BigDecimal vlTxAdv) {
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
        this.veicId = veicId;
        this.viagem = viagem;
        this.indTfa = indTfa;
        this.vlPesoTx = vlPesoTx;
        this.vlTxTerr = vlTxTerr;
        this.vlTxRed = vlTxRed;
        this.vlOut = vlOut;
        this.vlTxAdv = vlTxAdv;
    }

    public RegD150(){}
}