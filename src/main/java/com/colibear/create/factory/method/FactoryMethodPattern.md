# Factory Method Pattern

어떠한 객체(인스턴스)를 생성하는 책임을 구체적인 클레스가 아닌 추상적인 인터페이스의 메서드로 감싸는 것

- 다양한 구현제가 있고, 그중에서 특정한 구현체를 만들 수 있는 다양한 팩토리(Creator)을 제공한다.

```java
// sample
public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        // 색깔은 black 으로 하고 메일은 iln1027@abc.d
        Ship blackShip = ShipFactory.orderShip("black", "iln1027@abc.d");

        // 색깔은 white 로 하고 메일은 iln1027@abc.d
        Ship whiteShip = ShipFactory.orderShip("white", "iln1027@abc.d");
    }
}
```
