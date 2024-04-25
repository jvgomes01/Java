package principal;

import animal.Animal;
import animal.Cachorro;

import java.util.ArrayList;

public class ListaObjetosExcercicio {
    public static void main(String[] args) {
        //Excercicio 1 Criar Array
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Joao");
        lista.add("Carlos");
        lista.add("Vitor");
        lista.add("Pedro");
        lista.add("Isa");
        lista.add("lucia");

        for(String item: lista) {
            System.out.println(item);
        }

        //Exercicio 2

        Cachorro cachorro = new Cachorro();
        cachorro.setRaca("Buldog");
        Animal animal = (Animal) cachorro;
        if(cachorro instanceof Animal) {
            System.out.println(animal);
        }
    }
}
