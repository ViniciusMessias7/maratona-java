<p style="text-align: center;">
  <img width="500" alt="Thumbnail do vídeo no YouTube" src="https://i.ytimg.com/vi/VKjFuX91G5Q/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLCUA1JzRmWhkDSrhPF0SpLHj8sYHw"/>
</p>

<h1 style="text-align: center;">ANOTAÇÕES</h1>

<h1 style="text-align: left;">Como instalar o java & Configuração de variavel de ambiente
</h1>

> Instalação:
>> Google: download jdk (versão) > qualquer versão ex:oracle.
>> JDK download > escolha a jdk compatível ao sistema operacional.
>> Executar > next > "lembrar o caminho da instalação" > next > close.

> Variavel de ambiente:
>> Copie o caminho que o java está instalado sem a pasta bin > editar as variáveis de ambiente do sistema > Variáveis de ambiente > variáveis do sistema > novo > nome: JAVA_HOME valor da variável: caminho todo sem ultima \ > ok
>>> OBS: Ao instalar o java é bom lembrar o caminho de instalação, pra facilitar esse processo!
>>> Path > home > novo > %JAVA_HOME%\bin

<h1 style="text-align: left;">Termos genéricos da programação</h1>

> O que é convenção?
>> Conjunto de regras e diretrizes.

> O que é linguagem de baixo nível?
>> É uma linguagem de programação mais proxímo da linguagem da máquina

> O que é linguagem de alto nível?
>> É uma linguagem que um ser humano consegue entender o que está escrito/fazendo mais "facil".

> O que é uma versão da linguagem denominada "long term suport"?
>> É uma versão da linguagem que tem suporte a longo prazo.

<h1 style="text-align: left;">Básico do funcionamento do java!</h1>

> Por que o java funciona em multiplas plataformas?
>> Por causa da JVM = "java virtual machine".

> Como funciona?
>> É uma máquina virtual que roda em cima do sistema operacional.
>> funcionando como um tradutor entre o programa e o sistema. Uma máquina virtual para cada sistema.

> Por que o java é uma linguagem de compilação?
>> É um processo onde ele ira verificar se o programa esta tudo correto e traduzir pra linguagem de máquina.
>> Basicamente: aplicativo.java > javac (compilação) > java.class(bytecode) > jvm(entende o bytecode) > sistema operacional x.

> O que é o JDK?
>> Java Development Kit, ele possui uma JVM e ferramentas como compilador e debug.

> O que é debug?
>> Ajuda a entender o que está acontecendo no código em tempo real.

> Resuma o que é a retrocompatibilidade do java
>> Se o software é java 8 e se quiser atualizar pro java 9 é possivel mas claro que pode dar problemas, porem, é possivel.

> O que é jre?
>> java runtime environment, ambiente de execução e não de desenvolvimento.

> O que é o java home?
>> Basicamente é onde o java está instalado sem a pasta bin. É uma convenção.

> Como funciona o PATH em variáveis de ambiente?
>> %JAVA_HOME% > esta pedindo pras variáveis de ambiente pegar o valor dentro(caminho do java) e adicionar o \bin.

> O que acontece quando setamos o java home?
>> Os programas que utilizam java no computador irão procurar pelo java home(dentro do java home tera o diretorio do java).


<h1 style="text-align: left;">Aprendizado java em geral </h1>

> O que é uma palavra reservada?
>> São palavras que o java tornou exclusiva pra funcionalidades específicas dentro da linguagem
para saber as palavras busque no google. Se for tirar certificação é necessario memorizar todas!

> O que é organização em pacotes ?
>> Ajuda a organizar e agrupar classes em comum, é uma estrutura de diretorios
>>> Convenção: dominio.nomedoprojeto.oquequerternopacote.
>>>> ex: academy.devdojo.maratonajava |
>>>> não é aconselhado a ter traços

> Onde deve ficar o código package dentro de uma classe?
>> Na primeira linha.
>>> Observação: Comentarios podem ficar em cima de pacotes.

> O que é o javadoc?
>> É utilizado pra descrever a classe e/ou método pra outras pessoas que irão utilizar o código(outro desenvolvedor).

> Devo comentar o código?
>> NÃO! se não for javadoc os outros devem ser evitados o máximo possivel
>> Possivelmente se estiver escrevendo comentários é porque o código está com legibilidade baixa!

> Por que o javadoc é importante?
>> Facilita a manutenção do código por meio da criação da documentação
>> Conselho: os métodos publicos devem ter comentários javadoc é uma boa prática!