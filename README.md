# 🛒 Sistema de Gestão de E-commerce (Backend Core)

Este repositório contém a implementação do **Desafio Prático de Lógica e POO** do curso **Especialista Java da Rasmoo**.

O objetivo deste projeto foi simular o núcleo lógico de um sistema de e-commerce, aplicando conceitos fundamentais de Orientação a Objetos e boas práticas de desenvolvimento backend, sem o uso de frameworks, focando na robustez da linguagem Java.

## 🚀 Tecnologias & Conceitos Aplicados
* **Java 17** (Linguagem base)
* **POO Completa:** Encapsulamento, Abstração e Métodos Estáticos.
* **Tratamento de Exceções:** Uso de `try-catch` e lançamento de exceções personalizadas (`throw new`) para regras de negócio.
* **Collections API:** Manipulação de `ArrayList` para persistência de dados em memória.
* **Lógica de Negócio:** Validações de estoque negativo, preço inválido e duplicidade de IDs.

## ⚙️ Funcionalidades Implementadas
O sistema é capaz de realizar as seguintes operações via console:

- [x] **Cadastro de Produtos:** Com validação rígida (impede valores negativos).
- [x] **Banco de Dados em Memória:** Simulação de persistência usando listas estáticas (`static`).
- [x] **Gestão de Estoque:** Baixa de produtos com verificação de disponibilidade.
- [x] **Relatórios:**
    - Cálculo total do patrimônio em estoque.
    - Filtragem automática de produtos de alto valor (Premium).
- [x] **Busca Otimizada:** Localização de produtos por nome ignorando case-sensitive.

## 🛠️ Como Executar
1. Clone este repositório.
2. Abra o projeto na sua IDE favorita (IntelliJ, VS Code, Eclipse).
3. Execute a classe `Main.java`.
4. O console exibirá o fluxo de testes, incluindo tentativas de cadastro inválido (para testar as exceções) e a geração dos relatórios.

## 📚 Sobre o Desafio
Este projeto faz parte da trilha de formação **Especialista Java** da **Rasmoo**, focado em consolidar a base da linguagem antes de avançar para frameworks como Spring Boot.

---
Desenvolvido por **Weldyson** 🚀
