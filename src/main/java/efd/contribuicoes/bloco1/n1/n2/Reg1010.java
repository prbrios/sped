package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Reg1010 {

    @Getter @Inclui
    private final String reg = "1010";

    @Getter @Inclui
    private String numProc;

    @Getter @Inclui
    private String idSecJud;

    @Getter @Inclui
    private String idVara;

    @Getter @Inclui
    private String indNatAcao;

    @Getter @Inclui
    private String descDecJud;

    @Getter @Inclui
    private LocalDate dtSentJud;

    public Reg1010(String numProc, String idSecJud, String idVara, String indNatAcao, String descDecJud, LocalDate dtSentJud) {
        this.numProc = numProc;
        this.idSecJud = idSecJud;
        this.idVara = idVara;
        this.indNatAcao = indNatAcao;
        this.descDecJud = descDecJud;
        this.dtSentJud = dtSentJud;
    }

    public Reg1010(){ }
}
