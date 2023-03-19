package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg1360 implements Serializable {
	private static final long serialVersionUID = 3248929317773908873L;

	@Inclui
    private final String reg = "1360";

    @Inclui
    private String numLacre;

    @Inclui
    private LocalDate dtAplicacao;

    public Reg1360(String numLacre, LocalDate dtAplicacao) {
        this.numLacre = numLacre;
        this.dtAplicacao = dtAplicacao;
    }

    public Reg1360(){}

    public String getReg() {
        return reg;
    }

    public String getNumLacre() {
        return numLacre;
    }

    public void setNumLacre(String numLacre) {
        this.numLacre = numLacre;
    }

    public LocalDate getDtAplicacao() {
        return dtAplicacao;
    }

    public void setDtAplicacao(LocalDate dtAplicacao) {
        this.dtAplicacao = dtAplicacao;
    }
    
}