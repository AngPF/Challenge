# CINEWAVE - FIAP TDSA
## Disciplina: DevOps Tools e Cloud Computing

### Visão Geral do Projeto

Este projeto, desenvolvido para o CHALLENGE da FIAP com parceria da PLUSOFT. A CineWave é uma plataforma inovadora que visa revolucionar a estratégia de marketing para a indústria de streaming de filmes. Ao oferecer uma solução baseada em Inteligência Artificial, a plataforma permite aos profissionais de marketing cadastrar suas campanhas de filmes de forma simplificada, fornecendo insights valiosos para a tomada de decisões estratégicas. Alguns dos principais insights oferecidos incluem previsões de ROI, identificação dos canais de marketing mais eficazes para cada gênero de filme, análise do CPC por gênero e estimativa do número de conversões. Com essas informações, os profissionais de marketing podem otimizar a alocação de orçamento, maximizar o engajamento do público-alvo e melhorar a eficácia de suas campanhas de marketing.

## Link do video pitch: https://youtu.be/ShyynnN5ew4?si=jQd1umeQ1Gb0b3XX

### Equipe de Projeto e Suas Responsabilidades

- **Alberto R. Peruchi** - RM 99706
- **Angelo Augusto Pelluci** - RM98310 
- **Gabriela Stanguini** - RM 98786
- **Maria Fernanda Ribeiro Mello** - RM 98818
- **Nicolas Reis do Espirito Santo** - RM 98819

## Comandos

### Comando para criar o grupo de recursos

``` az group create --name rg-bcosql --location brazilsouth ```


### Comando para criar Servidor SQL
``` az sql server create -l brazilsouth -g rg-bcosql -n sqlserver-rm99706 -u admsql -p devops@Fiap2tds --enable-public-network true ```

### Comando para criar Banco de Dados SQL
``` az sql db create -g rg-bcosql -s sqlserver-rm99706 -n cinewave --service-objective Basic --backup-storage-redundancy Local --zone-redundant false ``` 

### Comando para criar regra de firewall liberando todos os IPs
``` az sql server firewall-rule create -g rg-bcosql -s sqlserver-rm99706 -n AllowAll --start-ip-address 0.0.0.0 --end-ip-address 255.255.255.255``` 

### Dados de acesso ao BD
**Usuário:** 
admsql

**Senha:**
devops@Fiap2tds

___
## Dados para criação do App Service

### Nome do grupo de recursos
rg-cinewave

### Nome do app
cinewave

#### Nome do plano de serviço
planCinewave

- Java 17 
- Java SE

____
## Requisições para Usuário
```bash
https://cinewave.azurewebsites.net/user
```

```json
{
  "nome": "Alberto",
  "email": "alb@email.com",
  "senha": "123456"
}
```
```json
{
  "nome": "Angelo",
  "email": "angelo@email.com",
  "senha": "ang123"
}
```
```json
{
  "nome": "Gabi",
  "email": "gabi@email.com",
  "senha": "gab456"
}
```
```json
{
  "nome": "Maria",
  "email": "maria@email.com",
  "senha": "mar789"
}
```
```json
{
  "nome": "Nicolas",
  "email": "nicolas@email.com",
  "senha": "nic321"
}
```

## UPDATE 
```json
{
  "nome": "Alberto",
  "email": "alb@email.com",
  "senha": "alb456"
}
```
___

## Requisições para Campanha
```bash
https://cinewave.azurewebsites.net/campanha
```

```json
{
  "titulo_filme": "O Poderoso Chefão",
  "genero_filme": "Drama",
  "faixa_etaria_filme": "16",
  "budget": 20000,
  "expectativa_alcance": 50000,
  "usuario": {
    "id": 2,
    "nome": "Angelo",
    "email": "angelo@email.com",
    "senha": "ang123"
  }
}
```
```json
{
  "titulo_filme": "Batman: O Cavaleiro das Trevas",
  "genero_filme": "Ação",
  "faixa_etaria_filme": "14",
  "budget": 15000,
  "expectativa_alcance": 30000,
  "usuario": {
    "id": 3,
    "nome": "Gabi",
    "email": "gabi@email.com",
    "senha": "gab456"
  }
}
```
```json
{
  "titulo_filme": "Clube da Luta",
  "genero_filme": "Drama",
  "faixa_etaria_filme": "18",
  "budget": 12000,
  "expectativa_alcance": 25000,
  "usuario": {
    "id": 4,
    "nome": "Maria",
    "email": "maria@email.com",
    "senha": "mar789"
  }
}
```
```json
{
  "titulo_filme": "A Origem",
  "genero_filme": "Ficção Científica",
  "faixa_etaria_filme": "12",
  "budget": 18000,
  "expectativa_alcance": 45000,
  "usuario": {
    "id": 4,
    "nome": "Maria",
    "email": "maria@email.com",
    "senha": "mar789"
  }
}
```
```json
{
  "titulo_filme": "Matrix",
  "genero_filme": "Ficção Científica",
  "faixa_etaria_filme": "16",
  "budget": 22000,
  "expectativa_alcance": 60000,
  "usuario": {
    "id": 5,
    "nome": "Nicolas",
    "email": "nicolas@email.com",
    "senha": "nic321"
  }
}
```

### UPDATE
```json
{
  "titulo_filme": "Matrix Reloaded",
  "genero_filme": "Ficção Científica",
  "faixa_etaria_filme": "16",
  "budget": 25000,
  "expectativa_alcance": 70000,
  "usuario": {
    "id": 5,
    "nome": "Nicolas",
    "email": "nicolas@email.com",
    "senha": "nic321"
  }
}
````
