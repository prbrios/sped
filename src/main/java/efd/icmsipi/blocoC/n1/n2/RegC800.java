package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC850;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegC800 {

    @Inclui
    private final String reg = "C800";

    @Inclui
    private String codMod;

    @Inclui
    private String codSit;

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
    private Long cnpjCpf;

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

    @Filho
    private List<RegC850> regC850;

}