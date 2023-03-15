package efd.ecd.bloco0;

import java.io.Serializable;
import java.time.LocalDate;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.bloco0.n1.Reg0001;
import efd.ecd.bloco0.n1.Reg0990;
import efd.ecd.bloco9.n1.Reg9001;
import efd.ecd.bloco9.n1.Reg9990;
import efd.ecd.blocoC.n1.RegC001;
import efd.ecd.blocoC.n1.RegC990;
import efd.ecd.blocoI.n1.RegI001;
import efd.ecd.blocoI.n1.RegI990;
import efd.ecd.blocoJ.n1.RegJ001;
import efd.ecd.blocoJ.n1.RegJ990;
import efd.ecd.blocoK.n1.RegK001;
import efd.ecd.blocoK.n1.RegK990;
import lombok.Getter;
import lombok.Setter;

public class Reg0000 implements Serializable {
	private static final long serialVersionUID = -4842167970177439029L;

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

    @Getter @Setter @Filho
    private RegC001 regC001;

    @Getter @Setter @Filho
    private RegC990 regC990;

    @Getter @Setter @Filho
    private RegI001 regI001;

    @Getter @Setter @Filho
    private RegI990 regI990;

    @Getter @Setter @Filho
    private RegJ001 regJ001;

    @Getter @Setter @Filho
    private RegJ990 regJ990;

    @Getter @Setter @Filho
    private RegK001 regK001;

    @Getter @Setter @Filho
    private RegK990 regK990;

    @Getter @Setter @Filho
    private Reg9001 reg9001;

    @Getter @Setter @Filho
    private Reg9990 reg9990;

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
