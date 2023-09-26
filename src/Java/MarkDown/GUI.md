# Week03 그래픽 사용자 인터페이스
> 지금까지 콘솔 기반이였지만 GUI를 통해 사용자에게 편의성을 제공한다.
+ GUI는 component들로 만들어지는데, 컴포넌트란?
  + 레이블, 버튼이나 텍스트 필드와 같은 GUI를 작성하는 기본적인 빌딩블록을 의미하는 것이다. Window 시스템에서는 컨트롤(control)이라고 부른다.
---
## Swing
### 컴포넌트가 자바로 작성되어 있기 때문에 어떤 플랫폼에서도 일관된 화면을 보여줄 수 있다.
+ 단순 컴포넌트
+ 컨테이너 컴포넌트
### 컨테이너의 종류

+ 최상위 컨테이너 : 
  + Jframe, Jdialog ...
---
## ㅇㅇㅇ?
### GUI 작성하기
1. 최상위 컨테이너를 생성한다.

```java
import javax.swing.*;

```

### 프레임 생성하기
MyFrame.java
```java
import javax.swing.*;
public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");
        setVisible(true);
    }
}
```
+ MyFrame 클래스는 Jframe이다.
+ 

```java
public class MyFrameTest {
  public static void main(String[] args) {
    MyFrame f = new MyFrame();
  }
}
```
+ 