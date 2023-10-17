# JPanel 클래스의 printComponent() 메소드를 재정의하여 그림을 그린다.

+ 프레임이 가려졌다가 다시 나타나는 경우에는 자동적으로 paintComponent()가 호출됩니다.
+ paintComponent 가 11장에서는 엄청 중요하다.

```java
import javax.swing.*;

class MyPanel extends JPanel {
    protected void paintComponent(Graphic graphic) {
        
    }
}
```

+ 만약 그림이 그려지는 컴포넌트가 JPanel이나 JLabel처럼 그래픽 컴포넌트인 경우, paintComponent
+ // p.516까지