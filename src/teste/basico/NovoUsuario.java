package src.teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Arthur", "arthur@gmail.com");

        em.getTransaction().begin(); //iniciar transação
        em.persist(novoUsuario); //gerar um insert
        em.getTransaction().commit(); //efetivar transação no banco de dados

        em.close();
        emf.close();
     }
}
