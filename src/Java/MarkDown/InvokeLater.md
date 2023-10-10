# 자바에서 Swing을 사용할 때 사용하는 메서드 중 하나
+ 자바어플리케이션에서 멀티스레딩을 사용하고 애플리케이션의 사용자 인터페이스로 Swing을 사용할 때, 중요합니다.
+ 스레드의 코드는 이벤트 핸들러에서 바로 호출되지 않지만 우리는 특히 GUI 업데이트 코드를 준비하고 일반적으로 해당 코드는 이벤트 디스패치 스레드에서 호출됩니다.

+ 쓰레드와 경쟁 조건에 빠질 위험이 있습니다.

```java
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Codes {
    
}
```