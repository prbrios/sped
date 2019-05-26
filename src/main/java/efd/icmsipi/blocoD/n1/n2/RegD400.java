package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD410;
import efd.icmsipi.blocoD.n1.n2.n3.RegD420;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegD400 {

    @Inclui
    private final String reg = "D400";

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private Integer codSit;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private Integer numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    @Filho
    private List<RegD410> regD410;

    @Filho
    private List<RegD420> regD420;

}