package efd.icmsipi.bloco0;

import java.time.LocalDate;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.Reg0001;
import efd.icmsipi.bloco0.n1.Reg0002;
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
import lombok.Getter;
import lombok.Setter;


public class Reg0000 {

    /**
     * 01 REG
     * Texto fixo contendo "0000"
     */
    @Getter @Inclui
    private final String reg = "0000";

    /**
     * 02 COD_VER
     */
    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer codVer;

    /**
     * 03 COD_FIN
     */
    @Getter @Setter @Inclui
    private Integer codFin;

    /**
     * 04 DT_INI
     */
    @Getter @Setter @Inclui
    private LocalDate dtIni;

    /**
     * 05 DT_FIN
     */
    @Getter @Setter @Inclui
    private LocalDate dtFin;

    /**
     * 06 NOME
     */
    @Getter @Setter @Inclui
    private String nome;

    /**
     * 07 CNPJ
     */
    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    /**
     * 08 CPF
     */
    @Getter @Setter @Inclui(zerosEsquerda = 11)
    private Long cpf;

    /**
     * 09 UF
     */
    @Getter @Setter @Inclui
    private String uf;

    /**
     * 10 IE
     */
    @Getter @Setter @Inclui
    private String ie;

    /**
     * 11 COD_MUN
     */
    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    /**
     * 12 IM
     */
    @Getter @Setter @Inclui
    private String im;

    /**
     * 13 SUFRAMA
     */
    @Getter @Setter @Inclui
    private String suframa;

    /**
     * 14 IND_PERFIL
     */
    @Getter @Setter @Inclui
    private String indPerfil;

    /**
     * 15 IND_ATIV
     */
    @Getter @Setter @Inclui
    private Integer indAtiv;

    @Getter @Setter @Filho
    private Reg0001 reg0001;

    @Getter @Setter @Filho
    private Reg0002 reg0002;

    @Getter @Setter @Filho
    private Reg0990 reg0990;

    @Getter @Setter @Filho
    private RegB001 regB001;

    @Getter @Setter @Filho
    private RegB990 regB990;

    @Getter @Setter @Filho
    private RegC001 regC001;

    @Getter @Setter @Filho
    private RegC990 regC990;

    @Getter @Setter @Filho
    private RegD001 regD001;

    @Getter @Setter @Filho
    private RegD990 regD990;

    @Getter @Setter @Filho
    private RegE001 regE001;

    @Getter @Setter @Filho
    private RegE990 regE990;

    @Getter @Setter @Filho
    private RegG001 regG001;

    @Getter @Setter @Filho
    private RegG990 regG990;

    @Getter @Setter @Filho
    private RegH001 regH001;

    @Getter @Setter @Filho
    private RegH990 regH990;

    @Getter @Setter @Filho
    private RegK001 regK001;

    @Getter @Setter @Filho
    private RegK990 regK990;

    @Getter @Setter @Filho
    private Reg1001 reg1001;

    @Getter @Setter @Filho
    private Reg1990 reg1990;

    @Getter @Setter @Filho
    private Reg9001 reg9001;

    @Getter @Setter @Filho
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

}
