package ru.javarush.endpoint;
// клас для запуску веб-сервера

import ru.javarush.ws.HelloWebServiceImpl;

import javax.xml.ws.Endpoint;
public class HelloWebServicePublisher {
    public static void main(String... args) {
        // запускаємо веб-сервер на порту 1986
        // і за адресою, вказаною в першому аргументі,
        // запускаємо веб-сервіс, який передається в другому аргументі
        Endpoint.publish("http://localhost:1986/wss/hello", new HelloWebServiceImpl());
    }
}