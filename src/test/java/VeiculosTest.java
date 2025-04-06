import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void testCalculoCustoSemDesconto() {
        Veiculo veiculo = new Veiculo("Sedan", 100);
        assertEquals(300, veiculo.calcularCusto(3));
    }

    @Test
    void testCalculoCustoComDesconto() {
        Veiculo veiculo = new Veiculo("SUV", 200);
        assertEquals(1260, veiculo.calcularCusto(7));
    }

    @Test
    void testExcecaoDiariaNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Veiculo("Compacto", -50);  // valor negativo correto para o teste
        });
        assertEquals("O valor da diária não pode ser negativo", exception.getMessage());
    }

    @Test
    void testExcecaoDiasNegativos() {
        Veiculo veiculo = new Veiculo("Luxo", 300);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            veiculo.calcularCusto(-2);
        });
        assertEquals("O número de dias não pode ser negativo", exception.getMessage());
    }
}
