package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC810;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC820;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC830;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC800 implements Serializable {
	private static final long serialVersionUID = 4126197879661618233L;

	@Getter @Inclui
	private final String reg = "C800";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Getter @Setter @Inclui
    private Integer numCfe;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlCfe;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String cnpjCpf;

    @Getter @Setter @Inclui
    private Integer nrSat;

    @Getter @Setter @Inclui
    private String chvCfe;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlMerc;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDa;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlPisSt;

    @Getter @Setter @Inclui
    private BigDecimal vlCofinsSt;

    @Getter @Setter @Filho
    private List<RegC810> regC810;

    @Getter @Setter @Filho
    private List<RegC820> regC820;

    @Getter @Setter @Filho
    private List<RegC830> regC830;

    public RegC800(String codMod, Integer codSit, Integer numCfe, LocalDate dtDoc, BigDecimal vlCfe, BigDecimal vlPis, BigDecimal vlCofins, String cnpjCpf, Integer nrSat, String chvCfe, BigDecimal vlDesc, BigDecimal vlMerc, BigDecimal vlOutDa, BigDecimal vlIcms, BigDecimal vlPisSt, BigDecimal vlCofinsSt) {
        this.codMod = codMod;
        this.codSit = codSit;
        this.numCfe = numCfe;
        this.dtDoc = dtDoc;
        this.vlCfe = vlCfe;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.cnpjCpf = cnpjCpf;
        this.nrSat = nrSat;
        this.chvCfe = chvCfe;
        this.vlDesc = vlDesc;
        this.vlMerc = vlMerc;
        this.vlOutDa = vlOutDa;
        this.vlIcms = vlIcms;
        this.vlPisSt = vlPisSt;
        this.vlCofinsSt = vlCofinsSt;
    }

    public RegC800(){ }
}
