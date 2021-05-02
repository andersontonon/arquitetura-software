/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anderson.app;

import com.bruno.app.enums.FonteFosforo;
import com.bruno.app.enums.FontePotassio;
import com.bruno.app.enums.TexturaSolo;
import com.bruno.app.models.CorrecaoCTC;
import com.bruno.app.models.CorrecaoFosforo;
import com.bruno.app.models.CorrecaoPotassio;
import java.text.DecimalFormat;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author Anderson Tonon
 */

public class TesteCorrecaoPotassio {
    
    int qtdTest = 3;
    
    Double []potassio   = {0.15,  0.20, 0.10};
    Double []calcio     = {5.56,  4.62, 2.14};
    Double []magnesio   = {1.63,  1.47, 1.32};
    Double []h_Al       = {5.35,  2.69, 6.79};   
    
    Double []teorPotassioDesejadoNaCTC ={7.0, 50.0, 99.9 };
            
    TexturaSolo []texturaSolo = {TexturaSolo.ARGILOSO, TexturaSolo.TEXTURA_MEDIA, TexturaSolo.ARGILOSO};
            
    Double []teorAtualPotassioNoSolo = {potassio[0], potassio[1], potassio[2]}; 
    
    FontePotassio []fontePotassio = {FontePotassio.SULFATO_DE_POTASSIO_MAGNESIO, FontePotassio.CLORETO_DE_POTASSIO, FontePotassio.SULFATO_DE_POTASSIO};
            
    Double []valorFontePorTonelada = {14.0, 55.5, 200.0};
        
    
    Double[] ctcCmol = new Double[qtdTest];
    
    CorrecaoPotassio []correcaoPotassio = new CorrecaoPotassio[qtdTest];
    
    public TesteCorrecaoPotassio(){
        
        for (int i = 0; i < qtdTest; i++) {
            
            ctcCmol[i] = new CorrecaoCTC().calculaCTCcmol(new CorrecaoCTC().calculaScmol(potassio[i], calcio[i], magnesio[i]), h_Al[i]);    
            correcaoPotassio[i] = new CorrecaoPotassio(ctcCmol[i], teorPotassioDesejadoNaCTC[i], texturaSolo[i], teorAtualPotassioNoSolo[i], fontePotassio[i], valorFontePorTonelada[i]);

        }
        
    } 
    
    @Test
    public void testCalculaParticipacaoAtualDoPotassioNaCTC() {
        DecimalFormat df =  new DecimalFormat();
        df.setMaximumFractionDigits(1);
        
        Double []participacaoAtualPotassio = {1.2, 2.2, 1.0};
        
        for (int i = 0; i < qtdTest; i++) {
            
            assertEquals(participacaoAtualPotassio[i], Double.parseDouble(df.format(correcaoPotassio[i].calculaParticipacaoAtualDoPotassioNaCTC()).replaceAll( "," , "." )));
        
        }
    }
    
    @Test
    public void testCalculaParticipacaoDoPotassioNaCTCAposCorrecao() {
        
        Double []potassioAposCorrecao = {teorPotassioDesejadoNaCTC[0], teorPotassioDesejadoNaCTC[1], teorPotassioDesejadoNaCTC[2]};
        
        for (int i = 0; i < qtdTest; i++) {
            
            assertEquals(potassioAposCorrecao[i], correcaoPotassio[i].calculaParticipacaoDoPotassioNaCTCAposCorrecao());
        }
    }

    @Test
    public void testCalculaParticipacaoDoPotassioIdealNaCTC() {
        
        Double []PotassioIdealNaCTC = {3.0, 3.0, 3.0};
        
        for (int i = 0; i < qtdTest; i++) {
            
            assertEquals(PotassioIdealNaCTC[i], correcaoPotassio[i].calculaParticipacaoPotassioIdealNaCTC());
            
        }
    }    
    
    @Test
    public void testCalculaQuantidadeAAplicar() {
        
        DecimalFormat df =  new DecimalFormat();
        df.setMaximumFractionDigits(2);
        
        Double []calculaQuantidadeAAplicar = {3704.92, 8165.79, 21739.56};
        
        for (int i = 0; i < qtdTest; i++) {
            System.out.println(correcaoPotassio[i].calculaQuantidadeAAplicar());
            assertEquals(calculaQuantidadeAAplicar[i], Double.parseDouble(df.format(correcaoPotassio[i].calculaQuantidadeAAplicar()).replace(".", "").replaceAll(",", ".")));
        
        }
    }
    
    @Test
    public void testCalculaCustoPorHa() {
        
        DecimalFormat df =  new DecimalFormat();
        df.setMaximumFractionDigits(2);
        
        Double []calculaCustoPorHa = {51.87, 453.20, 4347.91};
        
        for (int i = 0; i < qtdTest; i++) {
            System.out.println(correcaoPotassio[i].calculaCustoPorHa());            
            assertEquals(calculaCustoPorHa[i], Double.parseDouble(df.format( correcaoPotassio[i].calculaCustoPorHa()).replace(".", "").replaceAll( "," , "." )));
        
        }
    }  
}