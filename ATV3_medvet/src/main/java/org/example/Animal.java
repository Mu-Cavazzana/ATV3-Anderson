package org.example;

public class Animal {

    private int idAnimal;

    private String nome;

    private String raca;
    private Integer idade;

    private Character sexo;


    public Animal(){
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
    }

    public int getIdAnimal() {return idAnimal;}

    public void setIdAnimal(int idAnimal) {this.idAnimal = idAnimal;}

    public String getNome() {return  nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getRaca() {return raca;}

    public void setRaca(String raca) {this.raca = raca;}

    public Integer getIdade() {return idade;}

    public void setIdade(Integer idade) {this.idade = idade;}

    public Character getSexo() {return sexo;}

    public void setSexo(Character sexo) {this.sexo = sexo;}
}

