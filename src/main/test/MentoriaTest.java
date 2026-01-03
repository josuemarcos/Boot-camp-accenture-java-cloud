import org.example.bootcamp.Mentoria;
import org.junit.Assert;
import org.junit.Test;

public class MentoriaTest {
    @Test
    public void deveCalcuarCorretamenteAXP() {
        //Arrange
        Mentoria mentoria = new Mentoria("Mentoria Java", "mentoria java");
        double xpEsperada = 50;

        //Act
        double xpCalculada = mentoria.calcularXp();

        //Arrange
        Assert.assertEquals(xpEsperada, xpCalculada, 0.01);
    }
}
