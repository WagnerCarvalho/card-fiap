
[![CircleCI](https://circleci.com/gh/WagnerCarvalho/fiap-spring.svg?style=svg&circle-token=7a86d73abd02d79961c60169c9ce013acb3b4ac6)](https://circleci.com/gh/WagnerCarvalho/card-fiap)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)

# Avaliação - Spring Framework

Spring + Kotlin + MongoDB + Docker + Python

## Desafio:

A FIAP resolveu criar seu próprio cartão de crédito para ser utilizado pelos
alunos e para isso necessita de um sistema para gerenciamento e
integração com outras empresas. Desenvolva este sistema com os
seguintes requisitos:

*   *RF1* - Cadastro de Alunos
    
*   *RF2* - O cadastro inicial dos potenciais clientes do cartão será realizado via
      integração com um arquivo em formato ".txt"
      
*   *RF3* - As compras realizadas nos cartões dos clientes serão recebidas via
    integração com uma Autorizadora. Criar os endpoints necessários para
    receber as realizações de transações.
    
*   *RF4* - Deve ser possível gerar um extrato via download (endpoint) ou
      enviado no email do cliente (pode escolher uma opção).
   


## Solução:

RF1, RF3 e RF4 (Api)
> Aplicação em [Kotlin](https://kotlinlang.org/) / [Spring](https://spring.io/projects/spring-framework) utilizando [Reactivex - RxJava2](http://reactivex.io/) com [MongoDB](https://www.mongodb.com/) para cadastrar usuários e transações.
A idéia em ter uma aplicação assíncrona não bloqueante com segurança utilizando [Spring Security](https://spring.io/projects/spring-security), onde as requisições deverão ser autenticadas por usuário e senha. Toda documentação foi feita pelo [Swagger](https://github.com/wordnik/swagger-spec) para efetuar as chamadas REST em Api's.

RF2 (App)
> Aplicação em [Kotlin](https://kotlinlang.org/) / [Spring](https://spring.io/projects/spring-boot) com utilização do [Spring Batch](https://spring.io/projects/spring-batch) para fazer leitura de arquivos para integração de usuários.

## Observação 
*   *Simular Ambiente de Transações*, será executado um Script em [Python](https://www.python.org/), no [container](https://www.docker.com/resources/what-container) da aplicação (App).

*   *Formatação de Código Padrão*, utilizado plugin Plugin [kotlinter](https://plugins.gradle.org/plugin/org.jmailen.kotlinter) para manter o padrão do código.

*   *Executar Aplicação*, utilizado [Docker](https://www.docker.com/) para a aplicação funcionar em qualquer ambiente.

*   *Pipeline CI/CD para teste*, foi utilizado [CircleCi](https://circleci.com/).


## Requisitos:
```
1. `docker-compose`
2. `java 8 JDK`
3. `Python 2.7`
```

## Executar Fluxo no Mac/Linux
```
cd springFiap
./start-project.sh
```

## Executar Fluxo no Windows
```
cd springFiap
sh start-project.sh
```

## Eliminar processo do Docker Mac/Linux e Windows
```
docker-compose down --rmi all
```

## Documentação Swagger
> [Api Swagger](http://localhost:5000/swagger-ui.html) (Documentação disponível somente com aplicação em produção)


> [GitHub Api](https://github.com/WagnerCarvalho/fiap-spring/blob/master/api/README.md) (Documentação disponível)


> [GitHub App](https://github.com/WagnerCarvalho/fiap-spring/blob/master/app/README.md) (Documentação disponível)
