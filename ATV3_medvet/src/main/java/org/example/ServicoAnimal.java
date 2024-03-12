package org.example;

import java.util.ArrayList;
import java.util.List;

public class ServicoAnimal {

// Validar

    static List<Animal> listaAnimal = new ArrayList<>();

    public static int validarAnimal(Animal animal){
        if(animal.getIdAnimal() == 0){
            return 0;
        }
        if(animal.getNome() == null || animal.getNome().trim().isEmpty()){
            return 0;
        }
        if(animal.getRaca() == null || animal.getRaca().trim().isEmpty()){
            return 0;
        }
        return 1;
    }

// Cadastro
    public static int cadastrarAnimal(Animal animal){
        try{
            listaAnimal.add(animal);
            return 1;
        }catch (Exception e){
            return 0;
        }
    }

// Alteração/Edição
    public static boolean editarAnimal(Animal animal){
        try{
            if(validarAnimal(animal) == 1){
                for(Animal p : listaAnimal){
                    if(p.getIdAnimal() == animal.getIdAnimal()){
                        p.setNome(animal.getNome());
                        p.setRaca(animal.getRaca());
                        p.setIdade(animal.getIdade());
                        p.setSexo(animal.getSexo());
                        return true;
                    }
                }
                return false;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

// Exclusão
    public static boolean excluirAnimal(int idAnimal){
        for(int i = 0; i < listaAnimal.size(); i ++){
            if(listaAnimal.get(i).getIdAnimal() == idAnimal){
                listaAnimal.remove(i);
                return true;
            }
        }
        return false;
    }

// Consultar
    public static Animal consultarAnimal(int idAnimal){
        Animal animal = null;
        for(Animal p : listaAnimal){
            if(p.getIdAnimal() == idAnimal){
                animal = p;
                break;
            }
        }
        return animal;
    }

    public static List<Animal> getListaAnimal() {
        return listaAnimal;
    }

    public static void setListaAnimal(List<Animal> listaAnimal) {
        ServicoAnimal.listaAnimal = listaAnimal;
    }
}
