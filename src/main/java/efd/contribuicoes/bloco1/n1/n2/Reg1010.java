package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg1010 implements Serializable {
	private static final long serialVersionUID = 2546321335763643991L;

	@Inclui
	private final String reg = "1010";

    @Inclui
    private String numProc;

    @Inclui
    private String idSecJud;

    @Inclui
    private String idVara;

    @Inclui
    private String indNatAcao;

    @Inclui
    private String descDecJud;

    @Inclui
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

    public String getReg() {
        return reg;
    }

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public String getIdSecJud() {
        return idSecJud;
    }

    public void setIdSecJud(String idSecJud) {
        this.idSecJud = idSecJud;
    }

    public String getIdVara() {
        return idVara;
    }

    public void setIdVara(String idVara) {
        this.idVara = idVara;
    }

    public String getIndNatAcao() {
        return indNatAcao;
    }

    public void setIndNatAcao(String indNatAcao) {
        this.indNatAcao = indNatAcao;
    }

    public String getDescDecJud() {
        return descDecJud;
    }

    public void setDescDecJud(String descDecJud) {
        this.descDecJud = descDecJud;
    }

    public LocalDate getDtSentJud() {
        return dtSentJud;
    }

    public void setDtSentJud(LocalDate dtSentJud) {
        this.dtSentJud = dtSentJud;
    }
    
}
