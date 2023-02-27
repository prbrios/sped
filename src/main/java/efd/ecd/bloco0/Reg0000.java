package efd.ecd.bloco0;

import java.time.LocalDate;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.bloco0.n1.Reg0001;
import efd.ecd.bloco0.n1.Reg0990;
import lombok.Getter;
import lombok.Setter;

public class Reg0000 {
    
    @Getter @Inclui
    private final String reg = "0000";
    
    @Getter @Setter @Inclui
    private String lecd;
    
    @Getter @Setter @Inclui
    private LocalDate dtIni;
    
    @Getter @Setter @Inclui
    private LocalDate dtFin;
    
    @Getter @Setter @Inclui
    private String nome;
    
    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;
    
    @Getter @Setter @Inclui
    private String uf;
    
    @Getter @Setter @Inclui
    private String ie;
    
    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private String codMun;
    
    @Getter @Setter @Inclui
    private String im;
    
    @Getter @Setter @Inclui
    private Integer indSitEsp;
    
    @Getter @Setter @Inclui
    private Integer indSitIniPer;
    
    @Getter @Setter @Inclui
    private Integer indNire;
    
    @Getter @Setter @Inclui
    private Integer indFinEsc;
    
    @Getter @Setter @Inclui
    private String codHashSub;
    
    @Getter @Setter @Inclui
    private Integer indGrandePorte;
    
    @Getter @Setter @Inclui
    private Integer tipEcd;
    
    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long codScp;
    
    @Getter @Setter @Inclui
    private String identMf;
    
    @Getter @Setter @Inclui
    private String indEscCons;
    
    @Getter @Setter @Inclui
    private Integer indCentralizada;
    
    @Getter @Setter @Inclui
    private Integer indMudancPc;
    
    @Getter @Setter @Inclui
    private String codPlanRef;
    
    @Getter @Setter @Filho
    private Reg0001 reg0001;
    
    @Getter @Setter @Filho
    private Reg0990 reg0990;

    public Reg0000() {
    	this.lecd = "LECD";
    }
    
	public Reg0000(String lecd, LocalDate dtIni, LocalDate dtFin, String nome, Long cnpj, String uf, String ie,
			String codMun, String im, Integer indSitEsp, Integer indSitIniPer, Integer indNire, Integer indFinEsc,
			String codHashSub, Integer indGrandePorte, Integer tipEcd, Long codScp, String identMf, String indEscCons,
			Integer indCentralizada, Integer indMudancPc, String codPlanRef) {
		super();
		this.lecd = "LECD";
		this.dtIni = dtIni;
		this.dtFin = dtFin;
		this.nome = nome;
		this.cnpj = cnpj;
		this.uf = uf;
		this.ie = ie;
		this.codMun = codMun;
		this.im = im;
		this.indSitEsp = indSitEsp;
		this.indSitIniPer = indSitIniPer;
		this.indNire = indNire;
		this.indFinEsc = indFinEsc;
		this.codHashSub = codHashSub;
		this.indGrandePorte = indGrandePorte;
		this.tipEcd = tipEcd;
		this.codScp = codScp;
		this.identMf = identMf;
		this.indEscCons = indEscCons;
		this.indCentralizada = indCentralizada;
		this.indMudancPc = indMudancPc;
		this.codPlanRef = codPlanRef;
	}
}
