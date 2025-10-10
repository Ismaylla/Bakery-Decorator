# 🎂 Padaria-Decorator

Este projeto é uma implementação em **Java** do **Padrão de Projeto Decorator**, aplicada à simulação de uma padaria que vende bolos com diferentes camadas, confeitos e mensagens personalizadas.  
O desenvolvimento teve como foco demonstrar os princípios de **abertura para extensão e fechamento para modificação (OCP)**, além de manter um histórico de commits **rastreável, incremental e documentado** conforme os requisitos da atividade.

---

## 🎯 Objetivo e Restrições

O objetivo principal era aplicar o padrão **Decorator** para permitir que novos comportamentos (camadas extras, confeitos, mensagens etc.) fossem adicionados aos bolos **sem modificar** as classes existentes.  
As restrições definidas foram:

- O sistema deve utilizar **composição** para adicionar novas funcionalidades aos bolos.
- Cada decorador deve alterar **somente** a descrição e/ou custo, sem afetar diretamente as classes base.
- A saída do programa deve apresentar a **descrição completa** e o **custo final** de cada bolo.
- O projeto deve registrar **toda a utilização da IA** e justificar **os ajustes manuais** feitos sobre o que foi gerado.

---

## 🚀 Solução Arquitetural: Padrão Decorator Detalhado

A solução foi desenvolvida de forma modular e incremental, respeitando o padrão de camadas definido pelo problema:

### 1. 🍰 Classes de Bolos (Componentes Concretos)

- `ChocolateCake`, `VanillaCake` e `StrawberryCake`:  
  Cada classe representa um tipo de bolo com custo e descrição próprios.  
  A classe `StrawberryCake` foi adicionada como extensão, com **custo dobrado** em relação ao bolo base.

### 2. 🧩 Estrutura do Decorator

- `CakeDecorator` (classe abstrata):  
  Serve como base para todos os decoradores. Mantém uma referência ao objeto `Cake` que está sendo decorado e delega os métodos `getCost()` e `getDescription()`.  
  Essa estrutura permite **encadear decoradores** dinamicamente.

### 3. 🎂 Decoradores Concretos

- `MultiLayerDecorator`: adiciona camadas extras ao bolo, somando **5** ao custo e prefixando a descrição com _“Multi-layered”_.
- `SprinklesDecorator`: adiciona confeitos, aumentando o custo e modificando a descrição.
- `SayingDecorator`: adiciona **mensagens personalizadas**, sem alterar o custo base.

### 4. 🧾 Execução e Montagem dos Pedidos

- `Main.java`: responsável por **instanciar os bolos e encadear os decoradores**, gerando combinações como:
  - _Multi-layered Chocolate Cake with Sprinkles (Happy Birthday!)_
  - _Vanilla Cake with Sprinkles_
  - _Multi-layered Strawberry Cake (Best Wishes!)_

Durante essa fase, ocorreram pequenos ajustes de codificação, erros de compilação e problemas de encoding, corrigidos com o apoio da IA.

---

## 📜 Histórico de Implementação e Uso da IA

O desenvolvimento foi cuidadosamente versionado para mostrar a **evolução da solução** de forma clara e rastreável.

| Commit Prefix | Ação Principal           | Descrição Resumida                                                                                                           |
| ------------- | ------------------------ | ---------------------------------------------------------------------------------------------------------------------------- |
| **chore**     | Organização inicial      | Adiciona o código base do professor e estrutura os pacotes para compilar corretamente.                                       |
| **feat**      | Novo tipo de bolo        | Implementa `StrawberryCake` com custo dobrado, mantendo a herança e compatibilidade.                                         |
| **feat**      | Base do Decorator        | Cria `CakeDecorator` como classe abstrata base para todos os decoradores.                                                    |
| **feat**      | Decorador de camadas     | Implementa `MultiLayerDecorator`, que adiciona custo e altera a descrição.                                                   |
| **feat**      | Decorador de mensagens   | Cria `SayingDecorator` para adicionar mensagens personalizadas aos bolos.                                                    |
| **feat**      | Montagem final e ajustes | Atualiza `Main.java` para montar e imprimir os pedidos compostos com os decoradores. Corrige erros de compilação e encoding. |

---

## 💬 Documentação de Uso da IA

Cada commit contém a documentação exigida pela atividade:

- **Quais prompts foram utilizados**  
  Exemplo: _“fiz strawberrycake, e a classe base CakeDecorator, me de um exemplo de decorador a partir de MultiLayerDecorator…”_

- **Por que o que a IA fez não serviu totalmente**  
  Foram necessárias revisões nos **imports**, **formatação da saída**, e **estrutura dos pacotes**, além de ajustes de **codificação e execução** em ambiente local.

- **Por que meus ajustes melhoram a solução da IA**  
  Garantiram a **consistência do código**, **execução correta**, e aderência aos **requisitos do problema**, consolidando o entendimento prático do padrão **Decorator**.

---

## ▶️ Exemplo de Saída Esperada

A execução do programa deve gerar resultados semelhantes a este:

<pre style="white-space: pre-wrap; word-wrap: break-word; background-color:#f6f8fa; padding:12px; border-radius:6px;">
20 Multi-layered Chocolate Cake with Sprinkles (Happy Birthday!)
15 Vanilla Cake with Sprinkles
35 Multi-layered Strawberry Cake (Best Wishes!)
</pre>

Cada bolo é construído dinamicamente através da composição de decoradores, demonstrando a **flexibilidade e reutilização** características do padrão **Decorator**.

---

## 🧠 Conceitos Demonstrados

- Aplicação prática do **Padrão Decorator** em Java.
- Uso de **herança e composição** para extensibilidade sem modificação de código existente.
- Documentação detalhada de **interação com IA** e **decisões humanas** no processo de desenvolvimento.
- Manutenção de **histórico de commits descritivo e incremental**, permitindo entender toda a evolução da solução.

---

## 👩‍💻 Dupla Desenvolvedora

- **Ismaylla Batista**
- **Raphaela Samille**
