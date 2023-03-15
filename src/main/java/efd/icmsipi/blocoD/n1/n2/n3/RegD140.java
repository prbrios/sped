package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegD140 implements Serializable {
	private static final long serialVersionUID = 4138749034311922144L;

	@Getter @Inclui
    private final String reg = "D140";

    @Getter @Setter @Inclui
    private String codPartConsg;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Getter @Setter @Inclui
    private String indVeic;

    @Getter @Setter @Inclui
    private String veicId;

    @Getter @Setter @Inclui
    private String indNav;

    @Getter @Setter @Inclui
    private Integer viagem;

    @Getter @Setter @Inclui
    private BigDecimal vlFrtLiq;

    @Getter @Setter @Inclui
    private BigDecimal vlDespPort;

    @Getter @Setter @Inclui
    private BigDecimal vlDespCarDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlOut;

    @Getter @Setter @Inclui
    private BigDecimal vlfrtBr;

    @Getter @Setter @Inclui
    private BigDecimal vlFrtMm;

    public RegD140(String codPartConsg, Integer codMunOrig, Integer codMunDest, String indVeic, String veicId, String indNav, Integer viagem, BigDecimal vlFrtLiq, BigDecimal vlDespPort, BigDecimal vlDespCarDesc, BigDecimal vlOut, BigDecimal vlfrtBr, BigDecimal vlFrtMm) {
        this.codPartConsg = codPartConsg;
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
        this.indVeic = indVeic;
        this.veicId = veicId;
        this.indNav = indNav;
        this.viagem = viagem;
        this.vlFrtLiq = vlFrtLiq;
        this.vlDespPort = vlDespPort;
        this.vlDespCarDesc = vlDespCarDesc;
        this.vlOut = vlOut;
        this.vlfrtBr = vlfrtBr;
        this.vlFrtMm = vlFrtMm;
    }

    public RegD140(){}
}