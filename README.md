# Testes de Veículos

Projeto em Java com foco em testes automatizados para a classe `Veiculo`, desenvolvido com JUnit. O objetivo é validar o comportamento de métodos relacionados ao cálculo de custos e regras de negócio, como exceções para valores inválidos.

## 📚 Tecnologias Utilizadas

- Java
- JUnit 5
- IntelliJ IDEA

## 🚗 Funcionalidades testadas

- Cálculo de custo com base no tipo de veículo e quantidade de dias.
- Lançamento de exceções para parâmetros inválidos, como número negativo de dias.

## 🧪 Exemplo de teste

```java
@Test
void testExcecaoDiasNegativos() {
    Veiculo veiculo = new Veiculo("Luxo", 300);
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        veiculo.calcularCusto(-2);
    });
    assertEquals("O número de dias não pode ser negativo", exception.getMessage());
}
