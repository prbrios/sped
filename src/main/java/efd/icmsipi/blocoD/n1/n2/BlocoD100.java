package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoD100 {

    @Inclui
    private final String reg = "D100";

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
    private String chvCte;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private LocalDate dtAp;

    @Inclui
    private Integer tpCte;

    @Inclui
    private String chvCteRef;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private String indFrt;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlNt;

    @Inclui
    private String codInf;

    @Inclui
    private String codCta;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Filho
    private BlocoD101 blocoD101;

    @Filho
    private List<BlocoD110> blocoD110;

    @Filho
    private List<BlocoD130> blocoD130;

    @Filho
    private BlocoD140 blocoD140;

    @Filho
    private BlocoD150 blocoD150;

    @Filho
    private List<BlocoD160> blocoD160;

    @Filho
    private BlocoD170 blocoD170;

    @Filho
    private List<BlocoD180> blocoD180;

    @Filho
    private List<BlocoD190> blocoD190;

    @Filho
    private List<BlocoD195> blocoD195;

}