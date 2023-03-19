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

public class Reg0000 implements Serializable {
	private static final long serialVersionUID = -4842167970177439029L;

	@Inclui
    private final String reg = "0000";
    
    @Inclui
    private String lecd;
    
    @Inclui
    private LocalDate dtIni;
    
    @Inclui
    private LocalDate dtFin;
    
    @Inclui
    private String nome;
    
    @Inclui(zerosEsquerda = 14)
    private Long cnpj;
    
    @Inclui
    private String uf;
    
    @Inclui
    private String ie;
    
    @Inclui(zerosEsquerda = 7)
    private String codMun;
    
    @Inclui
    private String im;
    
    @Inclui
    private Integer indSitEsp;
    
    @Inclui
    private Integer indSitIniPer;
    
    @Inclui
    private Integer indNire;
    
    @Inclui
    private Integer indFinEsc;
    
    @Inclui
    private String codHashSub;
    
    @Inclui
    private Integer indGrandePorte;
    
    @Inclui
    private Integer tipEcd;
    
    @Inclui(zerosEsquerda = 14)
    private Long codScp;
    
    @Inclui
    private String identMf;
    
    @Inclui
    private String indEscCons;
    
    @Inclui
    private Integer indCentralizada;
    
    @Inclui
    private Integer indMudancPc;
    
    @Inclui
    private String codPlanRef;
    
    @Filho
    private Reg0001 reg0001;
    
    @Filho
    private Reg0990 reg0990;

    @Filho
    private RegC001 regC001;

    @Filho
    private RegC990 regC990;

    @Filho
    private RegI001 regI001;

    @Filho
    private RegI990 regI990;

    @Filho
    private RegJ001 regJ001;

    @Filho
    private RegJ990 regJ990;

    @Filho
    private RegK001 regK001;

    @Filho
    private RegK990 regK990;

    @Filho
    private Reg9001 reg9001;

    @Filho
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

    public String getReg() {
        return reg;
    }

    public String getLecd() {
        return lecd;
    }

    public void setLecd(String lecd) {
        this.lecd = lecd;
    }

    public LocalDate getDtIni() {
        return dtIni;
    }

    public void setDtIni(LocalDate dtIni) {
        this.dtIni = dtIni;
    }

    public LocalDate getDtFin() {
        return dtFin;
    }

    public void setDtFin(LocalDate dtFin) {
        this.dtFin = dtFin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
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

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public Integer getIndSitEsp() {
        return indSitEsp;
    }

    public void setIndSitEsp(Integer indSitEsp) {
        this.indSitEsp = indSitEsp;
    }

    public Integer getIndSitIniPer() {
        return indSitIniPer;
    }

    public void setIndSitIniPer(Integer indSitIniPer) {
        this.indSitIniPer = indSitIniPer;
    }

    public Integer getIndNire() {
        return indNire;
    }

    public void setIndNire(Integer indNire) {
        this.indNire = indNire;
    }

    public Integer getIndFinEsc() {
        return indFinEsc;
    }

    public void setIndFinEsc(Integer indFinEsc) {
        this.indFinEsc = indFinEsc;
    }

    public String getCodHashSub() {
        return codHashSub;
    }

    public void setCodHashSub(String codHashSub) {
        this.codHashSub = codHashSub;
    }

    public Integer getIndGrandePorte() {
        return indGrandePorte;
    }

    public void setIndGrandePorte(Integer indGrandePorte) {
        this.indGrandePorte = indGrandePorte;
    }

    public Integer getTipEcd() {
        return tipEcd;
    }

    public void setTipEcd(Integer tipEcd) {
        this.tipEcd = tipEcd;
    }

    public Long getCodScp() {
        return codScp;
    }

    public void setCodScp(Long codScp) {
        this.codScp = codScp;
    }

    public String getIdentMf() {
        return identMf;
    }

    public void setIdentMf(String identMf) {
        this.identMf = identMf;
    }

    public String getIndEscCons() {
        return indEscCons;
    }

    public void setIndEscCons(String indEscCons) {
        this.indEscCons = indEscCons;
    }

    public Integer getIndCentralizada() {
        return indCentralizada;
    }

    public void setIndCentralizada(Integer indCentralizada) {
        this.indCentralizada = indCentralizada;
    }

    public Integer getIndMudancPc() {
        return indMudancPc;
    }

    public void setIndMudancPc(Integer indMudancPc) {
        this.indMudancPc = indMudancPc;
    }

    public String getCodPlanRef() {
        return codPlanRef;
    }

    public void setCodPlanRef(String codPlanRef) {
        this.codPlanRef = codPlanRef;
    }

    public Reg0001 getReg0001() {
        return reg0001;
    }

    public void setReg0001(Reg0001 reg0001) {
        this.reg0001 = reg0001;
    }

    public Reg0990 getReg0990() {
        return reg0990;
    }

    public void setReg0990(Reg0990 reg0990) {
        this.reg0990 = reg0990;
    }

    public RegC001 getRegC001() {
        return regC001;
    }

    public void setRegC001(RegC001 regC001) {
        this.regC001 = regC001;
    }

    public RegC990 getRegC990() {
        return regC990;
    }

    public void setRegC990(RegC990 regC990) {
        this.regC990 = regC990;
    }

    public RegI001 getRegI001() {
        return regI001;
    }

    public void setRegI001(RegI001 regI001) {
        this.regI001 = regI001;
    }

    public RegI990 getRegI990() {
        return regI990;
    }

    public void setRegI990(RegI990 regI990) {
        this.regI990 = regI990;
    }

    public RegJ001 getRegJ001() {
        return regJ001;
    }

    public void setRegJ001(RegJ001 regJ001) {
        this.regJ001 = regJ001;
    }

    public RegJ990 getRegJ990() {
        return regJ990;
    }

    public void setRegJ990(RegJ990 regJ990) {
        this.regJ990 = regJ990;
    }

    public RegK001 getRegK001() {
        return regK001;
    }

    public void setRegK001(RegK001 regK001) {
        this.regK001 = regK001;
    }

    public RegK990 getRegK990() {
        return regK990;
    }

    public void setRegK990(RegK990 regK990) {
        this.regK990 = regK990;
    }

    public Reg9001 getReg9001() {
        return reg9001;
    }

    public void setReg9001(Reg9001 reg9001) {
        this.reg9001 = reg9001;
    }

    public Reg9990 getReg9990() {
        return reg9990;
    }

    public void setReg9990(Reg9990 reg9990) {
        this.reg9990 = reg9990;
    }
    
}
