## ActionEvent

```java
import javax.swing.*;

class MyFrame extends JFrame {
    private JButton button1;
    private JButton button2;
    private JPanel panel;
    MyListener listener = new MyListener();

    public MyFrame() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    // 이너클래스를 만들어서 리스너를 만듬
    public class MyListener
    

}
```
+ Shape 클래스의필드와 메소드에 접근하는 것은 ok
+ 리스너 객체를 미리 만들어놓는다.

+ 5가지 생성 방법 중
+ 이너클래스를 만드는 방법으로 했다.

  + `JPanel`을`MyFrame`에 전역으로 선언하는 이유를 아는가?
    + 클래스 속에는 데이터와 메소드가 있는데 특정 메소드 안에 선언하게 되면 다른 메소드에서 사용하려고 하면 따로 선언해야 한다.
  + 