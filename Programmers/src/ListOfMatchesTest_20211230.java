import java.util.LinkedList;
import java.util.Queue;

public class ListOfMatchesTest_20211230 {

    // https://programmers.co.kr/learn/courses/30/lessons/12985
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        // queue 에 대진표 저장
        Queue<Integer> matches = new LinkedList<Integer>();
        for(int i=0; i<n; i++) {
            matches.offer(i+1);
        }

        while(n >= 1) {

            boolean abMatch = false;
            int matchCount = matches.size();

            System.out.println();
            for(int i=0; i<matchCount; i+=2) {
                int target1 = matches.poll();
                int target2 = matches.poll();

                System.out.println("target1 : " + target1);
                System.out.println("target2 : " + target2);
                System.out.println("-----------------");

                if((target1 == a || target2 == a) && (target1 == b || target2 == b)) {
                    System.out.println("match");
                    abMatch = true;
                    break;
                } else if(target1 == a || target2 == a) {
                    System.out.println("a : " + a);
                    matches.offer(a);
                } else if(target1 == b || target2 == b) {
                    System.out.println("b : " + b);
                    matches.offer(b);
                } else {
                    matches.offer(target1);
                }
            }

            answer++;
            n = n / 2;

            if(abMatch) {
                break;
            }
        }

        System.out.println("answer : " + answer);

        return answer;
    }

}
