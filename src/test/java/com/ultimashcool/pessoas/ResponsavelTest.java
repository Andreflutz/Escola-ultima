package com.ultimashcool.pessoas;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ResponsavelTest {

    Responsavel responsavel1;
    Responsavel responsavel2;
    Responsavel responsavel3;


    @BeforeEach
    void setUp() {
        responsavel1 =new Responsavel("Fernanda Lima");
        responsavel2 =new Responsavel("Amanda Paixao");
        responsavel3 =new Responsavel("Felipe Marques");

    }

    @Test
    void testgetPagamentos() {
        Assertions.assertNotNull(responsavel1.getPagamentos());
        Assertions.assertNotNull(responsavel2.getPagamentos());
        Assertions.assertNotNull(responsavel3.getPagamentos());
        responsavel1.pagarMensalidade(1, true);
        responsavel2.pagarMensalidade(2, false);
        responsavel3.pagarMensalidade(3, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[1], true);
        Assertions.assertEquals(responsavel2.getPagamentos()[2], false);
        Assertions.assertEquals(responsavel3.getPagamentos()[3], true);
        responsavel1.pagarMensalidade(4, true);
        responsavel2.pagarMensalidade(5, false);
        responsavel3.pagarMensalidade(6, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[4], true);
        Assertions.assertEquals(responsavel2.getPagamentos()[5], false);
        Assertions.assertEquals(responsavel3.getPagamentos()[6], true);
    }

    @Test
    void testsetPagamentos() {
    }

    @Test
    void testpagarMensalidade() {
    }

    @Test
    void testverSituacao() {
    }

    @Test
    void testrelatorio() {
    }

    @AfterEach
    void tearDown() {
        responsavel1 = null;
        responsavel2 = null;
        responsavel3 = null;
    }
}