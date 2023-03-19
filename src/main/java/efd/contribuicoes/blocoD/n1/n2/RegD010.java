package efd.contribuicoes.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.n3.*;

import java.io.Serializable;
import java.util.List;

public class RegD010 implements Serializable {
	private static final long serialVersionUID = -8444845823414161389L;

	@Inclui
	private final String reg = "D010";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Filho
    private List<RegD100> regD100;

    @Filho
    private List<RegD200> regD200;

    @Filho
    private List<RegD300> regD300;

    @Filho
    private List<RegD350> regD350;

    @Filho
    private List<RegD500> regD500;

    @Filho
    private List<RegD600> regD600;

    public RegD010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegD010(){}

    public String getReg() {
        return reg;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public List<RegD100> getRegD100() {
        return regD100;
    }

    public void setRegD100(List<RegD100> regD100) {
        this.regD100 = regD100;
    }

    public List<RegD200> getRegD200() {
        return regD200;
    }

    public void setRegD200(List<RegD200> regD200) {
        this.regD200 = regD200;
    }

    public List<RegD300> getRegD300() {
        return regD300;
    }

    public void setRegD300(List<RegD300> regD300) {
        this.regD300 = regD300;
    }

    public List<RegD350> getRegD350() {
        return regD350;
    }

    public void setRegD350(List<RegD350> regD350) {
        this.regD350 = regD350;
    }

    public List<RegD500> getRegD500() {
        return regD500;
    }

    public void setRegD500(List<RegD500> regD500) {
        this.regD500 = regD500;
    }

    public List<RegD600> getRegD600() {
        return regD600;
    }

    public void setRegD600(List<RegD600> regD600) {
        this.regD600 = regD600;
    }
    
}
