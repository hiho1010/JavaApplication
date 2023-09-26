# 2023-09-12
## 자바의 특징
+ 객체 단위의 프로그래밍
```java
class src {
    public static void main(String[] args) {
        System.out.println();
    }
}
```
---
### 객체 간의 관계 3가지
1. Inheritance(상속)
2. overriding
3. overloading
---
### 프로그래밍할 때, 중요한 건 작은 것이 아닌 어떤 프로그램을 짜는 지부터
```java
class handleGrades {
    // 학생 n 명의 성적 데이터 배열
    class student {
        String name, number;
        int midExam, finalExam, grade, homework, hap;
        char g;
        public Student(String n, String n, int m, int f, int g, int h) {
            name =n;
            number = h;
            this.a = a;

        }
    // 학생 총 수 : n
class Grading() {
    Student[] s;
    int n;
    Grading(){
        s = new Student[3];
        n = 3;
        
    }
}
    // 성적 총합 꼐산 add : 학색 한 명의 중간 + 기말 + 출석 + 과제
    
    // 성적을 기준으로 정렬 sort
    
    // 최종 성적 주기 grade
}



}
```
---
### reference type과 primitive type의 차이에 대해서
+ 레퍼런스 타입은 한 번 돌아서 간다.
+ primitive는 정해져있는 타입이므로 바로 진행.
> 무슨 의미냐면 변수를 저장해야하는데 이 변수의 크기가 얼마인지 모르기 때문에 한 번 정보를 들여봐야한다.
## 즉, 위치만 잡고 값이 안들어간다는 의미이다. 그래서 초기화를 해야 값이 들어간다. 그 차이가 있다.
---
### 인스턴스를 만드는데 사용되는 kw는 new();라는 생성자이다.
+ 객체를 만들었는데 사용하고 싶다면
+ new();라는 연산자는 가장 우선순위가 높은 연산자이다.
+ `new();`의 의미는 메모리에 공간을 잡아달라는 의미이다. 그리고 대입 연산을 하면 그 칸 안에 정보를 대입해주는 것이다.
---
교재 p.180
확률을 처리하기 위해선? 확률이 동일하다고 했으니까 랜덤값이 필요하다.
방법 1. java.util.rand

.이라는 것은 소유 연산자이다. 즉, sout 같은 것도 System 안에 out 안에 println을 가지고 있다는 뜻이다.