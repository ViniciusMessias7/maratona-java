<p style="text-align: center;">
  <img width="500" alt="Thumbnail do vídeo no YouTube" src="https://i.ytimg.com/vi/VKjFuX91G5Q/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLCUA1JzRmWhkDSrhPF0SpLHj8sYHw"/>
</p>

<h1 style="text-align: center;">ANOTAÇÕES</h1>

<h1 style="text-align: left;">Como instalar o java & Configuração de variavel de ambiente
</h1>

### Instalação:

* Google: download jdk (versão) > qualquer versão, ex: oracle.
* JDK download > escolha a jdk compatível ao sistema operacional.
* Executar > next > "lembrar o caminho da instalação" > next > close.

<br /> 

### Variavel de ambiente:

* Copie o caminho que o java está instalado sem a pasta bin > editar as variáveis de ambiente do sistema > Variáveis de
  ambiente > variáveis do sistema > novo > nome: JAVA_HOME valor da variável: caminho todo sem ultima \ > ok
* OBS: Ao instalar o java é bom lembrar o caminho de instalação, pra facilitar esse processo!
* Path > home > novo > %JAVA_HOME%\bin

<br /> 

<h1 style="text-align: left;">Assuntos específicos</h1>

### Operador Aritmético

* Operadores que fazem calculos aritméticos
* `+` `-` `/` `*`
* Operação entre 2 numeros inteiro o resultado é sempre inteiro
* `%` resto da divisão > pode verificar por exemplo se um número é par ou impar

### Operadores relacionais

* Retornam valor boolean = true / false

* |`<`|`>`|`<=`|`>=`|`==`|`!=`|
        |---|---|--|--|--|----------|
  | menor | maior |menor ou igual|maior ou igual|igual| diferente |

### Operadores Lógicos

* Fazem sentido com estruturas condicionais
* and(&&) OR(||) !
* vou pra festa && se eu for maior de idade
* vou pra festa || ou ficar em casa

### Operadores atribuição

* Atribui algo a variavel
* `=` `+=` `*=` `/=` `%=`

### Operador ternario

* Usado pra simplificar if e else, associa um valor a uma variavel ou metodo
* syntax: String resultado = (condicao) ? verdadeiro : falso;

### Switch

* Funcionalidade simples, pra organizar condicionais simples(escolhas simples)

## Estrutura condicional
* Resultado tem que ser boolean = true ou false
* dentro dos parenteses tem que validar true pro if funcionar, if também tem bloco


## Contador
* `++` `--`
* contador++ = primeiro imprime e depois incrementa mais 1.
* 

  <br />

<h1 style="text-align: left;">Assuntos gerais</h1>

### Conversão de binario para decimal:

| Posição  | 7   | 6  | 5  | 4  | 3 | 2 | 1 | 0 |
|----------|-----|----|----|----|---|---|---|---|
| Valor    | 0   | 0  | 0  | 0  | 0 | 0 | 0 | 0 |
| Potência | 128 | 64 | 32 | 16 | 8 | 4 | 2 | 1 |

### O que é convenção?

* Conjunto de regras e diretrizes.

<br /> 

### O que é linguagem de baixo nível?

* É uma linguagem de programação mais proxímo da linguagem da máquina

<br /> 

### O que é linguagem de alto nível?

* É uma linguagem que um ser humano consegue entender o que está escrito/fazendo mais "facil".

<br /> 

### O que é uma versão da linguagem denominada "long term suport"?

* É uma versão da linguagem que tem suporte a longo prazo.

<br /> 

<h1 style="text-align: left;">Básico do funcionamento do java!</h1>

### Por que o java funciona em multiplas plataformas?

* Por causa da JVM = "java virtual machine".

<br /> 

### Como funciona?

* É uma máquina virtual que roda em cima do sistema operacional.
* funcionando como um tradutor entre o programa e o sistema. Uma máquina virtual para cada sistema.

<br /> 

### Por que o java é uma linguagem de compilação?

* É um processo onde ele ira verificar se o programa esta tudo correto e traduzir pra linguagem de máquina.
* Basicamente: aplicativo.java > javac (compilação) > java.class(bytecode) > jvm(entende o bytecode) > sistema
  operacional x.

<br /> 

### O que é o JDK?

* Java Development Kit, ele possui uma JVM e ferramentas como compilador e debug.

<br /> 

### O que é debug?

* Ajuda a entender o que está acontecendo no código em tempo real.

<br /> 

### Resuma o que é a retrocompatibilidade do java

* Se o software é java 8 e se quiser atualizar pro java 9 é possivel mas claro que pode dar problemas, porem, é
  possivel.

<br /> 

### O que é jre?

* java runtime environment, ambiente de execução e não de desenvolvimento.

<br /> 

### O que é o java home?

* Basicamente é onde o java está instalado sem a pasta bin. É uma convenção.

<br /> 

### Como funciona o PATH em variáveis de ambiente?

* %JAVA_HOME% > esta pedindo pras variáveis de ambiente pegar o valor dentro(caminho do java) e adicionar o \bin.

<br /> 

### O que acontece quando setamos o java home?

* Os programas que utilizam java no computador irão procurar pelo java home(dentro do java home tera o diretorio do
  java).

<br /> 

<h1 style="text-align: left;">Aprendizado java em geral </h1>

### O que é uma palavra reservada?

* São palavras que o java tornou exclusiva pra funcionalidades específicas dentro da linguagem
  para saber as palavras busque no google.
* Observação: Se for tirar certificação é necessario memorizar todas!

<br /> 

### O que é organização em pacotes ?

* Ajuda a organizar e agrupar classes em comum, é uma estrutura de diretorios.
* Ex: academy.devdojo.maratonajava.
* Não é aconselhado a ter traços.

<br /> 

### Onde deve ficar o código package dentro de uma classe?

* Na primeira linha.
* Observação: Comentarios podem ficar em cima de pacotes.

<br /> 

### O que é o javadoc?

* É utilizado pra descrever a classe e/ou método pra outras pessoas que irão utilizar o código(outro desenvolvedor).

<br /> 

### Devo comentar o código?

* NÃO! se não for javadoc os outros devem ser evitados o máximo possivel
* Possivelmente se estiver escrevendo comentários é porque o código está com legibilidade baixa!

<br /> 

### Por que o javadoc é importante?

* Facilita a manutenção do código por meio da criação da documentação
* Conselho: os métodos publicos devem ter comentários javadoc é uma boa prática!

## Porque em byte o valor máximo positivo é -128 até 127? Porque não pode ir também ate 128?

* 127 = 01111111
* -128 = 10000000
* Entendeu?