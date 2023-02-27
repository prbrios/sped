package efd.ecd.bloco0.n1.n2;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.bloco0.n1.n2.n3.Reg0180;
import lombok.Getter;
import lombok.Setter;

public class Reg0150 {
    
    @Getter @Inclui
    private final String reg = "0150";

    @Getter @Setter @Inclui
    private String codPart;
    
    @Getter @Setter @Inclui
    private String nome;
    
    @Getter @Setter @Inclui
    private Integer codPais;
    
    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;
    
    @Getter @Setter @Inclui(zerosEsquerda = 11)
    private Long cpf;
    
    @Getter @Setter @Inclui
    private Long nit;
    
    @Getter @Setter @Inclui
    private String uf;
    
    @Getter @Setter @Inclui
    private String ie;
    
    @Getter @Setter @Inclui
    private String ieSt;
    
    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Long codMun;
    
    @Getter @Setter @Inclui
    private String im;
    
    @Getter @Setter @Inclui
    private String suframa;
    
    @Getter @Setter @Filho
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
}
