package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD610;
import efd.icmsipi.blocoD.n1.n2.n3.RegD690;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegD600 {

    @Inclui
    private final String reg = "D600";

    @Inclui
    private String codMod;

    @Inclui
    private Integer codMun;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private Integer codCons;

    @Inclui
    private Integer qtdCons;

    @Inclui
    private LocalDate dtDoc;

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
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Filho
    private List<RegD610> regD610;

    @Filho
    private List<RegD690> regD690;

}
