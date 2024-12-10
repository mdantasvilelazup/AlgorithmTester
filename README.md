# Testador de algoritmos

A classe src.AlgorithmTester serve para testar qualquer outra classe que implemente a interface src.Algorithm.

## Como funciona

A classe src.AlgorithmTester recebe um src.Algorithm e ao chamar a função test da classe src.AlgorithmTester ela:
- Gera um vetor de inteiros aleatórios do tamanho especificado, esse vetor será o input do algoritmo
- Executa o algoritmo com o input gerado
- Mede o tempo de execução do algoritmo recebido em milisegundos

Executando a função main da classe src.AlgorithmTester:
- Instancia um src.SumAlgorithm, uma implementação da interface src.Algorithm
- Instancia um src.AlgorithmTester recebendo o src.SumAlgorithm instanciado
- Gera um array de números aleatórios
- Printa esse array no terminal
- Testa o algoritmo, chamando a função test(int size)
