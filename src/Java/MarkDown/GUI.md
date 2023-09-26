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
---
### 프레임에 컴포넌트 추가하기
+ add라는 메소드를 많이 사용하게 될 예정이다.
---
### 우리가 상속에서 살펴보았듯이 조상클래스가 제공하는 메소드들은 자식 클래스로 사용할 수 있다.
> Jframe 클래스의 조상 클래스가 가지고 있는 메소드들이 사용되는 
+ `add(component)` : 프레임에 컴포넌트를 추가한다.
+ `setLocation(s, y)` : 
+ `setIconImage(IconImage)` : 윈도우 시스템에 표시할 아이콘을 알려준다.
+ `setTitle()` : 
---
# 배치관리자
+ `FLOWLAYOUT` : 순서대로 버튼을 넣으면 칸에 맞게 자동으로 들어간다. Default는 가운데이다.
+ `BOARDERLAYOUT`