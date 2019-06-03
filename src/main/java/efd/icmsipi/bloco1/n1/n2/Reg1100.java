package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1105;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Reg1100 {

    @Inclui
    private final String reg = "1100";

    @Inclui
    private Integer indDoc;

    @Inclui
    private String nroDe;

    @Inclui
    private LocalDate dtDe;

    @Inclui
    private Integer natExp;

    @Inclui
    private Integer nroRe;

    @Inclui
    private LocalDate dtRe;

    @Inclui
    private String chcEmb;

    @Inclui
    private LocalDate dtChc;

    @Inclui
    private LocalDate dtAvb;

    @Inclui(zerosEsquerda = 2)
    private Integer tpChc;

    @Inclui
    private Integer pais;

    @Filho
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