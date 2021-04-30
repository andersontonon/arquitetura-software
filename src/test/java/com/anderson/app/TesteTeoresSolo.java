/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anderson.app;

import com.bruno.app.models.CorrecaoCTC;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anderson Tonon
 */
public class TesteTeoresSolo {
     
    CorrecaoCTC correcao = new CorrecaoCTC();
    
    public TesteTeoresSolo() {
    }

    
    @Test
    public void testCalculaScmol() {
        
        Double []resultado  = {7.50, 10.6, 9.5};
        
        Double []potassio   = {0.5,  1.6, 2.1};
        Double []calcio     = {5.5,  7.6, 6.1};
        Double []magnesio   = {1.5,  1.4, 1.3};
        
        assertEquals(resultado[0], correcao.calculaScmol(potassio[0], calcio[0], magnesio[0]));
        assertEquals(resultado[1], correcao.calculaScmol(potassio[1], calcio[1], magnesio[1]));
        assertEquals(resultado[2], correcao.calculaScmol(potassio[2], calcio[2], magnesio[2]));
        assertNotSame(resultado[0]+1, correcao.calculaScmol(potassio[0], calcio[0], magnesio[0]));// Valor correto esperado: '7.5'
    }
    
    @Test
    public void testCalculaPercentualVAtual() {
        
        Double []resultado  = {50.0, 50.0, 50.0};
        
        Double []potassio   = {0.5,  1.6, 2.1};
        Double []calcio     = {5.5,  7.6, 6.1};
        Double []magnesio   = {1.5,  1.4, 1.3};
        
        Double []resultadoScmol  = {7.50, 10.6, 9.50};
        
        Double[] Scmol = new Double[3]; 
        
        Scmol[0] = correcao.calculaScmol(potassio[0], calcio[0], magnesio[0]);
        Scmol[1] = correcao.calculaScmol(potassio[1], calcio[1], magnesio[1]);
        Scmol[2] = correcao.calculaScmol(potassio[2], calcio[2], magnesio[2]);
        
        Double[] CTCcmol = new Double[3]; 
       
        CTCcmol[0] = correcao.calculaCTCcmol(Scmol[0], resultadoScmol[0]);
        CTCcmol[1] = correcao.calculaCTCcmol(Scmol[1], resultadoScmol[1]);
        CTCcmol[2] = correcao.calculaCTCcmol(Scmol[2], resultadoScmol[2]);
        
        
        assertEquals(resultado[0], correcao.calculaPercentualVAtual(Scmol[0], CTCcmol[0]));
        assertEquals(resultado[1], correcao.calculaPercentualVAtual(Scmol[1], CTCcmol[1]));
        assertEquals(resultado[2], correcao.calculaPercentualVAtual(Scmol[2], CTCcmol[2]));
        
        assertNotSame(resultado[0], correcao.calculaPercentualVAtual(Scmol[0], CTCcmol[0]));
    }
    
    @Test
    public void testCalculaMOPercentual() {
        
        Double []percentual   = {0.0,  25.5, 78.9};
        
        Double []resultado   = {0.0,  2.55, 7.89};
        
        assertEquals(resultado[0], correcao.calculaMOPercentual(percentual[0]));
        assertEquals(resultado[1], correcao.calculaMOPercentual(percentual[1]));
        assertEquals(resultado[2], correcao.calculaMOPercentual(percentual[2]));
        assertNotSame(resultado[0], correcao.calculaMOPercentual(percentual[0])); // Valor correto esperado: '0.0'
    }
    
    @Test
    public void testCalculaCarbono() {
        
        Double []carbono   = {0.0,  25.5, 30.7};
        
        Double []resultado   = {0.0,  14.825581395348838, 17.848837209302324};
        
        assertEquals(resultado[0], correcao.calculaCarbono(carbono[0]));
        assertEquals(resultado[1], correcao.calculaCarbono(carbono[1]));
        assertEquals(resultado[2], correcao.calculaCarbono(carbono[2]));
        assertNotSame(resultado[1], correcao.calculaCarbono(carbono[0])); //// Valor correto esperado: '0.0'
        
        
    }
}
