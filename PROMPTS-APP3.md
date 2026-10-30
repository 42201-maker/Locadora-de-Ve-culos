# PROMPTS: Grupo ____

**Integrantes:**

1.fabrizio Matias 
2.João Lucas Pardinho dos Santos 

Link da conversa:

https://claude.ai/share/9df33e7e-df45-4bec-91de-041568cfacfb

**Prova:** POO

**Usamos IA?** (x) Sim  ( ) Não

**Qual ferramenta e modelo (se usaram):** Claude (Anthropic), modelo Claude Sonnet 5.5

> Quem não usou IA: troque "prompt" por "passo". Em cada bloco abaixo, descreva o que vocês fizeram naquele passo, na ordem em que aconteceu, e preencha os outros campos do mesmo jeito.

## Registro, na ordem

Copie o bloco abaixo para cada prompt. Escreva o prompt exatamente como foi enviado.

### Prompt 1

**O prompt (cópia exata):**

> preciso que você atue como um desenvolvedor Java especialista em Programação Orientada a Objetos (POO) e me ajude a desenvolver um projeto completo para uma locadora de veículos chamada Estrada Livre.
>
> O projeto deve seguir rigorosamente os requisitos abaixo. Não simplifique a estrutura nem deixe de implementar nenhum conceito solicitado.
>
> 1. Organização do projeto
> Crie a seguinte estrutura de pastas:
>
>
> text
> EstradaLivre/
> ├── src/
> │   ├── model/
> │   │   ├── Veiculo.java
> │   │   ├── Carro.java
> │   │   ├── Moto.java
> │   │   ├── CarroEletrico.java
> │   │   └── Recarregavel.java
> │   └── app/
> │       └── TesteLocadora.java
> ├── README.md
> └── PROMPTS.md
>
> Crie os pacotes model e `app`, com as seguintes classes:
>
> Veiculo: classe abstrata com placa, modelo e valor da diária. Os atributos devem ser privados e deve ter um método abstrato para calcular o aluguel e outro para mostrar o resumo.
> Carro: herda de Veiculo e calcula o aluguel com 10% de seguro sobre o valor total.
> Moto: herda de Veiculo e dá 15% de desconto quando o aluguel for de 5 dias ou mais.
> Recarregavel: interface com o método para calcular o custo da recarga.
> CarroEletrico: herda de Carro, implementa Recarregavel, acrescenta R$ 15,00 por dia de taxa de bateria e calcula a recarga usando R$ 0,80 por kWh.
>
> no final me mande o zip do projeto.

**O que a IA devolveu (uma ou duas linhas):** Um zip com o projeto EstradaLivre completo (as 5 classes do pacote model, a TesteLocadora, README e PROMPTS), já compilado e executado pela IA, com os totais de aluguel e a recarga calculados.

**O que fizemos com a resposta:** (x) usamos como veio  ( ) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):** vimos se a estrutura de pastas e as classes eram as pedidas e se as contas batiam com as regras de seguro.

### Prompt 2

**O prompt (cópia exata):**

> responda sem mudar a estrutura, faça respostas bem diretas e como um aluno

**O que a IA devolveu (uma ou duas linhas):** Este arquivo preenchido, mantendo a estrutura. A seção "Respostas finais, sem consultar a IA" foi deixada em branco, porque é para nós respondermos sozinhos.

**O que fizemos com a resposta:** ( ) usamos como veio  ( ) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):** 

(continuem com quantos blocos precisarem)

## Como conferimos

pedimos para a IA testar pois não temos o java instalado

```
##### LOCADORA ESTRADA LIVRE #####

=== CARRO ===
Placa: ABC-1234
Modelo: Fiat Argo
Diária: R$ 150,00
Dias: 3
Seguro (10%): R$ 45,00
Total do aluguel: R$ 495,00

=== MOTO ===
Placa: MOT-5678
Modelo: Honda CG 160
Diária: R$ 80,00
Dias: 3
Desconto: não aplicável (menos de 5 dias)
Total do aluguel: R$ 240,00

=== MOTO ===
Placa: MOT-9012
Modelo: Yamaha Fazer 250
Diária: R$ 100,00
Dias: 7
Desconto (15%): -R$ 105,00
Total do aluguel: R$ 595,00

=== CARRO ELÉTRICO ===
Placa: ELE-3456
Modelo: BYD Dolphin
Diária: R$ 220,00
Dias: 4
Seguro (10%): R$ 88,00
Taxa de bateria (R$ 15,00/dia): R$ 60,00
Total do aluguel: R$ 1028,00
Recarga de 40,0 kWh: R$ 32,00

Faturamento total dos aluguéis: R$ 2358,00

--- Teste de validação ---
Erro esperado: A quantidade de dias deve ser maior que zero.
```
## Onde a IA errou, ou onde nós erramos


## Respostas finais, sem consultar a IA

Respondam com as suas palavras, nos últimos 5 minutos. Não copiem de lugar nenhum.

**Pergunta 1:**Porque Veiculo é uma classe abstrata. Serve como modelo para outros veículos, como carro e moto. cada veiculo tem suas próprias regras de aluguel

**Pergunta 2:**Todos herdam de Veiculo e possuem o método de calcular aluguel. Cada classe faz o cálculo do seu próprio jeito. Se chama polimorfismo.

**Pergunta 3:**Porque nem todo veículo precisa ser recarregado. A interface só deixa que somente os veículos elétricos tenham essa função. Caso estivesse em Veiculo, motos e carros comuns também teriam uma função que não precisam.