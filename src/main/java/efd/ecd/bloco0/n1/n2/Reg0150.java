package efd.ecd.bloco0.n1.n2;

import java.io.Serializable;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.bloco0.n1.n2.n3.Reg0180;

public class Reg0150 implements Serializable {
	private static final long serialVersionUID = 228926986009288780L;

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
    private Long nit;
    
    @Inclui
    private String uf;
    
    @Inclui
    private String ie;
    
    @Inclui
    private String ieSt;
    
    @Inclui(zerosEsquerda = 7)
    private Long codMun;
    
    @Inclui
    private String im;
    
    @Inclui
    private String suframa;
    
    @Filho
    private List<Reg0180> reg0180;

	public Reg0150(String codPart, String nome, Integer codPais, Long cnpj, Long cpf, Long nit, String uf, String ie,
			String ieSt, Long codMun, String im, String suframa) {
		super();
		this.codPart = codPart;
		this.nome = nome;
		this.codPais = codPais;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.nit = nit;
		this.uf = uf;
		this.ie = ie;
		this.ieSt = ieSt;
		this.codMun = codMun;
		this.im = im;
		this.suframa = suframa;
	}
	
	public Reg0150() {/* */}

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

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getIeSt() {
        return ieSt;
    }

    public void setIeSt(String ieSt) {
        this.ieSt = ieSt;
    }

    public Long getCodMun() {
        return codMun;
    }

    public void setCodMun(Long codMun) {
        this.codMun = codMun;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public List<Reg0180> getReg0180() {
        return reg0180;
    }

    public void setReg0180(List<Reg0180> reg0180) {
        this.reg0180 = reg0180;
    }
    
}
