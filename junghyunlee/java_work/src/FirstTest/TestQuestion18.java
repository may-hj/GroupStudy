package FirstTest;

public class TestQuestion18 {
    /*
문제:  자바 컴파일러와, 자바 인터프리터(JVM)에 대해 기술해보자!!

자바 컴파일러(Java compiler)

컴파일러란 원시 언어에서 목적 언어로 바꾸는 작업으로 A라는 언어에서 B라는 언어로 통역해주는
작업입니다. 프로그래밍에서는 주로 고급 언어를 기계어로 바꿔주는 것을 말하며, C나 C++의
경우에는 컴파일러는 CPU나 운영체제마다 가지고 있는 기계어가 조금씩 다르기 때문에 CPU나
운영체제마다 별도의 컴파일러가 필요합니다. 같은 고급언어로 작성한 코드라도 다른 기계어 코드를
생성해야 하는 것입니다

하지만, 자바 컴파일러는 자바를 가지고 작성한 자바 소스 코드를 자바 가상머신이 이해할 수 있는
자바 바이트 코드로 변환합니다. 자바 컴파일러는 자바를 설치하면 javac.exe라는 실행 파일 형태로
설치됩니다.


자바 인터프리터(JVM)

자바는 OS에 독립적입니다. 그 이유는 JVM(JAva Virtual Machine)이 OS와 프로그램의
사이에서 기계어로 해석해주는 역할을 하기 때문입니다. 어떠한 OS든 Java가 설치 되어 있다면
JVM에 의해서 .java 코드가 기계어로 해석될 수 있습니다.

우선 자바개발자들이 Eclipse나 기타 개발툴을 사용해 .java 파일을 생성합니다. 그리고 Build
라는 작업을 하게 되면 Java Complier의 javac 라는 명령어를 사용해 .class 파일을 생성하게 됩니다.
이것은 아직 컴퓨터가 읽을 수 없는 자바 바이트 코드(반기계어)입니다.

이렇게 생성된 자바 바이트 코드(.class)는 크랠스 로더에 의해서 JVM내로 로드 되고, 실행엔진에 의해
기계어로 해석되어 메모리 상(Runtime Data Area)에 배치되게 됩니다. 실행엔진에는 Interperter와
JIT(Just-In-Time) Compiler가 있습니다. Interpreter는 바이트 코드를 한줄씩 읽기 때문에 실행이
느린 단점이 있었습니다. 이러한 단점을 보완하기 위해 나온것이 JIT Compiler 입니다. 인터프리터 방식으로
실행을 하다가 적절한 시점에 바이트 코드 전체를 컴파일 하고 더이상 인터프리팅 하지 않고
해당 코드를 직접 실행 하는 것입니다. JIT Compiler에 의해 해석된 코드는 캐시에 보관하기 때문에 한 번
컴파일 된 후에는 빠르게 수행하는 장점이 있습니다. 하지만 인터프리팅 방식보다는 훨씬 오래 걸리므로 한번만
실행하면 되는 코드는 인터프리팅 하는 것이 유리합니다.
     */
}