package efd.icmsipi;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.Reg0001;
import efd.icmsipi.bloco0.n1.Reg0990;
import efd.icmsipi.bloco1.n1.Reg1001;
import efd.icmsipi.bloco1.n1.Reg1990;
import efd.icmsipi.bloco9.Reg9001;
import efd.icmsipi.bloco9.Reg9990;
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

import java.time.LocalDate;

/**
 * BLOCO 0: ABERTURA, IDENTIFICAÇÃO E REFERÊNCIAS
 * REGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA ENTIDADE
 *<p>
 * Este Registro é obrigatório e corresponde ao primeiro registro do arquivo.
 * Nos casos de EFD-ICMS/IPI apresentadas por estabelecimentos situados em outra UF e que possuam Inscrição Estadual nos termos do Convênio ICMS nº 113/04 (serviços de comunicação definidos pela Anatel), deve-se observar o seguinte procedimento para preenchimento do registro 0000:
 * </p>
 * <ul>
 * <li>Informar o campo UF da unidade federada do tomador de serviços</li>
 * <li>Informar no campo IE a inscrição estadual na unidade federada do tomador de serviços</li>
 * <li>Informar no campo COD_MUN o código de município correspondente à capital do estado do tomador de serviços</li>
 * </ul>
 *
 * @author Paulo Rios prbrios@gmail.com
 * @since 17/05/2019
 *
 */

@Getter
@Setter
public class Reg0000 {

    /**
     * 01 REG
     * Texto fixo contendo "0000"
     */
    @Inclui
    private final String reg = "0000";

    /**
     * 02 COD_VER
     */
    @Inclui(zerosEsquerda = 3)
    private Integer codVer;

    /**
     * 03 COD_FIN
     */
    @Inclui
    private Integer codFin;

    /**
     * 04 DT_INI
     */
    @Inclui
    private LocalDate dtIni;

    /**
     * 05 DT_FIN
     */
    @Inclui
    private LocalDate dtFin;

    /**
     * 06 NOME
     */
    @Inclui
    private String nome;

    /**
     * 07 CNPJ
     */
    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    /**
     * 08 CPF
     */
    @Inclui(zerosEsquerda = 11)
    private Long cpf;

    /**
     * 09 UF
     */
    @Inclui
    private String uf;

    /**
     * 10 IE
     */
    @Inclui
    private String ie;

    /**
     * 11 COD_MUN
     */
    @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    /**
     * 12 IM
     */
    @Inclui
    private String im;

    /**
     * 13 SUFRAMA
     */
    @Inclui
    private String suframa;

    /**
     * 14 IND_PERFIL
     */
    @Inclui
    private String indPerfil;

    /**
     * 15 IND_ATIV
     */
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

}