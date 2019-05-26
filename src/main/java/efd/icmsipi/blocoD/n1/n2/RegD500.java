package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD510;
import efd.icmsipi.blocoD.n1.n2.n3.RegD530;
import efd.icmsipi.blocoD.n1.n2.n3.RegD590;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegD500 {

    @Inclui
    private final String reg = "D500";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private Integer codSit;

    @Inclui
    private String ser;

    @Inclui
    private String sub;

    @Inclui
    private Integer numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private LocalDate dtAp;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlServNt;

    @Inclui
    private BigDecimal vlTerc;

    @Inclui
    private BigDecimal vlDa;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private String codInf;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    @Inclui
    private Integer tpAssinante;

    @Filho
    private List<RegD510> regD510;

    @Filho
    private List<RegD530> regD530;

    @Filho
    private List<RegD590> regD590;

}