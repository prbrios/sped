package efd.icmsipi.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Bloco1921;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Bloco1925;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Bloco1926;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Bloco1920 {

    @Inclui
    private final String reg = "1920";

    @Inclui
    private BigDecimal vltotTransfDebitosOa;

    @Inclui
    private BigDecimal vlTotAjDebitosOa;

    @Inclui
    private BigDecimal vlEstornosCredOa;

    @Inclui
    private BigDecimal vlTotTransfCreditosOa;

    @Inclui
    private BigDecimal vlTotAjCretidosOa;

    @Inclui
    private BigDecimal vlEstornosDebOa;

    @Inclui
    private BigDecimal vlSldCredorAntOa;

    @Inclui
    private BigDecimal vlSldApuradoOa;

    @Inclui
    private BigDecimal vlTotDed;

    @Inclui
    private BigDecimal vlIcmsRecolherOa;

    @Inclui
    private BigDecimal vlSldCredorTranspOa;

    @Inclui
    private BigDecimal debEspOa;

    @Filho
    private List<Bloco1921> bloco1921;

    @Filho
    private List<Bloco1925> bloco1925;

    @Filho
    private List<Bloco1926> bloco1926;

}