package ru.javarush.ws;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
// говоримо, що наш інтерфейс буде працювати як веб-сервіс
@WebService
// говоримо, що веб-сервіс буде використовуватися для виклику методів
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWebService {
    // говоримо, що цей метод можна викликати віддалено
    @WebMethod
    public String getHelloString(String name);
}
