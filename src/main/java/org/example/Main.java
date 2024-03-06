package org.example;


import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        HashSet<Animal> set = new HashSet<>();
        Animal an1 = new Animal("Clone");
        Animal an2 = new Animal("Clone");
        set.add(an1);
        set.add(an2);
        System.out.println(an1.hashCode());
        System.out.println(an2.hashCode());
        System.out.println(set.size());





        //            EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalog");
//            EntityManager entityManager = emf.createEntityManager();
//
//            Transaction transaction = (Transaction) entityManager.getTransaction();
//            transaction.begin();
//
//            Book book = new Book("b", "main");
//            entityManager.persist(book);
//
//            List<Book> books = entityManager.createQuery("select b from Book b").getResultList();
//            System.out.println(books.get(0).getIsbn());
//
//            transaction.commit();
//            entityManager.close();



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



enum Tree{
    Hvoia(1), Sosna(2);

    private int leaves;
    Tree(int leaves){
        this.leaves = leaves;
    }
}
class Animal implements Cloneable {
    private int a = 2;
    private String name;

    Animal(){

    }
    Animal(String name){
        this.name = name;
    }

    public Animal clone(){
        Animal copy = null;

        try{
            copy = (Animal) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return copy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        char[] list = name.toCharArray();
        int code = 0;
        for(char c : list){
            code += c;
        }
        return (int)(Math.random()*100);
    }
}

class Dog extends Animal{
}