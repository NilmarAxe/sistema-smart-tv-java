# Smart TV em Java

### Objetivo
Este projeto tem como objetivo a implementação de uma Smart TV simulada utilizando a linguagem de programação Java. O sistema simula funcionalidades básicas de uma televisão, como ligar/desligar, mudar de canal e controlar o volume, com verificações de limites para o volume e os canais.

### Funcionalidades
- Ligar/Desligar: Permite ligar e desligar a TV.
- Mudar Canal: Possibilita mudar o canal da TV dentro de uma faixa definida (1 a 99).
- Controle de Volume: É possível aumentar ou diminuir o volume, com limites de 0 a 100.
- Mensagens de Feedback: O sistema fornece feedback ao usuário, informando o status atual da TV, como canal e volume.

### Estrutura do Código
- Classe `SmartTv`: Representa a Smart TV com métodos para controlar o estado da TV (ligada ou desligada), alterar o canal e o volume.
- Classe `Usuário`: Simula o uso da Smart TV, realizando interações com os métodos da classe `SmartTv`.

### Executando o Programa
O programa exibirá o status da TV, bem como simulará interações como ligar/desligar a TV, mudar de canal e controlar o volume.
_______

#### Abaixo um exemplo de como o programa funciona ao ser executado:
```java
Status Inicial -> TV Ligada: false
Canal Atual: 1
Volume Atual: 1
TV ligada.
Novo Status -> TV Ligada: true
Canal Atual: 1
Volume Atual: 1
Mudando para o canal: 12
Canal Atual: 12
Aumentando o volume para: 2
Diminuindo o volume para: 1
Volume Atual: 1
TV desligada.
Novo Status -> TV Desligada: false
Não é possível mudar o canal, a TV está desligada.
Não é possível aumentar o volume, a TV está desligada.
TV ligada.
Novo Status -> TV Ligada: true
Canal Atual: 1
Volume Atual: 1
Mudando para o canal: 5
Aumentando o volume para: 2
Canal Atual: 5
Volume Atual: 2
TV desligada.
Novo Status -> TV Desligada: false
```
### Considerações
- Limites: O volume é limitado entre 0 e 100, e os canais estão restritos entre 1 e 99.
- Verificação de Estado: A TV não permite mudar o canal ou ajustar o volume enquanto estiver desligada.
