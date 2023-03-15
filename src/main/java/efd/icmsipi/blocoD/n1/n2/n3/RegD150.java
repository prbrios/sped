package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegD150 implements Serializable {
	private static final long serialVersionUID = 1287383366029144731L;

	@Getter @Inclui
    private final String reg = "D150";

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Getter @Setter @Inclui
    private String veicId;

    @Getter @Setter @Inclui
    private Integer viagem;

    @Getter @Setter @Inclui
    private String indTfa;

    @Getter @Setter @Inclui
    private BigDecimal vlPesoTx;

    @Getter @Setter @Inclui
    private BigDecimal vlTxTerr;

    @Getter @Setter @Inclui
    private BigDecimal vlTxRed;

    @Getter @Setter @Inclui
    private BigDecimal vlOut;

    @Getter @Setter @Inclui
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