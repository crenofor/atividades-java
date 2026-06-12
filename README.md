# Atividades Java

# Nível 1 — Fundamentos

## Desafio 1: Sistema Bancario

Crie uma classe:

```java
ContaBancaria
```

Atributos privados:

```java
titular
saldo
```

Métodos:

```java
depositar()
sacar()
consultarSaldo()
```

Regras:

- Não permitir saque maior que saldo.
    
- Não permitir depósito negativo.
    

### O que avalia

- Encapsulamento
    
- Getters e Setters
    
- Regras de negócio

# Nível 2 — Herança

## Desafio 2: Sistema de Funcionários

Classe base:

```java
Funcionario
```

Atributos:

```java
nome
salario
```

Método:

```java
calcularBonus()
```

Classes filhas:

```java
Gerente
Programador
Estagiario
```

Cada uma possui bônus diferente.

Exemplo:

```java
Gerente = 20%
Programador = 10%
Estagiario = 5%
```

### O que avalia

- Herança
    
- Sobrescrita de métodos
    
# Nível 3 — Polimorfismo

## Desafio 3: Zoológico

Classe abstrata:

```java
Animal
```

Método:

```java
emitirSom()
```

Classes:

```java
Cachorro
Gato
Vaca
```

No main:

```java
ArrayList<Animal>
```

Percorra a lista chamando:

```java
animal.emitirSom();
```

Sem usar:

```java
if
switch
```
# Nível 4 — Interfaces

## Desafio 4: Sistema de Pagamentos

Interface:

```java
Pagamento
```

Método:

```java
pagar(double valor)
```

Implementações:

```java
Pix
CartaoCredito
Boleto
```

No programa:

```java
ArrayList<Pagamento>
```

Realize pagamentos de formas diferentes.

### O que avalia

- Interfaces
    
- Polimorfismo
    

---

# Nível 5 — Tudo Misturado

## Desafio 5: Loja Virtual

Classes:

```java
Produto
```

Tipos:

```java
Livro
Eletronico
Roupa
```

Interface:

```java
Descontavel
```

Método:

```java
calcularDesconto()
```

Cada produto possui desconto diferente.

Crie:

```java
Carrinho
```

Com:

```java
ArrayList<Produto>
```

Funcionalidades:

- Adicionar produto
    
- Remover produto
    
- Calcular total
    
- Aplicar descontos
    

### O que avalia

- Herança
    
- Interface
    
- Polimorfismo
    
- Coleções
    
- Encapsulamento
    
