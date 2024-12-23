package org.example.service.interfaces;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public interface ICommand<T> {
    T execute();
}
