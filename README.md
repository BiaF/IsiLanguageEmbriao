# IsiLanguageEmbriao
Embriao da IsiLanguage - curso de Compiladores

Este projeto foi desenvolvido como intrumento avaliativo para a disciplina de compiladores da UFABC ministrada pelo professor Francisco Isidro em dezembro de 2020.
O grupo contou com 4 integrantes: Ana Luiza Ferreira Figueiredo, Antonio Duarte Cantanhede Neto, Beatriz Favini Chicaroni e Rafael Calpena Rodrigues.

Foi utilizada a ferramenta geradora de parser antlr4
O principal objetivo do projeto é funcionar como um transpilador da "IsiLanguage", que é uma linguagem criada para esse projeto, para Java.

Para executar o programa você deve executar a classe principal localizada em
src/br/com/professorisidro/isilanguage/main/

Essa classe irá "traduzir" um programa escrito na IsiLanguage.
O programa está no arquivo input.isi

Ao executar a classe principal mencionada ela gera uma outra classe chamada MainClass.java no diretório em que está o arquivo input.isi
É possível verificar que a gramática java está correta nesse arquivo e executar o programa.

Para alterar ou adicionar novas regras à gramática, deve-se editar o arquivo IsiLang.g4
