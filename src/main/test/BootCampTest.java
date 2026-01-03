import org.example.Dev;
import org.example.bootcamp.BootCamp;
import org.example.bootcamp.Curso;
import org.example.bootcamp.Mentoria;
import org.junit.Assert;
import org.junit.Test;

public class BootCampTest {

    @Test
    public void deveAdicionarOsConteudosCorretamente() {
        //Arrange
        Curso curso = new Curso("curso java", "curso java", 20);
        Mentoria mentoria = new Mentoria("mentoria java", "mentoria java");
        BootCamp bootCamp = new BootCamp();
        bootCamp.setDescricao("bootcamp java");
        bootCamp.setDescricao("boot camp java");
        //Act
        bootCamp.adicionarConteudo(curso);
        bootCamp.adicionarConteudo(mentoria);
        System.out.println(bootCamp.getConteudos());

        //Assert
        Assert.assertEquals(2, bootCamp.getConteudos().size());

    }

    @Test
    public void naoDevePermitirAdicionarConteudosDuplicados() {
        //Arrange
        Curso curso = new Curso("curso java", "curso java", 20);
        Curso curso1 = new Curso("curso java", "curso java", 20);
        Mentoria mentoria = new Mentoria("mentoria java", "mentoria java");
        Mentoria mentoria1 = new Mentoria("mentoria java", "mentoria java");
        BootCamp bootCamp = new BootCamp();
        bootCamp.setDescricao("bootcamp java");
        bootCamp.setDescricao("boot camp java");
        //Act
        bootCamp.adicionarConteudo(curso);
        bootCamp.adicionarConteudo(curso1);
        bootCamp.adicionarConteudo(mentoria);
        bootCamp.adicionarConteudo(mentoria1);
        System.out.println(bootCamp.getConteudos());

        //Assert
        Assert.assertEquals(2, bootCamp.getConteudos().size());
    }

    @Test
    public void deveAdicionarAlunoAListaAposInscricao() {
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
        System.out.println(bootCamp.getAlunos());

        //Assert
        Assert.assertEquals(1, bootCamp.getAlunos().size());
    }
}
