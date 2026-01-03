import org.example.Dev;
import org.example.bootcamp.BootCamp;
import org.example.bootcamp.Curso;
import org.example.bootcamp.Mentoria;
import org.junit.Assert;
import org.junit.Test;

public class DevTest {
    @Test
    public void deveMatricularCorretamenteNoBootCamp() {
        //Arrange
        Curso curso = new Curso("curso java", "curso java", 20);
        Mentoria mentoria = new Mentoria("mentoria java", "mentoria java");
        BootCamp bootCamp = new BootCamp();
        bootCamp.setDescricao("bootcamp java");
        bootCamp.setDescricao("boot camp java");
        bootCamp.adicionarConteudo(curso);
        bootCamp.adicionarConteudo(mentoria);
        Dev aluno = new Dev();
        aluno.setNome("joao");
        //Act
        aluno.inscrever(bootCamp);
        System.out.println(aluno);


        //Assert
        Assert.assertEquals(2, aluno.getConteudosIncritos().size());
        Assert.assertEquals(0, aluno.getConteudosConcluidos().size());
    }

    @Test
    public void deveProgredirNosConteudosCorretamente() {
        //Arrange
        Curso curso = new Curso("curso java", "curso java", 20);
        Mentoria mentoria = new Mentoria("mentoria java", "mentoria java");
        BootCamp bootCamp = new BootCamp();
        bootCamp.setDescricao("bootcamp java");
        bootCamp.setDescricao("boot camp java");
        bootCamp.adicionarConteudo(curso);
        bootCamp.adicionarConteudo(mentoria);
        Dev aluno = new Dev();
        aluno.setNome("joao");
        //Act
        aluno.inscrever(bootCamp);
        aluno.progredir();
        System.out.println(aluno);


        //Assert
        Assert.assertEquals(1, aluno.getConteudosIncritos().size());
        Assert.assertEquals(1, aluno.getConteudosConcluidos().size());
    }

    @Test
    public void deveRetonarOTotalDeXpCorretamente() {
        //Arrange
        Curso curso = new Curso("curso java", "curso java", 20);
        Mentoria mentoria = new Mentoria("mentoria java", "mentoria java");
        BootCamp bootCamp = new BootCamp();
        bootCamp.setDescricao("bootcamp java");
        bootCamp.setDescricao("boot camp java");
        bootCamp.adicionarConteudo(curso);
        bootCamp.adicionarConteudo(mentoria);
        Dev aluno = new Dev();
        aluno.setNome("joao");
        double xpEsperada = 250;
        //Act
        aluno.inscrever(bootCamp);
        aluno.progredir();
        aluno.progredir();
        double xpCalculada = aluno.calcularTotalXp();
        System.out.println(aluno);
        System.out.println(xpCalculada);


        //Assert
        Assert.assertEquals(xpEsperada, xpCalculada, 0.01);
    }
}
