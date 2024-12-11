# Merge Sort
O Merge Sort é um algoritmo de ordenação eficiente, baseado no princípio de divisão e conquista.  Ele funciona dividindo a lista original em sublistas menores, ordenando essas sublistas e, em seguida, mesclando-as para produzir uma lista ordenada final. 
Vamos ver um exemplo de como isso funciona em Java:

## MergeAndSort
Essa classe é responsável pela implementação do algoritmo que funciona de forma recursiva, primeiro dividindo o input pela metade até que se tenham arrays com um único elemento, depois se comparam os elementos desses arrays unitários de forma que os elementos menores são colocados primeiro e os maiores depois. Uma vez que esses arrays, que agora tem 2 elementos, estão ordenados, o programa faz a mesma comparação desse com os elementos do próximo array de 2 elementos. Esse processo se repete até que sobre apenas 1 array com N elementos ordenados.

## Testador de algoritmos

A classe AlgorithmTester serve para testar qualquer outra classe que implemente a interface Algorithm.
        
A classe AlgorithmTester recebe um Algorithm e ao chamar a função test da classe AlgorithmTester ela:
- Gera um vetor de inteiros aleatórios do tamanho especificado, esse vetor será o input do algoritmo
- Executa o algoritmo com o input gerado
- Mede o tempo de execução do algoritmo recebido em milisegundos

## Como executar

Executando a função main da classe AlgorithmTester:
- Instancia um MergeAndSortAlgorithm
- Instancia um AlgorithmTester recebendo o MergeAndSortAlgorithm instanciado
- Chama o método test do objeto AlgorithmTester, gerando o input aleatório, realizando os prints de input e output e medição de tempo de execução do algoritmo em milissegundos.
