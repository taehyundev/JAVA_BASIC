# JavaStudy

### 자바 공부
> 제대로 공부하지 못한 부분에 대해서 다시 집중적으로 공부하고 자바에서 지원하는 라이브러리들을 활용하여
> 좀 더 가독성있고 질 좋은 프로그램을 만들기 위해 노력할 것이다.

**기본기** 의 중요성에 대해서 확실하게 느끼게 되었다. 


###### restart : 2020-02-03 ~

## 목차 (2020-02 start : 1분기 Java 공부 내용 )

 + **Chap1**
   >   [*연산자와 조건문* (정리완료)](https://github.com/taehyundev/JavaStudy/tree/master/2020-02_Javastudy(1%EB%B6%84%EA%B8%B0)/Chap01)
 
 + **Chap2**
   >   [*반복문과 배열 다차원배열 예외처리* (정리완료)](https://github.com/taehyundev/JavaStudy/tree/master/2020-02_Javastudy(1%EB%B6%84%EA%B8%B0)/Chap02)
 
 + **Chap3**
   >   [*클래스와 객체* (정리완료)](https://github.com/taehyundev/JavaStudy/tree/master/2020-02_Javastudy(1%EB%B6%84%EA%B8%B0)/Chap03)
 
 + **Chap4**
   >   [*상속* (정리완료)](https://github.com/taehyundev/JavaStudy/tree/master/2020-02_Javastudy(1%EB%B6%84%EA%B8%B0)/Chap04)
 
 + **Chap5**
   >   *제네릭과 컬렉션*
 
 + **Chap6**
   >    *입출력 스트림과 파일 입출력*
 
 + **Chap7**
   >   *자바 GUI 기초 AWT와 스윙*
 
 
 
#
 **Chap2** - 추가 설명
  ### <정방형 배열과 비정방형 배열>
  * 정방형 배열
   
         일반적인 배열의 형태이다.
   
  * [비정방형 배열](https://github.com/taehyundev/JavaStudy/blob/master/2020-02_Javastudy(1%EB%B6%84%EA%B8%B0)/Chap02/Ex02_06.java)
  
        행마다 열의 갯수가 다른 배열을 보여준다.
 
 
#
 **Chap3** - 추가 설명
  ### <객체지향 언어의 특성>
  * 캡슐화 (Encapsulation) 
   
        캡슐화란 객체를 캡슐 내부를 보호하고 볼수 없게 하는 것으로 객체의 가장 본질적인 특징이다.
    
  * 상속 (Inheritance)
  
        상속은 상위 개체의 속성이 하위 개체에 물려져서 하위 개체가 상위 개체의 속성을 모두 가지는 관계이다.
    
  * 다형성 (polymorphism) 
   
        다형성은 같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 동작하도록 구현되는 것을 말한다.
       EX) 오버로딩, 오버라이딩
       
       
  
   ### <가비지(garbage)란?>
   
        가비지란 자바 응용프로그램에서 더 이상 사용되지 않게 된 객체나 배열이다. (쓰레기)
        
        Person a,b;
        a = new Person("a");
        b = new Person("b");
        b = a; // b가 가르키던 객체는 가비지가됨
        
     
   ### <Static과 Non-Static>  [자세한설명 - (Tistory 참조)](https://supersoftware.tistory.com/entry/static-%EA%B3%BC-non-static)
   
        먼저 쉽게 설명해서 눈은 사람이라는 객체의 non-static 멤버이며, 공기는 static 멤버이다.
        소유와 공유 의 개념으로 생각하면 편할꺼같다.
        
        Static 멤버는 클래스당 하나씩 생긴다고 해서 클래스 멤버라고 부른다.
        Non-Static 멤버는 각 객체마다 하나씩 생긴다고 해서 인스턴스 멤버라고 부른다.
        
  
  
  
#
 **Chap4** - 추가 설명
  ### <업캐스팅과 다운캐스팅>
  * 업캐스팅
  
        서브 클래스의 객체에 대한 레퍼런스를 슈퍼 클래스 타입으로 변환하는 것을
        업캐스팅이라고 한다.
        
         Ex) 
        //upcasting
        
        Person p;
        Student s = new Student();
        p = s; //업캐스팅
 
 * 다운캐스팅
  
        업캐스팅과 반대로 캐스팅하는 것을 다운캐스팅이라고 한다.   
        
        Ex)
        //downcasting
        
        Person p = new Student("이재문");
        Student s = (Student)p; //다운 캐스팅
       

  ### <추상 클래스>        
        

         추상 메소드는 선언되어 있으나 코드가 구현되어 있지 않은, 즉 껍데기만 있는
         메소드 이다. abstract 키워드를 사용한다.

         Ex)
         public abstract String getName();
         public abstract void setName(String s);

         추상 클래스는 추상 메소드를 포함하는 클래스와 추상 메소드가 없지만,
         abstract로 선언한 클래스가 있다.

         Ex1. 추상 메소드를 포함하는 클래스)
         abstract class Shpae { //추상 클래스 선언
           public Shape() {}
           public void paint() { draw(); }
           abstract public void draw(); //추상 메소드 선언
         }

         Ex2. 추상 메소드가 없지만 abstract로 선언한 클래스)
         abstract class MyComponent { //추상 클래스 선언
           String name;
           public void load(String name) {
             this.name = name;
           }
         }
         
         * 추상 클래스는 객첵를 생성할 수 없다.
         * 추상 클래스는 계층적 상속 관계를 가지는 클래스들의 구조를 만들 때 적합하다.
   
  ### <인터페이스>
  * 인터페이스
         
         
         인터페이스는 interface 키워드를 사용하여 클래스를 선언하듯이 선언한다.
         
  * 인터페이스의 특징
  
    1. 인터페이스는 객체를 생성할 수 없다.
    2. 인터페이스 타입의 레퍼런스 변수는 선언 가능한다.
    3. 인터페이스끼리 상속된다.
    4. 인터페이스를 상속받아 클래스를 작성하면 인터페이스의 모든 추상 메소드를 구현하여야 한다.
    
    
  * 인터페이스 구현 - [(implements Tistory 추가 설명)](https://zbomoon.tistory.com/13)
  
          인터페이스 구현이란 implements 키워드를 사용하여 인터페이스의 모든 추상 메소드를
          구현한 클래스를 작성하는 것 이다.
          
          * 다중 인터페이스 구현이 가능하다.
          
        
    
