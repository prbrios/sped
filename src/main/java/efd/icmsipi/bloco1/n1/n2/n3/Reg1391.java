package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public class Reg1391 implements Serializable {
	private static final long serialVersionUID = -3211000897220254254L;

	@Getter @Inclui
    private final String reg = "1391";

    @Getter @Setter @Inclui
    private LocalDate dtRegistro;

    @Getter @Setter @Inclui
    private BigDecimal qtdMoid;

    @Getter @Setter @Inclui
    private BigDecimal estqIni;

    @Getter @Setter @Inclui
    private BigDecimal qtdProduz;

    @Getter @Setter @Inclui
    private BigDecimal entAnidHid;

    @Getter @Setter @Inclui
    private BigDecimal outrEntr;

    @Getter @Setter @Inclui
    private BigDecimal perda;

    @Getter @Setter @Inclui
    private BigDecimal cons;

    @Getter @Setter @Inclui
    private BigDecimal saiAniHid;

    @Getter @Setter @Inclui
    private Integer saidas;

    @Getter @Setter @Inclui
    private BigDecimal estqFin;

    @Getter @Setter @Inclui
    private BigDecimal estqIniMel;

    @Getter @Setter @Inclui
    private BigDecimal prodDiaMel;

    @Getter @Setter @Inclui
    private BigDecimal utilMel;

    @Getter @Setter @Inclui
    private BigDecimal prodAlcMel;

    @Getter @Setter @Inclui
    private String obs;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    String codItem;

    @Getter @Setter @Inclui
    Integer tpResiduo;

    @Getter @Setter @Inclui
    private BigDecimal qtdResiduo;

    public Reg1391(LocalDate dtRegistro, BigDecimal qtdMoid, BigDecimal estqIni, BigDecimal qtdProduz, BigDecimal entAnidHid, BigDecimal outrEntr, BigDecimal perda, BigDecimal cons, BigDecimal saiAniHid, Integer saidas, BigDecimal estqFin, BigDecimal estqIniMel, BigDecimal prodDiaMel, BigDecimal utilMel, BigDecimal prodAlcMel, String obs, String codItem, Integer tpResiduo, BigDecimal qtdResiduo) {
        this.dtRegistro = dtRegistro;
        this.qtdMoid = qtdMoid;
        this.estqIni = estqIni;
        this.qtdProduz = qtdProduz;
        this.entAnidHid = entAnidHid;
        this.outrEntr = outrEntr;
        this.perda = perda;
        this.cons = cons;
        this.saiAniHid = saiAniHid;
        this.saidas = saidas;
        this.estqFin = estqFin;
        this.estqIniMel = estqIniMel;
        this.prodDiaMel = prodDiaMel;
        this.utilMel = utilMel;
        this.prodAlcMel = prodAlcMel;
        this.obs = obs;
        this.codItem = codItem;
        this.tpResiduo = tpResiduo;
        this.qtdResiduo = qtdResiduo;
    }

    public Reg1391(){}
}