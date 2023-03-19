package efd.icmsipi.blocoB.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegB510 implements Serializable {
	private static final long serialVersionUID = -3761465309767002273L;

	@Inclui
    private final String reg = "B510";

    @Inclui
    private String indProf;

    @Inclui
    private String indEsc;

    @Inclui
    private String indSoc;

    @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Inclui
    private String nome;

    public RegB510(String indProf, String indEsc, String indSoc, Long cpf, String nome) {
        this.indProf = indProf;
        this.indEsc = indEsc;
        this.indSoc = indSoc;
        this.cpf = cpf;
        this.nome = nome;
    }

    public RegB510(){}

    public String getReg() {
        return reg;
    }

    public String getIndProf() {
        return indProf;
    }

    public void setIndProf(String indProf) {
        this.indProf = indProf;
    }

    public String getIndEsc() {
        return indEsc;
    }

    public void setIndEsc(String indEsc) {
        this.indEsc = indEsc;
    }

    public String getIndSoc() {
        return indSoc;
    }

    public void setIndSoc(String indSoc) {
        this.indSoc = indSoc;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
