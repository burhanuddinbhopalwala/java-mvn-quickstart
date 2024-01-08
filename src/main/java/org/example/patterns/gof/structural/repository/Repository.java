package org.example.patterns.gof.structural.repository;

import java.util.List;

// The Repository pattern is a design pattern that provides an abstraction layer between the application
// and the data storage system. It separates the data access logic from the business logic and provides a way
// to retrieve and store data consistently and efficiently.
// It also helps improve the application's maintainability, testability, and scalability.

// Interface for the repository
interface JpaRepository {
    User getById(int id);

    List<User> getAll();

    void save(User user);

    void delete(int id);
}

// Concrete repository class that uses a database
class UserRepository implements JpaRepository {
    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(int id) {

    }
    // Implement methods using JDBC or an ORM framework
}

// User class
class User {
    private int id;
    private String name;
    private int age;

    // Getters and setters omitted for brevity
}

// Main class
public class Repository {
    public static void main(String[] args) {
        // Create repository instance
        JpaRepository jpaRepository = new UserRepository();

        // Use repository methods to interact with data
        User user = jpaRepository.getById(1);
        List<User> users = jpaRepository.getAll();
        jpaRepository.save(new User(/* data */));
        jpaRepository.delete(1);
    }
}
