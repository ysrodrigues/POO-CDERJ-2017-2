# Programação Orientada a Objeto
## Exercício AD1

1. Suponha as classes abaixo, as quais iniciam uma aplicação em Java para manipulação de questões de uma prova:

```java
class Questao {
  private String enunciado;
  
  public Questao(String enunciado) {
    this.enunciado = enunciado;
  }

  public String getEnunciado() {
  return this.enunciado;
  }
}

class Discursiva extends Questao {
  private String gabarito;
  
  public Discursiva(String enunciado, String gabarito) {
    super(enunciado);
    this.gabarito = gabarito;
}

  public String getGabarito() {
  return this.gabarito;
  }
  
  public String toString() {
  return this.getEnunciado() + "\n";
  }
}

public class AD1_2017_2 {
  public static void main(String[] args) {
    Questao[] prova = new Questao[2];
    prova[0] = new Discursiva("Qual é o número da última versão de Java?", "8");
    
    ItemVerdadeiroFalso[] itens = new ItemVerdadeiroFalso[3];
    itens[0] = new ItemVerdadeiroFalso("Java foi lançada há mais de 20 anos atrás", true);
    itens[1] = new ItemVerdadeiroFalso("OO surgiu com a linguagem Java", false);
    itens[2] = new ItemVerdadeiroFalso("Eclipse é um editor de texto multilinguagem", true);
    
    prova[1] = new VerdadeiroFalso(itens);
    
    int num = 1;
    for (Questao q : prova) {
      System.out.print(num + ") ");
      System.out.println(q); // Chamada do método toString() para cada questão q
      num++;
    }
  }
}
```

Após implementada, para os objetos criados na main(), esta aplicação deve ter a seguinte saída:

<pre>
 1) Qual é o número da última versão de Java?

 2) Assinale verdadeiro ou falso para os itens:
 ( ) Java foi lançada há mais de 20 anos atrás
 ( ) OO surgiu com a linguagem Java
 ( ) Eclipse é um editor de texto multilinguagem
</pre>

<ol type="a">
  <li>
    Implemente as classes ItemVerdadeiroFalso e VerdadeiroFalso usadas na main(). Observe os valores passados na construção dos objetos para inferir sua estrutura.
  </li>
  <li>
    Implemente uma classe chamada Prova, de forma a incorporar a construção dos objetos criados diretamente na main(). Na construção do objeto Prova é informado quantas questões esta possuirá.
  </li>
  <li>
    Nesta classe Prova criada, implemente um método de impressão de forma a incorporar a impressão anterior feita diretamente na main().
  </li>
  <li>Reescreva a main criando uma instância da classe Prova e chame o método de impressão criado.</li>
</ol>

## Exercício AD2

1. Considere que sua empresa de software seja contratada pelos Correios para encontrar padrões para as soluções já implementadas para o problema de entrega de correspondências. Este problema consiste na procura de um caminho que, começa numa cidade de origem (isto é, a cidade onde as correspondências estão armazenadas) já definida, dentre várias, visita cada cidade SOMENTE uma vez e regressa à cidade inicial. 

Seu programa deve receber, como parâmetro de entrada, um arquivo contendo as soluções já implementadas pelos Correios, e deve retornar, no arquivo **resp-<nome do arquivo de entrada>**, os melhores trechos entre duas cidades que já foram usados mais de uma vez (em ordem decrescente, mostrando sempre os melhores trechos primeiro).

Um exemplo de arquivo de entrada neste formato seria:
RJ/SP/VIX/BH/NIT/RJ
RJ/VIX/SP/BH/NIT/RJ
SP/BH/NIT/RJ/VIX/SP
BH/NIT/RJ/VIX/SP/BH

Para o exemplo supracitado, o arquivo de resposta seria composto dos seguintes
trechos:
NIT/RJ  -> 4
BH/NIT  -> 4
RJ/VIX  -> 3
VIX/SP  -> 3
SP/BH   -> 3
