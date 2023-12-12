package efd.icmsipi.bloco0;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.Reg0001;
import efd.icmsipi.bloco0.n1.Reg0990;
import efd.icmsipi.bloco1.n1.Reg1001;
import efd.icmsipi.bloco1.n1.Reg1990;
import efd.icmsipi.bloco9.n1.Reg9001;
import efd.icmsipi.bloco9.n1.Reg9990;
import efd.icmsipi.blocoB.n1.RegB001;
import efd.icmsipi.blocoB.n1.RegB990;
import efd.icmsipi.blocoC.n1.RegC001;
import efd.icmsipi.blocoC.n1.RegC990;
import efd.icmsipi.blocoD.n1.RegD001;
import efd.icmsipi.blocoD.n1.RegD990;
import efd.icmsipi.blocoE.n1.RegE001;
import efd.icmsipi.blocoE.n1.RegE990;
import efd.icmsipi.blocoG.n1.RegG001;
import efd.icmsipi.blocoG.n1.RegG990;
import efd.icmsipi.blocoH.n1.RegH001;
import efd.icmsipi.blocoH.n1.RegH990;
import efd.icmsipi.blocoK.n1.RegK001;
import efd.icmsipi.blocoK.n1.RegK990;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg0000 implements Serializable {
	private static final long serialVersionUID = -6155523942201230995L;

    @Inclui
    private final String reg = "0000";

    @Inclui(zerosEsquerda = 3)
    private Integer codVer;

    @Inclui
    private Integer codFin;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Inclui
    private String nome;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Inclui
    private String uf;

    @Inclui
    private String ie;

    @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Inclui
    private String im;

    @Inclui
    private String suframa;

    @Inclui
    private String indPerfil;

    @Inclui
    private Integer indAtiv;

    @Filho
    private Reg0001 reg0001;

    @Filho
    private Reg0990 reg0990;

    @Filho
    private RegB001 regB001;

    @Filho
    private RegB990 regB990;

    @Filho
    private RegC001 regC001;

    @Filho
    private RegC990 regC990;

    @Filho
    private RegD001 regD001;

    @Filho
    private RegD990 regD990;

    @Filho
    private RegE001 regE001;

    @Filho
    private RegE990 regE990;

    @Filho
    private RegG001 regG001;

    @Filho
    private RegG990 regG990;

    @Filho
    private RegH001 regH001;

    @Filho
    private RegH990 regH990;

    @Filho
    private RegK001 regK001;

    @Filho
    private RegK990 regK990;

    @Filho
    private Reg1001 reg1001;

    @Filho
    private Reg1990 reg1990;

    @Filho
    private Reg9001 reg9001;

    @Filho
    private Reg9990 reg9990;

    public Reg0000(Integer codVer, Integer codFin, LocalDate dtIni, LocalDate dtFin, String nome, Long cnpj, Long cpf, String uf, String ie, Integer codMun, String im, String suframa, String indPerfil, Integer indAtiv) {

        this.codVer = codVer;
        this.codFin = codFin;
        this.dtIni = dtIni;
        this.dtFin = dtFin;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.uf = uf;
        this.ie = ie;
        this.codMun = codMun;
        this.im = im;
        this.suframa = suframa;
        this.indPerfil = indPerfil;
        this.indAtiv = indAtiv;
    }

    public Reg0000(){}

    public String getReg() {
        return reg;
    }

    public Integer getCodVer() {
        return codVer;
    }

    public void setCodVer(Integer codVer) {
        this.codVer = codVer;
    }

    public Integer getCodFin() {
        return codFin;
    }

    public void setCodFin(Integer codFin) {
        this.codFin = codFin;
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

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
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

    public Integer getCodMun() {
        return codMun;
    }

    public void setCodMun(Integer codMun) {
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

    public String getIndPerfil() {
        return indPerfil;
    }

    public void setIndPerfil(String indPerfil) {
        this.indPerfil = indPerfil;
    }

    public Integer getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(Integer indAtiv) {
        this.indAtiv = indAtiv;
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

    public RegB001 getRegB001() {
        return regB001;
    }

    public void setRegB001(RegB001 regB001) {
        this.regB001 = regB001;
    }

    public RegB990 getRegB990() {
        return regB990;
    }

    public void setRegB990(RegB990 regB990) {
        this.regB990 = regB990;
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

    public RegD001 getRegD001() {
        return regD001;
    }

    public void setRegD001(RegD001 regD001) {
        this.regD001 = regD001;
    }

    public RegD990 getRegD990() {
        return regD990;
    }

    public void setRegD990(RegD990 regD990) {
        this.regD990 = regD990;
    }

    public RegE001 getRegE001() {
        return regE001;
    }

    public void setRegE001(RegE001 regE001) {
        this.regE001 = regE001;
    }

    public RegE990 getRegE990() {
        return regE990;
    }

    public void setRegE990(RegE990 regE990) {
        this.regE990 = regE990;
    }

    public RegG001 getRegG001() {
        return regG001;
    }

    public void setRegG001(RegG001 regG001) {
        this.regG001 = regG001;
    }

    public RegG990 getRegG990() {
        return regG990;
    }

    public void setRegG990(RegG990 regG990) {
        this.regG990 = regG990;
    }

    public RegH001 getRegH001() {
        return regH001;
    }

    public void setRegH001(RegH001 regH001) {
        this.regH001 = regH001;
    }

    public RegH990 getRegH990() {
        return regH990;
    }

    public void setRegH990(RegH990 regH990) {
        this.regH990 = regH990;
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

    public Reg1001 getReg1001() {
        return reg1001;
    }

    public void setReg1001(Reg1001 reg1001) {
        this.reg1001 = reg1001;
    }

    public Reg1990 getReg1990() {
        return reg1990;
    }

    public void setReg1990(Reg1990 reg1990) {
        this.reg1990 = reg1990;
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
