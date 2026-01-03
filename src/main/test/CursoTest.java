import org.example.bootcamp.Curso;
import org.junit.Assert;
import org.junit.Test;

public class CursoTest {
    @Test
    public void deveCalcuarCorretamenteAXP() {
        //Arrange
        Curso curso = new Curso("Curso Java", "curso java", 20);
        double xpEsperada = 200;

        //Act
        double xpCalculada = curso.calcularXp();

        //Arrange
        Assert.assertEquals(xpEsperada, xpCalculada, 0.01);
    }
}
