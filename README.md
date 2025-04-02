# JAVÃO DA MASSA

###### "Escreva uma vez code em qualquer lugar!"
![java](https://png.pngtree.com/png-vector/20220623/ourmid/pngtree-java-programming-software-code-coding-png-image_5288937.png)
## Termos genéricos da programação

#### O que é convenção?
 Conjunto de regras e diretrizes.

O que é linguagem de baixo nível?
É uma linguagem de programação mais proxímo da linguagem da máquina
mais próximo = mais rápido, porem, mais complexo, ex:assembly.

O que é linguagem de alto nível?
É uma linguagem que um ser humano consegue entender o que está escrito/fazendo mais "facil".
ex: java, kotlin, rust, go.

O que é uma versão da linguagem denominada "long term suport"?
É uma versão da linguagem que tem suporte a longo prazo.

------- Como instalar o java & Configuração de variavel de ambiente -------

Instalação:
Google: download jdk (versão) > qualquer versão ex:oracle.
JDK download > escolha a jdk compatível ao sistema operacional.
Executar > next > "lembrar onde foi instalado" > next > close.

Variavel de ambiente:
Copie o caminho que o java está instalado sem a pasta bin > editar as variáveis de ambiente do sistema > Variáveis de ambiente > variáveis do sistema > novo > nome: JAVA_HOME  valor da variável: caminho todo sem ultima \ > ok
OBS: Ao instalar o java é bom lembrar o caminho pra facilitar esse processo!
Path > home > novo > %JAVA_HOME%\bin

------- Básico do funcionamento do java! -------

Por que o java funciona em multiplas plataformas?
Por causa da JVM = "java virtual machine".

Como ela funciona?
É uma máquina virtual que roda em cima do sistema operacional.
funcionando como um tradutor entre o programa e o sistema. Uma máquina virtual para cada sistema.

O que é uma linguagem compilada?
É um processo onde ele ira verificar se o programa esta tudo correto e traduzir pra linguagem de máquina.
basicamente: aplicativo.java > javac (compilação) > java.class(bytecode) > jvm(entende o bytecode) > sistema operacional x.

O que é o JDK?
Java Development Kit, ele possui uma JVM e possibilidades pros desenvolvedores java aplicações como:
compilador e ferramentas de debug

O que é debug?
Ajuda a entender o que está acontecendo no código em tempo real.

O Java	tem retrocompatibilidade.O que é isso?
Se o software é java 8 e se quiser atualizar pro java 9 é possivel mas claro que pode dar problemas, porem, é possivel

O que é jre?
Não quer desenvolver na máquina então pode utilizar o java runtime environment, basicamente é o ambiente de execução, não de desenvolvimento (jdk).

Como deixar o java ser acessado em diversas partes do computador?
Precisa definir o PATH em variáveis de ambiente e dizer as outras aplicações onde o java foi instalado
Como?
Verificando se java é reconhecido: cmd > javac.
Se não foi reconhecido então faça:

O que é o java home?
Basicamente é onde o java está instalado sem a pasta bin, é uma convenção.

O que acontece quando setamos o java home?
Os programas que utilizam java no computador irão procurar pelo java home(o diretorio é consequencia do que ta dentro do java home).

Como funciona o PATH em variáveis de ambiente?
%JAVA_HOME% > esta pedindo pras variáveis de ambiente pegar o valor dentro(caminho do java) e adicionar o \bin.

------- Convenções java -------

Lembrando: convenção é basicamente as regras e diretrizes da linguagem!

NomeacaoDaClasse: cada ínicio de palavra começa com letra maiúscula e palavras juntas.
OBS: Sem caracteres especiais!

------- Integrated Development Environment  -------

Por que utilizar uma IDE?
Para facilitar o dia a dia com shortcuts, uma bela interface, ele edita código-fonte, compila e roda o programa. Tambem debuga!

O que é o .idea, out, src dentro da IDE?
.idea = configs do proprio intellij
src = pasta padrão, mais importante de todas!
external libraries = localização do jdk.
.iml = arquivo intellij.
.out = onde fica os arquivos .class
lembrando que  .class é o bytecode que a jvm ira interpretar pro sistema operacional
você pode deletar que não acontece nada, o que importa é o SRC, ao executar novamente o .out surge novamente

O que é as palavras em laranja?
Palavras reservadas pelo java

------- Aprendizado java em geral -------

O que é uma palavra reservada?
São palavras que o java tornou exclusiva pra funcionalidades específicas dentro da linguagem
Para saber as palavras busque no google. Se for tirar certificação é necessario memorizar todas!

O que é organização em pacotes ?
Ajuda a organizar e agrupar classes em comum, é uma estrutura de diretorios
Convenção: dominio.nome do projeto.o que quer ter no pacote.
ex: academy.devdojo.maratonajava
não é aconselhado a ter traços
Onde deve ficar o código package dentro de uma classe?
Pacotes precisam começar com: package (localização/caminho).
A primeira linha que não seja comentario tem que ser pacotes.

O que é comentarios?
São pedaços de texto escritos no código que não afeta o código, apenas informativo
// em linha

			/*
				Comentários de multiplas linhas
			*/
			
			/**
			* javadoc
			*/

O que é o javadoc?
É utilizado pra descrever a classe o método pra outras pessoas que irão utilizar o código(outro desenvolvedor).

Deve comentar o código?
NÃO! se não for javadoc os outros devem ser evitados o máximo possivel
Pois se esta escrevendo comentários é porque o código está RUIM!

Por que o javadoc é importante?
Facilita a manutenção do código por meio da criação da documentação
Conselho: os métodos publicos devem ter comentários javadoc é uma boa prática!
```			
			