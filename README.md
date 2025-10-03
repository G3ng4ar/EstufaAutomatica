# EstufaAutomatica

Código Java desenvolvido para monitorar e registrar as temperaturas de uma estufa. 

## Funcionalidades:
- Registro de temperaturas por 24 horas.
- Cálculo de média, mínima e máxima.
- Alertas de temperatura fora dos padrões.
- Relatório final detalhado.

## Como utilizar: 
- O sistema inicializará automaticamente, sendo necessário apenas inserir as temperaturas.
- Serão permitidos registros de hora em hora, num decorrer total de 24 horas (1 dia).
- Ao final do período, será gerado um relatório geral contendo informações como: temperatura média, quantidade de temperaturas excedidadas, temperaturas mínima e máxima registras.

## Nota:
- O sistema permitirá apenas números inteiros.
- Mensagens de controle serão emitidas à cada registro, exibindo alertas como: Temperatura acima/abaixo do limite, valor inserido inválido/não numérico.
- Em caso de erro na inserção de dados, a mensagem com erro será emitida no terminal e ficará pausado no último horário, até que um valor válido seja inserido. 

## Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- Maven (opcional)

### Execução via JAR
```bash
java -jar EstufaControl.jar
