Instruções:

Instalar JDK de https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html (será necessário fazer login com um usuário Oracle para fazer o download);

Instalar IDE "Eclipse IDE for Java Developers" de http://www.eclipse.org/downloads/packages/release/2021-03/r/eclipse-ide-java-developers;

🥒 Instalar o plugin do Cucumber no Eclipse, indo em Help -> Marketplace -> digite Cucumber no campo de pesquisa e instale o plugin "Cucumber Eclipse Plugin"

Importar o projeto para o Eclipse, indo em File -> Import... -> Maven -> Existing Maven Projects -> Next -> Selecione a pasta onde está localizado o projeto -> Selecione o projeto -> Finish;

Rodar o arquivo "Runner.java" no Eclipse, alterando o conteúdo do campo "tags" de acordo com a tag do teste que deseja rodar, conforme visto no arquivo "newWeb.feature", por exemplo:
tags = {"@preencheFormulario"}
Obs:
Driver: Atualizar chromedriver para mesma versão do navegador.

Instructions:

Install JDK from https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html (you must log in with an Oracle user account in order to download);

Install "Eclipse IDE for Java Developers" IDE from http://www.eclipse.org/downloads/packages/release/2021-03/r/eclipse-ide-java-developers;

🥒 Install the Cucumber plugin for Eclipse, in Help -> Marketplace -> type Cucumber in the "Find:" field and install "Cucumber Eclipse Plugin"

Import the project into Eclipse, in File -> Import... -> Maven -> Existing Maven Projects -> Next -> Select the folder where the project is located -> Select the project -> Finish;

Run the "Runner.java" file in Eclipse, altering the content in the "tags" according to the tag for the test you wish to run, as seen in the "web.feature" file, for example:
tags = {"@preencheFormulario"}

Obs:
Driver: Update chromedriver to the same browser version.