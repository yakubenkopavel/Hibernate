package org.example;


import org.example.model.Book;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalog");
        EntityManager entityManager = emf.createEntityManager();

        Transaction transaction = (Transaction) entityManager.getTransaction();
        transaction.begin();

        Book book = new Book("b", "main");
        entityManager.persist(book);

        List<Book> books = entityManager.createQuery("select b from Book b").getResultList();
        System.out.println(books.get(0).getIsbn());

        transaction.commit();
        entityManager.close();



//            Configuration config=new Configuration();
//            config.configure();
//
//            SessionFactory sessionFactory=config.buildSessionFactory();
//            Session session = sessionFactory.openSession();
//            Transaction transaction = session.getTransaction();
//            transaction.begi     n();
//
//            Book book = new Book("abc", "main");
//            session.save(book);
//
//
//            transaction.commit();
//            session.close();

    }

}