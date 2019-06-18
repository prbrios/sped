package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1105;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


public class Reg1100 {

    @Getter @Inclui
    private final String reg = "1100";

    @Getter @Setter @Inclui
    private Integer indDoc;

    @Getter @Setter @Inclui
    private String nroDe;

    @Getter @Setter @Inclui
    private LocalDate dtDe;

    @Getter @Setter @Inclui
    private Integer natExp;

    @Getter @Setter @Inclui
    private Integer nroRe;

    @Getter @Setter @Inclui
    private LocalDate dtRe;

    @Getter @Setter @Inclui
    private String chcEmb;

    @Getter @Setter @Inclui
    private LocalDate dtChc;

    @Getter @Setter @Inclui
    private LocalDate dtAvb;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer tpChc;

    @Getter @Setter @Inclui
    private Integer pais;

    @Getter @Setter @Filho
    private List<Reg1105> reg1105;

    public Reg1100(Integer indDoc, String nroDe, LocalDate dtDe, Integer natExp, Integer nroRe, LocalDate dtRe, String chcEmb, LocalDate dtChc, LocalDate dtAvb, Integer tpChc, Integer pais) {
        this.indDoc = indDoc;
        this.nroDe = nroDe;
        this.dtDe = dtDe;
        this.natExp = natExp;
        this.nroRe = nroRe;
        this.dtRe = dtRe;
        this.chcEmb = chcEmb;
        this.dtChc = dtChc;
        this.dtAvb = dtAvb;
        this.tpChc = tpChc;
        this.pais = pais;
    }

    public Reg1100(){}
}