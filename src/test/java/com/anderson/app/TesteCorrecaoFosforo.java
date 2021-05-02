/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anderson.app;

import com.bruno.app.enums.FonteFosforo;
import com.bruno.app.models.CorrecaoCTC;
import com.bruno.app.models.CorrecaoFosforo;
import java.text.DecimalFormat;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotSame;
import org.junit.Test;

/**
 *
 * @author Anderson Tonon
 */

public class TesteCorrecaoFosforo {
    
    int qtdTest = 3;

    Double []teorFosforoAtingir  = {12.0, 15.0, 9.0};
    Double []valorFosforoAtual   = {8.59, 5.66, 3.10};
    Double []eficienciaFosforo   = {70.0, 85.0, 99.0};
    Double []valorTonelada       = {250.50, 1000.00, 127.65};
    

    CorrecaoFosforo[] correcao_FonteFosforo_01 = new CorrecaoFosforo[qtdTest];
    CorrecaoFosforo[] correcao_FonteFosforo_02 = new CorrecaoFosforo[qtdTest];
    CorrecaoFosforo[] correcao_FonteFosforo_03 = new CorrecaoFosforo[qtdTest];
    CorrecaoFosforo[] correcao_FonteFosforo_04 = new CorrecaoFosforo[qtdTest];
    CorrecaoFosforo[] correcao_FonteFosforo_05 = new CorrecaoFosforo[qtdTest];
    CorrecaoFosforo[] correcao_FonteFosforo_06 = new CorrecaoFosforo[qtdTest];
    CorrecaoFosforo[] correcao_FonteFosforo_07 = new CorrecaoFosforo[qtdTest];
    CorrecaoFosforo[] correcao_FonteFosforo_08 = new CorrecaoFosforo[qtdTest];
    CorrecaoFosforo[] correcao_FonteFosforo_09 = new CorrecaoFosforo[qtdTest];
    CorrecaoFosforo[] correcao_FonteFosforo_10 = new CorrecaoFosforo[qtdTest];
    CorrecaoFosforo[] correcao_FonteFosforo_11 = new CorrecaoFosforo[qtdTest];
    CorrecaoFosforo[] correcao_FonteFosforo_12 = new CorrecaoFosforo[qtdTest];
    
    /*
    TABELA DE RELAÇÃO TIPO DE FONTE DE FOSFORO
    
    Superfosfato Simples  =     correcao_FonteFosforo_01
    Superfosfato Triplo   =     correcao_FonteFosforo_02
    MAP                   =     correcao_FonteFosforo_03
    DAP                   =     correcao_FonteFosforo_04
    Yoorin                =     correcao_FonteFosforo_05
    Fosfato Arad          =     correcao_FonteFosforo_06
    Fosfato Gafsa         =     correcao_FonteFosforo_07
    Fosfato Daqui         =     correcao_FonteFosforo_08
    Fosfato Patos Minas   =     correcao_FonteFosforo_09
    Escoria De Thomas     =     correcao_FonteFosforo_10
    Acido Fosforico       =     correcao_FonteFosforo_11
    Multif Magnesiano     =     correcao_FonteFosforo_12
    */
    
    
    public TesteCorrecaoFosforo(){
       
        for (int i = 0; i < qtdTest; i++) {
            
            correcao_FonteFosforo_01[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.SUPERFOSFATO_SIMPLES,   valorTonelada[i]);
            correcao_FonteFosforo_02[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.SUPERFOSFATO_TRIPLO,    valorTonelada[i]);
            correcao_FonteFosforo_03[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.MAP,                    valorTonelada[i]);
            correcao_FonteFosforo_04[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.DAP,                    valorTonelada[i]);
            correcao_FonteFosforo_05[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.YOORIN,                 valorTonelada[i]);
            correcao_FonteFosforo_06[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.FOSFATO_ARAD,           valorTonelada[i]);
            correcao_FonteFosforo_07[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.FOSFATO_GAFSA,          valorTonelada[i]);
            correcao_FonteFosforo_08[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.FOSFATO_DAOUI,          valorTonelada[i]);
            correcao_FonteFosforo_09[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.FOSFATO_PATOS_MINAS,    valorTonelada[i]);
            correcao_FonteFosforo_10[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.ESCORIA_DE_THOMAS,      valorTonelada[i]);
            correcao_FonteFosforo_11[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.ACIDO_FOSFORICO,        valorTonelada[i]);
            correcao_FonteFosforo_12[i] = new CorrecaoFosforo(teorFosforoAtingir[i], valorFosforoAtual[i],eficienciaFosforo[i], FonteFosforo.MULTIFOSFATO_MAGNESIANO,valorTonelada[i]);

        }
        
    }
       
    
    @Test
    public void testCalculaQuantidadeAAplicar() {
        DecimalFormat df =  new DecimalFormat();
        df.setMaximumFractionDigits(2);
        
            Double []resultado_FonteFosforo_01 = {123.95, 279.59, 151.64};
            Double []resultado_FonteFosforo_02 = { 54.42, 122.75,  66.57};
            Double []resultado_FonteFosforo_03 = { 46.48, 104.85,  56.86};
            Double []resultado_FonteFosforo_04 = { 49.58, 111.84,  60.66};
            Double []resultado_FonteFosforo_05 = {123.95, 279.59, 151.64};
            Double []resultado_FonteFosforo_06 = { 67.61, 152.50,  82.71};
            Double []resultado_FonteFosforo_07 = { 76.93, 173.54,  94.12};
            Double []resultado_FonteFosforo_08 = { 69.72, 157.27,  85.30};
            Double []resultado_FonteFosforo_09 = { 92.96, 209.69, 113.73};
            Double []resultado_FonteFosforo_10 = {120.60, 272.03, 147.54};
            Double []resultado_FonteFosforo_11 = { 42.91,  96.78,  52.49};
            Double []resultado_FonteFosforo_12 = {123.95, 279.59, 151.64};
          

        for (int i = 0; i < qtdTest; i++) {
            

            assertEquals(resultado_FonteFosforo_01[i], Double.parseDouble(df.format(correcao_FonteFosforo_01[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
            assertEquals(resultado_FonteFosforo_02[i], Double.parseDouble(df.format(correcao_FonteFosforo_02[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
            assertEquals(resultado_FonteFosforo_03[i], Double.parseDouble(df.format(correcao_FonteFosforo_03[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
            assertEquals(resultado_FonteFosforo_04[i], Double.parseDouble(df.format(correcao_FonteFosforo_04[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
            assertEquals(resultado_FonteFosforo_05[i], Double.parseDouble(df.format(correcao_FonteFosforo_05[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
            assertEquals(resultado_FonteFosforo_06[i], Double.parseDouble(df.format(correcao_FonteFosforo_06[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
            assertEquals(resultado_FonteFosforo_07[i], Double.parseDouble(df.format(correcao_FonteFosforo_07[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
            assertEquals(resultado_FonteFosforo_08[i], Double.parseDouble(df.format(correcao_FonteFosforo_08[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
            assertEquals(resultado_FonteFosforo_09[i], Double.parseDouble(df.format(correcao_FonteFosforo_09[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
            assertEquals(resultado_FonteFosforo_10[i], Double.parseDouble(df.format(correcao_FonteFosforo_10[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
            assertEquals(resultado_FonteFosforo_11[i], Double.parseDouble(df.format(correcao_FonteFosforo_11[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
            assertEquals(resultado_FonteFosforo_12[i], Double.parseDouble(df.format(correcao_FonteFosforo_12[i].calculaQuantidadeAAplicar()).replaceAll( "," , "." )));
        }
    }
    
    @Test    
    public void testValorPrimeiroNutrientesAdicionais() {
        DecimalFormat df =  new DecimalFormat();
        df.setMaximumFractionDigits(1);
        
            Double []resultado_PrimeiroResidual_01 = {12.4, 28.0, 15.2};
            Double []resultado_PrimeiroResidual_05 = {18.6, 41.9, 22.7};
            Double []resultado_PrimeiroResidual_12 = {13.6, 30.8, 16.7};
          
        
        for (int i = 0; i < qtdTest; i++) {
            
            assertEquals(resultado_PrimeiroResidual_01[i], Double.parseDouble(df.format(correcao_FonteFosforo_01[i].calculaKgHaPrimeiroResiduo()).replaceAll( "," , "." )));
            assertEquals(resultado_PrimeiroResidual_05[i], Double.parseDouble(df.format(correcao_FonteFosforo_05[i].calculaKgHaPrimeiroResiduo()).replaceAll( "," , "." )));
            assertEquals(resultado_PrimeiroResidual_12[i], Double.parseDouble(df.format(correcao_FonteFosforo_12[i].calculaKgHaPrimeiroResiduo()).replaceAll( "," , "." )));
            
            assertEquals("Enxofre",  correcao_FonteFosforo_01[i].calculaNomePrimeiroResiduo());
            assertEquals("Magnésio", correcao_FonteFosforo_05[i].calculaNomePrimeiroResiduo());
            assertEquals("Enxofre",  correcao_FonteFosforo_12[i].calculaNomePrimeiroResiduo());
        }

        
    }
    
    @Test
    public void testValorSegundoNutrientesAdicionais() {
        DecimalFormat df =  new DecimalFormat();
        df.setMaximumFractionDigits(1);
        
            Double []resultado_SegundoResidual_01 = {34.7,  78.3, 42.5};
            Double []resultado_SegundoResidual_02 = {10.9,  24.5, 13.3};
            Double []resultado_SegundoResidual_03 = { 4.2,   9.4,  5.1};
            Double []resultado_SegundoResidual_04 = { 7.9,  17.9,  9.7};
            Double []resultado_SegundoResidual_05 = {34.7,  78.3, 42.5};
            Double []resultado_SegundoResidual_06 = {35.2,  79.3, 43.0};
            Double []resultado_SegundoResidual_07 = {40.0,  90.2, 48.9};
            Double []resultado_SegundoResidual_08 = {31.4,  70.8, 38.4};
            Double []resultado_SegundoResidual_09 = {26.0,  58.7, 31.8};
            Double []resultado_SegundoResidual_10 = {53.1, 119.7, 64.9};

            Double []resultado_SegundoResidual_12 = {22.3, 50.3, 27.3};
            
        for (int i = 0; i < qtdTest; i++) {
            
            assertEquals(resultado_SegundoResidual_01[i], Double.parseDouble(df.format(correcao_FonteFosforo_01[i].calculaKgHaSegundoResiduo()).replaceAll( "," , "." )));
            assertEquals(resultado_SegundoResidual_02[i], Double.parseDouble(df.format(correcao_FonteFosforo_02[i].calculaKgHaSegundoResiduo()).replaceAll( "," , "." )));
            assertEquals(resultado_SegundoResidual_03[i], Double.parseDouble(df.format(correcao_FonteFosforo_03[i].calculaKgHaSegundoResiduo()).replaceAll( "," , "." )));
            assertEquals(resultado_SegundoResidual_04[i], Double.parseDouble(df.format(correcao_FonteFosforo_04[i].calculaKgHaSegundoResiduo()).replaceAll( "," , "." )));
            assertEquals(resultado_SegundoResidual_05[i], Double.parseDouble(df.format(correcao_FonteFosforo_05[i].calculaKgHaSegundoResiduo()).replaceAll( "," , "." )));
            assertEquals(resultado_SegundoResidual_06[i], Double.parseDouble(df.format(correcao_FonteFosforo_06[i].calculaKgHaSegundoResiduo()).replaceAll( "," , "." )));
            assertEquals(resultado_SegundoResidual_07[i], Double.parseDouble(df.format(correcao_FonteFosforo_07[i].calculaKgHaSegundoResiduo()).replaceAll( "," , "." )));
            assertEquals(resultado_SegundoResidual_08[i], Double.parseDouble(df.format(correcao_FonteFosforo_08[i].calculaKgHaSegundoResiduo()).replaceAll( "," , "." )));
            assertEquals(resultado_SegundoResidual_09[i], Double.parseDouble(df.format(correcao_FonteFosforo_09[i].calculaKgHaSegundoResiduo()).replaceAll( "," , "." )));
            assertEquals(resultado_SegundoResidual_10[i], Double.parseDouble(df.format(correcao_FonteFosforo_10[i].calculaKgHaSegundoResiduo()).replaceAll( "," , "." )));
            
            assertEquals(resultado_SegundoResidual_12[i], Double.parseDouble(df.format(correcao_FonteFosforo_12[i].calculaKgHaSegundoResiduo()).replaceAll( "," , "." )));
     
            
            assertEquals("Cálcio",      correcao_FonteFosforo_01[i].calculaNomeSegundoResiduo());
            assertEquals("Cálcio",      correcao_FonteFosforo_02[i].calculaNomeSegundoResiduo());
            assertEquals("Nitrogênio",  correcao_FonteFosforo_03[i].calculaNomeSegundoResiduo());
            assertEquals("Nitrogênio",  correcao_FonteFosforo_04[i].calculaNomeSegundoResiduo());
            assertEquals("Cálcio",      correcao_FonteFosforo_05[i].calculaNomeSegundoResiduo());
            assertEquals("Cálcio",      correcao_FonteFosforo_06[i].calculaNomeSegundoResiduo());
            assertEquals("Cálcio",      correcao_FonteFosforo_07[i].calculaNomeSegundoResiduo());
            assertEquals("Cálcio",      correcao_FonteFosforo_08[i].calculaNomeSegundoResiduo());
            assertEquals("Cálcio",      correcao_FonteFosforo_09[i].calculaNomeSegundoResiduo());
            assertEquals("Cálcio",      correcao_FonteFosforo_10[i].calculaNomeSegundoResiduo());
            assertEquals("Cálcio",      correcao_FonteFosforo_12[i].calculaNomeSegundoResiduo());
        }  
    }
    @Test
    public void testCalculaPrecoPorToneladaFosforo() {
        DecimalFormat df =  new DecimalFormat();
        df.setMaximumFractionDigits(2);
        
            
            Double []resultado_ValorTonelada_1  = {31.05, 279.59, 19.36};
            Double []resultado_ValorTonelada_2  = {13.63, 122.75,  8.50};
            Double []resultado_ValorTonelada_3  = {11.64, 104.85,  7.26};
            Double []resultado_ValorTonelada_4  = {12.42, 111.84,  7.74};
            Double []resultado_ValorTonelada_5  = {31.05, 279.59, 19.36};
            Double []resultado_ValorTonelada_6  = {16.94, 152.50, 10.56};
            Double []resultado_ValorTonelada_7  = {19.27, 173.54, 12.01};
            Double []resultado_ValorTonelada_8  = {17.47, 157.27, 10.89};
            Double []resultado_ValorTonelada_9  = {23.29, 209.69, 14.52};
            Double []resultado_ValorTonelada_10 = {30.21, 272.03, 18.83};
            Double []resultado_ValorTonelada_11 = {10.75,  96.78,  6.70};
            Double []resultado_ValorTonelada_12 = {31.05, 279.59, 19.36};
               
            for (int i = 0; i < qtdTest; i++) {
                
                assertEquals(resultado_ValorTonelada_1[i], Double.parseDouble(df.format(correcao_FonteFosforo_01[i].calculaCustoPorHa()).replaceAll( "," , "." )));
                assertEquals(resultado_ValorTonelada_2[i], Double.parseDouble(df.format(correcao_FonteFosforo_02[i].calculaCustoPorHa()).replaceAll( "," , "." )));
                assertEquals(resultado_ValorTonelada_3[i], Double.parseDouble(df.format(correcao_FonteFosforo_03[i].calculaCustoPorHa()).replaceAll( "," , "." )));
                assertEquals(resultado_ValorTonelada_4[i], Double.parseDouble(df.format(correcao_FonteFosforo_04[i].calculaCustoPorHa()).replaceAll( "," , "." )));
                assertEquals(resultado_ValorTonelada_5[i], Double.parseDouble(df.format(correcao_FonteFosforo_05[i].calculaCustoPorHa()).replaceAll( "," , "." )));
                assertEquals(resultado_ValorTonelada_6[i], Double.parseDouble(df.format(correcao_FonteFosforo_06[i].calculaCustoPorHa()).replaceAll( "," , "." )));
                assertEquals(resultado_ValorTonelada_7[i], Double.parseDouble(df.format(correcao_FonteFosforo_07[i].calculaCustoPorHa()).replaceAll( "," , "." )));
                assertEquals(resultado_ValorTonelada_8[i], Double.parseDouble(df.format(correcao_FonteFosforo_08[i].calculaCustoPorHa()).replaceAll( "," , "." )));
                assertEquals(resultado_ValorTonelada_9[i], Double.parseDouble(df.format(correcao_FonteFosforo_09[i].calculaCustoPorHa()).replaceAll( "," , "." )));
                assertEquals(resultado_ValorTonelada_10[i], Double.parseDouble(df.format(correcao_FonteFosforo_10[i].calculaCustoPorHa()).replaceAll( "," , "." )));
                assertEquals(resultado_ValorTonelada_11[i], Double.parseDouble(df.format(correcao_FonteFosforo_11[i].calculaCustoPorHa()).replaceAll( "," , "." )));
                assertEquals(resultado_ValorTonelada_12[i], Double.parseDouble(df.format(correcao_FonteFosforo_12[i].calculaCustoPorHa()).replaceAll( "," , "." )));

            }
            
    }
  
}