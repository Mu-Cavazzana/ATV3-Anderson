import org.example.Animal;
import org.example.ServicoAnimal;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteServicoAnimal {

    @Test
    public void testeAnimalValido(){
        Animal animal = new Animal();
        animal.setIdAnimal(1);
        animal.setNome("Luma");
        animal.setRaca("vira-lata");
    }

    @Test
    public void testeAnimalInvalido(){
        Animal animal = new Animal();
        Assert.assertEquals(0,ServicoAnimal.validarAnimal(animal));

    }

    @Test
    public void testeCadastroAnimal(){
        Animal animal = new Animal();
        animal.setIdAnimal(1);
        animal.setNome("Luma");
        animal.setRaca("vira-lata");

        Assert.assertEquals(1, ServicoAnimal.validarAnimal(animal));
        Assert.assertEquals(1,ServicoAnimal.cadastrarAnimal(animal));
    }

    @Test
    public void testeEditarAnimal(){
        Animal animal = new Animal();
        animal.setIdAnimal(1);
        animal.setNome("Luma");
        animal.setRaca("vira-lata");
        if(ServicoAnimal.validarAnimal(animal) == 1){
            if(ServicoAnimal.cadastrarAnimal(animal) == 1) {
                animal.setIdAnimal(1);
                animal.setNome("Luma");
                animal.setRaca("vira-lata");
                animal.setIdade(5);
                animal.setSexo('M');
                Assert.assertTrue(ServicoAnimal.editarAnimal(animal));
            }
        }
    }

    @Test
    public void testeExcluirAnimal(){
        Animal animal = new Animal();
        animal.setIdAnimal(1);
        animal.setNome("Luma");
        animal.setRaca("vira-lata");
        ServicoAnimal.cadastrarAnimal(animal);

        Assert.assertTrue(ServicoAnimal.excluirAnimal(1));
        Assert.assertEquals(0, ServicoAnimal.getListaAnimal().size());
    }

    @Test
    public void testeConsultarAnimal(){
        Animal animal = new Animal();
        animal.setIdAnimal(1);
        animal.setNome("Luma");
        animal.setRaca("vira-lata");
        ServicoAnimal.cadastrarAnimal(animal);

        Assert.assertEquals("Luma", ServicoAnimal.consultarAnimal(1).getNome());
    }

}
