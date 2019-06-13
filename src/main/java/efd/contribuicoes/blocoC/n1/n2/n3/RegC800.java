package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegC800 {

    @Inclui
    private final String reg = "C800";

    @Inclui
    private String codMod;

    @Inclui
    private Integer codSit;

    @Inclui
    private Integer numCfe;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlCfe;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String cnpjCpf;

    @Inclui
    private Integer nrSat;

    @Inclui
    private String chvCfe;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlMerc;

    @Inclui
    private BigDecimal vlOutDa;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlPisSt;

    @Inclui
    private BigDecimal vlCofinsSt;

}
