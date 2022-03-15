
<h1 align = "center" > Projeto Spring Boot utilizando MongoDB </h1>


## Biblioteca ##
```
Instale os requisitos abaixo e siga as Instruções para executar o Projeto.
```



## Dependências 

- <a href=https://git-scm.com/download>Git</a>
- <a href=https://spring.io/tools>Springtoll</a>
- <a href=https://www.mongodb.com/try/download/community>MongoDB community</a>
- <a href=https://www.postman.com/downloads>Postman</a>



## Status do projeto 
> :heavy_check_mark: Projeto concluído :heavy_check_mark:


## Descrição do projeto 

O projeto consiste em uma consulta em um banco de dados alocado no MongoDB que é registrado em um sistema baseado em uma rede social, onde os usuários podem fazer posts com possibilidade de comentários de outras pessoas.

Além da opção de deletar, atualizar e criar novos usuários, posts ou comentários e principalmente a possibilidade de consultar por métodos específicos(exemplo: texto, data mínima e data máxima).

## :hammer: Instruções de como usar

`SpringToll: ` Após instalar o SpringTool, crie uma nova pasta com o nome projetosbmongodb;

`Terminal:`Abra um terminal de sua preferência e acesse a pasta "projetosbmongodb";

`Git:`Utilize o comando git clone https://github.com/akiojapa/workshop-springboot-mongodb.git no terminal para clonar o repositório dentro da pasta que foi criada.

`MongoDB:` Após instalar o banco de dados BancoDB(lembre de instalar o MongoCompass), é necessário iniciar em sua respectiva pasta o cmd e então inicializar o banco utilizando o comando "mongod".

`MongoCompass:` Após inicializar o MongoDB,execute o MongoCompass e então preencha os campos para conexão da seguinte forma:
<br>HOST: localhost
<br>Port: 27017
<br>Os outros campos deixar como o padrão.

`Iniciando o Sistema:`Após isso execute o programa selecionando o caminho do repositório que foi criado:

workshop-springboot-mongodb/src/main/java/com/akioandrei/workshopspringbootmongodb/WorkshopSpringbootMongodbApplication.java

`Postman:` Agora abra o Postman(opcional) e coloque  http://localhost:8080/ como link e através do URL que foi aberto anteriormente selecione as classes(tabelas) digite após o "/" para então consultar, atualizar, criar ou deletar os dados existentes no projeto.

Classes disponíveis: users,comments,posts

##
