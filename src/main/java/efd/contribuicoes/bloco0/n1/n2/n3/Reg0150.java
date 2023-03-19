package efd.contribuicoes.bloco0.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0150 implements Serializable {
	private static final long serialVersionUID = -8616754463584656087L;

	@Inclui
	private final String reg = "0150";

    @Inclui
    private String codPart;

    @Inclui
    private String nome;

    @Inclui
    private Integer codPais;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Inclui
    private String ie;

    @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Inclui
    private String suframa;

    @Inclui
    private String end;

    @Inclui
    private String num;

    @Inclui
    private String compl;

    @Inclui
    private String bairro;

    public Reg0150(String codPart, String nome, Integer codPais, Long cnpj, Long cpf, String ie, Integer codMun, String suframa, String end, String num, String compl, String bairro) {
        this.codPart = codPart;
        this.nome = nome;
        this.codPais = codPais;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.ie = ie;
        this.codMun = codMun;
        this.suframa = suframa;
        this.end = end;
        this.num = num;
        this.compl = compl;
        this.bairro = bairro;
    }

    public Reg0150(){}

    public String getReg() {
        return reg;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodPais() {
        return codPais;
    }

    public void setCodPais(Integer codPais) {
        this.codPais = codPais;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Integer getCodMun() {
        return codMun;
    }

    public void setCodMun(Integer codMun) {
        this.codMun = codMun;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
}
