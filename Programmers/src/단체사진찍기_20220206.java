import java.util.Arrays;
import java.util.List;

public class 단체사진찍기_20220206 {

    private final String[] arr = {"A", "C", "F", "J", "M", "N", "R", "T"};
    private final String[] result = new String[arr.length];
    private final boolean[] visited = new boolean[arr.length];

    private int sum = 0;

    // https://programmers.co.kr/learn/courses/30/lessons/1835?language=java
    public int solution(int n, String[] data) {
        dfs(0, data);

        int answer = sum;
        return answer;
    }

    private void dfs(int n, String[] data) {
        if(n == arr.length) {
            if(isOk(data)) {
                /*for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i] + " ");
                }
                System.out.println();*/
                sum++;
            }

        } else {
            for(int i=0; i<arr.length; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    result[n] = arr[i];
                    dfs(n + 1, data);
                    visited[i] = false;
                }
            }
        }
    }

    private boolean isOk(String[] data) {
        List<String> resultArray = Arrays.asList(result);
        for(String d : data) {
            int c1 = resultArray.indexOf(d.charAt(0)+"");
            int c2 = resultArray.indexOf(d.charAt(2)+"");
            char type = d.charAt(3);
            int diff = d.charAt(4) - '0';

            if(type == '=') {
                if(Math.abs(c1-c2)-1 != diff) {
                    return false;
                }
            } else if(type == '>') {
                if(Math.abs(c1-c2)-1 <= diff) {
                    return false;
                }
            } else if(type == '<') {
                if(Math.abs(c1-c2)-1 >= diff) {
                    return false;
                }
            }

            //System.out.println("c1 : " + c1 + ", c2 : " + c2 + ", type : '" + type + "', diff : " + diff + ", Math.abs(c1-c2)-1 = " + (Math.abs(c1-c2)-1));
        }

        return true;
    }

}
