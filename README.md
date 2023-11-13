# DoctorChat-Enterprise

---
## Integrantes
- 95456 - Amanda Grazielle Mendes da Silva
- 94075 - Mateus Marchetti Vieira
- 94329 - Jean Soares Ferreira
- 94348 - Kaio Gomes Vilarinho Vieira Pereira
---

![image](https://github.com/anaooz/DoctorChat-Enterprise/assets/69781921/f9e31eba-a53e-4a57-8b60-28b46ab3d657)


---

## Objetivo
Nosso app tem como objetivo agendar e gerenciar consultas médicas, o usuário faz a requisição através do chat de agendamento e, com ajuda do Chat GPT, o melhor médico e horário disponíveis são encontrados para o usuário.

---

## Funcionalidades

### Criação de conta:
Cada usuário tem seu próprio espaço e suas próprias consultas agendas.

### Agendamento:
Com o auxílio do ChatGPT, o usuário encontra a melhor consulta de acordo com suas solicitações.

---

## JSONs:

`GET` /usuario

`POST` /usuario

```js
{
  "nome": "Roger Waters",
  "cpf": {
    "cpf": "23324234126"
    },
  "email": "lanadelrey@email.com",
  "senha": "210685",
  "dataDeNascimento": "1985-06-21",
  "endereco": {
    "cep": 67890453,
    "logradouro": "Rua das Lamentações",
    "numero": 505,
    "bairro": "Hollywood",
    "complemento": "Sem Complemento"
    }
}
```

`PUT` /usuario/{id}

```js
{
  "nome": "Bernie Taupin",
  "cpf": {
    "cpf": "23324234126"
  },
  "email": "bernietaupin@gmail.com",
  "senha": "210685",
  "dataDeNascimento": "1950-05-22",
  "endereco": {
    "cep": 67890453,
    "logradouro": "Rua das Estrelas",
    "numero": 1000,
    "bairro": "Hollywood",
    "complemento": "Sem Complemento"
  }
}
```

`DELETE` /usuario/{id}

---

`GET` /hospital

`POST` /hospital

```js
{
    "nomeFantasia": "Hospital ABC",
    "razaoSocial": "João da Silva",
    "dataDaAbertura": "2023-10-11",
    "endereco": {
        "logradouro": "Rua Hospitalar",
        "numero": 123,
        "bairro": "Bairro Saúde",
        "complemento": "Sem Complemento",
        "cep": 12345678
    },
    "ativo": true,
    "cnpj": {
        "cnpj": "1234567890123"
    }
}

```

`PUT` /hospital/{id}

```js
{
    "nomeFantasia": "Hospital ABC123",
    "razaoSocial": "João da Silva",
    "dataDaAbertura": "2023-10-11",
    "endereco": {
        "logradouro": "Rua Hospitalar",
        "numero": 123,
        "bairro": "Bairro Saúde",
        "complemento": "Perto da Praça",
        "cep": 12345678
    },
    "ativo": true,
    "cnpj": {
        "cnpj": "1234567890123"
    }
}

```

`DELETE` /hospital/{id}

---

`GET` /medico

`POST` /medico

```js
{
    "nome": "Renato Ruiz",
    "especialidade": "Cardiologista",
    "endereco": {
        "logradouro": "Rua Médica",
        "numero": 1245,
        "bairro": "Bairro Saúde",
        "complemento": "Complemento Médico",
        "cep": 87654321
    },
    "ativo": false,
    "hospitais": [],
    "cmr": "cmr123456",
    "cpf": {
        "cpf": "12345678901"
    },
    "agendamento": null,
    "cnpj": {
        "cnpj": "12345678901234"
    }
}
```

`PUT` /medico/{id}

```js
{
    "nome": "Renato Ruiz de Almeida",
    "especialidade": "Cardiologista",
    "endereco": {
        "logradouro": "Rua Médica",
        "numero": 1245,
        "bairro": "Bairro Saúde",
        "complemento": "Complemento Médico",
        "cep": 87654321
    },
    "ativo": true,
    "cmr": "cmr123456",
    "cpf": {
        "cpf": "12345678901"
    },
    "cnpj": {
        "cnpj": "12345678901234"
    }
}
```

`DELETE` /medico/{id}
