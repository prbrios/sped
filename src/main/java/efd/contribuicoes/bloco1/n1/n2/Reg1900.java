package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Reg1900 {

    @Getter @Inclui
    private final String reg = "1900";

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private String ser;

    @Getter @Inclui
    private Integer subSer;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Getter @Inclui
    private BigDecimal vltotRec;

    @Getter @Inclui
    private Integer quantDoc;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Inclui
    private String infCompl;

    @Getter @Inclui
    private String codCta;

    public Reg1900(Long cnpj, String codMod, String ser, Integer subSer, Integer codSit, BigDecimal vltotRec, Integer quantDoc, Integer cstPis, Integer cstCofins, Integer cfop, String infCompl, String codCta) {
        this.cnpj = cnpj;
        this.codMod = codMod;
        this.ser = ser;
        this.subSer = subSer;
        this.codSit = codSit;
        this.vltotRec = vltotRec;
        this.quantDoc = quantDoc;
        this.cstPis = cstPis;
        this.cstCofins = cstCofins;
        this.cfop = cfop;
        this.infCompl = infCompl;
        this.codCta = codCta;
    }

    public Reg1900(){ }
}
