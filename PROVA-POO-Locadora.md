# Prova Prática de POO com IA: Locadora de Veículos

| Duração | Grupo | IA | Conceitos |
| --- | --- | --- | --- |
| 45 minutos | Até 3 alunos | Liberada (opcional) | Abstração, herança, sobrescrita, polimorfismo, interface e encapsulamento |

## Como esta prova funciona

Nesta prova vocês podem usar IA, e quem preferir fazer sem ela também pode. O que importa é mostrar **como o sistema foi construído**, não só o resultado.

A nota tem duas partes:

| Parte | Pontos | O que olhamos |
| --- | --- | --- |
| Produto | 6,0 | O código entregue: ele compila, segue as regras e dá os valores certos |
| Processo | 4,0 | O caminho: o que vocês pediram, em que ordem, o que conferiram e o que entenderam |

Não tem passo a passo. O enunciado conta o problema e as regras. Como modelar e em que ordem construir são decisões de vocês.

## A situação

A **Estrada Livre** é uma locadora que aluga carros, motos e carros elétricos. Ela precisa de um programa em Java que calcule quanto custa o aluguel de cada veículo e, só para os elétricos, quanto custa a recarga.

## As regras da locadora

- Todo veículo tem placa, modelo e valor da diária. Todo veículo sabe calcular o valor do aluguel para uma quantidade de dias, e cada tipo calcula do seu jeito.
- Ninguém aluga "um veículo" sem dizer o que ele é: o programa não pode permitir a criação de um veículo genérico.
- Todo veículo imprime um resumo com placa e modelo, do mesmo jeito para todos os tipos.
- **Carro:** diária vezes dias, mais 10% de seguro sobre esse total.
- **Moto:** diária vezes dias. A partir de 5 dias, 15% de desconto sobre o total.
- **Carro elétrico:** é um carro. Reaproveita o cálculo do carro e soma R$ 15,00 de taxa de bateria por dia.
- **Recarga:** só o carro elétrico sabe calcular. O custo é dias vezes o consumo diário em kWh vezes R$ 0,80. Carro comum e moto não têm esse cálculo, nem como método vazio.

## O que o projeto precisa ter

- Uma pasta de projeto criada por vocês, com os pacotes `model` (as classes da locadora) e `app` (a classe com o `main`), cada um na sua pasta.
- Dados dos objetos sem acesso público direto.
- Uma classe de teste em `app` que prove três coisas:
  - o veículo genérico não pode ser criado (deixem a linha comentada, com uma frase explicando o porquê);
  - carro, moto e carro elétrico ficam numa mesma lista, e um único laço, sem `instanceof` e sem cast, imprime o resumo e o valor do aluguel de todos;
  - o custo de recarga é mostrado percorrendo só os veículos elétricos, usando apenas o tipo que representa "ser elétrico".

## Valores para conferir

Usem estes cenários no teste. O programa de vocês precisa dar exatamente estes valores.

| Cenário | Dias | Valor do aluguel | Recarga |
| --- | --- | --- | --- |
| Carro, diária R$ 150 | 3 | 495.0 | não se aplica |
| Moto, diária R$ 80 | 4 | 320.0 | não se aplica |
| Moto, diária R$ 80 | 5 | 340.0 | não se aplica |
| Carro elétrico, diária R$ 200, consumo de 10 kWh por dia | 3 | 705.0 | 24.0 |

Se um valor não bater, o erro está no código (ou no que foi pedido para a IA). Descubram onde e anotem como no registro do processo.

## Registro do processo: o arquivo PROMPTS.md

Copiem o arquivo `PROMPTS-modelo.md` para a pasta do projeto, renomeiem para `PROMPTS.md` e preencham **durante** a prova, não depois.

- Registrem cada prompt **exatamente como foi enviado**, na ordem. Copiem e colem, não reescrevam.
- Ao lado de cada prompt, escrevam em uma ou duas linhas o que a IA devolveu e o que vocês fizeram com a resposta (usaram, alteraram ou descartaram) e por quê.
- Quem não usar IA também preenche o arquivo, descrevendo cada passo na ordem em que foi feito.
- Nos 5 minutos finais, **sem consultar a IA**, respondam as três perguntas da seção "Perguntas finais", logo abaixo, na última parte do `PROMPTS.md`.

O arquivo precisa se explicar sozinho: quem ler deve entender o caminho que vocês seguiram sem precisar perguntar nada.

## Perguntas finais

1. Por que não dá para criar um `Veiculo` diretamente, e por que isso faz sentido para uma locadora?
2. Num único laço, o programa calcula o aluguel de carro, moto e carro elétrico sem saber qual é qual. Como isso funciona e qual é o nome desse conceito?
3. Por que o cálculo de recarga está numa interface e não na classe `Veiculo`? O que daria errado se estivesse lá?

## Sugestão de tempo

| Minutos | O que fazer |
| --- | --- |
| 0 a 5 | Ler a prova e combinar como o grupo vai trabalhar |
| 5 a 35 | Construir e testar, registrando os prompts |
| 35 a 40 | Conferir a tabela de valores e colar a saída no README |
| 40 a 45 | Responder as três perguntas, sem IA |

## O que entregar

Uma pasta por grupo, com:

- `model/` e `app/` com os arquivos `.java`;
- `README.md` com os nomes dos integrantes e a **saída do programa** colada;
- `PROMPTS.md` preenchido.

## Como será corrigida

- [ ] O projeto compila e está organizado nos pacotes `model` e `app`.
- [ ] A estrutura de classes usa abstração, herança, sobrescrita e interface do jeito que as regras pedem.
- [ ] O teste prova o polimorfismo sem `instanceof` e sem cast.
- [ ] Os valores da tabela batem com a saída colada no README.
- [ ] O `PROMPTS.md` mostra o caminho: prompts na ordem, o que foi conferido e o que foi corrigido.
- [ ] As respostas finais mostram que o grupo entende o que entregou.
