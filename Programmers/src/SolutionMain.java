public class SolutionMain {

    public static void main(String[] args) {
        // 예상 대진표
        /*ListOfMatchesTest_20211230 list = new ListOfMatchesTest_20211230();

        int n = 8;
        int a = 4;
        int b = 7;

        list.solution(n , a, b);*/

        // 오픈채팅방
        /*오픈채팅방_20220106 test = new 오픈채팅방_20220106();
        String[] record = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        test.solution(record);*/

        // 단체사진 찍기
        단체사진찍기_20220206 test = new 단체사진찍기_20220206();
        int n = 2;
        String[] data = new String[]{"N~F=0", "R~T>2"};
        int aa = test.solution(n, data);
        System.out.println(aa);
        // 4 = 1344
        // 5 = 1056
        // 6 = 768
        // 7 = 480
    }

}
