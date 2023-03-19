package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;



import java.io.Serializable;
import java.time.LocalDate;

public class Reg1020 implements Serializable {
	private static final long serialVersionUID = -7293218511127045636L;

	@Inclui
	private final String reg = "1020";

    @Inclui
    private String numProc;

    @Inclui
    private String indNatAcao;

    @Inclui
    private LocalDate dtDecAdm;

    public Reg1020(String numProc, String indNatAcao, LocalDate dtDecAdm) {
        this.numProc = numProc;
        this.indNatAcao = indNatAcao;
        this.dtDecAdm = dtDecAdm;
    }

    public Reg1020(){ }

    public String getReg() {
        return reg;
    }

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public String getIndNatAcao() {
        return indNatAcao;
    }

    public void setIndNatAcao(String indNatAcao) {
        this.indNatAcao = indNatAcao;
    }

    public LocalDate getDtDecAdm() {
        return dtDecAdm;
    }

    public void setDtDecAdm(LocalDate dtDecAdm) {
        this.dtDecAdm = dtDecAdm;
    }
    
}
