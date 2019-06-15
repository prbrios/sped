package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegF200 {

    @Inclui
    private final String reg = "F200";

    @Inclui(zerosEsquerda = 2)
    private Integer indOper;

    @Inclui(zerosEsquerda = 2)
    private Integer unidImob;

    @Inclui
    private String identEmp;

    @Inclui
    private String descUnidImob;

    @Inclui
    private String numCont;

    @Inclui
    private String cpfCnpjAdqu;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate dtOper;

    @Inclui
    private BigDecimal vlTotVend;

    @Inclui
    private BigDecimal vlRecAcum;

    @Inclui
    private BigDecimal vlTotRec;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private BigDecimal percRecReceb;

    @Inclui
    private Integer indNatEmp;

    @Inclui
    private String infComp;

}
