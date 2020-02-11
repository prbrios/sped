package efd.icmsipi.bloco1.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg1210 {

    @Getter @Inclui
    private final String reg = "1210";

    @Getter @Setter @Inclui
    private String tipoUtil;

    @Getter @Setter @Inclui
    private String nrDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlCredUtil;

    @Getter @Setter @Inclui
    private String chvDoce;

    public Reg1210(String tipoUtil, String nrDoc, BigDecimal vlCredUtil, String chvDoce) {
        this.tipoUtil = tipoUtil;
        this.nrDoc = nrDoc;
        this.vlCredUtil = vlCredUtil;
        this.chvDoce = chvDoce;
    }

    public Reg1210(){}
}