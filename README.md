# CINEWAVE - FIAP TDSA
## Disciplina: JAVA ADVANCED

### Visão Geral do Projeto

Este projeto, desenvolvido para o CHALLENGE da FIAP com parceria da PLUSOFT. A CineWave é uma plataforma inovadora que visa revolucionar a estratégia de marketing para a indústria de streaming de filmes. Ao oferecer uma solução baseada em Inteligência Artificial, a plataforma permite aos profissionais de marketing cadastrar suas campanhas de filmes de forma simplificada, fornecendo insights valiosos para a tomada de decisões estratégicas. Alguns dos principais insights oferecidos incluem previsões de ROI, identificação dos canais de marketing mais eficazes para cada gênero de filme, análise do CPC por gênero e estimativa do número de conversões. Com essas informações, os profissionais de marketing podem otimizar a alocação de orçamento, maximizar o engajamento do público-alvo e melhorar a eficácia de suas campanhas de marketing.

### Equipe de Projeto e Suas Responsabilidades

- **Alberto Rubin Peruchi** ( JAVA ADVANCED , DEVOPS E MOBILE ) - RM 99706
- **Angelo Augusto Pelluci**( IA , DEVOPS E MOBILE ) - RM98310 
- **Gabriela Stanguini** ( QA , IA E MOBILE) - RM 98786
- **Maria Fernanda Ribeiro Mello** ( QA , C# E MOBILE)- RM 98818
- **Nicolas Reis do Espirito Santo** ( JAVA ADVANCED ,BANCO DE DADOS E MOBILE) - RM 98819

## Endpoints

### usuarios

`GET` /user

Lista todos os usuarios cadastrados no sistema.

*códigos de status*

200 sucesso

---

`GET` /user/{id}

Retorna os detalhes de um usuario com o id informado.

*códigos de status*

200 sucesso

404 id não encontrado

---

`POST` /user

Cadastrar um novo usuario.

| campo | tipo | obrigatório | descrição|
| :----------:|:-------:|:------------:|:-------------:
|nome|string|✅|Nome so usuario
|email|string|✅|Email do usuario
|senha|string|✅|senha do usuario contendo 6 caracteres

*códigos de status*

201 criado com sucesso

400 validação falhou

---

`DELETE` /user/{id}

Apaga o usuario com o id informado.

*códigos de status*

204 apagado com sucesso

404 id não encontrado

---

`PUT` /user/{id}

Altera o usuario com o id informado.

| campo | tipo | obrigatório | descrição|
| :----------:|:-------:|:------------:|:-------------:
|nome|string|✅|Novo Nome so usuario
|email|string|✅|Novo Email do usuario
|senha|string|✅|Nova senha do usuario contendo 6 caracteres

*códigos de status*

200 sucesso

404 id não encontrado

400 validação falhou

---

*Schema*

```js
{
    "nome": "Nicolas",
    "email": "nicolas@gmail.com",
    "senha": "212121"
}
```



## Definição do Nosso Problema: 

No atual ecossistema digital de streaming de filmes, saturado e altamente competitivo, não basta apenas ter conteúdo de qualidade; é crucial possuir estratégias de marketing precisas e eficazes. A Plusoft, líder em soluções de Human Experience, identificou um problema significativo que os profissionais de marketing enfrentam: a dependência de analistas de Business Intelligence para realizar análises preditivas de futuras campanhas de marketing. Esse processo é demorado e pode levar dias até que os insights sejam devolvidos aos profissionais de marketing. Além disso, a empresa busca maneiras de integrar análise de dados avançada e inteligência artificial para acelerar e aprimorar esse processo, garantindo insights mais rápidos e, consequentemente, decisões de marketing mais ágeis.
A solução proposta pela Plusoft não apenas simplifica e acelera o processo de análise de marketing mas também potencializa a eficácia das campanhas, pois os insights gerados pela plataforma são 

## Público-alvo: 

Clientes/Pagantes: Diretores e gerentes de marketing em empresas de streaming de filmes que buscam otimizar suas estratégias de marketing. 

Usuários/Consumidores: Profissionais de marketing dentro dessas organizações que utilizarão o sistema para planejar, executar e analisar campanhas. Este público se beneficiará diretamente da automação e insights rápidos, permitindo-lhes tomar decisões informadas de forma mais rápida e eficaz. 

A solução proposta pela Plusoft não apenas simplifica e acelera o processo de análise de marketing mas também potencializa a eficácia das campanhas, pois os insights gerados pela plataforma são baseados em modelos preditivos que utilizam grandes volumes de dados históricos e tendências atuais do mercado. Isso não só aumenta a precisão das previsões mas também permite que os profissionais de marketing otimizem cada aspecto da campanha. Por exemplo, identificar qual canal de mídia social gera mais engajamento para um determinado gênero de filme pode direcionar os investimentos para esses canais, aumentando a eficiência do gasto publicitário e melhorando as taxas de conversã 

## Proposta da Solução: 

Para enfrentar esses desafios, criaremos a CineWave, um app onde os profissionais de marketing irão conseguir cadastrar suas campanhas de filmes para o streaming e com poucos detalhes (título do filme, gênero, faixa-etária, budget total da ação e valor de alcance previsto), a Inteligência Artificial conseguirá prever alguns dados importantes para o “marketeiro”, servindo de insights para tomada de estratégias para a campanha 

Alguns insights principais da solução incluem: 

Previsões de ROI: Utilizar modelos preditivos avançados para estimar o retorno sobre o investimento de campanhas futuras, considerando variáveis como gênero do filme, orçamento e faixa-etária. 

Escolha de Canais de Marketing: Identificar qual canal de marketing é mais eficaz para o tipo de gênero fornecido, levando em conta o entendimento de campanhas de marketing anteriores, maximizando a eficiência da alocação do orçamento. 

Analisar o CPC por Gênero de Filme: Fornecer insights sobre o custo médio por clique, ajudando a direcionar campanhas para maximizar o engajamento a um custo menor. 

Estimar o Número de Conversões: Basear as estimativas no alcance esperado e em dados de campanhas anteriores para melhorar a precisão das previsões e a eficácia das campanhas. 


## Licença

Este projeto e todos os materiais associados estão protegidos por direitos autorais e são propriedade exclusiva da equipe deste projeto. Este conteúdo não é open-source e está disponível apenas para visualização e uso no contexto do projeto da Cinewave desenvolvido pela equipe designada, sob o Challenge da FIAP.

A distribuição, reprodução, modificação ou uso deste material para quaisquer outros fins sem a autorização expressa por escrito é estritamente proibida. Todos os direitos reservados.

Para mais informações sobre o uso permitido e as restrições de licença, entre em contato.
