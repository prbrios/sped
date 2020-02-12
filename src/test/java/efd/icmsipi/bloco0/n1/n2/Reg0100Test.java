package efd.icmsipi.bloco0.n1.n2;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0100Test {

    @Test
    public void teste() {

        Reg0100 reg = new Reg0100();
        reg.setNome("Nome");
        reg.setCpf(99988877766L);
        reg.setCrc("");
        reg.setCnpj(11222333444455L);
        reg.setCep(60000000);
        reg.setEnd("Rua X");
        reg.setNum("10");
        reg.setCompl("Complemento");
        reg.setBairro("Bairro");
        reg.setFone("8511112222");
        reg.setFax("8522223333");
        reg.setEmail("email@email.com.br");
        reg.setCodMun(2304400);

        Assert.assertEquals(Util.formata("|0100|Nome|99988877766||11222333444455|60000000|Rua X|10|Complemento|Bairro|8511112222|8522223333|email@email.com.br|2304400|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0100||||||||||||||"), Conversor.converteBloco(new Reg0100()));

    }

}
