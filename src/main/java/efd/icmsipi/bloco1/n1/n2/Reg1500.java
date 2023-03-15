package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1510;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class Reg1500 implements Serializable {
	private static final long serialVersionUID = -8725942749400584679L;

	@Getter @Inclui
    private final String reg = "1500";

    @Getter @Setter @Inclui
    private String indOper;

    @Getter @Setter @Inclui
    private String indEmit;

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer sub;

    @Getter @Setter @Inclui
    private String codCons;

    @Getter @Setter @Inclui
    private Integer numDoc;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private LocalDate dtEs;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlForn;

    @Getter @Setter @Inclui
    private BigDecimal vlServNt;

    @Getter @Setter @Inclui
    private BigDecimal vlTerc;

    @Getter @Setter @Inclui
    private BigDecimal vlDa;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcmsSt;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsSt;

    @Getter @Setter @Inclui
    private String codInf;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private Integer tpLigacao;

    @Getter @Setter @Inclui
    private String codGrupoTensao;

    @Getter @Setter @Filho
    private List<Reg1510> reg1510;

    public Reg1500(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser, Integer sub, String codCons, Integer numDoc, LocalDate dtDoc, LocalDate dtEs, BigDecimal vlDoc, BigDecimal vlDesc, BigDecimal vlForn, BigDecimal vlServNt, BigDecimal vlTerc, BigDecimal vlDa, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, String codInf, BigDecimal vlPis, BigDecimal vlCofins, Integer tpLigacao, String codGrupoTensao) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.codCons = codCons;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.dtEs = dtEs;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.vlForn = vlForn;
        this.vlServNt = vlServNt;
        this.vlTerc = vlTerc;
        this.vlDa = vlDa;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.codInf = codInf;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.tpLigacao = tpLigacao;
        this.codGrupoTensao = codGrupoTensao;
    }

    public Reg1500(){}

}