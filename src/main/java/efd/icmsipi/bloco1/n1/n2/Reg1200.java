package efd.icmsipi.bloco1.n1.n2;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1210;
import lombok.Getter;
import lombok.Setter;


public class Reg1200 {

    @Getter @Inclui
    private final String reg = "1200";

    @Getter @Setter @Inclui
    private String codAjApur;

    @Getter @Setter @Inclui
    private BigDecimal sldCred;

    @Getter @Setter @Inclui
    private BigDecimal credApr;

    @Getter @Setter @Inclui
    private BigDecimal credReceb;

    @Getter @Setter @Inclui
    private BigDecimal credUtil;

    @Getter @Setter @Inclui
    private BigDecimal sldCredFim;

    @Getter @Setter @Filho
    private List<Reg1210> reg1210;

    public Reg1200(String codAjApur, BigDecimal sldCred, BigDecimal credApr, BigDecimal credReceb, BigDecimal credUtil, BigDecimal sldCredFim) {
        this.codAjApur = codAjApur;
        this.sldCred = sldCred;
        this.credApr = credApr;
        this.credReceb = credReceb;
        this.credUtil = credUtil;
        this.sldCredFim = sldCredFim;
    }

    public Reg1200(){}
}