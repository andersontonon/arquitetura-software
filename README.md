# Relatório

Antes da refatoração dos componentes do código, ao executar o comando cloc, obteve-se a resposta abaixo:

```
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             8             73              7            403
-------------------------------------------------------------------------------
SUM:                             8             73              7            403
-------------------------------------------------------------------------------

```

## Inicio da refatoração

```
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            11             86              7            420
-------------------------------------------------------------------------------
SUM:                            11             86              7            420
-------------------------------------------------------------------------------
```

Após a refatoração da classe de Analise, obteve-se um pequeno aumento nas linhas de código do projeto causados pelas interfaces e novas classes criadas, e apesar de haverem mais linhas, condicionais foram removidos aplicando o design pattern Strategy, facilitando a manutenibilidade. [Link da alteração](https://github.com/brunoricardosecco/arquitetura-software/commit/0d5306cc8d0541f2dc9917674aa9fd732bfb6c18)

```
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            11             86              7            414
-------------------------------------------------------------------------------
SUM:                            11             86              7            414
-------------------------------------------------------------------------------

```

Após a refatoração da classe de CorrecaoCTC, obteve-se uma diminuição nas linhas de código, referente a remoção de condicionais aplicando o design pattern Strategy, facilitando a manutenibilidade. [Link da alteração](https://github.com/brunoricardosecco/arquitetura-software/commit/5cca8c7b375ca251c38250386f88f4683a2827b1)

```
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            13             93              7            346
-------------------------------------------------------------------------------
SUM:                            13             93              7            346
-------------------------------------------------------------------------------

```

Após a refatoração da classe de CorrecaoFosforo, obteve-se uma expressiva diminuição de linhas de código. Resultado relacionado com a remoção de funções que poderiam ser removidas alterando o seu retorno direto para a fórmula e também houve a remoção de condicionais aplicando o design pattern Strategy, facilitando a manutenibilidade. Também foi alterado o enum de Fonte de Fosforo para se adequar melhor ao pattern. [Link da alteração](https://github.com/brunoricardosecco/arquitetura-software/commit/de9aae8f18afe3c19ec4dcc01526a6ec3ad2189b)

```
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            13             96              7            349
-------------------------------------------------------------------------------
SUM:                            13             96              7            349
-------------------------------------------------------------------------------

```

Após a refatoração da classe de CorrecaoPotassio, obteve-se um pequeno aumento das linhas de código causadas pela adequação da classe ao pattern Strategy, tornando possível a remoção dos condicionais. Também foi alterado o enum de Fonte de Potássio para se adequar melhor ao pattern. [Link da alteração](https://github.com/brunoricardosecco/arquitetura-software/commit/de9aae8f18afe3c19ec4dcc01526a6ec3ad2189b)


-------------------------------------------------------------------------------
# Relatório de teste 
por Anderson Tonon

<br>

## Passos para realização dos testes com O JUnit:
    
    * Gerar fork do repositório.
    * Clonar o repositório localmente.
    * Leitura e compreensão do código.
    * Implementar os testes automatizados.
    * Atualizar relatório.
    
 <br>
 
 #### Gerar fork do repositório:
    
    * O fork foi realizado, sem maiores problemas. 
    
 <br>
 
 #### Clonar o repositório localmente:
    
    * O repositório foi clonado ultilizando o Git Bash.
 
 
 <br> 
 
 #### Leitura e compreensão do código:
    
    * O código é bem estruturado, foi nescessário pouco tempo para o seu entendimento.


 </br>
 
 #### Implementar os testes automatizados:
    
    * Foi utilizado o JUnit, para a realização dos testes, já havia no código de teste e foi adicionado outro packed
      de testes. Foi feito testes para todas as possibilidades de entrada de dados pelo usuário na planilha, para Teores do
      solo, correção/recuperação de fósforo e correção e recuperação de potássio.
    
    * Não foi modificada no código a quantidade de dígitos a retornar nas funções.
    
    * Foi utilizado alguns recursos nos testes, para adequar o retorno dos dados de acordo com os dados exibidos na planilha,
      como exemplo trocar "." por ",", e quantidade de dígitos após a vírgula.
    
    * Contudo não foi necessário a alteração no código, pois o mesmo cumpria com os requisitos para a implementação da 
      arquitetura necessária. 


</br>

#### Atualizar relatório:

    * Relatório possui informações importantes sobre o desenvolvimento dos testes.
</br>

-------------------------------------------------------------------------------
                                                            
# Lista classes de testes criadas:  
                                                            
   [TesteCorrecaoFosforo.java](https://github.com/andersontonon/arquitetura-software/commit/5942422dc97cd35cf748cc3bd1bd71444c6ad90c)
   <br>
   [TesteCorrecaoPotassio.java](https://github.com/andersontonon/arquitetura-software/commit/83b3ab7750b115889c7f7bea88c075ddba4d1e87)
   <br>
   [TesteTeoresSolo.java](https://github.com/andersontonon/arquitetura-software/commit/7d6f7ca371a0cd3beccce70947b5b9f3dfb5e8c5)


                                                            
