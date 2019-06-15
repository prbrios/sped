package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegC800 {

    @Getter @Inclui
    private final String reg = "C800";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private Integer codSit;

    @Getter @Inclui
    private Integer numCfe;

    @Getter @Inclui
    private LocalDate dtDoc;

    @Getter @Inclui
    private BigDecimal vlCfe;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String cnpjCpf;

    @Getter @Inclui
    private Integer nrSat;

    @Getter @Inclui
    private String chvCfe;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui
    private BigDecimal vlMerc;

    @Getter @Inclui
    private BigDecimal vlOutDa;

    @Getter @Inclui
    private BigDecimal vlIcms;

    @Getter @Inclui
    private BigDecimal vlPisSt;

    @Getter @Inclui
    private BigDecimal vlCofinsSt;

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
