## Implementação de Spring Security

Exercício de implementaçãos de Spring Security em um API desenvolvida por outro membro do time Catalisa.

Requisitos:
- Conter pelo menos 2 roles para a aplicação;
- Conter criptografia de senha;
- Conter um controller para CRUD.

Na API há duas roles:
- USUARIO: que possui acesso apenas de visualização (GET);
- ADMIN: que possui acessoa total ao sistema (GET, POST, PUT e DELETE).

A senha é criptografada através do BCrypt e o acesso ao sistema é feito por usuário e senha, sem token.

### Inserção de dados

Para inserir dados na base de livros utilize um json no seguinte formato:

    {
        "nome":"Sistemas Orientados a Objetos",
        "autor":"Pablo Rangel",
        "datadeLancamento":"2022",
        "isbn":"9786588431412"
    }

**Obs.:** todos os campos são obrigatórios

### Extras

No diretório _resources/postman_ há os arquivos necessários para testar a API no [Postman](https://www.postman.com).

Na mesma raiz do diretório supracitado encontra-se um arquivo _data.sql_ com sintaxes básicas para inserir na DB e iniciar os testes.

Por fim inclui um docker file dentro de _resources/docker_ para a API ser testada no mesmo ambiente em que fora desenvolvida.