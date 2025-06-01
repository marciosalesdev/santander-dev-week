# Santander Dev Week #
Java RESTFul Api criada para Santander Dev Week

## Diagrama de Classes 

```mermaid
classDiagram
    class User {
        -String nome
        -Account account
        -Features[] features
        -Card card
        -News[] news
    }

    class Account {
        -String Number
        -String Agency
        -double Balance
        -double Limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -double limit
    }

    class News {
        -String icon
        -String description
    }

    User "1" *--> "1" Account
    User "1" *--> "N" Feature
    User "1" *--> "1" Card
    User "1" *--> "N" News
