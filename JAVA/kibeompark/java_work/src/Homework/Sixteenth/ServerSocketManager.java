package Homework.Sixteenth;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// SocketManager의 상속을 받는 ServerSocketManager 클래스
public class ServerSocketManager extends SocketManager {
    // 서버 소켓 객체 선언
    private ServerSocket servSock;
    // 클라이언트 소켓 정보가 담길 소켓 배열 선언
    private Socket[] clntSockArr;

    // 클라이언트 수를 세기 위한 변수 선언
    private int clntCnt;
    // 전체 클라이언트 수를 저장할 변수 선언
    private int maxClnt;

    // 생성자 선언
    public ServerSocketManager(int portNum, int max)
            throws IOException {

        // 부모 클래스 SocketManager의 생성자(recv용, 서버 입장) 참조
        super(max);

        // 접속해야 하는 클라이언트의 수를 메시지로 출력
        System.out.printf("%d 명이 접속해야 게임을 시작할 수 있습니다. ", max);

        // 바인딩 포트 번호를 대입하여 서버 소켓 객체 생성
        servSock = new ServerSocket(portNum);

        // 클라이언트 수 0으로 초기화
        clntCnt = 0;
        // 접속 가능한 클라이언트 수 저장
        maxClnt = max;

        // 클라이언트 소켓 배열 크기를
        // 클라이언트 수만큼 지정
        clntSockArr = new Socket[max];
    }

    // 클라이언트의 접속 요청을 기다리는 메서드
    public void waitForClientRequest() throws IOException {
        System.out.println("사용자 접속을 대기합니다.");

        // 접속 가능하도록 지정한 클라이언트 수만큼 반복하며
        // 클라이언트의 접속 요청을 대기(accept())하다가
        // 요청이 들어오면 승인하여 배열에 저장
        // Q : 소켓에는 접속한 클라이언트에 대한 모든 정보가 저장되는 건가요 ?
        //     아니면 이후 지속적인 실시간 연결 개념이라고 봐야 하나요 ?
        // Q : for 문을 사용하고 있는데
        //     배열 인덱스에 clntCnt 대신 i를 쓰면 안 되나요 ?
        for (int i = 0; i < maxClnt; i++) {
            clntSockArr[clntCnt++] = servSock.accept();
        }
    }

    // 접속한 클라이언트들의 주소를 확인하는 메서드
    public void checkEachIpAddressInfo() {
        // 접속한 클라이언트들의 IP 주소를 각각 출력
        for (int i = 0; i < maxClnt; i++) {
            System.out.println(
                    "[" + clntSockArr[i].getInetAddress() +
                            "] client connected"
            );
        }
    }

    // 클라이언트 소켓 배열을 반환하는 Getter 메서드
    public Socket[] getClntSockArr() {
        return clntSockArr;
    }

    // 접속 가능한 클라이언트 수를 반환하는 Getter 메서드
    public int getMaxClnt() {
        return maxClnt;
    }
}
