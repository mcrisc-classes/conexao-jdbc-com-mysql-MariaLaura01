# Atividade - Conexão JDBC com banco MySQL

## Parte 1

1. Instale e configure o MySQL em seu computador.
1. Baixe o [banco de dados World](https://dev.mysql.com/doc/world-setup/en/) e carregue-o no MySQL que você acaba de instalar em seu computador.
1. Use um cliente MySQL para executar a consulta a seguir, no banco de dados World. Dessa maneira, você se certificará de que os dados foram carregados.

    select code, name, indepyear from country where IndepYear > 1990;


## Parte 2

Seguindo as instruções contidas no vídeo [DSIS4 - Semana 02 - (Parte 2/3) Como obter uma conexão com o MySQL](https://youtu.be/UQWNMYsvSXk):

1. Baixe o *driver* JDBC para MySQL (MySQL Connector/J);
1. Crie um diretório (pasta) chamado `lib`, neste projeto, e copie para dentro dele o arquivo JAR do *driver*;
1. Especifique a URL de conexão com o seu servidor de banco de dados (SGBD), na linha 11, do arquivo `Main.java`, contido neste projeto.
1. Execute o programa e verifique se a conexão foi estabelecida com sucesso.


## Entrega

Após realizar as tarefas indicadas acima, envie o seu código para o GitHub (faça um *push*).

