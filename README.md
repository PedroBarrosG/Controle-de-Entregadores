# Controle de Entregadores
 ## API para gerenciamento do Controle sobre os entregadores

## **Instruções para colocar em operação** <br />
### **Requisitos:** <br />
+ Java 17 <br />
+ PostgreSQL <br />

**Database:** entregadores <br />
**Username:** postgres <br />
**Password:** postgres <br />

### Instalação
1. Clone este projeto <br />
1. Importe para o Eclipse <br />
1. Atualize as bibliotecas com o Maven <br />
1. Inicialize <br />

### Acesso <br />
Abra o um gerenciador de API, como o Postman <br />

### Como utilizar: <br />

Para incluir um entregador:
```
- URI: http://localhost:8080/entregadores

- Método: POST

- Formulário JSON: nome, cpf, capveic 
```


Para listar todos os entregadores:

```
- URI: http://localhost:8080/entregadores
- Método: GET
```

Para mostrar apenas um entregador:

```
- URI: http://localhost:8080/entregadores/{id}
- Método: GET
```


Para alterar um entregador:

```

- URI: http://localhost:8080/entregadores/{id}

- Método: PUT

- Formulário JSON: nome, cpf, capveic 
```

Para excluir um entregador:

```
- URI: http://localhost:8080/entregadores/{id}

- Método: DELETE
```
