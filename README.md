# Testador de algoritmos

A classe AlgorithmTester serve para testar qualquer outra classe que implemente a interface Algorithm.

## Como funciona

A classe AlgorithmTester recebe um Algorithm e ao chamar a função test da classe AlgorithmTester ela:
- Gera um vetor de inteiros aleatórios do tamanho especificado, esse vetor será o input do algoritmo
- Executa o algoritmo com o input gerado
- Mede o tempo de execução do algoritmo recebido em milisegundos

Executando a função main da classe AlgorithmTester:
- Instancia a implementação SumAlgorithm de Algorithm
- Instancia um AlgorithmTester recebendo o SumAlgorithm instanciado
- Gera um array de números aleatórios
- Printa esse array no terminal
- Testa o algoritmo, chamando a função test(int size)
