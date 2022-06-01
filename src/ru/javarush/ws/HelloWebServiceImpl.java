package ru.javarush.ws;
// та ж анотація, що і при описі інтерфейсу,
import javax.jws.WebService;
// але тут використовується з параметром endpointInterface,
// що вказує повне ім'я класу інтерфейсу нашого веб-сервісу
@WebService(endpointInterface = "ru.javarush.ws.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {
    @Override
    public String getHelloString(String name) {
        // просто возвращаем приветствие
        return "Hello, " + name + "!";
    }
}
