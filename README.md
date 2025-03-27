#### Versão em Português: <img src="https://upload.wikimedia.org/wikipedia/en/0/05/Flag_of_Brazil.svg" width="20">

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

__________

#### English Version: <img src="https://upload.wikimedia.org/wikipedia/commons/b/be/Flag_of_England.svg" width="20">

# Smart TV in Java

### Objective
This project aims to implement a simulated Smart TV using the Java programming language. The system simulates basic television functionalities, such as turning on/off, changing channels, and controlling volume, with limit checks for volume and channels.

### Features
- Turn On/Off: Allows turning the TV on and off.
- Change Channel: Enables changing the TV channel within a defined range (1 to 99).
- Volume Control: The volume can be increased or decreased, with limits between 0 and 100.
- Feedback Messages: The system provides feedback to the user, informing the current TV status, such as channel and volume.

### Code Structure
- Class `SpartTv`: Represents the Smart TV with methods to control its state (on or off), change channels, and adjust the volume.
- Class `Usuário`: Simulates the use of the Smart TV, interacting with the methods of the `SmartTv` class.

### Running the Program
The program will display the TV status and simulate interactions such as turning the TV on/off, changing channels, and controlling the volume.
__________

#### Below is an example of how the program works when executed:
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
### Considerations
- Limits: The volume is limited between 0 and 100, and channels are restricted between 1 and 99.
- State Verification: The TV does not allow channel changes or volume adjustments while it is off.

