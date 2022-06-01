package ru.javarush.client;
// потрібно, щоб отримати wsdl опис і через нього
// дотягнутися до самого веб-сервісу

import ru.javarush.ws.HelloWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
public class HelloWebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        // створюємо посилання на wsdl опис
        URL url = new URL("http://localhost:1986/wss/hello?wsdl");
        // Параметри наступного конструктора дивимося в найпершому тезі WSD опису - definitions
        // 1-й аргумент дивимося в атрибуті targetNamespace
        // 2-й аргумент дивимося в атрибуті name
        QName qname = new QName("http://ws.javarush.ru/",
                "HelloWebServiceImplService");
        // Тепер ми можемо дотягнутися до тега service в wsdl описі,
        Service service = Service.create(url, qname);
        // а далі і до вкладеного в нього тега port, щоб
        // отримати посилання на віддалений від нас об'єкт веб-сервісу
        HelloWebService hello = service.getPort(HelloWebService.class);
        // Ура! Тепер можна викликати віддалений метод
        System.out.println(hello.getHelloString("Kostya"));
    }
}
