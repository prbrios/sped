package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoB.n1.n2.n3.BlocoB025;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BlocoB020 {

    @Inclui
    private final String reg = "B020";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private String codSit;

    @Inclui
    private String ser;

    @Inclui
    private Integer numDoc;

    @Inclui
    private String chvNfe;

    @Inclui
    private LocalDate dtDoc;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunServ;

    @Inclui
    private BigDecimal vlCont;

    @Inclui
    private BigDecimal vlMatTerc;

    @Inclui
    private BigDecimal vlSub;

    @Inclui
    private BigDecimal vlInstIss;

    @Inclui
    private BigDecimal vlDedBc;

    @Inclui
    private BigDecimal vlBcIss;

    @Inclui
    private BigDecimal vlBsIssRt;

    @Inclui
    private BigDecimal vlIssRt;

    @Inclui
    private BigDecimal vlIss;

    @Inclui
    private String codInfObs;

    @Filho
    private List<BlocoB025> blocoB025;

}
