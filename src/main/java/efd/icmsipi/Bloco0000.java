package efd.icmsipi;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.Bloco0001;
import efd.icmsipi.bloco0.n1.Bloco0990;
import efd.icmsipi.bloco1.n1.Bloco1001;
import efd.icmsipi.bloco1.n1.Bloco1990;
import efd.icmsipi.bloco9.Bloco9001;
import efd.icmsipi.bloco9.Bloco9990;
import efd.icmsipi.blocoB.n1.BlocoB001;
import efd.icmsipi.blocoB.n1.BlocoB990;
import efd.icmsipi.blocoC.n1.BlocoC001;
import efd.icmsipi.blocoC.n1.BlocoC990;
import efd.icmsipi.blocoD.n1.BlocoD001;
import efd.icmsipi.blocoD.n1.BlocoD990;
import efd.icmsipi.blocoE.n1.BlocoE001;
import efd.icmsipi.blocoE.n1.BlocoE990;
import efd.icmsipi.blocoG.n1.BlocoG001;
import efd.icmsipi.blocoG.n1.BlocoG990;
import efd.icmsipi.blocoH.n1.BlocoH001;
import efd.icmsipi.blocoH.n1.BlocoH990;
import efd.icmsipi.blocoK.n1.BlocoK001;
import efd.icmsipi.blocoK.n1.BlocoK990;
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
public class Bloco0000 {

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
    private Bloco0001 bloco0001;

    @Filho
    private Bloco0990 bloco0990;

    @Filho
    private BlocoB001 blocoB001;

    @Filho
    private BlocoB990 blocoB990;

    @Filho
    private BlocoC001 blocoC001;

    @Filho
    private BlocoC990 blocoC990;

    @Filho
    private BlocoD001 blocoD001;

    @Filho
    private BlocoD990 blocoD990;

    @Filho
    private BlocoE001 blocoE001;

    @Filho
    private BlocoE990 blocoE990;

    @Filho
    private BlocoG001 blocoG001;

    @Filho
    private BlocoG990 blocoG990;

    @Filho
    private BlocoH001 blocoH001;

    @Filho
    private BlocoH990 blocoH990;

    @Filho
    private BlocoK001 blocoK001;

    @Filho
    private BlocoK990 blocoK990;

    @Filho
    private Bloco1001 bloco1001;

    @Filho
    private Bloco1990 bloco1990;

    @Filho
    private Bloco9001 bloco9001;

    @Filho
    private Bloco9990 bloco9990;

}
