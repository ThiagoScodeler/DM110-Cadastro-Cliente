# Exercício DM110-Cadastro Clientes - Desenvolvimento Java EE

### Recursos
#### Cadastrar Cliente

**- Method:**
```sh
POST
```

**- URL:**
/context-root/api/crm/cliente/<nomeCliente>/<emailCliente>

**- URL Params (Required):**
```sh
nomeCliente
emailCliente
```

**- URL Example:**
```sh
http://localhost:8080/cliente-project/api/crm/cliente/thiago/tscodeler@gmail.com
```

**- Success Response:**

**Code:** 204 No Content

**- Sample Call:**
```sh
curl -X POST \
  http://localhost:8080/cliente-project/api/crm/cliente/thiago/tscodeler@gmail.com
```

#### Listar Clientes

**- Method:**
```sh
GET
```

**- URL:**
/context-root/api/crm/cliente/all

**- URL Example:**
```sh
http://localhost:8080/cliente-project/api/crm/cliente/all
```

**- Success Response:**

**Code:** 200 OK
**Response Content:**
```sh
["thiago","camila"]
```

**- Sample Call:**
```sh
curl -X GET \
  http://localhost:8080/cliente-project/api/crm/cliente/all
```