package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF205;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF210;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF211;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegF200 {

    @Getter @Inclui
    private final String reg = "F200";

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer indOper;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer unidImob;

    @Getter @Inclui
    private String identEmp;

    @Getter @Inclui
    private String descUnidImob;

    @Getter @Inclui
    private String numCont;

    @Getter @Inclui
    private String cpfCnpjAdqu;

    @Getter @Inclui(formatoData = "MMyyyy")
    private LocalDate dtOper;

    @Getter @Inclui
    private BigDecimal vlTotVend;

    @Getter @Inclui
    private BigDecimal vlRecAcum;

    @Getter @Inclui
    private BigDecimal vlTotRec;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private BigDecimal percRecReceb;

    @Getter @Inclui
    private Integer indNatEmp;

    @Getter @Inclui
    private String infComp;

    @Getter @Setter @Filho
    private List<RegF205> regF205;

    @Getter @Setter @Filho
    private List<RegF210> regF210;

    @Getter @Setter @Filho
    private List<RegF211> regF211;

    public RegF200(Integer indOper, Integer unidImob, String identEmp, String descUnidImob, String numCont, String cpfCnpjAdqu, LocalDate dtOper, BigDecimal vlTotVend, BigDecimal vlRecAcum, BigDecimal vlTotRec, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, BigDecimal percRecReceb, Integer indNatEmp, String infComp) {
        this.indOper = indOper;
        this.unidImob = unidImob;
        this.identEmp = identEmp;
        this.descUnidImob = descUnidImob;
        this.numCont = numCont;
        this.cpfCnpjAdqu = cpfCnpjAdqu;
        this.dtOper = dtOper;
        this.vlTotVend = vlTotVend;
        this.vlRecAcum = vlRecAcum;
        this.vlTotRec = vlTotRec;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.percRecReceb = percRecReceb;
        this.indNatEmp = indNatEmp;
        this.infComp = infComp;
    }

    public RegF200(){ }
}
