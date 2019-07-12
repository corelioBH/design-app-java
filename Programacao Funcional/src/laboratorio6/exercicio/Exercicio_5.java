package laboratorio6.exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio_5 {

    public static void main(String[] args) {
        List<Produto> listaProdutos = Arrays.asList(
                new Produto("Xiaomi Mi 9", 1799.99),
                new Produto("Microondas", 299.00),
                new Produto("IPhone XS", 5299.99),
                new Produto("Notebook Dell", 2999.00),
                new Produto("Geladeira", 1299.99),
                new Produto("Samsung J5 Prime", 899.99)

        );

        Stream<Produto> streamProduto = listaProdutos.stream();
        Stream<String> streamNomeProdutos = streamProduto.map(p -> p.getNome());
        List<String> listaNomeProtudos = streamNomeProdutos.collect(Collectors.toList());
        listaNomeProtudos.forEach(p -> System.out.println(p));
    }

}
