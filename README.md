# AlgoritmosGreed

###1
Esta implementação utiliza uma abordagem recursiva para gerar todos os subconjuntos de tamanho n do conjunto S. O método calcularSubconjuntos é recursivo e gera todos os subconjuntos de tamanho n começando a partir do índice start do conjunto S. 
Os subconjuntos são adicionados à lista result. O método main mostra exemplos de uso da função calcularSubconjuntos.


###2
todos os subconjuntos possíveis de um conjunto S, independentemente do tamanho. O problema requer apenas os subconjuntos de tamanho n. Portanto, embora o código gere subconjuntos, ele não está restrito ao tamanho especificado.


###3
Nesta implementação, a função minNumeroMoedas recebe um array de moedas e uma quantia como entrada e retorna o menor número de moedas necessário para dar o troco. 
O array de moedas é ordenado em ordem decrescente e, em seguida, percorremos as moedas disponíveis a partir da maior. 
Para cada moeda, subtraímos seu valor da quantia restante enquanto a quantia restante for maior ou igual ao valor da moeda. O contador de moedas é então incrementado de acordo.
