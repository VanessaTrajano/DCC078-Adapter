import org.example.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarClassificacaoCliente() {
        Cliente cliente = new Cliente();
        cliente.setClassificacao("Baixo");

        assertEquals("Baixo", cliente.getClassificacao());
    }

    @Test
    void deveRetornarScoreCliente() {
        Cliente cliente = new Cliente();
        cliente.setClassificacao("Baixo");

        assertEquals(800, cliente.getScore());
    }

}