# CINEWAVE - FIAP TDSA
## Disciplina: DevOps Tools e Cloud Computing

### Visão Geral do Projeto

Este projeto, desenvolvido para o CHALLENGE da FIAP com parceria da PLUSOFT. A CineWave é uma plataforma inovadora que visa revolucionar a estratégia de marketing para a indústria de streaming de filmes. Ao oferecer uma solução baseada em Inteligência Artificial, a plataforma permite aos profissionais de marketing cadastrar suas campanhas de filmes de forma simplificada, fornecendo insights valiosos para a tomada de decisões estratégicas. Alguns dos principais insights oferecidos incluem previsões de ROI, identificação dos canais de marketing mais eficazes para cada gênero de filme, análise do CPC por gênero e estimativa do número de conversões. Com essas informações, os profissionais de marketing podem otimizar a alocação de orçamento, maximizar o engajamento do público-alvo e melhorar a eficácia de suas campanhas de marketing.

## Link do video: https://youtu.be/Rr4Wmyry9uw

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

### Após fazer um fork do repositório, basta seguir os passos abaixo:

### Nome do grupo de recursos
rg-cinewave

### Nome do app
cinewave

![Captura de tela 2024-09-14 173851](https://github.com/user-attachments/assets/3b815606-65b4-4954-ac24-b40d6f11de07)

### Runtime e Servidor do App Service
- Java 17 
- Java SE

![Captura de tela 2024-09-14 173915](https://github.com/user-attachments/assets/9f86e537-9b50-4f63-a074-eb7fb15e9b32)

#### Nome do plano de serviço
planCinewave

![Captura de tela 2024-09-14 173946](https://github.com/user-attachments/assets/9dcd4986-9b18-42e1-9db4-4d7cb2635f27)

### Na parte de Banco de dados não mexemos em nada

![Captura de tela 2024-09-14 173958](https://github.com/user-attachments/assets/3e2450df-d9d1-4e82-8ae0-aa046aea68bd)

### Configurações de implantação
- Aqui será necessário usar sua conta do Github e o fork  que deve ser feito desse repositório

![Captura de tela 2024-09-14 174041](https://github.com/user-attachments/assets/e498c273-fd97-43d1-b194-da1f580d4367)

![Captura de tela 2024-09-14 174057](https://github.com/user-attachments/assets/6bcd5114-a028-408d-ba16-b15ece346767)

### Certifique-se de ativar o acesso público nas configurações de Rede

![Captura de tela 2024-09-14 174111](https://github.com/user-attachments/assets/d38dfe31-d55c-433f-a261-8cd9e561c35c)

### Configurações de Monitorar e Proteger
- Podemos desativar o Application Insights

![Captura de tela 2024-09-14 174130](https://github.com/user-attachments/assets/295f1955-198f-4e1f-83d3-cd850a5bb920)

### Não é necessário criar nenhum rótulo

![Captura de tela 2024-09-14 174143](https://github.com/user-attachments/assets/44c00dcc-32a7-47ad-8878-7e5528937ede)

### Revisar e Criar
- Confira se está tudo correto e pode criar o App Service

![Captura de tela 2024-09-14 174211](https://github.com/user-attachments/assets/bdeec761-0cc3-4b3b-bb01-806a78ed2eb0)

![Captura de tela 2024-09-14 174227](https://github.com/user-attachments/assets/a8b04260-9d95-40cc-9958-7c79fc2ac152)

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
