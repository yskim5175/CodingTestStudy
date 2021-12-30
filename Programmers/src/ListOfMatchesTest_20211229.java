public class ListOfMatchesTest_20211229 {

    // https://programmers.co.kr/learn/courses/30/lessons/12985
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(n >= 1) {
            n = n / 2;

            // 대진 순서 구하기
            a = a/2 + a%2;
            b = b/2 + b%2;

            System.out.println("a : " + a);
            System.out.println("b : " + b);
            System.out.println();

            answer++;

            if (a == b) {
                break;
            }
        }

        System.out.println("answer : " + answer);

        return answer;
    }

}
