package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF205;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF210;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF211;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegF200 implements Serializable {
	private static final long serialVersionUID = 2886675183928658036L;

	@Getter @Inclui
	private final String reg = "F200";

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer indOper;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer unidImob;

    @Getter @Setter @Inclui
    private String identEmp;

    @Getter @Setter @Inclui
    private String descUnidImob;

    @Getter @Setter @Inclui
    private String numCont;

    @Getter @Setter @Inclui
    private String cpfCnpjAdqu;

    @Getter @Setter @Inclui(formatoData = "MMyyyy")
    private LocalDate dtOper;

    @Getter @Setter @Inclui
    private BigDecimal vlTotVend;

    @Getter @Setter @Inclui
    private BigDecimal vlRecAcum;

    @Getter @Setter @Inclui
    private BigDecimal vlTotRec;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private BigDecimal percRecReceb;

    @Getter @Setter @Inclui
    private Integer indNatEmp;

    @Getter @Setter @Inclui
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
