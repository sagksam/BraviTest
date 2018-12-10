# BraviTest
Teste técnico para a empresa Bravi. 
Criação da classe BalancedBrackets que valida uma determinada sequência de brackets.
Criação de uma API Rest para uma Contact List. 

# Técnologias
Banco de Dados: MySQL
Frameworks: Hibernate, Spring, JUnit

# Manual de Execução - Balanced Brackets

1 - Execute a class de teste BalancedBracketsTest que se encontra no pacote de testes. 

# Manual de Execução - Contact List

1 - Faça a configuração do banco de dados no arquivo hibernate.cfg.xml que se encontra em src/main/resources
2 - Execute o arquivo script.sql que se encontra na pasta do projeto
3 - Baixe o software Postman nesse link para a execução da API https://www.getpostman.com/apps
4 - Faça a execução do CRUD de acordo com as instruções abaixo.
 4.1 - Create: Crie um POST no Postman com seguinte URL http://localhost:8080/BraviTest/create/ o formato da troca de informações deve ser do tipo Json. Exemplo abaixo.
 {
	"name" : "Jose Silva",
	"phone" : "1998565878",
	"email" : "josesilva@terra.com.br",
	"whatsapp" : "1998565878"
 }
 4.2 Update: Crie um PUT no Postman com a seguinte URL http://localhost:8080/BraviTest/update/1 o formato da troca de informações deve ser também no formato Json.
 4.3 Get: Crie um GET no Postman com a seguinte URL http://localhost:8080/BraviTest/get/1
 4.4 Delete: Crie um DELETE no postman com a seguinte URL http://localhost:8080/BraviTest/delete/1
 
