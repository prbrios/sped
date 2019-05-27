# SPED
Esses projeto tem por objetivo facilitar a geração do arquivo do SPED por meio de classes desenvolvidas em Java. O projeto foi iniciado tendo com base o GUIA PRÁTICO DA ESCRITURAÇÃO FISCAL DIGITAL – EFD ICMS/IPI.

[![Apache 2.0 License](https://img.shields.io/badge/license-apache%202.0-green.svg) ](https://github.com/wmixvideo/nfe/blob/master/LICENSE)

## Atenção

Este é um projeto colaborativo, sinta-se a vontade em usar e colaborar com o mesmo.

## Instalação

```
git clone https://github.com/prbrios/sped
mvn clean install
``` 
## Como usar

Você vai precisar basicamente criar objetos e no final converter esse(s) objeto(s) em uma string.

```java
import efd.*;
import efd.icmsipi.bloco0.*;
import efd.icmsipi.bloco9.*;
import java.time.LocalDate;

Reg0000 reg0000 = new Reg0000();
reg0000.setCodVer(13);
reg0000.setCodFin(1);
reg0000.setDtIni(LocalDate.of(2019,5,26));
reg0000.setDtFin(LocalDate.of(2019,5,26));
reg0000.setNome("SAINT SEYA");
reg0000.setCnpj(1L);
reg0000.setCpf(1L);
reg0000.setUf("CE");
reg0000.setIe("1");
reg0000.setCodMun(1);
reg0000.setIm("1");
reg0000.setSuframa("123");
reg0000.setIndPerfil("A");
reg0000.setIndAtiv(1);

Reg0001 reg0001 = new Reg0001();
reg0001.setIndMov(0);
reg0000.setReg0001(reg0001);

Reg9999 reg9999 = new Reg9999();
reg9999.setQtdLin(1500);

IcmsIpi icmsIpi = new IcmsIpi();
icmsIpi.setReg0000(reg0000);
icmsIpi.setReg9999(reg9999);

String arquivo = Conversor.converte(icmsIpi);

```